package vigya.digipodium.countonme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textCount;
    int counter;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCount = findViewById(R.id.btnCount);
        Button btnReset = findViewById(R.id.btnReset);
        Button btnsetCount=findViewById(R.id.btnsetCount);
        editTextNumber = findViewById(R.id.editTextNumber);
        textCount = findViewById(R.id.textCount);
    }
    public void setNumber(View v){
        counter= Integer.parseInt(editTextNumber.getText().toString());

    }
    public void increaseCount(View v){
        counter++;
        textCount.setText(String.valueOf(counter));
    }

    public void resetCount(View v){
        counter = 0;
        textCount.setText(String.valueOf(counter));
        editTextNumber.setText(String.valueOf(0));
    }
}
