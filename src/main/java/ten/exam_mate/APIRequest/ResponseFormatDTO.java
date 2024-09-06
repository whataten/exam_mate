package ten.exam_mate.APIRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseFormatDTO {

    public ResponseFormatDTO(String type) {
        this.type = type;
    }

    @JsonProperty("type")
    private String type;

    public void setType(String type) {
        this.type = type;
    }
}
