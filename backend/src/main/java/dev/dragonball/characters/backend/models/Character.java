package dev.dragonball.characters.backend.models;


import dev.dragonball.characters.backend.models.enums.Form;
import dev.dragonball.characters.backend.models.enums.Race;
import dev.dragonball.characters.backend.models.enums.Tag;
import dev.dragonball.characters.backend.models.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Character {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "character_seq")
  @SequenceGenerator(name = "character_seq", sequenceName = "character_seq", allocationSize = 1)
  private Long id;

  private String name;

  @Enumerated(value = EnumType.STRING)
  private Form form;

  @Enumerated(value = EnumType.STRING)
  private Race race;

  @Enumerated(value = EnumType.STRING)
  private Tag tag;

  @Enumerated(value = EnumType.STRING)
  private Type type;

  private String primaryColor;

  private String secondaryColor;

  @ManyToOne
  @JoinColumn(name = "stat_id")
  private Stat stat;

  private String image;

  private String backgroundImage;

  public Character(String name, Form form, Race race, Tag tag, Type type, String primaryColor, String secondaryColor, Stat stat, String image, String backgroundImage) {
    this.name = name;
    this.form = form;
    this.race = race;
    this.tag = tag;
    this.type = type;
    this.primaryColor = primaryColor;
    this.secondaryColor = secondaryColor;
    this.stat = stat;
    this.image = image;
    this.backgroundImage = backgroundImage;
  }
}