package com.tub.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		/***
		String webPage = "<!DOCTYPE html>\n"
				+ "<html lang=\"ko\">\n"
				+ "<head>\n"
				+ "    <meta charset=\"UTF-8\">\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
				+ "    <title>기본 HTML 페이지</title>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "    <h1>Hello, world!</h1>\n"
				+ "    <p>이것은 기본 HTML 페이지입니다.</p>\n"
				+ "</body>\n"
				+ "</html>\n"
				+ "";
				***/
		return "index.html";

	}

}
