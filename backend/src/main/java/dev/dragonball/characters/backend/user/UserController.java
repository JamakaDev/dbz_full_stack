package dev.dragonball.characters.backend.user;

import dev.dragonball.characters.backend.auth.AuthenticationResponse;
import dev.dragonball.characters.backend.auth.VerificationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;


  @PostMapping("/verify")
  public AuthenticationResponse findUserByEmail(@RequestBody VerificationRequest request) {
    return userService.findUserByEmail(request);
  }
}
