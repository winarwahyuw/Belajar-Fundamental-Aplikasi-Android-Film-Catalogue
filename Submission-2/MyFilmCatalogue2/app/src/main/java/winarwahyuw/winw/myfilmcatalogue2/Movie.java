package winarwahyuw.winw.myfilmcatalogue2;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String movieTitle;
    private String movieDesc;
    private int moviePhoto;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public int getMoviePhoto() {
        return moviePhoto;
    }

    public void setMoviePhoto(int moviePhoto) {
        this.moviePhoto = moviePhoto;
    }

    public static Creator<Movie> getCREATOR() {
        return CREATOR;
    }

    public Movie() {
        // Required empty public constructor
    }


    protected Movie(Parcel in) {
        movieTitle = in.readString();
        movieDesc = in.readString();
        moviePhoto = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(movieTitle);
        dest.writeString(movieDesc);
        dest.writeInt(moviePhoto);
    }
}
