package dev.dragonball.characters.backend.services;

import dev.dragonball.characters.backend.models.Stat;
import dev.dragonball.characters.backend.models.enums.Form;
import dev.dragonball.characters.backend.repositories.StatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StatService {

  private final StatRepository statRepository;

  public List<Stat> findAllStats(){
    return statRepository.findAll();
  }

  public Stat findStatByForm(String form) {
    Optional<Stat> stat = statRepository.findByForm(Form.valueOf(form.toLowerCase()));
    if (!stat.isPresent()){
      throw new IllegalStateException("The form " + form + " is not valid.");
    }
    return stat.get();
  }
}
