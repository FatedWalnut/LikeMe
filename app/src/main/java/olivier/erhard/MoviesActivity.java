package olivier.erhard;



import olivier.erhard.MusicCategoryActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MoviesActivity extends Activity{
    public static final String EXTRA_MOVIESID = "movieId";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_activity);

        int movieId = (Integer)getIntent().getExtras().get(EXTRA_MOVIESID);
        Movie movie = Movie.movie[movieId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(movie.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(movie.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(movie.getImageResourceID());
        photo.setContentDescription(movie.getName());

    }


}
