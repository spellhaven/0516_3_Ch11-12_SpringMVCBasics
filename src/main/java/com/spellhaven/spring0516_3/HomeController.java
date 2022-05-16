package com.spellhaven.spring0516_3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	// @RequestMapping(value = "/")니까 Context Path 뒤에 /만 있고 비워져 있는 주소에 대해
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); // 오. 다시 보니 너도 그냥 View가 아니라 ModelAndView 구조였구나.
		
		return "home"; // Controller는 "home"이라는 말을 붙여 준다.
		// 그러면 DispatcherServlet은 둘을 합친 http://localhost:8181/spring0516_3/home
		// 이 주소로 클라이언트를 보내 주는 거야.
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		return "test";
		// 리턴값과 Context Path가 합쳐져서 url이 되니까, 이 리턴값 문자열은 꼭 목적지가 될 jsp 파일의 이름과 같아야 한다.
		// 예) 얘는 test.jsp와 연결된다.
	}
	
	@RequestMapping(value = "/view")
	public String bruh() { // 이 함수 이름은 꼭 가려는 페이지와 같을 필요는 없다. (그러나 가독성은. 살해당했다.)
		return "view";
	}
	
}
