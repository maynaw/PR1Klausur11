package at.campus02.iwi.music;

public class Album {
    public int nrSongs;
    public double shortestSong;
    public double longestSong;


    public double averageSongLength() {
        double sum = 0;
        sum = longestSong + shortestSong;
        return sum / 2;
    }

    public double totalLength() {

        return averageSongLength() * nrSongs;
    }

    public boolean fitsOnMedium(int minutes) {
        double albumImMinuten = totalLength() / 60;
        if (albumImMinuten <= minutes)
            return true;
        else return false;
    }


}
