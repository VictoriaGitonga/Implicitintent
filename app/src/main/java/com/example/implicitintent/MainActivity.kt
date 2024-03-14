package com.example.implicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    EditText URLentry;
    Button searchButton;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        URLentry = findViewById(R.id.urlText);
        searchButton = findViewById(R.id.searchButton);

        //OnClickListener is an abstract function
        //View - collection of functions, abstract class
        //on this view, inherit from listener
        searchButton.setOnClickListener(new View.OnClickListener(){
            //override since you've already used the function
            @Override
            //picks text from text box and save to URL
            public void onClick(View view){
            String URL = URLentry.getText().toString();
                //open action view and pass URL (converts what was passed in string to URL but in the correct format)
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                StartActivity(i);
        };
    }
}