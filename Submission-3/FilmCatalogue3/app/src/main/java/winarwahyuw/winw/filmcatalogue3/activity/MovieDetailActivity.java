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
import winarwahyuw.winw.filmcatalogue3.item.MovieItems;

public class MovieDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE="EXTRA_MOVIE";
    private TextView tvTitle, tvOverview, tvReleaseDate;
    private ImageView ivPoster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        MovieItems movieItems=getIntent().getParcelableExtra(EXTRA_MOVIE);

        tvTitle=findViewById(R.id.tv_detail_title);
        tvOverview=findViewById(R.id.tv_detail_overview);
        tvReleaseDate=findViewById(R.id.tv_detail_release_date);
        ivPoster=findViewById(R.id.img_detal_poster);
        ivPoster.setClipToOutline(true);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(movieItems.getTitle());
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Handler handler=new Handler();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        MovieItems movieItems1=getIntent().getParcelableExtra(EXTRA_MOVIE);
                        String url_poster="https://image.tmdb.org/t/p/w185" + Objects.requireNonNull(movieItems1).getPoster_path();

                        tvTitle.setText(movieItems1.getTitle());
                        tvOverview.setText(movieItems1.getOverview());
                        tvReleaseDate.setText(movieItems1.getRelease_date());
                        Glide.with(MovieDetailActivity.this)
                                .load(url_poster)
                                .apply(new RequestOptions().fitCenter())
                                .into(ivPoster);
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
