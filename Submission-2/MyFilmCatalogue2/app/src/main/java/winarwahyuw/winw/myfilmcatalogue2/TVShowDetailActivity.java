package winarwahyuw.winw.myfilmcatalogue2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TVShowDetailActivity extends AppCompatActivity {
    public static final String EXTRA_SHOW="extra show";

    TextView showTitle, showDesc;
    ImageView showPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);

        showTitle=findViewById(R.id.detail_tv_title);
        showDesc=findViewById(R.id.detail_tv_desc);
        showPhoto=findViewById(R.id.detail_tv_img);

        TVShow tvShow=getIntent().getParcelableExtra(EXTRA_SHOW);

        showTitle.setText(tvShow.getTVShowTitle());
        showDesc.setText(tvShow.getTVShowDesc());
        showPhoto.setImageResource(tvShow.getTVShowPhoto());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
