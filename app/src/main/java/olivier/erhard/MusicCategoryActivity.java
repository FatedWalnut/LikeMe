package olivier.erhard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MusicCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_category_activity);
        ArrayAdapter<Music> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Music.music);
        ListView list_musics = (ListView) findViewById(R.id.lista_de_musicas);
        list_musics.setAdapter(listAdapter);
    }
}
