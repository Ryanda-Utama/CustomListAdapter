package id.poliban.ac.mi.customlistadapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;
import java.util.List;

public class ClubAdapter extends BaseAdapter {

    private List<Club> data = new ArrayList<>();
    public  ClubAdapter(List<Club> data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvClubName;
        TextView tvClubDescription;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_club, parent,false);

        img_flag = convertView.findViewById(R.id.img_flag_club);
        tvClubName = convertView.findViewById(R.id.tv_club_name);
        tvClubDescription = convertView.findViewById(R.id.tv_club_description);

        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60,60))
                .into(img_flag);
        tvClubName.setText(data.get(position).getClubName());
        tvClubDescription.setText(data.get(position).getClubDescription());

        return convertView;
    }
}
