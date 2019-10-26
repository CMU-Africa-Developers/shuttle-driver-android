package edu.cmu.bopiyo.shuttledriver.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.List;

import edu.cmu.bopiyo.shuttledriver.R;
import edu.cmu.bopiyo.shuttledriver.model.Trip;

/**
 * Created by Bryan Lamtoo
 * Carnegie Mellon University - Africa
 * 2019-10-26
 */
public class TripsAdapter extends RecyclerView.Adapter<TripsAdapter.TripViewHolder> {

    List<Trip> trips;

    public TripsAdapter(List<Trip> trips) {

        this.trips = trips;
    }

    @NonNull
    @Override
    public TripViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.trip_listitem, parent, false);

        return new TripViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TripViewHolder holder, int position) {

        Trip trip = trips.get(position);
        holder.tripName.setText(trip.getName());
        holder.tripStartTime.setText(new Date(trip.getStartTime()).toString());

    }

    @Override
    public int getItemCount() {
        return trips.size();
    }

    class TripViewHolder extends RecyclerView.ViewHolder {

        TextView tripName, tripStartTime, routeName;

        public TripViewHolder(@NonNull View itemView) {
            super(itemView);

            tripName = itemView.findViewById(R.id.trip_name);
            tripStartTime = itemView.findViewById(R.id.trip_time);
            routeName = itemView.findViewById(R.id.route_name);
        }
    }
}
