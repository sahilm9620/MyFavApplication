package sahil.mulla.myfavapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        floatingActionButton=findViewById(R.id.fav_button);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            displayCreateCategoryItemDialoge();
            }
        });

    }

    private void displayCreateCategoryItemDialoge() {
        final EditText itemEditText=new EditText(this);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(itemEditText);
        alertDialog.setTitle("Enter The Item Name Here");
        alertDialog.setPositiveButton("Create", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String  item=itemEditText.getText().toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        });
     alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.setting_action:

                startActivity(new Intent(Settings.ACTION_SETTINGS));
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}

