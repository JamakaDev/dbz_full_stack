package dev.dragonball.characters.backend.models;



import dev.dragonball.characters.backend.models.enums.Form;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stats")
public class Stat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "stats_seq")
  @SequenceGenerator(name = "stats_seq", sequenceName = "stats_seq", allocationSize = 1)
  private Long id;

  @Enumerated(value = EnumType.STRING)
  private Form form;

  private Integer health;

  private Integer powerLevel;

  private Integer strikeAttack;

  private Integer strikeDefense;

  private Integer kiBlastAttack;

  private Integer kiBlastDefense;

  private Integer specialAttack;

  private Integer ultimateAttack;



  public Stat(Form form, Integer health, Integer powerLevel, Integer strikeAttack, Integer strikeDefense, Integer kiBlastAttack, Integer kiBlastDefense, Integer specialAttack, Integer ultimateAttack) {
    this.form = form;
    this.health = health;
    this.powerLevel = powerLevel;
    this.strikeAttack = strikeAttack;
    this.strikeDefense = strikeDefense;
    this.kiBlastAttack = kiBlastAttack;
    this.kiBlastDefense = kiBlastDefense;
    this.specialAttack = specialAttack;
    this.ultimateAttack = ultimateAttack;
  }
}
