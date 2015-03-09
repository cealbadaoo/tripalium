<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="claimBean" class="com.webhomecover.beans.ClaimBean" scope="request"/>
<jsp:setProperty name="claimBean" property="*" />
<jsp:forward page="claimresponseserverpage.jsp" />
