package G_CustomClass;

import java.time.LocalTime;

public class PlaylistPlayer {
    public static void main(String[] args) {
        Playlist song = new Playlist();

        song.play("DTG","Rover","HipHop");
        System.out.println("-------------------------------------------------------");
        song.discography("DTG","Rover","HipHop", LocalTime.of(0,2,47),true,false);

    }
}
