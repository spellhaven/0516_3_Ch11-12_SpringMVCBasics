package com.spellhaven.spring0516_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 컨트롤러를 직접 만들 수도 있다. (write.jsp를 실행시킬 수 있는 놈을 만들어 보자.)
// 이렇게 컨트롤러가 여러 개면, DispatchServlet은 모든 컨트롤러에게 request를 보내게 된다. 중복만 안 되면 문제없다.

@RequestMapping("/board") // 클래스에 @RequestMapping 적용! 이렇게 하면 아래 value들의 /board를 생략해 줄 수 있다. (근데 이러면 MyController는 /board 아래에 있는 애들한테밖에 접근 못 함...)
// 근데 그래도 각 함수 애들의 리턴값은 그대로 "board/write" 이런 식으로 써야 함... 상위 폴더 생략 못 함. ㅋ.
public class MyController {

	@RequestMapping(value = "/write")
	public String write() {
		return "board/write";
	}
	
	@RequestMapping(value = "/reply") // Context Path 뒤에 올 부분(파일 주소 뒷부분)을 제대로 써 주면 된다.
	public String jaehyun() {
		return "board/reply"; // 여기도 마찬가지다. [[board 폴더 안에 있는]] reply를 실행시켜 줘! 이렇게 잘 명시해야 404 안 뜸
	}
	
	
	// 페이지를 실행하면서 내용을 보여 주지만 말고, Model을 써서 .jsp에다 무언가를 실어 보내기도 해 보자. (이래서 "ModelAndView"라고 불리는 거다.)		
	@RequestMapping(value = "/content")
	public String content(Model model) { // 인수 있디
		
		model.addAttribute("memberId", "tiger"); // 인수 2개는 - 실어 보낼 것의 이름, 객체(아무 타입이어도 됨. 여기선 String 씀)
		
		return "board/content"; // 이렇게 나온 content.jsp 페이지는 model도 받았기 때문에, 사용할 수 있다. EL을 쓰는 걸 함 보자.
	}
	
	
	// 이번엔 ModelAndView로 Model과 View를 한꺼번에 같이 보내 보자. 교수님은 reply.jsp를 고치셨지만 난 뭐 새로 만듦
	@RequestMapping(value = "/upvote")
	public ModelAndView upvote() { // 리턴형을 ModelAndView로. (교: 리턴형이 왜 ModelAndView여야 하는지 모르면 자바 함수 부분 다시 배워야 해요~~)
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("memberId", "BlackTiger"); // 모델 데이터 설정함, ㅋ		
		mv.setViewName("board/upvote");
		
		return mv;
	}
	
	
	
}





















