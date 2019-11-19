package object;

public class MovieWithBLOBs extends Movie {
    private String movieintroduce;

    private String officialwebsite;

    public String getMovieintroduce() {
        return movieintroduce;
    }

    public void setMovieintroduce(String movieintroduce) {
        this.movieintroduce = movieintroduce == null ? null : movieintroduce.trim();
    }

    public String getOfficialwebsite() {
        return officialwebsite;
    }

    public void setOfficialwebsite(String officialwebsite) {
        this.officialwebsite = officialwebsite == null ? null : officialwebsite.trim();
    }
}