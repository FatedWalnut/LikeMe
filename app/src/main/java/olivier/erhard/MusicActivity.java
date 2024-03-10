package olivier.erhard;


import olivier.erhard.MusicCategoryActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MusicActivity extends Activity{
    public static final String EXTRA_MUSICID = "musicId";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity);

        int musicId = (Integer)getIntent().getExtras().get(EXTRA_MUSICID);
        Music music = Music.music[musicId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(music.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(music.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(music.getImageResourceID());
        photo.setContentDescription(music.getName());

    }


}
