package com.iamsalih.scorekeeperapplication20;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String EXTRA_CHICAGO_BULLS_POINT = "chicago_point";
    private final static String EXTRA_LAKERS_POINT = "lakers_point";
    private final static String EXTRA_JORDAN_POINT = "jordan_point";
    private final static String EXTRA_PIPPEN_POINT = "pippen_point";
    private final static String EXTRA_RODMAN_POINT = "rodman_point";
    private final static String EXTRA_KERR_POINT = "kerr_point";
    private final static String EXTRA_KUKOC_POINT = "kukoc_point";
    private final static String EXTRA_JONES_POINT = "jones_point";
    private final static String EXTRA_LUE_POINT = "lue_point";
    private final static String EXTRA_BRYANT_POINT = "bryant_point";
    private final static String EXTRA_CAMPBELL_POINT = "campbell_point";
    private final static String EXTRA_SHAQ_POINT = "shaq_point";
    private final static String EXTRA_JORDAN_FOULS = "jordan_fouls";
    private final static String EXTRA_PIPPEN_FOULS = "pippen_fouls";
    private final static String EXTRA_RODMAN_FOULS = "rodman_fouls";
    private final static String EXTRA_KERR_FOULS = "kerr_fouls";
    private final static String EXTRA_KUKOC_FOULS = "kukoc_fouls";
    private final static String EXTRA_JONES_FOULS = "jones_fouls";
    private final static String EXTRA_LUE_FOULS = "lue_fouls";
    private final static String EXTRA_BRYANT_FOULS = "bryant_fouls";
    private final static String EXTRA_CAMPBELL_FOULS = "campbell_fouls";
    private final static String EXTRA_SHAQ_FOULS = "shaq_fouls";

    //Chicago variables
    TextView chicagoBullsPoints;
    TextView jordanPoints;
    TextView pippenPoints;
    TextView rodmanPoints;
    TextView kerrPoints;
    TextView kukocPoints;
    TextView jordanFouls;
    TextView pippenFouls;
    TextView rodmanFouls;
    TextView kerrFouls;
    TextView kukocFouls;

    //Lakers variables
    TextView losangelesLakersPoints;
    TextView jonesPoints;
    TextView luePoints;
    TextView bryantPoints;
    TextView campbellPoints;
    TextView shaqPoints;
    TextView jonesFouls;
    TextView lueFouls;
    TextView bryantFouls;
    TextView campbellFouls;
    TextView shaqFouls;

    CollapsingToolbarLayout collapsingToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(this,android.R.color.transparent));
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetViews();
            }
        });
        initChicagoTexts();
        initLakersTexts();
        initChicagoButtons();
        initLakersButtons();
        if(savedInstanceState != null) {
            chicagoBullsPoints.setText(savedInstanceState.getString(EXTRA_CHICAGO_BULLS_POINT));
            losangelesLakersPoints.setText(savedInstanceState.getString(EXTRA_LAKERS_POINT));
            jordanPoints.setText(savedInstanceState.getString(EXTRA_JORDAN_POINT));
            pippenPoints.setText(savedInstanceState.getString(EXTRA_PIPPEN_POINT));
            rodmanPoints.setText(savedInstanceState.getString(EXTRA_RODMAN_POINT));
            kerrPoints.setText(savedInstanceState.getString(EXTRA_KERR_POINT));
            kukocPoints.setText(savedInstanceState.getString(EXTRA_KUKOC_POINT));
            jonesPoints.setText(savedInstanceState.getString(EXTRA_JONES_POINT));
            luePoints.setText(savedInstanceState.getString(EXTRA_LUE_POINT));
            bryantPoints.setText(savedInstanceState.getString(EXTRA_BRYANT_POINT));
            campbellPoints.setText(savedInstanceState.getString(EXTRA_CAMPBELL_POINT));
            shaqPoints.setText(savedInstanceState.getString(EXTRA_SHAQ_POINT));
            jordanFouls.setText(savedInstanceState.getString(EXTRA_JORDAN_FOULS));
            pippenFouls.setText(savedInstanceState.getString(EXTRA_PIPPEN_FOULS));
            rodmanFouls.setText(savedInstanceState.getString(EXTRA_RODMAN_FOULS));
            kerrFouls.setText(savedInstanceState.getString(EXTRA_KERR_FOULS));
            kukocFouls.setText(savedInstanceState.getString(EXTRA_KUKOC_FOULS));
            jonesFouls.setText(savedInstanceState.getString(EXTRA_JONES_FOULS));
            lueFouls.setText(savedInstanceState.getString(EXTRA_LUE_FOULS));
            bryantFouls.setText(savedInstanceState.getString(EXTRA_BRYANT_FOULS));
            campbellFouls.setText(savedInstanceState.getString(EXTRA_CAMPBELL_FOULS));
            shaqFouls.setText(savedInstanceState.getString(EXTRA_SHAQ_FOULS));
            collapsingToolbar.setTitle(getString(R.string.current_score,chicagoBullsPoints.getText().toString(),losangelesLakersPoints.getText().toString()));
        } else {
            resetViews();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(EXTRA_CHICAGO_BULLS_POINT,chicagoBullsPoints.getText().toString());
        outState.putString(EXTRA_LAKERS_POINT,losangelesLakersPoints.getText().toString());
        outState.putString(EXTRA_JORDAN_POINT,jordanPoints.getText().toString());
        outState.putString(EXTRA_PIPPEN_POINT,pippenPoints.getText().toString());
        outState.putString(EXTRA_RODMAN_POINT,rodmanPoints.getText().toString());
        outState.putString(EXTRA_KERR_POINT,kerrPoints.getText().toString());
        outState.putString(EXTRA_KUKOC_POINT,kukocPoints.getText().toString());
        outState.putString(EXTRA_JONES_POINT,jonesPoints.getText().toString());
        outState.putString(EXTRA_LUE_POINT,luePoints.getText().toString());
        outState.putString(EXTRA_BRYANT_POINT,bryantPoints.getText().toString());
        outState.putString(EXTRA_CAMPBELL_POINT,campbellPoints.getText().toString());
        outState.putString(EXTRA_SHAQ_POINT,shaqPoints.getText().toString());
        outState.putString(EXTRA_JORDAN_FOULS,jordanFouls.getText().toString());
        outState.putString(EXTRA_PIPPEN_FOULS,pippenFouls.getText().toString());
        outState.putString(EXTRA_RODMAN_FOULS,rodmanFouls.getText().toString());
        outState.putString(EXTRA_KERR_FOULS,kerrFouls.getText().toString());
        outState.putString(EXTRA_KUKOC_FOULS,kukocFouls.getText().toString());
        outState.putString(EXTRA_JONES_FOULS,jonesFouls.getText().toString());
        outState.putString(EXTRA_LUE_FOULS,lueFouls.getText().toString());
        outState.putString(EXTRA_BRYANT_FOULS,bryantFouls.getText().toString());
        outState.putString(EXTRA_CAMPBELL_FOULS,campbellFouls.getText().toString());
        outState.putString(EXTRA_SHAQ_FOULS,shaqFouls.getText().toString());
        super.onSaveInstanceState(outState);
    }

    private void resetViews() {

        chicagoBullsPoints.setText(getString(R.string.default_score));
        losangelesLakersPoints.setText(getString(R.string.default_score));

        jordanPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        pippenPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        rodmanPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        kerrPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        kukocPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));

        jonesPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        luePoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        bryantPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        campbellPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));
        shaqPoints.setText(getString(R.string.personal_score,getString(R.string.default_score)));

        jordanFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        pippenFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        rodmanFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        kerrFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        kukocFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));

        jonesFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        lueFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        bryantFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        campbellFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        shaqFouls.setText(getString(R.string.foul_count,getString(R.string.default_score)));
        collapsingToolbar.setTitle(getString(R.string.current_score,getString(R.string.default_score),getString(R.string.default_score)));
    }

    private void initLakersButtons() {
        Button jonesOnePoint = (Button)findViewById(R.id.jones_one_point);
        jonesOnePoint.setOnClickListener(this);
        Button lueOnePoint = (Button)findViewById(R.id.lue_one_point);
        lueOnePoint.setOnClickListener(this);
        Button bryantOnePoint = (Button)findViewById(R.id.bryant_one_point);
        bryantOnePoint.setOnClickListener(this);
        Button campbellOnePoint = (Button)findViewById(R.id.campbell_one_point);
        campbellOnePoint.setOnClickListener(this);
        Button shaqOnePoint = (Button)findViewById(R.id.shaq_one_point);
        shaqOnePoint.setOnClickListener(this);
        Button jonesTwoPoint = (Button)findViewById(R.id.jones_two_point);
        jonesTwoPoint.setOnClickListener(this);
        Button lueTwoPoint = (Button)findViewById(R.id.lue_two_point);
        lueTwoPoint.setOnClickListener(this);
        Button bryantTwoPoint = (Button)findViewById(R.id.bryant_two_point);
        bryantTwoPoint.setOnClickListener(this);
        Button campbellTwoPoint = (Button)findViewById(R.id.campbell_two_point);
        campbellTwoPoint.setOnClickListener(this);
        Button shaqTwoPoint = (Button)findViewById(R.id.shaq_two_point);
        shaqTwoPoint.setOnClickListener(this);
        Button jonesThreePoint = (Button)findViewById(R.id.jones_three_point);
        jonesThreePoint.setOnClickListener(this);
        Button lueThreePoint = (Button)findViewById(R.id.lue_three_point);
        lueThreePoint.setOnClickListener(this);
        Button bryantThreePoint = (Button)findViewById(R.id.bryant_three_point);
        bryantThreePoint.setOnClickListener(this);
        Button campbellThreePoint = (Button)findViewById(R.id.campbell_three_point);
        campbellThreePoint.setOnClickListener(this);
        Button shaqThreePoint = (Button)findViewById(R.id.shaq_three_point);
        shaqThreePoint.setOnClickListener(this);
        Button jonesFoulIncrease = (Button)findViewById(R.id.jones_foul_increase);
        jonesFoulIncrease.setOnClickListener(this);
        Button lueFoulIncrease = (Button)findViewById(R.id.lue_foul_increase);
        lueFoulIncrease.setOnClickListener(this);
        Button bryantFoulIncrease = (Button)findViewById(R.id.bryant_foul_increase);
        bryantFoulIncrease.setOnClickListener(this);
        Button campbellFoulIncrease = (Button)findViewById(R.id.campbell_foul_increase);
        campbellFoulIncrease.setOnClickListener(this);
        Button shaqFoulIncrease = (Button)findViewById(R.id.shaq_foul_increase);
        shaqFoulIncrease.setOnClickListener(this);
        Button jonesFoulDecrease = (Button)findViewById(R.id.jones_foul_decrease);
        jonesFoulDecrease.setOnClickListener(this);
        Button lueFoulDecrease = (Button)findViewById(R.id.lue_foul_decrease);
        lueFoulDecrease.setOnClickListener(this);
        Button bryantFoulDecrease = (Button)findViewById(R.id.bryant_foul_decrease);
        bryantFoulDecrease.setOnClickListener(this);
        Button campbellFoulDecrease = (Button)findViewById(R.id.campbell_foul_decrease);
        campbellFoulDecrease.setOnClickListener(this);
        Button shaqFoulDecrease = (Button)findViewById(R.id.shaq_foul_decrease);
        shaqFoulDecrease.setOnClickListener(this);
    }

    private void initChicagoButtons() {
        Button jordanOnePoint = (Button)findViewById(R.id.jordan_one_point);
        jordanOnePoint.setOnClickListener(this);
        Button pippenOnePoint = (Button)findViewById(R.id.pippen_one_point);
        pippenOnePoint.setOnClickListener(this);
        Button rodmanOnePoint = (Button)findViewById(R.id.rodman_one_point);
        rodmanOnePoint.setOnClickListener(this);
        Button kerrOnePoint = (Button)findViewById(R.id.kerr_one_point);
        kerrOnePoint.setOnClickListener(this);
        Button kukocOnePoint = (Button)findViewById(R.id.kukoc_one_point);
        kukocOnePoint.setOnClickListener(this);
        Button jordanTwoPoint = (Button)findViewById(R.id.jordan_two_point);
        jordanTwoPoint.setOnClickListener(this);
        Button pippenTwoPoint = (Button)findViewById(R.id.pippen_two_point);
        pippenTwoPoint.setOnClickListener(this);
        Button rodmanTwoPoint = (Button)findViewById(R.id.rodman_two_point);
        rodmanTwoPoint.setOnClickListener(this);
        Button kerrTwoPoint = (Button)findViewById(R.id.kerr_two_point);
        kerrTwoPoint.setOnClickListener(this);
        Button kukocTwoPoint = (Button)findViewById(R.id.kukoc_two_point);
        kukocTwoPoint.setOnClickListener(this);
        Button jordanThreePoint = (Button)findViewById(R.id.jordan_three_point);
        jordanThreePoint.setOnClickListener(this);
        Button pippenThreePoint = (Button)findViewById(R.id.pippen_three_point);
        pippenThreePoint.setOnClickListener(this);
        Button rodmanThreePoint = (Button)findViewById(R.id.rodman_three_point);
        rodmanThreePoint.setOnClickListener(this);
        Button kerrThreePoint = (Button)findViewById(R.id.kerr_three_point);
        kerrThreePoint.setOnClickListener(this);
        Button kukocThreePoint = (Button)findViewById(R.id.kukoc_three_point);
        kukocThreePoint.setOnClickListener(this);
        Button jordanFoulIncrease = (Button)findViewById(R.id.jordan_foul_increase);
        jordanFoulIncrease.setOnClickListener(this);
        Button pippenFoulIncrease = (Button)findViewById(R.id.pippen_foul_increase);
        pippenFoulIncrease.setOnClickListener(this);
        Button rodmanFoulIncrease = (Button)findViewById(R.id.rodman_foul_increase);
        rodmanFoulIncrease.setOnClickListener(this);
        Button kerrFoulIncrease = (Button)findViewById(R.id.kerr_foul_increase);
        kerrFoulIncrease.setOnClickListener(this);
        Button kukocFoulIncrease = (Button)findViewById(R.id.kukoc_foul_increase);
        kukocFoulIncrease.setOnClickListener(this);
        Button jordanFoulDecrease = (Button)findViewById(R.id.jordan_foul_decrease);
        jordanFoulDecrease.setOnClickListener(this);
        Button pippenFoulDecrease = (Button)findViewById(R.id.pippen_foul_decrease);
        pippenFoulDecrease.setOnClickListener(this);
        Button rodmanFoulDecrease = (Button)findViewById(R.id.rodman_foul_decrease);
        rodmanFoulDecrease.setOnClickListener(this);
        Button kerrFoulDecrease = (Button)findViewById(R.id.kerr_foul_decrease);
        kerrFoulDecrease.setOnClickListener(this);
        Button kukocFoulDecrease = (Button)findViewById(R.id.kukoc_foul_decrease);
        kukocFoulDecrease.setOnClickListener(this);
    }

    private void initLakersTexts() {
        losangelesLakersPoints = (TextView)findViewById(R.id.lakers_score);
        jonesPoints = (TextView)findViewById(R.id.jones_points);
        luePoints = (TextView)findViewById(R.id.lue_points);
        bryantPoints = (TextView)findViewById(R.id.bryant_points);
        campbellPoints = (TextView)findViewById(R.id.campbell_points);
        shaqPoints = (TextView)findViewById(R.id.shaq_points);
        jonesFouls = (TextView)findViewById(R.id.jones_fouls);
        lueFouls = (TextView)findViewById(R.id.lue_fouls);
        bryantFouls = (TextView)findViewById(R.id.bryant_fouls);
        campbellFouls = (TextView)findViewById(R.id.campbell_fouls);
        shaqFouls = (TextView)findViewById(R.id.shaq_fouls);
    }

    private void initChicagoTexts() {
        chicagoBullsPoints = (TextView)findViewById(R.id.chicago_score);
        jordanPoints = (TextView)findViewById(R.id.jordan_points);
        pippenPoints = (TextView)findViewById(R.id.pippen_points);
        rodmanPoints = (TextView)findViewById(R.id.rodman_points);
        kerrPoints = (TextView)findViewById(R.id.kerr_points);
        kukocPoints = (TextView) findViewById(R.id.kukoc_points);
        jordanFouls = (TextView)findViewById(R.id.jordan_fouls);
        pippenFouls = (TextView)findViewById(R.id.pippen_fouls);
        rodmanFouls = (TextView)findViewById(R.id.rodman_fouls);
        kerrFouls = (TextView)findViewById(R.id.kerr_fouls);
        kukocFouls = (TextView)findViewById(R.id.kukoc_fouls);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.jordan_one_point:
                increasePoint(chicagoBullsPoints,jordanPoints,1);
                break;
            case R.id.jordan_two_point:
                increasePoint(chicagoBullsPoints,jordanPoints,2);
                break;
            case R.id.jordan_three_point:
                increasePoint(chicagoBullsPoints,jordanPoints,3);
                break;
            case R.id.pippen_one_point:
                increasePoint(chicagoBullsPoints,pippenPoints,1);
                break;
            case R.id.pippen_two_point:
                increasePoint(chicagoBullsPoints,pippenPoints,2);
                break;
            case R.id.pippen_three_point:
                increasePoint(chicagoBullsPoints,pippenPoints,3);
                break;
            case R.id.rodman_one_point:
                increasePoint(chicagoBullsPoints,rodmanPoints,1);
                break;
            case R.id.rodman_two_point:
                increasePoint(chicagoBullsPoints,rodmanPoints,2);
                break;
            case R.id.rodman_three_point:
                increasePoint(chicagoBullsPoints,rodmanPoints,3);
                break;
            case R.id.kerr_one_point:
                increasePoint(chicagoBullsPoints,kerrPoints,1);
                break;
            case R.id.kerr_two_point:
                increasePoint(chicagoBullsPoints,kerrPoints,2);
                break;
            case R.id.kerr_three_point:
                increasePoint(chicagoBullsPoints,kerrPoints,3);
                break;
            case R.id.kukoc_one_point:
                increasePoint(chicagoBullsPoints,kukocPoints,1);
                break;
            case R.id.kukoc_two_point:
                increasePoint(chicagoBullsPoints,kukocPoints,2);
                break;
            case R.id.kukoc_three_point:
                increasePoint(chicagoBullsPoints,kukocPoints,3);
                break;
            case R.id.jones_one_point:
                increasePoint(losangelesLakersPoints,jonesPoints,1);
                break;
            case R.id.jones_two_point:
                increasePoint(losangelesLakersPoints,jonesPoints,2);
                break;
            case R.id.jones_three_point:
                increasePoint(losangelesLakersPoints,jonesPoints,3);
                break;
            case R.id.lue_one_point:
                increasePoint(losangelesLakersPoints,luePoints,1);
                break;
            case R.id.lue_two_point:
                increasePoint(losangelesLakersPoints,luePoints,2);
                break;
            case R.id.lue_three_point:
                increasePoint(losangelesLakersPoints,luePoints,3);
                break;
            case R.id.bryant_one_point:
                increasePoint(losangelesLakersPoints,bryantPoints,1);
                break;
            case R.id.bryant_two_point:
                increasePoint(losangelesLakersPoints,bryantPoints,2);
                break;
            case R.id.bryant_three_point:
                increasePoint(losangelesLakersPoints,bryantPoints,3);
                break;
            case R.id.campbell_one_point:
                increasePoint(losangelesLakersPoints,campbellPoints,1);
                break;
            case R.id.campbell_two_point:
                increasePoint(losangelesLakersPoints,campbellPoints,2);
                break;
            case R.id.campbell_three_point:
                increasePoint(losangelesLakersPoints,campbellPoints,3);
                break;
            case R.id.shaq_one_point:
                increasePoint(losangelesLakersPoints,shaqPoints,1);
                break;
            case R.id.shaq_two_point:
                increasePoint(losangelesLakersPoints,shaqPoints,2);
                break;
            case R.id.shaq_three_point:
                increasePoint(losangelesLakersPoints,shaqPoints,3);
                break;
            case R.id.jordan_foul_increase:
                changeFoulCount(jordanFouls,1);
                break;
            case R.id.jordan_foul_decrease:
                changeFoulCount(jordanFouls,-1);
                break;
            case R.id.pippen_foul_increase:
                changeFoulCount(pippenFouls,1);
                break;
            case R.id.pippen_foul_decrease:
                changeFoulCount(pippenFouls,-1);
                break;
            case R.id.rodman_foul_increase:
                changeFoulCount(rodmanFouls,1);
                break;
            case R.id.rodman_foul_decrease:
                changeFoulCount(rodmanFouls,-1);
                break;
            case R.id.kerr_foul_increase:
                changeFoulCount(kerrFouls,1);
                break;
            case R.id.kerr_foul_decrease:
                changeFoulCount(kerrFouls,-1);
                break;
            case R.id.kukoc_foul_increase:
                changeFoulCount(kukocFouls,1);
                break;
            case R.id.kukoc_foul_decrease:
                changeFoulCount(kukocFouls,-1);
                break;
            case R.id.jones_foul_increase:
                changeFoulCount(jonesFouls,1);
                break;
            case R.id.jones_foul_decrease:
                changeFoulCount(jonesFouls,-1);
                break;
            case R.id.lue_foul_increase:
                changeFoulCount(lueFouls,1);
                break;
            case R.id.lue_foul_decrease:
                changeFoulCount(lueFouls,-1);
                break;
            case R.id.bryant_foul_increase:
                changeFoulCount(bryantFouls,1);
                break;
            case R.id.bryant_foul_decrease:
                changeFoulCount(bryantFouls,-1);
                break;
            case R.id.campbell_foul_increase:
                changeFoulCount(campbellFouls,1);
                break;
            case R.id.campbell_foul_decrease:
                changeFoulCount(campbellFouls,-1);
                break;
            case R.id.shaq_foul_increase:
                changeFoulCount(shaqFouls,1);
                break;
            case R.id.shaq_foul_decrease:
                changeFoulCount(shaqFouls,-1);
                break;
        }
    }

    /**
     *  Method to calculate and show it on the selected textview.
     * @param fouls Textview to show
     * @param foulCount
     */
    private void changeFoulCount(TextView fouls, int foulCount) {
        String personalFoulCount = fouls.getText().toString();
        personalFoulCount = personalFoulCount.trim().substring(personalFoulCount.length()-1,personalFoulCount.length());
        int foul = Integer.parseInt(personalFoulCount);
        foul += foulCount;
        if ((foul >= 0) && (foul <= 6)) {
            fouls.setText(getString(R.string.foul_count, String.valueOf(foul)));
        }
    }

    /**
     * Increasing point according to player and total point and show it in textviews
     * @param teamPoint
     * @param points
     * @param pointToIncrease
     */
    private void increasePoint(TextView teamPoint,TextView points, int pointToIncrease) {
        int teamPointInt = Integer.parseInt(teamPoint.getText().toString());
        teamPointInt += pointToIncrease;
        teamPoint.setText(String.valueOf(teamPointInt));
        String personalPoint = points.getText().toString();
        personalPoint = personalPoint.substring(personalPoint.length()-2,personalPoint.length());
        int personalPointInt = Integer.parseInt(personalPoint.trim());
        personalPointInt += pointToIncrease;
        points.setText(getString(R.string.personal_score, String.valueOf(personalPointInt)));
        collapsingToolbar.setTitle(getString(R.string.current_score,chicagoBullsPoints.getText().toString(),losangelesLakersPoints.getText().toString()));
    }
}
