package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create the primary layout of this app
        final LinearLayout inputLayout = new LinearLayout(this);

        //Create the parameters for each of the elements in this layout.
        LinearLayout.LayoutParams viewParams = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        );

        //Create all the input fields for the words to put in the story.
         AppCompatTextView characterName = new AppCompatTextView(this);
        characterName.setTextSize(14);
        characterName.setText("Enter a name: ");

        final AppCompatEditText characterNameInput = new AppCompatEditText(this);
        characterNameInput.setLayoutParams(viewParams);

        AppCompatTextView vehicle = new AppCompatTextView(this);
        vehicle.setTextSize(14);
        vehicle.setText("Enter a type of vehicle: ");

        final AppCompatEditText vehicleInput = new AppCompatEditText(this);
        vehicleInput.setLayoutParams(viewParams);

        AppCompatTextView place = new AppCompatTextView(this);
        place.setTextSize(14);
        place.setText("Enter a place: ");

        final AppCompatEditText placeInput = new AppCompatEditText(this);
        placeInput.setLayoutParams(viewParams);

        AppCompatTextView physicalItem = new AppCompatTextView(this);
        physicalItem.setTextSize(14);
        physicalItem.setText("Enter a plural physical item: ");

        final AppCompatEditText physicalItemInput = new AppCompatEditText(this);
        physicalItemInput.setLayoutParams(viewParams);

        AppCompatTextView physicalItemTwo = new AppCompatTextView(this);
        physicalItemTwo.setTextSize(14);
        physicalItemTwo.setText("Enter another plural physical item: ");

        final AppCompatEditText physicalItemTwoInput = new AppCompatEditText(this);
        physicalItemTwoInput.setLayoutParams(viewParams);

        final AppCompatTextView storyView = new AppCompatTextView(this);
        storyView.setTextSize(14);


        //Create the button which tells the app to build the story.
        AppCompatButton createStory = new AppCompatButton(this);
        createStory.setText("Create Story!");
        //This code creates the story once the button is clicked
        createStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gathers the words the user inputted.
                String characterNameValue = characterNameInput.getText().toString();
                String vehicleValue = vehicleInput.getText().toString();
                String placeValue = placeInput.getText().toString();
                String physicalItemValue = physicalItemInput.getText().toString();
                String physicalItemTwoValue = physicalItemTwoInput.getText().toString();


                //Creates the story.
                String story = characterNameValue + " went on an errand to " + placeValue + " driving a " +  vehicleValue + " to trade some " + physicalItemValue + " for some " + physicalItemTwoValue + ". Unfortunately, " + placeValue + " was all sold out.";

                //Shows the story on the screen
                storyView.setText(story);
            }
        });

        //Add all the views to the layout
        inputLayout.addView(characterName);
        inputLayout.addView(characterNameInput);
        inputLayout.addView(vehicle);
        inputLayout.addView(vehicleInput);
        inputLayout.addView(place);
        inputLayout.addView(placeInput);
        inputLayout.addView(physicalItem);
        inputLayout.addView(physicalItemInput);
        inputLayout.addView(physicalItemTwo);
        inputLayout.addView(physicalItemTwoInput);
        inputLayout.addView(createStory);
        inputLayout.addView(storyView);
        inputLayout.setOrientation(LinearLayout.VERTICAL);

        //Set the only layout in this program as the one the user views.
        setContentView(inputLayout);
    }
}