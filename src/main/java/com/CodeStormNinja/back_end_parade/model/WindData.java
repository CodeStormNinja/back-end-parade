package com.CodeStormNinja.back_end_parade.model;

import java.time.OffsetDateTime;
import java.util.Optional;

public class WindData extends DadosBrutos{
    private double p_gust_1h;
    private double gust_kmh;
    private double sustained_kmh;

    public WindData(double lat, double lon, OffsetDateTime updated_at, String source, Optional<Integer> level,
                    double p_gust_1h, double gust_kmh, double sustained_kmh) {

        super(lat, lon, updated_at, source, level);
        this.p_gust_1h = p_gust_1h;
        this.gust_kmh = gust_kmh;
        this.sustained_kmh = sustained_kmh;
    }

    public double getP_gust_1h() {
        return p_gust_1h;
    }

    public void setP_gust_1h(double p_gust_1h) {
        this.p_gust_1h = p_gust_1h;
    }

    public double getGust_kmh() {
        return gust_kmh;
    }

    public void setGust_kmh(double gust_kmh) {
        this.gust_kmh = gust_kmh;
    }

    public double getSustained_kmh() {
        return sustained_kmh;
    }

    public void setSustained_kmh(double sustained_kmh) {
        this.sustained_kmh = sustained_kmh;
    }
}
