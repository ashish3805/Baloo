package com.boophee.baloo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView currentAmountTextView;
    EditText newAmountEditText;
    Button amountAddButton;
    MainContent mainContent;

    public MainActivity() {
        this.mainContent = new MainContent();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        currentAmountTextView = (TextView) findViewById(R.id.currentAmountTextView);
        currentAmountTextView.setText("0");
        newAmountEditText = (EditText) findViewById(R.id.newAmountEditText);
        amountAddButton = (Button) findViewById(R.id.amountAddButton);

        amountAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Transaction t;
                double newAmount = Double.parseDouble(String.valueOf(newAmountEditText.getText()));
                User user = new User("ashish","MALE");
                t = mainContent.ledger.addTransaction(newAmount,user);
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
                currentAmountTextView.setText(String.valueOf(mainContent.ledger.getTotal()));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
