package week6;

public class Artist extends Person{
    String genre;
    String jod0;
    String job2;
    String job3;
    String job4;
    public Artist(String name,int age){
    this.age = age;
    this.name = name;
    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music.");
    }
    public void job(){
        System.out.println("I used to be the "+jod0);
        System.out.println("Then i became a "+job2);
        System.out.println("And i changed my job and became a "+job3);
        System.out.println("Now i'm a "+job4);
    }
}
