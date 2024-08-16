package com.drakonor.sos_sheet.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Inventory implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer slotMin;
    private Integer slotMax;

    private List<String> items = new ArrayList<>();

    public Inventory() {
    }

    public Inventory(Integer slotMin, Integer slotMax, List<String> items) {
        this.slotMin = slotMin;
        this.slotMax = slotMax;
        this.items.addAll(items);
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

    public List<String> getItems() {
        return items;
    }


}
