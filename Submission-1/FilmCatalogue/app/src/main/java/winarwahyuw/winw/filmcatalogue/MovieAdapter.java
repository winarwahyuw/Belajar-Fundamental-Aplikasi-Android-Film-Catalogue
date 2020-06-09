package winarwahyuw.winw.filmcatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Movie> movies=new ArrayList<>();

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView=convertView;
        if(itemView==null){
            itemView= LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        }

        ViewHolder viewHolder=new ViewHolder(itemView);

        Movie movie=(Movie)getItem(position);
        viewHolder.bind(movie);
        return itemView;
    }
    
    private class ViewHolder{
        private TextView txtName;
        private TextView txtDesc;
        private ImageView imgPhoto;
        
        ViewHolder (View view){
            txtName=view.findViewById(R.id.tv_name);
            txtDesc=view.findViewById(R.id.tv_desc);
            imgPhoto=view.findViewById(R.id.img_film);
        }

        public void bind(Movie movie) {
            txtName.setText(movie.getName());
            txtDesc.setText(movie.getDesc());
            imgPhoto.setImageResource(movie.getPhoto());
        }
    }
}
