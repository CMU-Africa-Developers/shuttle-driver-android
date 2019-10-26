package edu.cmu.bopiyo.shuttledriver;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.cmu.bopiyo.shuttledriver.adapters.TripsAdapter;
import edu.cmu.bopiyo.shuttledriver.model.Trip;

public class MainActivity extends AppCompatActivity {

    RecyclerView mTripRecyclerview;
    TripsAdapter mAdapter;
    List<Trip> tripList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTripRecyclerview = findViewById(R.id.trip_recyclerview);
        mAdapter = new TripsAdapter(tripList);
        mTripRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        mTripRecyclerview.setItemAnimator(new DefaultItemAnimator());
        mTripRecyclerview.setAdapter(mAdapter);


        displayTrips();
    }

    private void displayTrips() {

        for (int i = 0; i < 10; i++) {

            Trip trip = new Trip();
            trip.setName("Trip " + i + 1);
            trip.setStartTime(new Date().getTime());
            tripList.add(trip);
        }

        mAdapter.notifyDataSetChanged();
    }


}
