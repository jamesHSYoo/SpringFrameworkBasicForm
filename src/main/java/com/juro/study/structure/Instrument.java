package com.juro.study.structure;

import java.util.List;

class Instrument {

    private List<Leg> legs;
    private List<Underlying> underlyings;
    public List<Leg> getLegs() {
        return legs;
    }
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }
    public List<Underlying> getUnderlyings() {
        return underlyings;
    }
    public void setUnderlyings(List<Underlying> underlyings) {
        this.underlyings = underlyings;
    }
}
