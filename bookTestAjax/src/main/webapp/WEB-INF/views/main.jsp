<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	function listBook(){
		$.ajax({url:"/listBook.do",success:function(data){
			$.each(data, function(i,book){
				let tr = $("<tr></tr>");
				$(tr).append( $("<td></td>").html( book.bookid ) );
				$(tr).append( $("<td></td>").html( book.bookname ) );
				$("#list").append(tr);
			});
		}});
	}
	
	listBook();
});
</script>
</head>
<body>
	<table id="list" border="1" width="80%">
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
		</tr>
	</table>
</body>
</html>