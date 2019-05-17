package edu.ecu.cs.pirateplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class PiratePlacesActivity extends AppCompatActivity
{

    private Button mPreviousButton;
    private Button mNextButton;
    private TextView mpiratePlaceNameText;
    private TextView mpiratePlaceDateText;
    private int selectedindex = 0;
    private ArrayList<PiratePlace> mPiratePlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        createDefaultPiratePlaces();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pirate_places);
        mpiratePlaceNameText = (TextView) findViewById(R.id.piratePlaceNameText);
        mpiratePlaceNameText.setText(mPiratePlaces.get(selectedindex).getPlaceName());
        mpiratePlaceDateText = (TextView) findViewById(R.id.piratePlaceDateText);
        mpiratePlaceDateText.setText(mPiratePlaces.get(selectedindex).getLastVisited().toString());
        mPreviousButton = (Button) findViewById(R.id.previous_button);
        mNextButton = (Button) findViewById(R.id.next_button);
        mPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedindex > 0)
                {
                    selectedindex--;
                    mpiratePlaceNameText.setText(mPiratePlaces.get(selectedindex).getPlaceName());
                    mpiratePlaceDateText.setText(mPiratePlaces.get(selectedindex).getLastVisited().toString());
                }
                if(selectedindex == 0 && mPreviousButton.isEnabled() == true)
                    mPreviousButton.setEnabled(false);
                if(selectedindex < mPiratePlaces.size() - 1 && mNextButton.isEnabled() == false)
                    mNextButton.setEnabled(true);

            }
        });
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedindex < mPiratePlaces.size() - 1)
                {
                    selectedindex++;
                    mpiratePlaceNameText.setText(mPiratePlaces.get(selectedindex).getPlaceName());
                    mpiratePlaceDateText.setText(mPiratePlaces.get(selectedindex).getLastVisited().toString());
                }
                if(selectedindex > 0 && mPreviousButton.isEnabled() == false)
                    mPreviousButton.setEnabled(true);
                if(selectedindex == mPiratePlaces.size() - 1 && mNextButton.isEnabled() == true)
                    mNextButton.setEnabled(false);
            }
        });
    }

    private void createDefaultPiratePlaces()
    {
        PiratePlace p1 = new PiratePlace("SciTech Building", new Date());
        PiratePlace p2 = new PiratePlace("The Wright Place", new Date());
        PiratePlace p3 = new PiratePlace("Brewster B-201", new Date());
        mPiratePlaces = new ArrayList<>();
        mPiratePlaces.add(p1);
        mPiratePlaces.add(p2);
        mPiratePlaces.add(p3);
    }
}
