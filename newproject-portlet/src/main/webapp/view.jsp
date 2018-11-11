<%@page import="com.example.sb.service.FirstEntityLocalServiceUtil"%>
<%@page import="com.example.sb.model.FirstEntity"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>


<liferay-theme:defineObjects />
<portlet:defineObjects />

<%! private static final Log log = LogFactoryUtil.getLog("JSP"); %>

<%

/*
	Enumeration<String> attributeNames = application.getInitParameterNames();
	while(attributeNames.hasMoreElements()){
		String element = attributeNames.nextElement();
		log.info(element + " : " + application.getInitParameter(element));
	}
	
	log.info("\nAtributes");
	Enumeration<String> attributeNames = request.getAttributeNames();
	while(attributeNames.hasMoreElements()){
		String element = attributeNames.nextElement();
		log.info(element + " : " + request.getAttribute(element));
	}

	log.info("\nParams");
	for (Entry<String, String[]> string : liferayPortletRequest.getParameterMap().entrySet()) {
		log.info(string.getKey() + " - " + Arrays.deepToString(string.getValue()) );
	}
	*/	
	FirstEntity entity = FirstEntityLocalServiceUtil.getFirstEntity(1);
	
	
%>

<style>
.aui-field-select{
	margin-bottom: 0px!important;
}
</style>
<liferay-portlet:actionURL var="simpleActionURL" />

<aui:form action="<%= simpleActionURL %>" method="POST" >
	<aui:input type="checkbox" name="checkTtestAuiInput" value="111" />
	<aui:input type="checkbox" name="checkTtestAuiInput" value="222" />
	<aui:input type="checkbox" name="checkTtestAuiInput" value="333" />

	<aui:select name="testAuiInput" label="aui-input" inlineField="true" disabled="false" >
		<aui:option value="1" selected="<% entity.getTestId() == 1 %>">первый</aui:option>
		<aui:option value="2" selected="<% entity.getTestId() == 2 %>">второй</aui:option>
		<aui:option value="3" selected="<% entity.getTestId() == 3 %>">третий</aui:option>
		<aui:option value="4" selected="<% entity.getTestId() == 4 %>">четвёртый</aui:option>
		<aui:option value="5" selected="<% entity.getTestId() == 5 %>">пятый</aui:option>
	</aui:select>
	<aui:input type="hidden" name="testAuiInput" value="<%= entity.getTestId() %>" />
	
	<aui:button type="submit" value="OK"/>
</aui:form>

<br/>
<%= Arrays.deepToString(ParamUtil.getParameterValues(request, "testAuiInput")) %>

<br/>
<%= ParamUtil.getString(request, "testAuiInput") %>