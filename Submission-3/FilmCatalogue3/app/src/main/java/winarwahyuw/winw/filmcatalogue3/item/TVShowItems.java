package winarwahyuw.winw.filmcatalogue3.item;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class TVShowItems implements Parcelable {
    private String name;
    private String poster_path;
    private String overview;

    public  TVShowItems(){

    }

    public String getName() {
        return name;
    }

    public void setName(String original_name) {
        this.name = original_name;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public static Creator<TVShowItems> getCREATOR() {
        return CREATOR;
    }

    private String first_air_date;

    protected TVShowItems(Parcel in) {
        name = in.readString();
        poster_path = in.readString();
        overview = in.readString();
        first_air_date = in.readString();
    }

    public static final Creator<TVShowItems> CREATOR = new Creator<TVShowItems>() {
        @Override
        public TVShowItems createFromParcel(Parcel in) {
            return new TVShowItems(in);
        }

        @Override
        public TVShowItems[] newArray(int size) {
            return new TVShowItems[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(poster_path);
        dest.writeString(overview);
        dest.writeString(first_air_date);
    }

    public TVShowItems(JSONObject object){
        try{
            String name             =object.getString("name");
            String overview         =object.getString("overview");
            String first_air_date   =object.getString("first_air_date");
            String poster_path      =object.getString("poster_path");

            this.name           =name;
            this.overview       =overview;
            this.first_air_date =first_air_date;
            this.poster_path    =poster_path;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
