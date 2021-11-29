package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {


@GetMapping(path = "/hello2", produces = "application/json")
String home() {
	return "{'msg':'hello world!'}";
}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
