package projectmap.shahar.alexey.projectmap.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import projectmap.shahar.alexey.projectmap.Entity.Location;
import projectmap.shahar.alexey.projectmap.R;

/**
 * Created by comsequent on 10/02/2018.
 */

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    ArrayList<Location> locations;

    public LocationAdapter(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LocationViewHolder holder, int position) {
        Location location = locations.get(position);
        //set views for location, on cardView
        holder.setViews(location);
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    class LocationViewHolder extends RecyclerView.ViewHolder {

        TextView placeName;
        TextView placeCoordinates;
        TextView distanceFromCurrentLocation;
        ImageView previewImg;
        ImageButton sharePlaceBtn;

        public LocationViewHolder(View itemView) {
            super(itemView);
            placeName = itemView.findViewById(R.id.place_name);
            placeCoordinates = itemView.findViewById(R.id.place_coordinates);
            distanceFromCurrentLocation = itemView.findViewById(R.id.distance_from_current_location);
            previewImg = itemView.findViewById(R.id.place_image_preview);
            sharePlaceBtn = itemView.findViewById(R.id.share_item_btn);
        }

        public void setViews(Location location) {

            this.placeName.setText(location.getPlaceName());
            this.placeCoordinates.setText("Lat:" + location.getLat() + " Long" + location.getLng());
            // TODO calculate distance from current location
            // TODO get current user UNITS of distance
            // this.distanceFromCurrentLocation.setText(calculatedDistance + userUnits);
            // TODO load previewImage
//            this.previewImg.setImageResource(setImageResource);
            this.sharePlaceBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("mylog", "share clicked" );
                }
            });

        }
    }
}
