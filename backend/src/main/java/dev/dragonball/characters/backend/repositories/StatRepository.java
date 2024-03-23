package dev.dragonball.characters.backend.repositories;


import dev.dragonball.characters.backend.models.Stat;
import dev.dragonball.characters.backend.models.enums.Form;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatRepository extends JpaRepository<Stat, Long> {

  Optional<Stat> findByForm(Form form);
}