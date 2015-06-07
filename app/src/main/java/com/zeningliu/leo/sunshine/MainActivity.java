package com.zeningliu.leo.sunshine;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.ShareActionProvider;

import java.util.Set;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//
//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    public static class PlaceholderFragment extends Fragment {
//        private ArrayAdapter<String> mForecastAdapter;
//
//        public PlaceholderFragment() {
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
//
//
//            String[] forecastArray={
//                    "Today - Sunny - 88/63",
//                    "Tomorrow - Foggy - 70/40",
//                    "Weds - Cloudy - 72/63",
//                    "Thurs - Asteroids - 75/65",
//                    "Fri - Heavy Rain - 65/56",
//                    "Sat - Help Trapped in Weatherstation - 60/51",
//                    "Sun - Sunny - 80/68"
//            };
//
//            List<String> weekForecast = new ArrayList<String>(
//                    Arrays.asList(forecastArray)
//            );
//
//            mForecastAdapter =
//                    new ArrayAdapter<String>(
//                            getActivity(),
//                            R.layout.list_item_forecast,
//                            R.id.list_item_forecast_textview,
//                            weekForecast
//
//                    );
//
//            return rootView;
//        }
//
//    }

}