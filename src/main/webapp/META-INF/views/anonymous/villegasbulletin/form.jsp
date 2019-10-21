<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.villegasBulletin.form.label.author" path="author" />
	<acme:form-textbox code="anonymous.villegasBulletin.form.label.title" path="title" />
	<acme:form-textarea code="anonymous.villegasBulletin.form.label.text" path="text" />

	<acme:form-submit code="anonymous.villegasBulletin.form.button.create" action="/anonymous/villegasbulletin/create"/>		
  	<acme:form-return code="anonymous.villegasBulletin.form.button.return"/>
</acme:form>
