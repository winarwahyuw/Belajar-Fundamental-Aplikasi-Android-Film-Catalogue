package winarwahyuw.winw.filmcatalogue3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

import winarwahyuw.winw.filmcatalogue3.R;
import winarwahyuw.winw.filmcatalogue3.item.TVShowItems;

public class TVShowDetailActivity extends AppCompatActivity {

    public static final String EXTRA_TVSHOW="EXTRA_TV_SHOW";
    private TextView tvName, tvOverview, tvFirstAirDate;
    private ImageView ivPosterTVShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);

        final TVShowItems tvShowItems=getIntent().getParcelableExtra(EXTRA_TVSHOW);

        tvName=findViewById(R.id.tv_detail_name_tvshow);
        tvOverview=findViewById(R.id.tv_detail_overview_tvshow);
        tvFirstAirDate=findViewById(R.id.tv_detail_first_air_date);
        ivPosterTVShow=findViewById(R.id.img_detail_poster_tvshow);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(Objects.requireNonNull(tvShowItems).getName());
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Handler handler=new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        TVShowItems tvShowItems1=getIntent().getParcelableExtra(EXTRA_TVSHOW);
                        String url_poster="https://image.tmdb.org/t/p/w185" + Objects.requireNonNull(tvShowItems1).getPoster_path();

                        tvName.setText(tvShowItems1.getName());
                        tvOverview.setText(tvShowItems1.getOverview());
                        tvFirstAirDate.setText(tvShowItems1.getFirst_air_date());
                        Glide.with(TVShowDetailActivity.this)
                                .load(url_poster)
                                .apply(new RequestOptions().fitCenter())
                                .into(ivPosterTVShow);
                    }
                });
            }
        }).start();
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
