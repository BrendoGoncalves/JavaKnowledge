package br.com.alura.knowledge06.module21;

public class Lion extends Feline{

    private static final long serialVersionUID = 2L;
    private String name;
    private transient Country nationalaty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void roar(){
        System.out.println("Roarrrr!");
    }
}
