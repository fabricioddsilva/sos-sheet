package com.drakonor.sos_sheet.entities;

import com.drakonor.sos_sheet.entities.enums.Job;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
public class Sheet implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    // == First Page ==

    private String name;
    private String creator;
    private Job job;
    private String subClass;

    //Evolution
    private Integer level;
    private Integer proficiencyBonus;

    private Integer verse;
    private Integer chorus;

    //Status
    private Integer hpMin;
    private Integer hpMax;
    private Integer epMin;
    private Integer epMax;

    private Integer epPerTurn;

    // Others
    private Integer difficultClass;
    private Integer armorClass;
    private Integer movement;

    //Ability
    private AbilityScore abilityScore;

    // Skill
    private Skills skills;

    // == Second Page ==

    // Slot Powers
    private Integer slotMin;
    private Integer slotMax;
    private String slotPowers;

    // Class Powers
    private String classPowers;
    private String autority;

    // Inventory
    private Inventory inventory;

    // Magic
    private List<Magic> magics = new ArrayList<>();

    public Sheet() {
    }

    public Sheet(String id, String name, String creator, Job job, String subClass, Integer level, Integer proficiencyBonus, Integer verse, Integer chorus, Integer hpMin, Integer hpMax, Integer epMin, Integer epMax, Integer epPerTurn, Integer difficultClass, Integer armorClass, Integer movement, AbilityScore abilityScore, Skills skills, Integer slotMin, Integer slotMax, String slotPowers, String classPowers, String autority) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.job = job;
        this.subClass = subClass;
        this.level = level;
        this.proficiencyBonus = proficiencyBonus;
        this.verse = verse;
        this.chorus = chorus;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.epMin = epMin;
        this.epMax = epMax;
        this.epPerTurn = epPerTurn;
        this.difficultClass = difficultClass;
        this.armorClass = armorClass;
        this.movement = movement;
        this.abilityScore = abilityScore;
        this.skills = skills;
        this.slotMin = slotMin;
        this.slotMax = slotMax;
        this.slotPowers = slotPowers;
        this.classPowers = classPowers;
        this.autority = autority;
    }

    public Sheet(String id, String name, String creator, Job job, String subClass, Integer level, Integer proficiencyBonus, Integer verse, Integer chorus, Integer hpMin, Integer hpMax, Integer epMin, Integer epMax, Integer epPerTurn, Integer difficultClass, Integer armorClass, Integer movement, AbilityScore abilityScore, Skills skills, Integer slotMin, Integer slotMax, String slotPowers, String classPowers, String autority, Inventory inventory) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.job = job;
        this.subClass = subClass;
        this.level = level;
        this.proficiencyBonus = proficiencyBonus;
        this.verse = verse;
        this.chorus = chorus;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.epMin = epMin;
        this.epMax = epMax;
        this.epPerTurn = epPerTurn;
        this.difficultClass = difficultClass;
        this.armorClass = armorClass;
        this.movement = movement;
        this.abilityScore = abilityScore;
        this.skills = skills;
        this.slotMin = slotMin;
        this.slotMax = slotMax;
        this.slotPowers = slotPowers;
        this.classPowers = classPowers;
        this.autority = autority;
        this.inventory = inventory;
    }

    public Sheet(String id, String name, String creator, Job job, String subClass, Integer level, Integer proficiencyBonus, Integer verse, Integer chorus, Integer hpMin, Integer hpMax, Integer epMin, Integer epMax, Integer epPerTurn, Integer difficultClass, Integer armorClass, Integer movement, AbilityScore abilityScore, Skills skills, Integer slotMin, Integer slotMax, String slotPowers, String classPowers, String autority, Inventory inventory, List<Magic> magics) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.job = job;
        this.subClass = subClass;
        this.level = level;
        this.proficiencyBonus = proficiencyBonus;
        this.verse = verse;
        this.chorus = chorus;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.epMin = epMin;
        this.epMax = epMax;
        this.epPerTurn = epPerTurn;
        this.difficultClass = difficultClass;
        this.armorClass = armorClass;
        this.movement = movement;
        this.abilityScore = abilityScore;
        this.skills = skills;
        this.slotMin = slotMin;
        this.slotMax = slotMax;
        this.slotPowers = slotPowers;
        this.classPowers = classPowers;
        this.autority = autority;
        this.inventory = inventory;
        this.magics.addAll(magics);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getSubClass() {
        return subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(Integer proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public Integer getVerse() {
        return verse;
    }

    public void setVerse(Integer verse) {
        this.verse = verse;
    }

    public Integer getChorus() {
        return chorus;
    }

    public void setChorus(Integer chorus) {
        this.chorus = chorus;
    }

    public Integer getHpMin() {
        return hpMin;
    }

    public void setHpMin(Integer hpMin) {
        this.hpMin = hpMin;
    }

    public Integer getHpMax() {
        return hpMax;
    }

    public void setHpMax(Integer hpMax) {
        this.hpMax = hpMax;
    }

    public Integer getEpMin() {
        return epMin;
    }

    public void setEpMin(Integer epMin) {
        this.epMin = epMin;
    }

    public Integer getEpMax() {
        return epMax;
    }

    public void setEpMax(Integer epMax) {
        this.epMax = epMax;
    }

    public Integer getEpPerTurn() {
        return epPerTurn;
    }

    public void setEpPerTurn(Integer epPerTurn) {
        this.epPerTurn = epPerTurn;
    }

    public Integer getDifficultClass() {
        return difficultClass;
    }

    public void setDifficultClass(Integer difficultClass) {
        this.difficultClass = difficultClass;
    }

    public Integer getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Integer armorClass) {
        this.armorClass = armorClass;
    }

    public Integer getMovement() {
        return movement;
    }

    public void setMovement(Integer movement) {
        this.movement = movement;
    }

    public AbilityScore getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(AbilityScore abilityScore) {
        this.abilityScore = abilityScore;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Integer getSlotMin() {
        return slotMin;
    }

    public void setSlotMin(Integer slotMin) {
        this.slotMin = slotMin;
    }

    public Integer getSlotMax() {
        return slotMax;
    }

    public void setSlotMax(Integer slotMax) {
        this.slotMax = slotMax;
    }

    public String getSlotPowers() {
        return slotPowers;
    }

    public void setSlotPowers(String slotPowers) {
        this.slotPowers = slotPowers;
    }

    public String getClassPowers() {
        return classPowers;
    }

    public void setClassPowers(String classPowers) {
        this.classPowers = classPowers;
    }

    public String getAutority() {
        return autority;
    }

    public void setAutority(String autority) {
        this.autority = autority;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Magic> getMagics() {
        return magics;
    }

    public void setMagics(List<Magic> magics) {
        this.magics = magics;
    }
}
