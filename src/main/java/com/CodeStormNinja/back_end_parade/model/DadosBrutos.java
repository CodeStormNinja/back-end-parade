package com.CodeStormNinja.back_end_parade.model;

import java.time.OffsetDateTime;
import java.util.Optional;

public class DadosBrutos {

    private double temperatura;
    private double lat;
    private double lon;
    private OffsetDateTime updated_at;
    private String source;
    private Optional<Integer> level;

    public DadosBrutos(){


    }

    public DadosBrutos(double temperatura,double lat, double lon, OffsetDateTime updated_at, String source, Optional<Integer> level) {
        this.temperatura = temperatura;
        this.lat = lat;
        this.lon = lon;
        this.updated_at = updated_at;
        this.source = source;
        this.level = level;

    }


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public OffsetDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(OffsetDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Optional<Integer> getLevel() {
        return level;
    }

    public void setLevel(Optional<Integer> level) {
        this.level = level;
    }


    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}

