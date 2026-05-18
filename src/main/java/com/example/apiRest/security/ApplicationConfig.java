package com.example.apiRest.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    // 1. Inyecta aquí tu repositorio de usuarios (asumiendo que se llama UserRepository)
    // private final UserRepository userRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        // Sustituye este retorno simulado por la búsqueda real en tu base de datos. Ejemplo:
        // return username -> userRepository.findByEmail(username)
        //         .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        return username -> {
            throw new UsernameNotFoundException("Falta conectar el repositorio aquí");
        };
    }

    // 2. ¡ESTE ES EL BEAN QUE TE FALTA!
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
