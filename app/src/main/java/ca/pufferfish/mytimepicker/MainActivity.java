package ca.pufferfish.mytimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker = findViewById(R.id.timePicker);
    }

    public void showTime(View v)
    { Toast.makeText(
                getBaseContext(),
                String.format("%d : %d", timePicker.getHour(), timePicker.getMinute()),
                Toast.LENGTH_LONG).show();
    }

}
