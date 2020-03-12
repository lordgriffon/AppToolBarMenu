package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Grupo_Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grupo_layout);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("App Grupo Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.grupomenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mGpAlterar:
                Toast.makeText(getApplicationContext(), "Cliquei em Alterar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpExcluir:
                Toast.makeText(getApplicationContext(), "Cliquei em Excluir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpSair:
                finish();
                break;
            case R.id.mGpFav:
                Toast.makeText(getApplicationContext(), "Cliquei em Favoritos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpSpam:
                Toast.makeText(getApplicationContext(), "Cliquei em Spam", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpLixeira:
                Toast.makeText(getApplicationContext(), "Cliquei em Lixeira", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
