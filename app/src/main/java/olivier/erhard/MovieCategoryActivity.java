package olivier.erhard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MovieCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_category_activity);
        ArrayAdapter<Movie> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Movie.movie);
        ListView list_movies = findViewById(R.id.lista_de_filmes);
        list_movies.setAdapter(listAdapter);
    }
}
