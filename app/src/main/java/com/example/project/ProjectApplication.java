package com.example.project;



import android.app.Application;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class ProjectApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(this, "q4LrrETwQIHkmXIRwWQu9GOfNWVoumBrYWbHssWZ", "ucAvx2GptJjAFb7ZWJeyfRob3fK5HPyvnjyvXVuv");


        ParseUser user = new ParseUser();
        user.setUsername("my name");
        user.setPassword("my pass");
        user.setEmail("email@example.com");

// other fields can be set just like with ParseObject
        user.put("phone", "650-555-0000");

        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    // Hooray! Let them use the app now.
                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });

    }

}
