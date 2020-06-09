package winarwahyuw.winw.filmcatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.MovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView1=findViewById(R.id.tv_name_act2);
        TextView textView2=findViewById(R.id.tv_desc_act2);
        ImageView imageView=findViewById(R.id.img_film_act2);

        Movie m=getIntent().getParcelableExtra("Movie");

        String name= m.getName();
        String desc= m.getDesc();
        int photo= m.getPhoto();

        textView1.setText(name);
        textView2.setText(desc);
        imageView.setImageResource(photo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(name+ "Details");

    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
