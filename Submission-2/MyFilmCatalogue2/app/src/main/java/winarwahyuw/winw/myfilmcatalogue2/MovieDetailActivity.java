package winarwahyuw.winw.myfilmcatalogue2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE="extra movie";
    TextView movieTitle, movieDesc;
    ImageView moviePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        movieTitle=findViewById(R.id.detail_movie_title);
        movieDesc=findViewById(R.id.detail_movie_desc);
        moviePhoto=findViewById(R.id.detail_movie_img);

        Movie movie=getIntent().getParcelableExtra(EXTRA_MOVIE);

        movieTitle.setText(movie.getMovieTitle());
        movieDesc.setText(movie.getMovieDesc());
        moviePhoto.setImageResource(movie.getMoviePhoto());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
