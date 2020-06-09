package winarwahyuw.winw.filmcatalogue3.fragment_with_view_model;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

import cz.msebera.android.httpclient.Header;
import winarwahyuw.winw.filmcatalogue3.item.MovieItems;

public class MovieViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private static final String API_KEY="5ec518cd0e3a58bbeb7141f9a3e8be78";
    private MutableLiveData<ArrayList<MovieItems>> listMovie=new MutableLiveData<>();

    void setMovie(final String movies){
        AsyncHttpClient client=new AsyncHttpClient();
        final ArrayList<MovieItems> listMovieItems=new ArrayList<>();
        String url="https://api.themoviedb.org/3/discover/movie?api_key=" +API_KEY+ "&language=en-US&page=1";

        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String result=new String(responseBody);

                try{
                    JSONObject responseObject=new JSONObject(result);
                    JSONArray list=responseObject.getJSONArray("results");

                    for(int i=0; i<list.length(); i++){
                        JSONObject movie=list.getJSONObject(i);
                        MovieItems movieItems=new MovieItems(movie);

                        Log.d("DATA", movie.getString("title"));

                        listMovieItems.add(movieItems);
                    }
                    listMovie.postValue(listMovieItems);
                } catch (JSONException e) {
                    Log.d("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", Objects.requireNonNull(error.getMessage()));
            }
        });
    }

    public LiveData<ArrayList<MovieItems>> getMovies () {
        return listMovie;
    }
}
