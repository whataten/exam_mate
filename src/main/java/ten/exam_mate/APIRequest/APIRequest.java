package ten.exam_mate.APIRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class APIRequest {

    public APIRequest(String inquiry) {
        this.model = "gpt-3.5-turbo-0125";

        this.messages = new ArrayList<MessageDTO>();
        this.messages.add(new MessageDTO("system", "I am a student. I hope you give me exam questions to study."));
        this.messages.add(new MessageDTO("system", "Please write all the questions in Korean"));

        this.messages.add(new MessageDTO("user", inquiry));
    }

    @JsonProperty("model")
    private String model;
    
    @JsonProperty("messages")
    private List<MessageDTO> messages;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<MessageDTO> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageDTO> messages) {
        this.messages = messages;
    }
}