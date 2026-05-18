package com.example.apiRest.services;

import com.example.apiRest.dto.AuthenticationRequest;
import com.example.apiRest.dto.AuthenticationResponse;
import com.example.apiRest.dto.Autor;
import com.example.apiRest.dto.RegisterRequest;
import com.example.apiRest.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final PersonaRepository userRepository; // Tu repositorio de usuarios
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
}
//    public AuthenticationResponse register(RegisterRequest request) {
//        // 1. Crea el nuevo usuario mapeando los datos del DTO
//        Autor user = new Autor();
//        user.setNombre(request.username());
//        // CRUCIAL: Encripta la contraseña antes de guardarla
//        user.setApellido(passwordEncoder.encode(request.password()));
//
//
//        // 2. Genera el token para el usuario recién registrado
//        //String jwtToken = jwtService.generateToken(user);
//        //return new AuthenticationResponse(jwtToken);
//        // }

//    public AuthenticationResponse authenticate(AuthenticationRequest request) {
//        // 1. Esto valida automáticamente si el usuario y contraseña son correctos
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.username(),
//                        request.password()
//                )
//        );

        // 2. Si no lanzó excepción en el paso anterior, el usuario es válido


        // 3. Generamos y devolvemos su token
//        String jwtToken = jwtService.generateToken(user);
//        return new AuthenticationResponse(jwtToken);
        //}
//}
