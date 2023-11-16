package com.laca.entity.Routes.ConcretePrototype;

public class Coordinates_Point {
    private String address;
    private LatLng location;
    private String placeId;

    /* ESTRUCTURA DE OBJETO GEOCODER REQUEST
 { address: string,  //OBLIGATORIO
 location: Entities.Routes.ConcretePrototype.LatLng, //OBLIGATORIO
 placeId: string,  //OBLIGATORIO}*/

    public Coordinates_Point() {
    }

    public Coordinates_Point(String address, LatLng location, String placeId) {
        this.address = address;
        this.location = location;
        this.placeId = placeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    @Override
    public String toString() {
        return "Coordinates_Point{" +
                "address='" + address + '\'' +
                ", location=" + location +
                ", placeId='" + placeId + '\'' +
                '}';
    }
}
