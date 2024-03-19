package ten.exam_mate.APIResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChoiceDTO {
    @JsonProperty("index")
    private int index;
    
    @JsonProperty("message")
    private MessageDTO message;

    @JsonProperty("logprobs")
    private Object logprobs;

    @JsonProperty("finish_reason")
    private String finishReason;

    public int getIndex() {
        return index;
    }

    public MessageDTO getMessage() {
        return message;
    }

    public Object getLogprobs() {
        return logprobs;
    }

    public String getFinishReason() {
        return finishReason;
    }
}