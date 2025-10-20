package structural.fecade;

public class FecadeTest {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Light light = new Light();
        PopcornMaker popcornMaker = new PopcornMaker();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, light, popcornMaker);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
