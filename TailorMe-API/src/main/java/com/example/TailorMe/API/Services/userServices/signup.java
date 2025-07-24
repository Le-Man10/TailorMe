package com.example.TailorMe.API.Services.userServices;

import com.example.TailorMe.API.Models.OneTimeCodeModel;
import com.example.TailorMe.API.Models.user;
import com.example.TailorMe.API.Models.userDTO;
import com.example.TailorMe.API.Repositories.Command;
import com.example.TailorMe.API.Repositories.OneTimeCoderepo;
import com.example.TailorMe.API.Repositories.userRepository;
import com.example.TailorMe.API.Security.SendEmail;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class signup implements Command<user, String> {

    private final OneTimeCoderepo OTP;

    private final Random rnd = new Random();
    private final userRepository userRepo;
    private final SendEmail Send;

    public signup(OneTimeCoderepo otp, userRepository userRepo, SendEmail send) {
        OTP = otp;
        this.userRepo = userRepo;
        Send = send;
    }
    @Transactional
    @Override
    public ResponseEntity<String> execute(user input) {
        OneTimeCodeModel newCode = new OneTimeCodeModel();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(16);
        input.setPassword(passwordEncoder.encode(input.getPassword()));
        user newUser = userRepo.save(input);
        int confirmationCode = 100000 + rnd.nextInt(900000);
        newCode.setCode(confirmationCode);
        newCode.setUser(newUser);
        OTP.save(newCode);
        String StringCode = Integer.toString(confirmationCode);
        Send.sendEmail(input.getEmail(),"Login Code",StringCode);
        return ResponseEntity.ok().body("user successfully created");
    }
}
