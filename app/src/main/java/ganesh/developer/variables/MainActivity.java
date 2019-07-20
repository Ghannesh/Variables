package ganesh.developer.variables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int age = 28;
//        float price = 19.9f; //float, double
//        double userscore = 5.3333333;
//        long CoumputerRam = 10243472347l;
//
//        boolean isalive = true;
//
//        String name = "Ganesh";
//        char letterG = 'G';
//
//        Log.i( "MyTag", CoumputerRam + "");

        TextView text = findViewById(R.id. Text);

        int sumTwoIntegerNumbers = 12 + 15;
        text.setText(sumTwoIntegerNumbers + ""+ sumTwoIntegerNumbers);


    }
}