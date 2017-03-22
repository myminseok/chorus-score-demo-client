package com.example;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class ScoreDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoreDemoClientApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(HttpServletRequest request, Model model) throws Exception {
		return "index";
	}
	
	
}
