package winarwahyuw.winw.myfilmcatalogue2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MovieFragment extends Fragment {

    private RecyclerView rvCategory;
    private ArrayList<Movie> list = new ArrayList<>();

    public MovieFragment() {

    }

    public MovieFragment(Parcel in){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_movie,container,false);
        rvCategory = view.findViewById(R.id.rv_movie);
        rvCategory.setHasFixedSize(true);

        list.addAll(DataMovie.getListData());
        showRecyclerMovie();

        return view;

    }

    private void showRecyclerMovie(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this.getContext()));
        MovieAdapter movieAdapter = new MovieAdapter(this.getContext());
        movieAdapter.setListMovies(list);
        rvCategory.setAdapter(movieAdapter);
    }
}
