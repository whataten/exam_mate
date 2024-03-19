package ten.exam_mate;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL = "https://api.openai.com/v1/chat/";

    public static APIService getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(APIService.class);
    }
}
