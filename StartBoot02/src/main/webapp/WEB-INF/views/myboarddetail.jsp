<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>이름</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
			<th>날짜</th>
			<td>${dto.mydate }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="20" cols="40" readonly="readonly">${dto.mycontent }</textarea></td>
		</tr>
	</table>
	
	<input type="button" value="삭제" onclick="location.href='delete?myno=${dto.myno }'">
	<input type="button" value="수정" onclick="location.href='updatepage?myno=${dto.myno }'">

</body>
</html>