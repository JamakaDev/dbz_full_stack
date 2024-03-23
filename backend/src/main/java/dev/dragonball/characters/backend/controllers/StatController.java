package dev.dragonball.characters.backend.controllers;


import dev.dragonball.characters.backend.models.Stat;
import dev.dragonball.characters.backend.services.StatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/stat")
@RequiredArgsConstructor
public class StatController {

  private final StatService statService;

  @GetMapping("/all")
  public List<Stat> findStats(){
    return statService.findAllStats();
  }

  @GetMapping("/{form}")
  public Stat findStatByForm(@PathVariable("form") String form) {
    return statService.findStatByForm(form);
  }
}
