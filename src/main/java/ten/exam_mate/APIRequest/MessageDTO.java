package ten.exam_mate.APIRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {

    public MessageDTO(String role, String content) {
        this.role = role;
        this.content = content;
    }

    @JsonProperty("role")
    private String role;
    
    @JsonProperty("content")
    private String content;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}