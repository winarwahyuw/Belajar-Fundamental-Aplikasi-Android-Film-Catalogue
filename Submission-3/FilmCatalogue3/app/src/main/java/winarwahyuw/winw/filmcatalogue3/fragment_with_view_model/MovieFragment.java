package winarwahyuw.winw.filmcatalogue3.fragment_with_view_model;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;

import winarwahyuw.winw.filmcatalogue3.R;
import winarwahyuw.winw.filmcatalogue3.adapter.MovieAdapter;
import winarwahyuw.winw.filmcatalogue3.item.MovieItems;

public class MovieFragment extends Fragment {

    private MovieAdapter movieAdapter;
    private ProgressBar progressBar;

    public MovieFragment () {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.movie_fragment, container,false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_movieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        progressBar=view.findViewById(R.id.progressBar);

        movieAdapter=new MovieAdapter(this.getContext());

        recyclerView.setAdapter(movieAdapter);

        MovieViewModel mViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieViewModel.class);
        mViewModel.getMovies().observe(getViewLifecycleOwner(), new Observer<ArrayList<MovieItems>>() {
            @Override
            public void onChanged(ArrayList<MovieItems> movieItems) {
                if(movieItems!=null){
                    movieAdapter.setMovieData(movieItems);
                }

                showLoading(false);
            }
        });
        mViewModel.setMovie("EXTRA_MOVIE");

        showLoading(true);
        return view;

    }

    private void showLoading(boolean state){
        if(state){
            progressBar.setVisibility(View.VISIBLE);
        }else{
            progressBar.setVisibility(View.GONE);
        }
    }


}
