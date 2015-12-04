package demo;

import com.squareup.okhttp.OkHttpClient;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by lidongyang on 2015/12/4.
 */
public class BaseRetrofit {

    private static final String BASE_URL = "";

    private static Retrofit instance = null;

    public static <T> T getInstance(Class<T> claszz) {
        if (instance == null) {
            synchronized (BaseRetrofit.class) {
                if (instance == null) {
                    instance = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(new OkHttpClient())
                            .build();

                }
            }
        }
        return instance.create(claszz);
    }
}
