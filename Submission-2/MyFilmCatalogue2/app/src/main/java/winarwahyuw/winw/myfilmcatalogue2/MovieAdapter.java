package winarwahyuw.winw.myfilmcatalogue2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovies;

    public ArrayList<Movie> getListMovies() {
        return listMovies;
    }

    public void setListMovies(ArrayList<Movie> listMovies) {
        this.listMovies = listMovies;
    }

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int position) {
        Movie movie = getListMovies().get(position);

        cardViewViewHolder.tvTitle.setText(movie.getMovieTitle());
        cardViewViewHolder.tvDesc.setText(movie.getMovieDesc());
        cardViewViewHolder.imgPhoto.setImageResource(movie.getMoviePhoto());

    }

    @Override
    public int getItemCount() {
        return getListMovies().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvTitle, tvDesc;

        CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.iv_movie_img);
            tvTitle = itemView.findViewById(R.id.tv_movie_title);
            tvDesc = itemView.findViewById(R.id.tv_movie_desc);


            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getListMovies().get(position);

            movie.setMovieTitle(movie.getMovieTitle());
            movie.setMovieDesc(movie.getMovieDesc());
            movie.setMoviePhoto(movie.getMoviePhoto());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), MovieDetailActivity.class);
            moveWithObjectIntent.putExtra(MovieDetailActivity.EXTRA_MOVIE, movie);
            context.startActivity(moveWithObjectIntent);
        }
    }
}
