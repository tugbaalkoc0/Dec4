public class TestClassPlaylist {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Favorite Songs");
        playlist.addSong("Çelik - Nazına ölüyorum");
        playlist.addSong("Taylor Swift - Don't Blame");
        playlist.addSong("Semicenk - Batık Gemi");
        playlist.getSongCount();

        playlist.removeSong("Semicenk - Batık Gemi");

        playlist.printSongs();

    }
}
