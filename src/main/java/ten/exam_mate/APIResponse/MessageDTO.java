package ten.exam_mate.APIResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {
    @JsonProperty("role")
    private String role;
    
    @JsonProperty("content")
    private String content;

    public String getRole() {
        return role;
    }

    public String getContent() {
        return content;
    }
}