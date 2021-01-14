package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20);

        art.genre = "hip hop";
        art.jod0 = "Tercher";
        art.job2 = "Writer";
        art.job3 = "Construction Woker";
        art.job4 = "Music creator";
        art.introduce();
        art.playMusic();
        art.job();
    }
}
