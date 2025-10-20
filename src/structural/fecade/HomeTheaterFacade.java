package structural.fecade;

/**
 * The {@code HomeTheaterFacade} class provides a simplified interface to a complex
 * home theater subsystem composed of multiple devices including
 * {@link DVDPlayer}, {@link Projector}, {@link Light}, and {@link PopcornMaker}.
 * <p>
 * This class demonstrates the <strong>Facade Design Pattern</strong> by exposing
 * simple operations such as {@link #watchMovie(String)} and {@link #endMovie()}
 * that internally coordinate the behavior of all subsystem components.
 * </p>
 *
 * <p>Example Usage:</p>
 * <pre>
 * HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, light, popcorn);
 * homeTheater.watchMovie("Inception");
 * homeTheater.endMovie();
 * </pre>
 *
 * @author Mohammad Reza
 * @since 1.0
 */
class HomeTheaterFacade {
    private final DVDPlayer dvd;
    private final Projector projector;
    private final Light light;
    private final PopcornMaker popcornMaker;

    /**
     * Constructs the {@code HomeTheaterFacade} using existing subsystem components.
     *
     * @param dvd          the DVD player instance
     * @param projector    the projector instance
     * @param light        the lighting system instance
     * @param popcornMaker the popcorn maker instance
     */
    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Light light, PopcornMaker popcornMaker) {
        this.dvd = dvd;
        this.projector = projector;
        this.light = light;
        this.popcornMaker = popcornMaker;
    }

    /**
     * Starts the entire movie-watching experience by orchestrating all subsystem
     * components—preparing popcorn, dimming lights, configuring the projector,
     * and playing the selected movie.
     *
     * @param movie the movie title to be played
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornMaker.on();
        popcornMaker.pop();
        light.dim(10);
        projector.on();
        projector.wideScreenMode();
        dvd.on();
        dvd.play(movie);
    }

    /**
     * Ends the movie experience by shutting down all subsystem components
     * and resetting the environment to normal.
     */
    public void endMovie() {
        System.out.println("\nShutting movie theater down...");
        popcornMaker.off();
        light.on();
        projector.off();
        dvd.off();
    }
}

