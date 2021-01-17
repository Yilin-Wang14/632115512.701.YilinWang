package week7;

public class Dog extends Pets{
    String size;
    String hair;
    String sport;
    String bark;
    String place;
    String Species;
    public Dog(String species){
        this.species = species;
    }
    public void MyDog(){
        System.out.println("Name: "+name+" Species: "+Species+" Color: "+color+" Age: "+age);
    }
    public void DogSport(){
        System.out.println("My "+species+" "+name+" is "+sport+" to the "+place);
    }
    public void DogSizeBark(){
        System.out.println(size+" bark "+bark);
    }
    public void Doghair(){
        if ("Short".equals(hair)){
            System.out.println(hair+" hair: true");
        }else{
            System.out.println("False is "+hair+" hair");
        }
    }
    
}
