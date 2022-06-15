package at.campus02.iwi.music;

public class MusicApp {
    public static void main(String[] args) {

        Album album = new Album();
        album.nrSongs = 4;
        album.longestSong = 240;
        album.shortestSong = 90;

        System.out.println("the average of long of song is: " + album.averageSongLength());
        System.out.println("the total length of all of album is: " + album.totalLength());
        System.out.println("is the album size fit in save place? " + album.fitsOnMedium(10));
    }
}
