package winarwahyuw.winw.filmcatalogue3.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import winarwahyuw.winw.filmcatalogue3.activity.MovieDetailActivity;
import winarwahyuw.winw.filmcatalogue3.R;
import winarwahyuw.winw.filmcatalogue3.item.MovieItems;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private Context context;
    private ArrayList<MovieItems> movieData=new ArrayList<>();

    public void setMovieData(ArrayList<MovieItems> movieItems){
        movieData.clear();
        movieData.addAll(movieItems );
        notifyDataSetChanged();
    }

    public MovieAdapter(Context context){
        this.context=context;
    }
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        final MovieItems movieItems=movieData.get(position);
        String url_poster="https://image.tmdb.org/t/p/w185" +movieItems.getPoster_path();

        Glide.with(context)
                .load(url_poster)
                .apply(new RequestOptions().fitCenter())
                .into(holder.ivMoviePhoto);
        holder.tvMovieTitle.setText(movieItems.getTitle());
        holder.tvMovieDesc.setText(movieItems.getOverview());
    }

    @Override
    public int getItemCount() {
        return movieData.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvMovieTitle;
        TextView tvMovieDesc;
        ImageView ivMoviePhoto;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMovieTitle=itemView.findViewById(R.id.tv_movieTitle);
            tvMovieDesc=itemView.findViewById(R.id.tv_movieDesc);
            ivMoviePhoto=itemView.findViewById(R.id.img_movie);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int i   =getAdapterPosition();
            MovieItems movieItems=new MovieItems();

            movieItems.setTitle(movieData.get(i).getTitle());
            movieItems.setOverview(movieData.get(i).getOverview());
            movieItems.setRelease_date(movieData.get(i).getRelease_date());
            movieItems.setPoster_path(movieData.get(i).getPoster_path());

            Intent intent=new Intent(context, MovieDetailActivity.class);
            intent.putExtra(MovieDetailActivity.EXTRA_MOVIE, movieItems);
            context.startActivity(intent);
        }

    }

}
