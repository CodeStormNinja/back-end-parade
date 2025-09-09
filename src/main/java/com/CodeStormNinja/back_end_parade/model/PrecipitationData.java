package com.CodeStormNinja.back_end_parade.model;

import java.time.OffsetDateTime;
import java.util.Optional;

public class PrecipitationData extends DadosBrutos {
    private double p_rain_1h;
    private double intensity_mm_h;

    public PrecipitationData(double p_rain_1h, double intensity_mm_h) {
        this.p_rain_1h = p_rain_1h;
        this.intensity_mm_h = intensity_mm_h;
    }

    public PrecipitationData(double temperatura, double lat, double lon, OffsetDateTime updated_at, String source, Optional<Integer> level, double p_rain_1h, double intensity_mm_h) {
        super(temperatura, lat, lon, updated_at, source, level);
        this.p_rain_1h = p_rain_1h;
        this.intensity_mm_h = intensity_mm_h;
    }

    public double getP_rain_1h() {
        return p_rain_1h;
    }

    public void setP_rain_1h(double p_rain_1h) {
        this.p_rain_1h = p_rain_1h;
    }

    public double getIntensity_mm_h() {
        return intensity_mm_h;
    }

    public void setIntensity_mm_h(double intensity_mm_h) {
        this.intensity_mm_h = intensity_mm_h;
    }
}
