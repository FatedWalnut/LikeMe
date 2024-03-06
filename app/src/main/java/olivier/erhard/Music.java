package olivier.erhard;


public class Music {
    private String name;
    private String description;
    private int imageResourceID;

    private String videoUrl;



    public static final Music[] music = {
            new Music("DNA", "PHONK",R.drawable.dna,"https://www.youtube.com/watch?v=UktZ2npc5qw"),
            new Music("SOTIRED","PHONK ",R.drawable.sotired,"https://www.youtube.com/watch?v=xrHsSiqGiQM"),
            new Music("SHINZOPHONK","PHONK",R.drawable.oasis,"https://www.youtube.com/watch?v=r8OipmKFDeM")

    };
    private Music(String name, String description, int imageResourceID, String videoUrl){
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
        this.videoUrl = videoUrl;

    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceID(){
        return imageResourceID;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String toString(){
        return this.name;
    }

}
