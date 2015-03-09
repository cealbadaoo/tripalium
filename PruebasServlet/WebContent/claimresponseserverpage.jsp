<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="claimBean" class="com.webhomecover.beans.ClaimBean" scope="request"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insurance Claim Deatils</title>
</head>
<body>
Gracias por realizar tu reclamación. <br>
Aquí están los detalles de la misma <br>
------------------------- <br>

Número de Póliza:
<jsp:getProperty property="policyNumber" name="claimBean"/><br>
Valor de la Reclamación:
<jsp:getProperty property="claim" name="claimBean"/><br>
Tipo de reclamación:
<jsp:getProperty property="type" name="claimBean"/><br>
Descripción de la reclamación:
<jsp:getProperty property="description" name="claimBean"/><br>
</body>
</html>