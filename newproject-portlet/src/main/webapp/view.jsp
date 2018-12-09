
<%@page import="com.example.sb.service.PeopleLocalServiceUtil"%>
<%@page import="com.example.sb.model.People"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
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

<style>
.aui-field-select{
	margin-bottom: 0px!important;
}
</style>

<liferay-portlet:actionURL var="testURL"></liferay-portlet:actionURL>
<aui:button value="23234234" href="<%= testURL %>"></aui:button>>

<liferay-ui:error key="birthdate-required" message="date-of-birth-required" />
<%
	List<String> list = new ArrayList();
	list.add("first");
	list.add("second");
	list.add("third");
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
       <portlet:param name="mvcPath" value="/html/view.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container  delta="20" iteratorURL="<%= iteratorURL %>">
<liferay-ui:search-container-results results="<%=list %>" total="<%=list.size() %>" />
<liferay-ui:search-container-row className="java.lang.String"  modelVar="slogan">
	<liferay-ui:search-container-column-text name="rating">
		<liferay-ui:ratings-score score="<%= 2332 %>" /> 
		<liferay-ui:ratings classPK="" className="" ></liferay-ui:ratings>
	</liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text value="<%= slogan %>" name="slogan-text" />
</liferay-ui:search-container-row>
<liferay-ui:search-iterator />
</liferay-ui:search-container>

<span id="textSpan"></span>

<liferay-portlet:resourceURL id="sock" var="resURL"></liferay-portlet:resourceURL>

<script type="text/javascript">
	console.log("<%= resURL.toString() %>");
	var socket = new WebSocket("<%= resURL.toString() %>");

	// первый вызовется, когда соединение будет установлено:
	socket.onopen = function() { alert("Connection opened...") };
	 
	// второй - когда соединено закроется
	socket.onclose = function() { alert("Connection closed...") };
	 
	// и, наконец, третий - каждый раз, когда браузер получает какие-то данные через веб-сокет
	socket.onmessage = function(evt) { $("#textSpan").append("<p>"+evt.data+"</p>"); };
	
$(document).ready(function(){
	
})

</script>