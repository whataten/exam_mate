package ten.exam_mate.APIResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class APIResponse {
        @JsonProperty("id")
        private String id;
        
        @JsonProperty("object")
        private String object;

        @JsonProperty("created")
        private long created;
        
        @JsonProperty("model")
        private String model;

        @JsonProperty("choices")
        private List<ChoiceDTO> choices;

        @JsonProperty("usage")
        private UsageDTO usage;

        @JsonProperty("system_fingerprint")
        private String systemFingerprint;
                
        public String getId() {
            return id;
        }

        public String getObject() {
            return object;
        }
        
        public long getCreated() {
            return created;
        }

        public String getModel() {
            return model;
        }

        public List<ChoiceDTO> getChoices() {
            return choices;
        }

        public UsageDTO getUsage() {
            return usage;
        }

        public String getSystemFingerprint() {
            return systemFingerprint;
        }
    }
    
