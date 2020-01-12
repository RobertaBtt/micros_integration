package com.pos.common.type;


import java.beans.Transient;
import java.util.Objects;

public class Location {

    private Double latitude;
    private Double longitude;
    private String address;
    private String city;
    private String postalCode;
    private String country;


    private Location() {
    }

    public Location(Double latitude, Double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Double latitude, Double longitude, String address, String city, String postalCode, String country) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Transient
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(location.latitude, latitude) &&
                Objects.equals(location.longitude, longitude) &&
                Objects.equals(address, location.address) &&
                Objects.equals(city, location.city) &&
                Objects.equals(postalCode, location.postalCode) &&
                Objects.equals(country, location.country);
    }

    @Transient
    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, address, city, postalCode, country);
    }

    @Transient
    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}