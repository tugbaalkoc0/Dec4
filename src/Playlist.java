import java.util.ArrayList;
public class Playlist {
    private String name;
    private ArrayList <String> songs = new ArrayList<>();




    public Playlist(String name){
        this.name = name;

    }
    public String getName() {
        return name;
    }
    void addSong(String songName){
        songs.add(songName);

    }
    void removeSong(String songName){
        songs.remove(songName);

    }
    void printSongs(){
        System.out.println("Playlist name : " + name);
        if(songs.isEmpty() ){
            System.out.println("The playlist is empty");
            return;
        }
        for(int i = 0 ; i<songs.size() ; i++){
            System.out.println((i+1) + ". " + songs.get(i));
        }


    }
    int getSongCount(){
        return songs.size();
    }

}
