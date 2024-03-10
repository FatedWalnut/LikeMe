package olivier.erhard;


import olivier.erhard.GamesCategoryActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;


public class MovieCategoryActivity extends Activity {
    private static final String EXTRA_MOVIESID = "moviesId";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_category_activity);
        ArrayAdapter<Movie> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Movie.movie);

        ListView listMovie = (ListView) findViewById(R.id.lista_de_filmes);
        listMovie.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listMusic, View itemView, int position, long id) {
                        Intent intent = new Intent(MovieCategoryActivity.this,
                                MoviesActivity.class);
                        intent.putExtra(MoviesActivity.EXTRA_MOVIESID,(int) id);
                        startActivity(intent);

                    }
                };
        listMovie.setOnItemClickListener(itemClickListener);
    }
}