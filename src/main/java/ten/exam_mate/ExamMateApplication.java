package ten.exam_mate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import retrofit2.Call;
import retrofit2.Response;
import ten.exam_mate.APIRequest.APIRequest;
import ten.exam_mate.APIResponse.APIResponse;

@SpringBootApplication
public class ExamMateApplication {

	@Autowired
	private ExamMateProperties properties = new ExamMateProperties();

	public static void main(String[] args) {
		SpringApplication.run(ExamMateApplication.class, args);
	}
	
	@Controller
	class FormController {
		
		@GetMapping("/")
		public String homePage() {
			return "index";
		}
		
		@PostMapping("/")
		public String submitForm(@RequestParam("inputValue") String inputValue, Model model) {
			
			APIService apiService = RetrofitClient.getService();
			
			// Bearer 토큰 설정
			 String bearerToken = properties.getBearerToken();

			// 요청 본문 데이터 설정
			APIRequest apiRequest = new APIRequest(inputValue);
			
			// POST 요청 보내기
			Call<APIResponse> call = apiService.sendPostRequest("Bearer " + bearerToken, apiRequest);
			try {
				Response<APIResponse> response = call.execute();
				if (response.isSuccessful()) {
					APIResponse apiResponse = response.body();
					
					var content = apiResponse.getChoices().get(0).getMessage().getContent();
					model.addAttribute("inputValue", content);
					
				} else {
					model.addAttribute("inputValue", "다시 입력하세요.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "index";
		}
	}
}
