package olivier.erhard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

public class GamesCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_category_activity);

        ArrayAdapter<Games> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Games.games);
        ListView listJogos = findViewById(R.id.lista_de_jogos);
        listJogos.setAdapter(listAdapter);

        listJogos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(GamesCategoryActivity.this, Games.class);
                intent.putExtra(GamesCategoryActivity.EXTRA_GAMESID, (int) id);
                startActivity(intent);
            }
        });
    }
}
