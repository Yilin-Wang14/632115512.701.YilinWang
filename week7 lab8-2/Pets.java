package week7;

public class Pets {
    String species;
    String name;
    String color;
    int age;
    public Pets(){
    }
    public Pets(String species,String name,String color,int age){
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void introduce(){
        System.out.println("My "+species);
    }
    }

