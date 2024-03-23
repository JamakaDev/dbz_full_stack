package dev.dragonball.characters.backend.user;


import dev.dragonball.characters.backend.auth.AuthenticationResponse;
import dev.dragonball.characters.backend.auth.VerificationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public AuthenticationResponse findUserByEmail(VerificationRequest request) {
    Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
    if (optionalUser.isEmpty()) {
      throw new UsernameNotFoundException("User " + request.getEmail() + " does not exist. Please register or try again.");
    }
    return AuthenticationResponse
            .builder()
            .token(optionalUser.get().getPassword())
            .build();
  }
}
