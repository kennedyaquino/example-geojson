package com.kennedy.testegeojson.models;

import java.util.Map;

public class GeoJSONFeature {

    private String type = "Feature";

    private Geometry geometry;
    private Map<String, Object> properties;

    public GeoJSONFeature() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "GeoJSONFeature{" +
                "type='" + type + '\'' +
                ", geometry=" + geometry +
                ", properties=" + properties +
                '}';
    }
}
