package ten.exam_mate.APIResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsageDTO {
    @JsonProperty("prompt_tokens")
    private int promptTokens;

    @JsonProperty("completion_tokens")
    private int completionTokens;
    
    @JsonProperty("total_tokens")
    private int totalTokens;

    public int getPromptTokens() {
        return promptTokens;
    }
    
    public int getCompletionTokens() {
        return completionTokens;
    }

    public int getTotalTokens() {
        return totalTokens;
    }
}