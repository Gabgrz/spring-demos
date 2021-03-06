package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator; // signal on how Jackson can create an instance of this POJO
import com.fasterxml.jackson.annotation.JsonProperty; // clearly marks what field Jackson should put this constructor argument into

public class Greeting extends ResourceSupport {

    private final String content;

    @JsonCreator
    public Greeting(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}