package com.example.TailorMe.API.Services.userServices;

import com.example.TailorMe.API.Exceptionhandling.codeDoesntExistException;
import com.example.TailorMe.API.Models.OneTimeCodeModel;
import com.example.TailorMe.API.Models.user;
import com.example.TailorMe.API.Models.userDTO;
import com.example.TailorMe.API.Repositories.Command;
import com.example.TailorMe.API.Repositories.OneTimeCoderepo;
import com.example.TailorMe.API.Repositories.userRepository;
import com.example.TailorMe.API.Security.jwt.jwtUtil;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class LoginWithCode implements Command<Integer, String> {
    private final OneTimeCoderepo OTP;
    private final AuthenticationManager manager;
    private final userRepository userRepo;

    public LoginWithCode(OneTimeCoderepo otp, AuthenticationManager manager, userRepository userRepo) {
        OTP = otp;
        this.manager = manager;
        this.userRepo = userRepo;
    }
    @Transactional
    @Override
    public ResponseEntity<String> execute(Integer input) {
        if(OTP.existsByCode(input)) {
            Long otpId = OTP.findByCode(input).getOtp_id();
            OTP.deleteById(otpId);
            return ResponseEntity.ok().body("Success");
        }else {
            throw new codeDoesntExistException();
        }

    }
}
