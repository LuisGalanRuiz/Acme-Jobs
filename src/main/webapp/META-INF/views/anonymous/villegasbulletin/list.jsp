<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.villegasBulletin.list.label.date" path="date" width="30%"/>
	<acme:list-column code="anonymous.villegasBulletin.list.label.author" path="author" width="30%"/>
	<acme:list-column code="anonymous.villegasBulletin.list.label.title" path="title" width="30%"/>
	<acme:list-column code="anonymous.villegasBulletin.list.label.text" path="text" width="10%"/>		
</acme:list>