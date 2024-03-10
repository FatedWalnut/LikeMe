package olivier.erhard;


import olivier.erhard.GamesCategoryActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;


public class GamesCategoryActivity extends Activity {
    private static final String EXTRA_GAMESID = "gamesId";

   @Override

    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.games_category_activity);
       ArrayAdapter<Games> listAdapter = new ArrayAdapter<>(
               this,
               android.R.layout.simple_list_item_1,
               Games.games);

       ListView listGames = (ListView) findViewById(R.id.lista_de_jogos);
       listGames.setAdapter(listAdapter);

       AdapterView.OnItemClickListener itemClickListener =
               new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> listGames, View itemView, int position, long id) {
                       Intent intent = new Intent(GamesCategoryActivity.this,
                               GamesActivity.class);
                       intent.putExtra(GamesActivity.EXTRA_GAMESID,(int) id);
                       startActivity(intent);

                   }
               };
       listGames.setOnItemClickListener(itemClickListener);
   }
        }