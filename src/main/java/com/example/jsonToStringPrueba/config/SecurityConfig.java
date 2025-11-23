package com.example.jsonToStringPrueba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.logging.Logger;
// ... (otras importaciones)

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();

        // Configura explícitamente el origen permitido aquí
        configuration.addAllowedOrigin("http://localhost:4000");

        configuration.addAllowedMethod("*"); // Permite todos los métodos
        configuration.addAllowedHeader("*"); // Permite todas las cabeceras
        configuration.setAllowCredentials(true); // Permite credenciales (cookies/auth)

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // Aplica esta configuración a todas las rutas
        source.registerCorsConfiguration("/**", configuration);

        return source;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())

                // Asegúrate de que esta línea esté presente para que use el Bean de arriba
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))

                // Permite acceso total
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/**").permitAll()
                        .anyRequest().authenticated()
                )
                // Deshabilita formularios, etc.
                .httpBasic(httpBasic -> httpBasic.disable())
                .formLogin(formLogin -> formLogin.disable());

        return http.build();
    }
}