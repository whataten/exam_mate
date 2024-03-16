package ten.exam_mate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class ExamMateApplication {

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
			model.addAttribute("inputValue", inputValue);
			return "index";
		}
	}
}
