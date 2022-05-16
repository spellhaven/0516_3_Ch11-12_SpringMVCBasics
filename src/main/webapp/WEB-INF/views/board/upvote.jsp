<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upvote.jsp</title>
</head>
<body>
	여기는 upvote.jsp입니디. <br>
	내가 받은 아이디는 ${memberId}입니다. <br><br>
	
	<h3>Model, 그리고 View. 누구나 누릴 수 없는 두 품격을 한 번에. 더블 역세권.<br><br></h3>
	
	(ModelAndView는 그냥 평범한 @RequestMapping에 model.addAttribute를 달아서 할 수도 있고,<br>
	이 방법대로 아예 ModelAndView 클래스를 써서도 할 수 있다.<br><br>
	
	"프로그래밍은 같은 결과를 여러 방법으로 낼 수 있다" - 이 교훈이 수없이 강조된다.<br>
	왜 그럴까. 내 생각엔 개발자들이 풍각쟁이라서 그런 것 같다.)<br><br>
	
	그리고 놀랍게도 이게 Spring 13장 내용 끝이다.
	
</body>
</html>