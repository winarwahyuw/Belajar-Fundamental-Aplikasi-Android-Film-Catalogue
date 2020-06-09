package winarwahyuw.winw.filmcatalogue3.fragment_with_view_model;

import androidx.annotation.ArrayRes;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

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
import winarwahyuw.winw.filmcatalogue3.adapter.TVShowAdapter;
import winarwahyuw.winw.filmcatalogue3.item.MovieItems;
import winarwahyuw.winw.filmcatalogue3.item.TVShowItems;

public class TVShowFragment extends Fragment {
    private TVShowAdapter tvShowAdapter;
    private ProgressBar progressBar;

    public TVShowFragment(){

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tvshow_fragment, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.rv_tvShowList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        progressBar=view.findViewById(R.id.progressBar2);

        tvShowAdapter=new TVShowAdapter(this.getContext());
        recyclerView.setAdapter(tvShowAdapter);

       TVShowViewModel viewModel=new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TVShowViewModel.class);

       viewModel.getTVShow().observe(getViewLifecycleOwner(), new Observer<ArrayList<TVShowItems>>() {
           @Override
           public void onChanged(ArrayList<TVShowItems> tvShowItems) {
               if(tvShowItems!=null){
                   tvShowAdapter.setTvShowData(tvShowItems);
               }

               showLoading(false);
           }
       });
       viewModel.setTVShow("EXTRA_TVSHOW");

       showLoading(true);
       return view;
    }

    private void showLoading(boolean state){
        if(state){
            progressBar.setVisibility(View.VISIBLE);
        }else {
            progressBar.setVisibility(View.GONE);
        }
    }

}
