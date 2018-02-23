package projectmap.shahar.alexey.projectmap.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import projectmap.shahar.alexey.projectmap.Adapter.LocationAdapter;
import projectmap.shahar.alexey.projectmap.Entity.Location;
import projectmap.shahar.alexey.projectmap.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {

    RecyclerView locationRecyclerView;

    public ListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list_view, container, false);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        locationRecyclerView = view.findViewById(R.id.location_recycler_view);
        locationRecyclerView.setLayoutManager(linearLayoutManager);
        locationRecyclerView.setItemAnimator(new DefaultItemAnimator());
        locationRecyclerView.setAdapter(new LocationAdapter(getMocDate()));

        return view;
    }

    public ArrayList<Location> getMocDate() {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(0,"121503",10.0000023,11.0000045, "Place No.1","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",11.0000054,12.0000048, "Dance Hall Big Foot","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",12.0000078,13.0000097, "Vinny the Pooh house","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",13.0000025,14.0000068, "Home sweet Home","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",14.0000054,15.0000067, "Mr. Dracula palace","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",15.0000074,16.0000021, "House of mouse","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",16.0000084,17.0000006, "Very terrible place","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",17.0000022,18.0000089, "hell no idea that is it","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",18.0000048,19.0000073, "Hotel California","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",19.0000078,10.0000019, "12 chairs Pub","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",10.0000023,11.0000045, "Place No.1","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",11.0000054,12.0000048, "Dance Hall Big Foot","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",12.0000078,13.0000097, "Vinny the Pooh house","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",13.0000025,14.0000068, "Home sweet Home","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",14.0000054,15.0000067, "Mr. Dracula palace","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",15.0000074,16.0000021, "House of mouse","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",16.0000084,17.0000006, "Very terrible place","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",17.0000022,18.0000089, "hell no idea that is it","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",18.0000048,19.0000073, "Hotel California","Cool Place", false, null,null));
        locations.add(new Location(0,"121503",19.0000078,10.0000019, "12 chairs Pub","Cool Place", false, null,null));
        return locations;
    }
}
