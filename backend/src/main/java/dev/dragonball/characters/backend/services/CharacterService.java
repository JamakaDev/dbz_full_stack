package dev.dragonball.characters.backend.services;


import dev.dragonball.characters.backend.models.Character;
import dev.dragonball.characters.backend.models.enums.Form;
import dev.dragonball.characters.backend.models.enums.Race;
import dev.dragonball.characters.backend.models.enums.Tag;
import dev.dragonball.characters.backend.models.enums.Type;
import dev.dragonball.characters.backend.repositories.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CharacterService {

  private final CharacterRepository characterRepository;


  public List<Character> findAllCharacters() {
    return characterRepository.findAll();
  }

  public Set<Character> findCharactersByName(String name){
    Optional<Set<Character>> characters = characterRepository.findByName(name.toLowerCase());
    if (characters.isEmpty()){
      throw new UsernameNotFoundException("ERROR: character " + name + " doesn't exist");
    }
    return characters.get();
  }

  public Set<Character> findCharactersByForm(String form){
    Optional<Set<Character>> characters = characterRepository.findByForm(Form.valueOf(form.toLowerCase()));
    if (characters.isEmpty()){
      throw new UsernameNotFoundException("ERROR: character " + form + " doesn't exist");
    }
    return characters.get();
  }

  public Set<Character> findCharactersByRace(String race){
    Optional<Set<Character>> characters = characterRepository.findByRace(Race.valueOf(race.toLowerCase()));
    if (characters.isEmpty()){
      throw new UsernameNotFoundException("ERROR: character " + race + " doesn't exist");
    }
    return characters.get();
  }

  public Set<Character> findCharactersByTag(String tag){
    Optional<Set<Character>> characters = characterRepository.findByTag(Tag.valueOf(tag.toLowerCase()));
    if (characters.isEmpty()){
      throw new UsernameNotFoundException("ERROR: character " + tag + " doesn't exist");
    }
    return characters.get();
  }

  public Set<Character> findCharactersByType(String type){
    Optional<Set<Character>> characters = characterRepository.findByType(Type.valueOf(type.toLowerCase()));
    if (characters.isEmpty()){
      throw new UsernameNotFoundException("ERROR: character " + type + " doesn't exist");
    }
    return characters.get();
  }

  public Character findCharacterByNameAndForm(String name, String form) {
    Optional<Character> character = characterRepository.findByNameAndForm(name.toLowerCase(), Form.valueOf(form.toLowerCase()));
    if (character.isEmpty()){
      throw new UsernameNotFoundException("ERROR: character " + form.toLowerCase() + " " + name + " doesn't exist");
    }
    return character.get();
  }


}


