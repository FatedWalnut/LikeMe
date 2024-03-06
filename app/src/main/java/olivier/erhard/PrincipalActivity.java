package olivier.erhard;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import  android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class PrincipalActivity  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(PrincipalActivity.this, GamesCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = findViewById(R.id.lista_opcoes);
        listView.setOnItemClickListener(itemClickListener);
    }
}
