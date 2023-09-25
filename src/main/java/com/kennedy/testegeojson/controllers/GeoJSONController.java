package com.kennedy.testegeojson.controllers;

import com.kennedy.testegeojson.models.GeoJSONFeature;
import com.kennedy.testegeojson.models.GeoJSONMultiPolygon;
import com.kennedy.testegeojson.models.Geometry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/geojson")
public class GeoJSONController {

    @GetMapping("/point")
    public GeoJSONFeature getExampleGeoJson() {
        // Criando um objeto GeoJson de exemplo
        GeoJSONFeature feature = new GeoJSONFeature();
        Geometry geometry = new Geometry();
        geometry.setType("Point");
        geometry.setCoordinates(Arrays.asList(10.0, 20.0));
        feature.setGeometry(geometry);

        //adicionando propriedade adicionais, se necessario
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Exemplo de localização");
        feature.setProperties(properties);

        return feature;
    }

    @GetMapping("/multipolygon")
    public GeoJSONMultiPolygon getMultiPolygonGeoJSON() {
        // Crie um objeto GeoJSON de exemplo representando um MultiPolygon
        GeoJSONMultiPolygon multiPolygon = new GeoJSONMultiPolygon();

        // Adicione coordenadas para duas regiões poligonais diferentes
        List<List<List<List<Double>>>> polygonCoordinates = new ArrayList<>();

        // Primeiro MultiPolygon (um retângulo)
        List<List<List<Double>>> firstPolygon = new ArrayList<>();
        List<List<Double>> firstRing = new ArrayList<>();



        firstRing.addAll(List.of( Arrays.asList(100.0, 0.0), Arrays.asList(101.0, 0.0), Arrays.asList(101.0, 1.0), Arrays.asList(100.0, 1.0), Arrays.asList(100.0, 0.0) ));
        firstPolygon.add(firstRing);

        // Segundo MultiPolygon (um triângulo)
        List<List<List<Double>>> secondPolygon = new ArrayList<>();
        List<List<Double>> secondRing = new ArrayList<>();
        secondRing.addAll(List.of( Arrays.asList(102.0, 0.0), Arrays.asList(103.0, 0.0), Arrays.asList(103.0, 1.0), Arrays.asList(102.0, 1.0), Arrays.asList(102.0, 0.0) ));
        secondPolygon.add(secondRing);

        polygonCoordinates.add(firstPolygon);
        polygonCoordinates.add(secondPolygon);

        multiPolygon.setCoordinates(polygonCoordinates);

        return multiPolygon;
    }
}
