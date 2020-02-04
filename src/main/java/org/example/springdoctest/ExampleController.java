package org.example.springdoctest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ExampleController {

    private static int counter = 0;

    @PostMapping(value = "/v1/test", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Mono<ExampleResponse> getPlanForParameter(@RequestBody ExampleRequest exampleRequest) {
        return Mono.just(new ExampleResponse(exampleRequest.getId(), counter++));
    }
}
