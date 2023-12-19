/* Devin Pombo
 * 11/09/22
 * CSE007 - classwork
 * Purpose: practice object oriented programming and creating a class
 */

public class TVShow{
    private String name;
    private String stream;
    private String genre;
    private double avgLength;
    private int episodes=0; 
    private static int shows = 0;

    //constructors
    public TVShow(){
        String name;
        String stream;
        String genre;
        double avgLength;
        shows++;
    }
    public TVShow(String name, String stream, String genre, double avgLength){
        this.name = name;
        this.stream = stream;
        this.genre = genre;
        this.avgLength = avgLength;
        shows++;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getStream(){
        return stream;
    }
    public String getGenre(){
        return genre;
    }
    public double getAvgLength(){
        return avgLength;
    }
    public int getEpisodes(){ 
        return episodes;
    }
    public static int getShows(){
        return shows;
    }
    
    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setStream(String stream){
        this.stream = stream;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setAvgLength(double avgLength){
        this.avgLength = avgLength;
    }
    public void setEpisodes(int episodes){ 
        this.episodes = episodes;
    }

    
    public int airEpisodes(){
        episodes++;
        return episodes;
    }
    public int airEpisodes(int count){
        episodes = episodes + count;
        return episodes;
    }
    public double totalAirtime(){
        double totalAirtime = episodes * avgLength;
        return totalAirtime;
    } 
        
}