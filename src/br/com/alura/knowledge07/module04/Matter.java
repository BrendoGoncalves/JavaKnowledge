package br.com.alura.knowledge07.module04;

public class Matter {
    private String name;
    private int students;
    public Matter(String name, int students) {
        this.name = name;
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public int getStudents() {
        return students;
    }
}
