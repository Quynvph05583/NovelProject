package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.novelsproject.Model.Stories;
import com.example.novelsproject.R;
import com.example.novelsproject.dao.StoriesDao;

import java.util.List;

public class lv_storyApdapter extends BaseAdapter {
    private Activity activity;
    List<Stories> list;
    StoriesDao storiesDao;
    private Context context;

    public class ViewHolder {
        TextView tvName, views;
        ImageView thumbnail;
    }
    public lv_storyApdapter(Context context, List<Stories> list){
        this.list = list;
        this.context = context;
        storiesDao = new StoriesDao();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.lv_story, null);

        ImageView thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView views = (TextView) view.findViewById(R.id.views);

        tvName.setText(list.get(i).getName() + "");
        views.setText(list.get(i).getViews() + "");
        return null;
    }
}
