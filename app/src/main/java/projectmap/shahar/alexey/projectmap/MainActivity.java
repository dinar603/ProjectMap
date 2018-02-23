package projectmap.shahar.alexey.projectmap;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import projectmap.shahar.alexey.projectmap.Fragments.ListViewFragment;
import projectmap.shahar.alexey.projectmap.Fragments.MapFragment;

public class MainActivity extends AppCompatActivity {

    ListViewFragment listViewFragment = new ListViewFragment();
    SupportMapFragment mapFragment;
    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void initViews() {
        setAppToolbar();

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return listViewFragment;
                    case 1:
                        if (mapFragment==null){
                            mapFragment = new SupportMapFragment();
                        }
                        mapFragment.getMapAsync(new OnMapReadyCallback() {
                            @Override
                            public void onMapReady(GoogleMap googleMap) {
                                map = googleMap;
                            }
                        });
                        return mapFragment;
                }
                return null;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "List";
                    case 1:
                        return "Map";
                }
                return null;
            }

            @Override
            public int getCount() {
                return 2;
            }
        });

        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setAppToolbar() {
        toolbar = findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("BookmarkMap");
        getSupportActionBar().setSubtitle("main page");
    }
}
