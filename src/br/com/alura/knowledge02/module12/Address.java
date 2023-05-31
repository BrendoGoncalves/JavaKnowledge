package br.com.alura.knowledge02.module12;

public class Address {
    private String street;
    private int streetNumber;
    private String city;

    public Address(){
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

    public void goAway(){
        System.out.println("Good-bye!");
    }
}
