package dev.dragonball.characters.backend.auth;

import dev.dragonball.characters.backend.config.JwtService;
import dev.dragonball.characters.backend.user.Role;
import dev.dragonball.characters.backend.user.User;
import dev.dragonball.characters.backend.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AuthenticationService {

  private final AuthenticationManager authManager;
  private final JwtService jwtService;
  private final BCryptPasswordEncoder passwordEncoder;
  private final UserRepository userRepository;

  public AuthenticationResponse registerUser(RegisterRequest request) {
    var user = User.builder()
            .firstname(request.getFirstname())
            .lastname(request.getLastname())
            .email(request.getEmail())
            .password(passwordEncoder.encode(request.getPassword()))
            .role(Role.USER)
            .build();
    userRepository.save(user);
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder().token(jwtToken).build();
  }

  public AuthenticationResponse authenticateUser(AuthenticationRequest request) {
    authManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
    );
    Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
    if (optionalUser.isEmpty()) {
      throw new UsernameNotFoundException(
              "User " + request.getEmail() + " does not exist. Please register or try again.");
    }
    var jwtToken = jwtService.generateToken(optionalUser.get());
    return AuthenticationResponse.builder().token(jwtToken).build();
  }
}
