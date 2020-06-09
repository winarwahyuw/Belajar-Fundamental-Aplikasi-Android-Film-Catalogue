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

public class TVShowAdapter extends RecyclerView.Adapter<TVShowAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<TVShow> listTVShow;

    public ArrayList<TVShow> getListTVShow(){
        return listTVShow;
    }

    public void setListTVShow(ArrayList<TVShow> listTVShow) {
        this.listTVShow = listTVShow;
    }

    public TVShowAdapter(Context context) {
        this.context=context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tvshow,parent,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        TVShow tvShow=getListTVShow().get(position);

        holder.tvShowTitle.setText(tvShow.getTVShowTitle());
        holder.tvShowDesc.setText(tvShow.getTVShowDesc());
        holder.tvShowPhoto.setImageResource(tvShow.getTVShowPhoto());

    }

    @Override
    public int getItemCount() {
        return getListTVShow().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView tvShowPhoto;
        TextView tvShowTitle, tvShowDesc;

        public CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            tvShowTitle=itemView.findViewById(R.id.tv_tvShow_title);
            tvShowDesc=itemView.findViewById(R.id.tv_tvShow_desc);
            tvShowPhoto=itemView.findViewById(R.id.iv_tvShow_img);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            TVShow tvShow = getListTVShow().get(position);

            tvShow.setTVShowTitle(tvShow.getTVShowTitle());
            tvShow.setTVShowDesc(tvShow.getTVShowDesc());
            tvShow.setTVShowPhoto(tvShow.getTVShowPhoto());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), TVShowDetailActivity.class);
            moveWithObjectIntent.putExtra(TVShowDetailActivity.EXTRA_SHOW, tvShow);
            context.startActivity(moveWithObjectIntent);
        }
    }
}
