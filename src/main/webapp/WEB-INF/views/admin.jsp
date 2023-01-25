<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manitto | Admin</title>
</head>
<body>
<jsp:include page="frame/header.jsp" /><br>

<h1>관리자 페이지 입니다.반갑습니다.</h1>
<h3>
	<ul>
		<li><a href="<%=request.getContextPath()%>/api/match/pmrreg">벌칙, 미션, 보상 등록 </a></li>
		<li><a href="<%=request.getContextPath()%>/api/match/pmrlookup">벌칙, 미션, 보상 조회 </a></li>
		<li><a href="<%=request.getContextPath()%>/userrev">전체 유저 조회 </a></li>
		<li><a href="<%=request.getContextPath()%>/currentmani">현재 마니또 참여 그룹 </a></li>	
	</ul>
</h3>
 <Script>
 console.log(<%=request.getContextPath()%>);
</Script>


</body>
</html>
