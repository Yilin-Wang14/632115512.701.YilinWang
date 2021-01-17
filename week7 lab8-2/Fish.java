package week7;

public class Fish extends Pets{
    String Size;
    String water;
    double speed;
    String where;
    String Species;
    String sea;
    public Fish(String species){
        this.species = species;
    }
    public void MyFish(){
        System.out.println("Nane: "+name+" Species: "+Species+" Color: "+color+" Age: "+age);
    }
    public void FishLive(){
        System.out.println("My "+species+" is living in the "+where);
    }
    public void FishSize(){
        System.out.println(Size);
    }
    public void FishSpeed(){
        System.out.println("The speed of this "+species+" is "+speed+" km/h");
    }
    public void FishSea(){
        if ("Sea".equals(sea)){
            System.out.println("Living in the "+sea+" : true");
        }else{
            System.out.println("It's living in the "+sea);
        }
    }
}
