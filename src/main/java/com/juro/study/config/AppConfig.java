package com.juro.study.config;

import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    private String observedDay;

    private String[] targetAssetType;

    public String getObservedDay() {
        return observedDay;
    }

    public void setObservedDay(String observedDay) {
        this.observedDay = observedDay;
    }

    public String[] getTargetAssetType() {
        return targetAssetType;
    }

    public void setTargetAssetType(String[] targetAssetType) {
        this.targetAssetType = targetAssetType;
    }
}
