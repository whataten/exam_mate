package ten.exam_mate;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import ten.exam_mate.APIRequest.APIRequest;
import ten.exam_mate.APIResponse.APIResponse;

public interface APIService {
    
    @POST("completions")
    Call<APIResponse> sendPostRequest(@Header("Authorization") String authorization, @Body APIRequest requestBody);
}