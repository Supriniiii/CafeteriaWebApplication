package com.web.cafeteriawebapplication;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHttpResponse {
    @LocalServerPort
    private int port;
    @autowired
    private TestRestTemplate;
    
}
