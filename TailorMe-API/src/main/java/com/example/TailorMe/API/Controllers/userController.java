package com.example.TailorMe.API.Controllers;

import com.example.TailorMe.API.Models.LoginDTO;
import com.example.TailorMe.API.Models.user;
import com.example.TailorMe.API.Models.userDTO;
import com.example.TailorMe.API.Services.userServices.Login;
import com.example.TailorMe.API.Services.userServices.LoginWithCode;
import com.example.TailorMe.API.Services.userServices.signup;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "user/")
public class userController {
    private final LoginWithCode loginwithCode;

    private final signup signup;
    private final Login login;

    public userController(LoginWithCode loginwithCode, com.example.TailorMe.API.Services.userServices.signup signup, Login login) {
        this.loginwithCode = loginwithCode;
        this.signup = signup;
        this.login = login;
    }

    @PostMapping("signup")
    public ResponseEntity<String> signup(@Valid @RequestBody user input){
        return signup.execute(input);
    }
    @GetMapping("login")
    public ResponseEntity<userDTO> login(@Valid @RequestBody LoginDTO input){
        return login.execute(input);
    }

    @GetMapping("codeLogin")
    public ResponseEntity<String> loginPin(@RequestParam(name = "code") int code ){
        return loginwithCode.execute(code);
    }
}
