package rimp.rild.com.android.restsample.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rild on 16/03/10.
 */
public class WeatherEntity {
    public Coord coord;
    @SerializedName("weather")
    public List<Weather> weathers;
    public String base;
    public Main main;
    public int visibility;
    public Wind wind;
    @SerializedName("clouds")
    public Cloud cloud;
    public int dt;
    public Sys sys;
    public int id;
    public String name;
    public int cod;

    public class Coord {
        public double lon;
        public double lat;
    }

    public class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;
    }

    public class Main {
        public double temp;
        public int pressure;
        public int humidity;
        public double tempMin;
        public double tempMax;
    }
    public class Wind {
        public double lon;
        public double lat;
    }

    public class Cloud {
        public int all;
    }

    public class Sys {
        public int type;
        public int id;
        public double message;
        public String country;
        public int sunrise;
        public int sunset;
    }

}
