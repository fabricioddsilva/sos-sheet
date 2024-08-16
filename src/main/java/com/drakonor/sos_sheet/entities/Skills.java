package com.drakonor.sos_sheet.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Skills implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer acrobatics;
    private Integer animalHandling;
    private Integer arts;
    private Integer aiming;
    private Integer athletics;
    private Integer crime;
    private Integer diplomacy;
    private Integer deception;
    private Integer driving;
    private Integer fortitude;
    private Integer fighting;
    private Integer history;
    private Integer intimidation;
    private Integer investigation;
    private Integer insight;
    private Integer magic;
    private Integer medicine;
    private Integer perception;
    private Integer profession1;
    private Integer profession2;
    private Integer reflexes;
    private Integer religion;
    private Integer science;
    private Integer stealth;
    private Integer survival;
    private Integer tactics;
    private Integer technology;
    private Integer will;

    public Skills() {
    }

    public Skills(Integer acrobatics, Integer animalHandling, Integer arts, Integer aiming, Integer athletics, Integer crime, Integer diplomacy, Integer deception, Integer driving, Integer fortitude, Integer fighting, Integer history, Integer intimidation, Integer investigation, Integer insight, Integer magic, Integer medicine, Integer perception, Integer profession1, Integer profession2, Integer reflexes, Integer religion, Integer science, Integer stealth, Integer survival, Integer tactics, Integer technology, Integer will) {
        this.acrobatics = acrobatics;
        this.animalHandling = animalHandling;
        this.arts = arts;
        this.aiming = aiming;
        this.athletics = athletics;
        this.crime = crime;
        this.diplomacy = diplomacy;
        this.deception = deception;
        this.driving = driving;
        this.fortitude = fortitude;
        this.fighting = fighting;
        this.history = history;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.insight = insight;
        this.magic = magic;
        this.medicine = medicine;
        this.perception = perception;
        this.profession1 = profession1;
        this.profession2 = profession2;
        this.reflexes = reflexes;
        this.religion = religion;
        this.science = science;
        this.stealth = stealth;
        this.survival = survival;
        this.tactics = tactics;
        this.technology = technology;
        this.will = will;
    }


    public Integer getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Integer acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Integer getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(Integer animalHandling) {
        this.animalHandling = animalHandling;
    }

    public Integer getArts() {
        return arts;
    }

    public void setArts(Integer arts) {
        this.arts = arts;
    }

    public Integer getAiming() {
        return aiming;
    }

    public void setAiming(Integer aiming) {
        this.aiming = aiming;
    }

    public Integer getAthletics() {
        return athletics;
    }

    public void setAthletics(Integer athletics) {
        this.athletics = athletics;
    }

    public Integer getCrime() {
        return crime;
    }

    public void setCrime(Integer crime) {
        this.crime = crime;
    }

    public Integer getDiplomacy() {
        return diplomacy;
    }

    public void setDiplomacy(Integer diplomacy) {
        this.diplomacy = diplomacy;
    }

    public Integer getDeception() {
        return deception;
    }

    public void setDeception(Integer deception) {
        this.deception = deception;
    }

    public Integer getDriving() {
        return driving;
    }

    public void setDriving(Integer driving) {
        this.driving = driving;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public void setFortitude(Integer fortitude) {
        this.fortitude = fortitude;
    }

    public Integer getFighting() {
        return fighting;
    }

    public void setFighting(Integer fighting) {
        this.fighting = fighting;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Integer intimidation) {
        this.intimidation = intimidation;
    }

    public Integer getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Integer investigation) {
        this.investigation = investigation;
    }

    public Integer getInsight() {
        return insight;
    }

    public void setInsight(Integer insight) {
        this.insight = insight;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getMedicine() {
        return medicine;
    }

    public void setMedicine(Integer medicine) {
        this.medicine = medicine;
    }

    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    public Integer getProfession1() {
        return profession1;
    }

    public void setProfession1(Integer profession1) {
        this.profession1 = profession1;
    }

    public Integer getProfession2() {
        return profession2;
    }

    public void setProfession2(Integer profession2) {
        this.profession2 = profession2;
    }

    public Integer getReflexes() {
        return reflexes;
    }

    public void setReflexes(Integer reflexes) {
        this.reflexes = reflexes;
    }

    public Integer getReligion() {
        return religion;
    }

    public void setReligion(Integer religion) {
        this.religion = religion;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getSurvival() {
        return survival;
    }

    public void setSurvival(Integer survival) {
        this.survival = survival;
    }

    public Integer getTactics() {
        return tactics;
    }

    public void setTactics(Integer tactics) {
        this.tactics = tactics;
    }

    public Integer getTechnology() {
        return technology;
    }

    public void setTechnology(Integer technology) {
        this.technology = technology;
    }

    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
    }

}
