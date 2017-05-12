package com.example.android.guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.open_camera);
        tv.setText(stringFromJNI());


        // Find the View that shows the camera category
        Button camera = (Button) findViewById(R.id.open_camera);

        // Set a click listener on that View
        camera.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cameraIntent = new Intent(MainActivity.this, OpenCamera.class);

                // Start the new activity
                startActivity(cameraIntent);
            }
        });

        // Find the View that shows the FAQs category
        Button frequent_ques = (Button) findViewById(R.id.faqs);

        // Set a click listener on that View
        frequent_ques.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent faqsIntent = new Intent(MainActivity.this, FAQs.class);

                // Start the new activity
                startActivity(faqsIntent);
            }
        });

        // Find the View that shows the recent searches category
        Button recentsearch = (Button) findViewById(R.id.recent_searches);

        // Set a click listener on that View
        recentsearch.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent recentSearchIntent = new Intent(MainActivity.this, RecentSearches.class);

                // Start the new activity
                startActivity(recentSearchIntent);
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
