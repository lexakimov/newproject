
<%@page import="com.example.sb.service.persistence.Entity1Util"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%! private static final Log log = LogFactoryUtil.getLog("JSP"); %>
SETSTSS
<style>
.aui-field-select{
	margin-bottom: 0px!important;
}
</style>
<%
	try{
		Entity1Util.getPersistence().findByPrimaryKey(443);
	}catch (Throwable e){
		out.println("<div class='alert alert-error'>");
		out.println(this);
		out.println("<br/>");
		StackTraceElement[] trace = e.getStackTrace();
		for (StackTraceElement traceElement : trace){
			out.println("\tat " + traceElement);
			out.println("<br/>");
		}
		out.println("</div>");
	}

%>

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
