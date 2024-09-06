package ten.exam_mate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExamMateProperties {
    
    @Value("${exam_mate.openai.key}")
    private String bearerToken;

    public String getBearerToken() {
        return bearerToken;
    }
}
