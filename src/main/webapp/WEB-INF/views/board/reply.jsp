<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reply.jsp</title>
</head>
<body>
	views 폴더 안에 board라는 폴더를 따로 만들어서 그 안에 이 reply.jsp를 만들어 봤다.<br>
	
	느낀점) 폴더를 만들어서 자료 구조를 관리할 경우, 그걸 잘 써 줘야 한다.<br><br>
	
	@RequestMapping(value = "/board/reply")<br>
	public String jaehyun() {<br>
		return "board/reply";<br>
	}	<br><br>
	
	<b>이렇게 그냥 /reply가 아니라, /board/reply인 걸 잘 써 주라고.</b>
	
</body>
</html>