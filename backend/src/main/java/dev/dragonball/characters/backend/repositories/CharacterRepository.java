package dev.dragonball.characters.backend.repositories;

import dev.dragonball.characters.backend.models.Character;
import dev.dragonball.characters.backend.models.enums.Form;
import dev.dragonball.characters.backend.models.enums.Race;
import dev.dragonball.characters.backend.models.enums.Tag;
import dev.dragonball.characters.backend.models.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
  Optional<Set<Character>> findByName(String name);
  Optional<Set<Character>> findByForm(Form form);
  Optional<Set<Character>> findByRace(Race race);
  Optional<Set<Character>> findByTag(Tag tag);
  Optional<Set<Character>> findByType(Type type);
  Optional<Character> findByNameAndForm(String name, Form form);
}
