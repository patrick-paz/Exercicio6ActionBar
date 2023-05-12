package com.example.exercicio6actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.act_adicionar){
            Toast.makeText(this,R.string.act_adicionar_contato, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_editar){
            Toast.makeText(this,R.string.act_editar_contato, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_remover){
            Toast.makeText(this,R.string.act_remover_contato, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_ajuda){
            Toast.makeText(this,R.string.act_ajudar_contato, Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
