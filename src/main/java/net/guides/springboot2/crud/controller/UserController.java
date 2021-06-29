package net.guides.springboot2.crud.controller;

import net.guides.springboot2.crud.model.ApplicationUser;
import net.guides.springboot2.crud.repository.UserRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserRepository userRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    //@PostMapping("/sign-up")
    @PostMapping("/record")
    public HttpEntity<String> signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);

       
        return ResponseEntity.ok().body("User added successfully");
    }

    @PostMapping("/login")
    public void login(@RequestBody ApplicationUser user) {

    }


}