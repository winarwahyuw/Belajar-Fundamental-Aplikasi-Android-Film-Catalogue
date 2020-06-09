package winarwahyuw.winw.myfilmcatalogue2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TVShowFragment extends Fragment {
    private RecyclerView rvTVShow;
    private ArrayList<TVShow> list=new ArrayList<>();

    public TVShowFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tvshow, container, false);
        rvTVShow=view.findViewById(R.id.rv_tvshow);
        rvTVShow.setHasFixedSize(true);

        list.addAll(DataTVShow.getListData());

        ShowRecyclerTVShow();
        return view;
    }

    public void ShowRecyclerTVShow(){
        rvTVShow.setLayoutManager(new LinearLayoutManager(this.getContext()));
        TVShowAdapter tvShowAdapter=new TVShowAdapter(this.getContext());
        tvShowAdapter.setListTVShow(list);
        rvTVShow.setAdapter(tvShowAdapter);
    }

}
