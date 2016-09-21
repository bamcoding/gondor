<%@page import="net.homework1.vo.ArtclVO"%>
<%@page import="net.homework1.dao.ArtclDao"%>
<%@page import="net.homework1.dao.ArtclDaoImpl"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Article</title>
</head>
<body>
	<table border=1 style="border-collaps:collaps; border:1px solid black">

		<tr>
			<th>ARTCL_ID</th>
			<th>SBJ</th>
			<th>CONT</th>
			<th>CRT_DT</th>
		</tr>
<%	ArtclDao dao = new ArtclDaoImpl(); 
	List<ArtclVO> artclVOs = dao.getArtcls();
	
	for(ArtclVO artclVO:artclVOs) {
		
%>

		<tr>
			<td><%= artclVO.getArticleId() %></td>
			<td><%= artclVO.getSubject() %></td>
			<td><%= artclVO.getContent() %></td>
			<td><%= artclVO.getCreateDate() %></td>
		</tr>
				
<%
		}
%>
	</table>
</body>
</html>