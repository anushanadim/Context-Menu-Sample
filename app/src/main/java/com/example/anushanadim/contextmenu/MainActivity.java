package com.example.anushanadim.contextmenu;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        options=findViewById(R.id.button);

        registerForContextMenu(options);
    }

    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu,v,menuInfo);
        getMenuInflater().inflate(R.menu.my_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.option1:
                Toast.makeText(MainActivity.this,"Option1",Toast.LENGTH_LONG).show();
                break;

            case R.id.option2:
                Toast.makeText(MainActivity.this,"Option2",Toast.LENGTH_LONG).show();
                break;

            case R.id.option3:
                Toast.makeText(MainActivity.this,"Option3",Toast.LENGTH_LONG).show();
                break;

        }

        return super.onContextItemSelected(item);
    }
}
