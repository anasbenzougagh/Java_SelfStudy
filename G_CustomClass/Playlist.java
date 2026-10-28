package G_CustomClass;


import java.time.LocalTime;

public class Playlist {
    public String artist,song,genre;
    public LocalTime length;
    public boolean IsSingle,IsAnAlbum;

    public void play (String artist, String song, String genre){
        System.out.println("Now Playing: " + song + 
        " \nBy: " + artist + 
        " \nGenre: " + genre);
    }

    public void discography(String artist, String song, String genre,LocalTime length,boolean IsSingle, boolean IsAnAlbum){
        System.out.println("Discography: \nSong: " + song + 
        " \nBy: " + artist + 
        " \nLength: " + length + 
        " \nGenre: " + genre + 
        " \nIs Single: " + IsSingle + 
        " \nIs An Album: " + IsAnAlbum);
    }

}
