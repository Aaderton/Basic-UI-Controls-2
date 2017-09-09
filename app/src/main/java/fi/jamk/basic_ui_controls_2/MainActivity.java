package fi.jamk.basic_ui_controls_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.login); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }

    public void showFields(View view) {
// find login-field id and content to a string variable
        AutoCompleteTextView tv1 = (AutoCompleteTextView) findViewById(R.id.login);
        String text1 = tv1.getText().toString();

// find password-field id and content to a string variable
        EditText tv2 = (EditText) findViewById(R.id.password);
        String text2 = tv2.getText().toString();

        //add the strings together
        String text3 = text1+" "+text2;

// toast message to screen
        Toast.makeText(getApplicationContext(), text3,
                Toast.LENGTH_SHORT).show();
    }
}
