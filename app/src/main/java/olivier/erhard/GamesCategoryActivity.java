package olivier.erhard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GamesCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_category_activity);
        ArrayAdapter<Games> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Games.games);
        ListView listJogos = (ListView) findViewById(R.id.lista_de_jogos);
        listJogos.setAdapter(listAdapter);
    }
}
