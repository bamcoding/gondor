<%@page import="net.gondor.vo.NewsVO"%>
<%@page import="net.gondor.dao.NewsDao"%>
<%@page import="net.gondor.dao.NewsDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 처리하는 페이지들은 그 처리만 해주면 된다.
	따라서 아무것도 필요없다.
	 -->
<%
	//한글 깨짐을 방지를 위한 코드
	request.setCharacterEncoding("UTF-8");

	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	
	//contents 의 줄바꿈 문자를  br로 바꾸기
	contents = contents.replaceAll("\n","<br/>")
						.replaceAll("\r", "");
 	//최종 결과를 내용에 담는다 이미 등록이된 내용들은 어쩔 수가 없다.
	
	String categoryIdParse = request.getParameter("categoryId");
	String journalistIdParse = request.getParameter("journalistId");;

	if(journalistIdParse == null){
		journalistIdParse="1";
	}
	if(subject==null){
		subject="제목이 없습니다.";
	}
	if(contents==null){
		subject="내용이 없습니다.";
	}
	
	int categoryId = Integer.parseInt(categoryIdParse);
	int journalistId = Integer.parseInt(journalistIdParse);
	
	
	NewsVO newsVO =new NewsVO();
	
	newsVO.setCategoryId(categoryId);
	newsVO.setJournalistId(journalistId);
	newsVO.setSubject(subject);
	newsVO.setContent(contents);
	
	NewsDao dao = new NewsDaoImpl();
	dao.addNewNews(newsVO);

	//등록이 완료된 시점에서 다시 이동합니다. -->
	 response.sendRedirect("/Article/news.jsp");
%>

<h1>기사가 등록되었습니다.</h1>
<!-- <a href="./news.jsp?categoryId=<%=categoryId%>&parentCategoryId=8">뉴스 보기</a>
 -->
 
