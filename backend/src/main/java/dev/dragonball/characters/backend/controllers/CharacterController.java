package dev.dragonball.characters.backend.controllers;

import dev.dragonball.characters.backend.models.Character;
import dev.dragonball.characters.backend.models.testClass;
import dev.dragonball.characters.backend.services.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("api/v1/character")
@RequiredArgsConstructor
public class CharacterController {

  private final CharacterService characterService;


  @GetMapping("all")
  public List<Character> findAllCharacters(){
    return characterService.findAllCharacters();
  }

  @GetMapping("name/{name}")
  public Set<Character> findCharactersByName(@PathVariable("name") String name){
    testClass testClass = new testClass();
    return characterService.findCharactersByName(name);
  }

  @GetMapping("form/{form}")
  public Set<Character> findCharactersByForm(@PathVariable("form") String form){
    return characterService.findCharactersByForm(form);
  }

  @GetMapping("race/{race}")
  public Set<Character> findCharactersByRace(@PathVariable("race") String race){
    return characterService.findCharactersByRace(race);
  }

  @GetMapping("tag/{tag}")
  public Set<Character> findCharactersByTag(@PathVariable("tag") String tag){
    return characterService.findCharactersByTag(tag);
  }

  @GetMapping("type/{type}")
  public Set<Character> findCharactersByType(@PathVariable("type") String type){
    return characterService.findCharactersByType(type);
  }

  @GetMapping("name/{name}/form/{form}")
  public Character findCharacterByNameAndForm(@PathVariable("name") String name, @PathVariable("form") String form) {
    return characterService.findCharacterByNameAndForm(name, form);
  }


}

