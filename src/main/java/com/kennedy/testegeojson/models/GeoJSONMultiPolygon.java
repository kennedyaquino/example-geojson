package com.kennedy.testegeojson.models;

import java.util.List;

public class GeoJSONMultiPolygon {
    private String type = "MultiPolygon";
    private List<List<List<List<Double>>>> coordinates;

    public GeoJSONMultiPolygon() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<List<List<List<Double>>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }




}
