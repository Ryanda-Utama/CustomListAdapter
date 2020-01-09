package id.poliban.ac.mi.customlistadapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  List<Club> clubs = new ArrayList<>();
    private  ListView listView;
    private  BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        clubs.addAll(ClubData.getAllClubs());
        adapter  = new ClubAdapter(clubs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage("Anda memilih" + clubs.get(position).toString())
                    .setPositiveButton("Ok", null)
                    .show();
        });


    }
}
