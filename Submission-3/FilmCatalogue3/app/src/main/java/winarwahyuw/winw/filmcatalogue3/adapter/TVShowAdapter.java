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

import winarwahyuw.winw.filmcatalogue3.R;
import winarwahyuw.winw.filmcatalogue3.activity.TVShowDetailActivity;
import winarwahyuw.winw.filmcatalogue3.item.TVShowItems;

public class TVShowAdapter extends RecyclerView.Adapter<TVShowAdapter.TVShowViewHolder> {
    private Context context;
    private ArrayList<TVShowItems> tvShowData=new ArrayList<>();

    public void setTvShowData(ArrayList<TVShowItems> tvShowItems){
        tvShowData.clear();
        tvShowData.addAll(tvShowItems);
        notifyDataSetChanged();
    }

    public TVShowAdapter(Context context){
        this.context=context;
    }

    @NonNull
    @Override
    public TVShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tvshow, parent,false);
        return new TVShowViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull TVShowViewHolder holder, int position) {
        final TVShowItems tvShowItems=tvShowData.get(position);
        String url_tv_poster="https://image.tmdb.org/t/p/w185" +tvShowItems.getPoster_path();

        Glide.with(context)
                .load(url_tv_poster)
                .apply(new RequestOptions().fitCenter())
                .into(holder.ivPosterTVShow);
        holder.tvName.setText(tvShowItems.getName());
        holder.tvOverview.setText(tvShowItems.getOverview());
    }

    @Override
    public int getItemCount() {
        return tvShowData.size();
    }

    public class TVShowViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName, tvOverview;
        ImageView ivPosterTVShow;

        public TVShowViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName      =itemView.findViewById(R.id.tv_tvShowTitle);
            tvOverview  =itemView.findViewById(R.id.tv_tvShowDesc);
            ivPosterTVShow    =itemView.findViewById(R.id.img_tvShow);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int i=getAdapterPosition();
            TVShowItems tvShowItems=new TVShowItems();

            tvShowItems.setName(tvShowData.get(i).getName());
            tvShowItems.setOverview(tvShowData.get(i).getOverview());
            tvShowItems.setFirst_air_date(tvShowData.get(i).getFirst_air_date());
            tvShowItems.setPoster_path(tvShowData.get(i).getPoster_path());

            Intent intent=new Intent(context, TVShowDetailActivity.class);
            intent.putExtra(TVShowDetailActivity.EXTRA_TVSHOW,tvShowItems);
            context.startActivity(intent);
        }
    }
}
