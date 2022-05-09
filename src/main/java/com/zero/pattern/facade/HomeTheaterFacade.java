package main.java.com.zero.pattern.facade;

/**
 * @author zero
 * @description HomeTheaterFacade
 * @date 2022/5/9 15:07
 */
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
    }

    public void open() {
        projector.on();
        dvdPlayer.on();
        projector.focus();
        dvdPlayer.play();
    }

    public void close() {
        projector.off();
        dvdPlayer.off();
    }
}
