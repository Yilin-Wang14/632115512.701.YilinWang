package week7;

public class Bird extends Pets{
    String Species;
    String country;
    String fly;
    String speak;
    public Bird(String species){
        this.species = species;
    }
    public void Mybird(){
        System.out.println("Name: "+name+" Species: "+Species+" Color: "+color+" Age: "+age);
    }
    public void BirdLive(){
        System.out.println("My "+species+" is comes from "+country);
    }
    public void Birdspeak(){
        System.out.println("This "+species+" can speak "+speak);
    }
    public void BirdFly(){
        if ("can fly".equals(fly)){
            System.out.println("This "+species+" "+fly);
        }else{
            System.out.println("This "+species+" can not fly");
        }
    }
}
