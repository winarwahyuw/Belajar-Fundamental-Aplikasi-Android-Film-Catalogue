 package winarwahyuw.winw.filmcatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


 public class MainActivity extends AppCompatActivity  {

    private MovieAdapter adapter;
    private String[] dataName;
    private String[] dataDesc;
    private TypedArray dataPhoto;
    private ArrayList<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView=findViewById(R.id.lv_film);
        adapter = new MovieAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent moveIntent=new Intent(MainActivity.this, DetailActivity.class);
                Intent intent = moveIntent.putExtra("Movie", movieList.get(position));
                startActivity(intent);
            }
        });

    }

    private void prepare(){
        dataName=getResources().getStringArray(R.array.data_name);
        dataDesc=getResources().getStringArray(R.array.data_desc2);
        dataPhoto=getResources().obtainTypedArray(R.array.data_photo2);
    }

    private void addItem(){
        movieList=new ArrayList<>();

        for(int position=0; position<dataName.length; position++){
            Movie movie=new Movie();
            movie.setName(dataName[position]);
            movie.setDesc(dataDesc[position]);
            movie.setPhoto(dataPhoto.getResourceId(position,0));
            movieList.add(movie);
        }

        adapter.setMovies(movieList);
    }

 }
