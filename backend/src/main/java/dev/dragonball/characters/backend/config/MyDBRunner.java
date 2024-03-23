package dev.dragonball.characters.backend.config;


import dev.dragonball.characters.backend.models.Stat;
import dev.dragonball.characters.backend.models.Character;
import dev.dragonball.characters.backend.models.enums.Form;
import dev.dragonball.characters.backend.models.enums.Race;
import dev.dragonball.characters.backend.models.enums.Tag;
import dev.dragonball.characters.backend.models.enums.Type;
import dev.dragonball.characters.backend.repositories.CharacterRepository;
import dev.dragonball.characters.backend.repositories.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyDBRunner implements CommandLineRunner {

  @Autowired
  CharacterRepository characterRepository;

  @Autowired
  StatRepository statRepository;


  @Override
  public void run(String... args) throws Exception {
    List<Stat> stats = new ArrayList<>();

    stats.add(new Stat(Form.valueOf("android"),       24000, 11000, 2500, 1700, 2400, 1900, 3200, 5200));
    stats.add(new Stat(Form.valueOf("base"),          20000,  8000, 2300, 1500, 2000, 1500, 3000, 5000));
    stats.add(new Stat(Form.valueOf("kaioken"),       21000,  9000, 2350, 1550, 2100, 1600, 3050, 5050));
    stats.add(new Stat(Form.valueOf("_final"),        22000,  9500, 2400, 1600, 2200, 1700, 3100, 5050));
    stats.add(new Stat(Form.valueOf("ss1"),           23000, 10000, 2450, 1650, 2300, 1800, 3150, 5150));
    stats.add(new Stat(Form.valueOf("ss2"),           24000, 11000, 2500, 1700, 2400, 1900, 3200, 5200));
    stats.add(new Stat(Form.valueOf("ss3"),           25000, 12000, 2600, 1750, 2500, 2000, 3250, 5250));
    stats.add(new Stat(Form.valueOf("ultimate"),      25000, 12000, 2600, 1750, 2600, 2100, 3300, 5300));
    stats.add(new Stat(Form.valueOf("rose"),          26000, 12500, 2650, 1850, 2700, 2200, 3350, 5350));
    stats.add(new Stat(Form.valueOf("ssg"),           26000, 13000, 2700, 1800, 2700, 2200, 3400, 5400));
    stats.add(new Stat(Form.valueOf("ssgss"),         27000, 14000, 2750, 1850, 2800, 2300, 3450, 5450));
    stats.add(new Stat(Form.valueOf("mutated"),       28000, 14000, 2800, 1950, 2900, 2400, 3500, 5500));
    stats.add(new Stat(Form.valueOf("golden"),        29000, 15000, 2850, 2000, 3000, 2500, 3550, 5550));
    stats.add(new Stat(Form.valueOf("ssgsskaioken"),  29000, 15000, 2900, 2050, 3000, 2700, 3600, 5600));
    stats.add(new Stat(Form.valueOf("ssgssevolved"),  30000, 15000, 2950, 2100, 3100, 2600, 3650, 5650));
    stats.add(new Stat(Form.valueOf("ultraego"),      35000, 16000, 3000, 2250, 3200, 2800, 3700, 5700));
    stats.add(new Stat(Form.valueOf("ultrainstinct"), 35000, 16000, 3050, 2200, 3200, 2800, 3700, 5700));
    stats.add(new Stat(Form.valueOf("orange"),        35000, 16000, 3100, 2200, 3250, 2900, 3750, 5750));
    stats.add(new Stat(Form.valueOf("beast"),         35000, 18000, 3200, 2300, 3300, 3000, 4000, 6000));
    stats.add(new Stat(Form.valueOf("legendary"),     40000, 20000, 3500, 2500, 4000, 3500, 5000, 7000));
    statRepository.saveAll(stats);

    characterRepository.save(new Character("buu",          Form.valueOf("ultimate"),      Race.valueOf("majin"),     Tag.valueOf("hero"),    Type.valueOf("defense"), "pink", "purple",            stats.get(7),  "src/assets/images/characters/buu_base.png",             "src/assets/images/backgrounds/buu_base.jpg"));
    characterRepository.save(new Character("krillin",      Form.valueOf("base"),          Race.valueOf("earthling"), Tag.valueOf("hero"),    Type.valueOf("defense"), "orange", "yellow",          stats.get(1),  "src/assets/images/characters/krillin.png",              "src/assets/images/backgrounds/krillin.jpg"));
    characterRepository.save(new Character("tien",         Form.valueOf("base"),          Race.valueOf("earthling"), Tag.valueOf("hero"),    Type.valueOf("support"), "green", "red",              stats.get(1),  "src/assets/images/characters/tien.png",                 "src/assets/images/backgrounds/tien.jpg"));
    characterRepository.save(new Character("videl",        Form.valueOf("base"),          Race.valueOf("earthling"), Tag.valueOf("hero"),    Type.valueOf("support"), "white", "black",            stats.get(1),  "src/assets/images/characters/videl.png",                "src/assets/images/backgrounds/videl.jpg"));
    characterRepository.save(new Character("yamcha",       Form.valueOf("base"),          Race.valueOf("earthling"), Tag.valueOf("hero"),    Type.valueOf("support"), "blue", "orange",            stats.get(1),  "src/assets/images/characters/yamcha.png",               "src/assets/images/backgrounds/yamcha.jpg"));
    characterRepository.save(new Character("master roshi", Form.valueOf("base"),          Race.valueOf("earthling"), Tag.valueOf("hero"),    Type.valueOf("support"), "orange", "purple",          stats.get(1),  "src/assets/images/characters/master-roshi.png",         "src/assets/images/backgrounds/master-roshi.jpg"));
    characterRepository.save(new Character("android 17",   Form.valueOf("android"),       Race.valueOf("android"),   Tag.valueOf("hero"),    Type.valueOf("defense"), "lightgreen", "lightblue",   stats.get(0),  "src/assets/images/characters/android_17.png",           "src/assets/images/backgrounds/android_17.jpg"));
    characterRepository.save(new Character("android 18",   Form.valueOf("android"),       Race.valueOf("android"),   Tag.valueOf("hero"),    Type.valueOf("defense"), "blue", "black",             stats.get(0),  "src/assets/images/characters/android_18.png",           "src/assets/images/backgrounds/android_18.jpg"));
    characterRepository.save(new Character("piccolo",      Form.valueOf("base"),          Race.valueOf("namekian"),  Tag.valueOf("hero"),    Type.valueOf("defense"), "purple", "green",           stats.get(1),  "src/assets/images/characters/piccolo_base.png",         "src/assets/images/backgrounds/piccolo_base.jpg"));
    characterRepository.save(new Character("piccolo",      Form.valueOf("orange"),        Race.valueOf("namekian"),  Tag.valueOf("hero"),    Type.valueOf("attack"), "purple", "orange",           stats.get(17), "src/assets/images/characters/piccolo_orange.png",       "src/assets/images/backgrounds/piccolo_orange.jpg"));
    characterRepository.save(new Character("goten",        Form.valueOf("base"),          Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "blue", "lavender",           stats.get(1),  "src/assets/images/characters/goten_base.png",           "src/assets/images/backgrounds/goten_base.jpg"));
    characterRepository.save(new Character("goten",        Form.valueOf("ss1"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "yellow",           stats.get(4),  "src/assets/images/characters/goten_ss1.png",            "src/assets/images/backgrounds/goten_ss1.jpg"));
    characterRepository.save(new Character("broly",        Form.valueOf("base"),          Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "red", "blue",                stats.get(1),  "src/assets/images/characters/broly_base.png",           "src/assets/images/backgrounds/broly_base.jpg"));
    characterRepository.save(new Character("broly",        Form.valueOf("ss1"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "red", "yellow",              stats.get(4),  "src/assets/images/characters/broly_ss1.png",            "src/assets/images/backgrounds/broly_ss1.jpg"));
    characterRepository.save(new Character("broly",        Form.valueOf("legendary"),     Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "lime green", "yellow",       stats.get(19), "src/assets/images/characters/broly_legendary.png",      "src/assets/images/backgrounds/broly_legendary.jpg"));
    characterRepository.save(new Character("trunks",       Form.valueOf("base"),          Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "lavender", "darkgrey",       stats.get(1),  "src/assets/images/characters/trunks_base.png",          "src/assets/images/backgrounds/trunks_base.jpg"));
    characterRepository.save(new Character("trunks",       Form.valueOf("ss1"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "lavender", "yellow",         stats.get(4),  "src/assets/images/characters/trunks_ss1.png",           "src/assets/images/backgrounds/trunks_ss1.jpg"));
    characterRepository.save(new Character("trunks",       Form.valueOf("ss2"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "yellow", "blue",             stats.get(5),  "src/assets/images/characters/trunks_ss2.png",           "src/assets/images/backgrounds/trunks_ss2.jpg"));
    characterRepository.save(new Character("gohan",        Form.valueOf("base"),          Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "purple",           stats.get(1),  "src/assets/images/characters/gohan_base.png",           "src/assets/images/backgrounds/gohan_base.jpg"));
    characterRepository.save(new Character("gohan",        Form.valueOf("ss1"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "green", "yellow",            stats.get(4),  "src/assets/images/characters/gohan_ss1.png",            "src/assets/images/backgrounds/gohan_ss1.jpg"));
    characterRepository.save(new Character("gohan",        Form.valueOf("ss2"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "yellow",           stats.get(5),  "src/assets/images/characters/gohan_ss2.png",            "src/assets/images/backgrounds/gohan_ss2.jpg"));
    characterRepository.save(new Character("gohan",        Form.valueOf("ultimate"),      Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"),"purple", "orange",            stats.get(7),  "src/assets/images/characters/gohan_ultimate.png",       "src/assets/images/backgrounds/gohan_ultimate.jpg"));
    characterRepository.save(new Character("gohan",        Form.valueOf("beast"),         Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"),"purple", "lightgrey",         stats.get(18), "src/assets/images/characters/gohan_beast.png",          "src/assets/images/backgrounds/gohan_beast.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("base"),          Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "blue",             stats.get(1),  "src/assets/images/characters/goku_base.png",            "src/assets/images/backgrounds/goku_base.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("kaioken"),       Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "red", "orange",              stats.get(2),  "src/assets/images/characters/goku_kaioken.png",         "src/assets/images/backgrounds/goku_kaioken.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ss1"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "yellow",           stats.get(4),  "src/assets/images/characters/goku_ss1.png",             "src/assets/images/backgrounds/goku_ss1.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ss2"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "yellow",           stats.get(5),  "src/assets/images/characters/goku_ss2.png",             "src/assets/images/backgrounds/goku_ss2.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ss3"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "yellow",           stats.get(6),  "src/assets/images/characters/goku_ss3.png",             "src/assets/images/backgrounds/goku_ss3.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ssg"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "red",              stats.get(9),  "src/assets/images/characters/goku_ssg.png",             "src/assets/images/backgrounds/goku_ssg.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ssgss"),         Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "lightblue", "orange",        stats.get(10), "src/assets/images/characters/goku_ssgss.png",           "src/assets/images/backgrounds/goku_ssgss.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ssgsskaioken"),  Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "red", "lightblue",           stats.get(13), "src/assets/images/characters/goku_ssgss_kaioken.png",   "src/assets/images/backgrounds/goku_ssgss_kaioken.jpg"));
    characterRepository.save(new Character("goku",         Form.valueOf("ultrainstinct"), Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "orange", "silver",           stats.get(16), "src/assets/images/characters/goku_ui.png",              "src/assets/images/backgrounds/goku_ui.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("base"),          Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "blue", "yellow",             stats.get(1),  "src/assets/images/characters/vegeta_base.png",          "src/assets/images/backgrounds/vegeta_base.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("ss1"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "blue", "yellow",             stats.get(4),  "src/assets/images/characters/vegeta_ss1.png",           "src/assets/images/backgrounds/vegeta_ss1.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("ss2"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"),"lightgrey", "yellow",         stats.get(5),  "src/assets/images/characters/vegeta_ss2.png",           "src/assets/images/backgrounds/vegeta_ss2.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("ssg"),           Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "red", "blue",                stats.get(9),  "src/assets/images/characters/vegeta_ssg.png",           "src/assets/images/backgrounds/vegeta_ssg.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("ssgss"),         Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "lightblue", "darkgrey",      stats.get(10), "src/assets/images/characters/vegeta_ssgss.png",         "src/assets/images/backgrounds/vegeta_ssgss.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("ssgssevolved"),  Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "lightblue", "navyblue",      stats.get(14), "src/assets/images/characters/vegeta_ssgss_evolved.png", "src/assets/images/backgrounds/vegeta_ssgss_evolved.jpg"));
    characterRepository.save(new Character("vegeta",       Form.valueOf("ultraego"),      Race.valueOf("saiyan"),    Tag.valueOf("hero"),    Type.valueOf("attack"), "purple", "blue",             stats.get(15), "src/assets/images/characters/vegeta_ue.png",            "src/assets/images/backgrounds/vegeta_ue.jpg"));
    characterRepository.save(new Character("frieza",       Form.valueOf("base"),          Race.valueOf("frieza"),    Tag.valueOf("villain"), Type.valueOf("attack"), "pink", "purple",             stats.get(1),  "src/assets/images/characters/frieza_base.png",          "src/assets/images/backgrounds/frieza_base.jpg"));
    characterRepository.save(new Character("frieza",       Form.valueOf("_final"),        Race.valueOf("frieza"),    Tag.valueOf("villain"), Type.valueOf("attack"), "white", "purple",            stats.get(3),  "src/assets/images/characters/frieza_final.png",         "src/assets/images/backgrounds/frieza_final.jpg"));
    characterRepository.save(new Character("frieza",       Form.valueOf("golden"),        Race.valueOf("frieza"),    Tag.valueOf("villain"), Type.valueOf("attack"), "gold", "purple",             stats.get(12), "src/assets/images/characters/frieza_golden.png",        "src/assets/images/backgrounds/frieza_golden.jpg"));
    characterRepository.save(new Character("goku black",   Form.valueOf("base"),          Race.valueOf("core"),      Tag.valueOf("villain"), Type.valueOf("attack"), "black", "lightgrey",         stats.get(1),  "src/assets/images/characters/goku-black_base.png",      "src/assets/images/backgrounds/goku-black_base.jpg"));
    characterRepository.save(new Character("goku black",   Form.valueOf("rose"),          Race.valueOf("core"),      Tag.valueOf("villain"), Type.valueOf("attack"), "pink", "black",              stats.get(8),  "src/assets/images/characters/goku-black_rose.png",      "src/assets/images/backgrounds/goku-black_rose.jpg"));
    characterRepository.save(new Character("fused zamasu", Form.valueOf("base"),          Race.valueOf("core"),      Tag.valueOf("villain"), Type.valueOf("attack"), "red", "green",               stats.get(1),  "src/assets/images/characters/fused-zamasu_base.png",    "src/assets/images/backgrounds/fused-zamasu_base.jpg"));
    characterRepository.save(new Character("fused zamasu", Form.valueOf("mutated"),       Race.valueOf("core"),      Tag.valueOf("villain"), Type.valueOf("attack"), "purple", "green",            stats.get(11), "src/assets/images/characters/fused-zamasu_mutated.png", "src/assets/images/backgrounds/fused-zamasu_mutated.jpg"));

  }
}
