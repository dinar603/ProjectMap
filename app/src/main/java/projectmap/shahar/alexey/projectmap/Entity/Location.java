package projectmap.shahar.alexey.projectmap.Entity;

/**
 * Created by Dell on 01-Feb-18.
 */

public class Location {

    int id;
    String date;
    double lat;
    double lng;
    String placeName;
    String placeDescription;
    Boolean isFavorite;
    String pic_preview;
    String pic_large;

    public Location(int id, String date, double lat, double lng, String placeName, String placeDescription, Boolean isFavorite) {
        this.id = id;
        this.date = date;
        this.lat = lat;
        this.lng = lng;
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.isFavorite = isFavorite;
    }


    public Location(int id, String date, double lat, double lng, String placeName, String placeDescription, Boolean isFavorite, String pic_preview, String pic_large) {
        this.id = id;
        this.date = date;
        this.lat = lat;
        this.lng = lng;
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.isFavorite = isFavorite;
        this.pic_preview = pic_preview;
        this.pic_large = pic_large;
    }

    public Location() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public String getPic_preview() {
        return pic_preview;
    }

    public void setPic_preview(String pic_preview) {
        this.pic_preview = pic_preview;
    }

    public String getPic_large() {
        return pic_large;
    }

    public void setPic_large(String pic_large) {
        this.pic_large = pic_large;
    }
}//Location
