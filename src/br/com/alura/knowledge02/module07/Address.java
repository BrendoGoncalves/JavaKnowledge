package br.com.alura.knowledge02.module07;

public class Address {
    private String street;
    private int streetNumber;
    private String city;

    public Address(String street, int streetNumber, String city){
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
