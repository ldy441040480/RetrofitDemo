package demo;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.GET;

/**
 * Created by lidongyang on 2015/12/4.
 */
public interface BaseServise {

    @GET("/some/entpoint")
    Call<String> get(@Field("name1") String name1, @Field("name2") String name2);
}
