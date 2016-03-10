package rimp.rild.com.android.restsample;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rimp.rild.com.android.restsample.model.entity.WeatherEntity;
import rx.Observable;

/**
 * Created by rild on 16/03/10.
 */
public interface WeatherApi {
    @GET("/data/2.5/{path}")
    public Observable<WeatherEntity> get(@Path("path") String path, @Query("q") String name, @Query("appid") String key);
}