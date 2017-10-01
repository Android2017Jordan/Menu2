package mariam.hashash.menu;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import static mariam.hashash.menu.R.id.spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton Rb1,Rb2;
    CheckBox ch1,ch2;
    TextView txt1;
    Spinner sp1;
    ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner)findViewById(spinner);
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        Rb1=(RadioButton)findViewById(R.id.radioButton);
        Rb2=(RadioButton)findViewById(R.id.radioButton2);
        c=(ConstraintLayout)findViewById(R.id.Co);
        txt1=(TextView)findViewById(R.id.txt);
        ch1.setOnClickListener(this);
        ch2.setOnClickListener(this);
        Rb1.setOnClickListener(this);
        Rb2.setOnClickListener(this);
sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        txt1.setText(sp1.getSelectedItem().toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});

        spinner2();
    }

    private void spinner2() {
        txt1.setText(sp1.getSelectedItem().toString());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.checkBox){

        c.setBackgroundColor(Color.YELLOW);
        }else if (view.getId() == R.id.checkBox2){
            c.setBackgroundColor(Color.BLUE);
        }else if (view.getId() == R.id.radioButton){
            c.setBackgroundColor(Color.BLACK);
        }else if (view.getId() == R.id.radioButton2){
            c.setBackgroundColor(Color.WHITE);
        }
        spinner2();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.back)
            System.exit(-1);
        return super.onOptionsItemSelected(item);
    }
}
