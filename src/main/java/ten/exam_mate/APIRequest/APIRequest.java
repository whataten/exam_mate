package ten.exam_mate.APIRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class APIRequest {

    public APIRequest(String inquiry) {
        this.model = "gpt-3.5-turbo";

        this.messages = new ArrayList<MessageDTO>();
        this.messages.add(new MessageDTO("system",
                "내가 제공하는 정보를 토대로 7 개의 문제를 만들어줘. 모든 문제는 객관식이며, 5개의 선택지를 보여주고 그 중에서 고를 수 있도록 해줘. 모든 문제는 한국어로 만들어줘."));
        this.messages.add(new MessageDTO("system",
                "문제는 Json 형식으로 문제를 만들어줘. {'questions': [{'context':'첫 번째 문제의 지문이 위치합니다.','choice': {'1': '첫 번째 문제의 1번 선택지가 위치합니다.','2': '첫 번째 문제의 2번 선택지가 위치합니다.','3': '첫 번째 문제의 3번 선택지가 위치합니다.','4': '첫 번째 문제의 4번 선택지가 위치합니다.','5': '첫 번째 문제의 5번 선택지가 위치합니다.'},'answer': '첫 번째 문제의 정답 번호가 위치합니다.','commentary': '첫 번째 문제의 정답 풀이가 위치합니다.'},{'context':'두 번째 문제의 지문이 위치합니다.','choice': {'1': '두 번째 문제의 1번 선택지가 위치합니다.','2': '두 번째 문제의 2번 선택지가 위치합니다.','3': '두 번째 문제의 3번 선택지가 위치합니다.','4': '두 번째 문제의 4번 선택지가 위치합니다.','5': '두 번째 문제의 5번 선택지가 위치합니다.'},'answer': '두 번째 문제의 정답 번호가 위치합니다.','commentary': '두 번째 문제의 정답 풀이가 위치합니다.'}]}"));
        this.messages.add(new MessageDTO("user", inquiry));

        this.max_tokens = 4096;

        this.responseFormat = new ResponseFormatDTO("json_object");
    }

    @JsonProperty("model")
    private String model;

    @JsonProperty("max_tokens")
    private int max_tokens;

    @JsonProperty("response_format")
    private ResponseFormatDTO responseFormat;

    @JsonProperty("messages")
    private ArrayList<MessageDTO> messages;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<MessageDTO> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<MessageDTO> messages) {
        this.messages = messages;
    }
}