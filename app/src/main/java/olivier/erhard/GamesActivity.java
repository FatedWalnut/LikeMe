package olivier.erhard;


import olivier.erhard.GamesCategoryActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class GamesActivity extends Activity{
    public static final String EXTRA_GAMESID = "gamesid";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_activity);

        int gamesId = (Integer)getIntent().getExtras().get(EXTRA_GAMESID);
        Games games = Games.games[gamesId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(games.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(games.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(games.getImageResourceID());
        photo.setContentDescription(games.getName());

    }


}
