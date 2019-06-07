import java.util.HashMap;
import java.util.Set;

public class Test{
    public static void main(String[] args){
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Brown Sugar", "You shoulda heard me just around midnight.");
        tracklist.put("Dead Flowers", "I'll be in my basement room with a needle and a spoon.");
        tracklist.put("Honky Tonk Women", "I just can't seem to drink you off my mind.");
        tracklist.put("Wild Horses", "You know I can't let you slide through my hands.");
        System.out.println("Honky Tonk Women: " + tracklist.get("Honky Tonk Women"));
        Set<String> titles = tracklist.keySet();
        for(String title : titles){
            System.out.println(title + ": " + tracklist.get(title));
        }
    }
}