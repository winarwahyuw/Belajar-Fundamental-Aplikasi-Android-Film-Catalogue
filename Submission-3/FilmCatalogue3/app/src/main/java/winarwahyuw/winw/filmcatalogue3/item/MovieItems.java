package winarwahyuw.winw.filmcatalogue3.item;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class MovieItems implements Parcelable{
    private String title;

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    private String poster_path;

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public static Creator<MovieItems> getCREATOR() {
        return CREATOR;
    }

    private String overview;
    private String release_date;

    public MovieItems(){

    }

    public MovieItems(JSONObject movie) {
        try{
            String title    =movie.getString("title");
            String overview =movie.getString("overview");
            String release_date =movie.getString("release_date");
            String poster_path  =movie.getString("poster_path");

            this.release_date=release_date;
            this.title=title;
            this.overview=overview;
            this.poster_path=poster_path;

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected MovieItems(Parcel in) {
        title = in.readString();
        overview = in.readString();
        release_date=in.readString();
        poster_path=in.readString();
    }

    public static final Creator<MovieItems> CREATOR = new Creator<MovieItems>() {
        @Override
        public MovieItems createFromParcel(Parcel in) {
            return new MovieItems(in);
        }

        @Override
        public MovieItems[] newArray(int size) {
            return new MovieItems[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(overview);
        dest.writeString(release_date);
        dest.writeString(poster_path);
    }
}
