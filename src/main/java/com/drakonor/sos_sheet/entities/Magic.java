package com.drakonor.sos_sheet.entities;

import com.drakonor.sos_sheet.entities.enums.Execution;
import com.drakonor.sos_sheet.entities.enums.MagicCategory;
import com.drakonor.sos_sheet.entities.enums.MagicStructure;

import java.util.Objects;

public class Magic {

    private String name;
    private MagicStructure structure;
    private MagicCategory category;
    private Execution execution;
    private String range;
    private String target;
    private String duration;
    private String formula;
    private Integer cost;

    public Magic() {
    }

    public Magic(String name, MagicStructure structure, MagicCategory category, Execution execution, String range, String target, String duration, String formula, Integer cost) {
        this.name = name;
        this.structure = structure;
        this.category = category;
        this.execution = execution;
        this.range = range;
        this.target = target;
        this.duration = duration;
        this.formula = formula;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MagicStructure getStructure() {
        return structure;
    }

    public void setStructure(MagicStructure structure) {
        this.structure = structure;
    }

    public MagicCategory getCategory() {
        return category;
    }

    public void setCategory(MagicCategory category) {
        this.category = category;
    }

    public Execution getExecution() {
        return execution;
    }

    public void setExecution(Execution execution) {
        this.execution = execution;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

}
