package com.global.health.controllers;

import com.global.health.entities.UserEntity;
import com.global.health.exeception.BadRequestException;
import com.global.health.security.DTO.JwtRequestDTO;
import com.global.health.security.DTO.JwtResponseDTO;
import com.global.health.security.libs.JwtTokenUtil;
import com.global.health.services.JwtUserDetailsService;
import com.global.health.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    private void authenticate(String email, String password) throws BadRequestException {
        UserEntity user = this.userService.findByEmail(email);

        if (user == null) throw new BadRequestException("E-mail não cadastrado");
        if (!passwordEncoder.matches(password, user.getPassword())) throw new BadRequestException("Senha inválida");
    }

    @PostMapping
    public ResponseEntity<JwtResponseDTO> createAuthenticationToken(@RequestBody JwtRequestDTO response) {
        this.authenticate(response.getEmail(), response.getPassword());

        UserEntity user = this.userService.findByEmail(response.getEmail());

        final UserDetails userDetails = userDetailsService.loadUserByUsername(response.getEmail());
        final String token = jwtTokenUtil.generateToken(userDetails);

        JwtResponseDTO jwtResponse = new JwtResponseDTO(token);

        return new ResponseEntity<>(jwtResponse, HttpStatus.OK);
    }
}