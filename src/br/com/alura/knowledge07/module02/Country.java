package br.com.alura.knowledge07.module02;

public class Country implements Comparable<Country>{
    private String name;
    private long population;

    public Country(String name, long population){
        super();
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getPopulation();
    }

    @Override
    public int compareTo(Country country) {
        return this.getName().compareTo(country.getName());
    }
}
