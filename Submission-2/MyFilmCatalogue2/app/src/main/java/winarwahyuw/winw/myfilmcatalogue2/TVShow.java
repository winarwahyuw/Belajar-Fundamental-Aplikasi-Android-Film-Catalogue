package winarwahyuw.winw.myfilmcatalogue2;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShow implements Parcelable {
    private String TVShowTitle;
    private String TVShowDesc;
    private int TVShowPhoto;

    protected TVShow(Parcel in) {
        TVShowTitle = in.readString();
        TVShowDesc = in.readString();
        TVShowPhoto = in.readInt();
    }

    public static final Creator<TVShow> CREATOR = new Creator<TVShow>() {
        @Override
        public TVShow createFromParcel(Parcel in) {
            return new TVShow(in);
        }

        @Override
        public TVShow[] newArray(int size) {
            return new TVShow[size];
        }
    };

    public TVShow() {

    }

    public String getTVShowTitle() {
        return TVShowTitle;
    }

    public void setTVShowTitle(String TVShowTitle) {
        this.TVShowTitle = TVShowTitle;
    }

    public String getTVShowDesc() {
        return TVShowDesc;
    }

    public void setTVShowDesc(String TVShowDesc) {
        this.TVShowDesc = TVShowDesc;
    }

    public int getTVShowPhoto() {
        return TVShowPhoto;
    }

    public void setTVShowPhoto(int TVShowPhoto) {
        this.TVShowPhoto = TVShowPhoto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static Creator<TVShow> getCREATOR() {
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(TVShowTitle);
        dest.writeString(TVShowDesc);
        dest.writeInt(TVShowPhoto);
    }
}
