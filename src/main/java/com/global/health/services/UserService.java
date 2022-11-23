package com.global.health.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.global.health.entities.UserEntity;
import com.global.health.exeception.BadRequestException;
import com.global.health.interfaces.IUserService;
import com.global.health.repositories.UserRepository;
import com.global.health.utils.lib.CpfValidate;
import com.global.health.utils.lib.EmailValidate;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    protected UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity create(UserEntity user) {	
        if (!CpfValidate.isCPF(user.getCpf())) throw new BadRequestException("Cpf inválido");
        if (!EmailValidate.isEmail(user.getEmail())) throw new BadRequestException("E-mail inválido");

        if (this.findByEmail(user.getEmail()) != null) throw new BadRequestException("E-mail já cadastrado");
        if (user.getPassword().length() < 8) throw new BadRequestException("Senha deve conter mais de 8 caracteres");

        String senhaHash = this.passwordEncoder.encode(user.getPassword());

        user.setCpf(CpfValidate.formatCPF(user.getCpf()));
        user.setPassword(senhaHash);
		user.setUpdatedAt(LocalDate.now());
		user.setCreatedAt(LocalDate.now());

        return userRepository.save(user);
    }

    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
