package me.mehdi.mynativeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numArray, mean;

//    // Used to load the 'native-lib' library on application startup.
//    static {
//        System.loadLibrary("native-lib");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Example of a call to a native method
        TextView numArray = (TextView) findViewById(R.id.array);
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        StringBuilder arrayStr = new StringBuilder("Array: ");
        for (int anA : a) {
            arrayStr.append(String.valueOf(anA)).append(",");
        }
        numArray.setText(arrayStr.toString());

        TextView mean = (TextView) findViewById(R.id.mean);
        String meanText = String.valueOf(MyNativeLib.mean(a));
        mean.setText(meanText);

    }

//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    public native String stringFromJNI();
}
