package olivier.erhard;


import olivier.erhard.GamesCategoryActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;


public class MusicCategoryActivity extends Activity {
    private static final String EXTRA_MUSICID = "gamesId";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_category_activity);
        ArrayAdapter<Music> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Music.music);

        ListView listMusic = (ListView) findViewById(R.id.lista_de_musicas);
        listMusic.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listMusic, View itemView, int position, long id) {
                        Intent intent = new Intent(MusicCategoryActivity.this,
                                MusicActivity.class);
                        intent.putExtra(MusicActivity.EXTRA_MUSICID,(int) id);
                        startActivity(intent);

                    }
                };
        listMusic.setOnItemClickListener(itemClickListener);
    }
}