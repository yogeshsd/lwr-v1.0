<%@page import="com.lwr.software.reporter.reportmgmt.Report"%>
<%@page import="java.util.Set"%>
<%@page import="com.lwr.software.reporter.reportmgmt.ReportManager"%>
<%@page import="com.lwr.software.menu.MenuItem"%>
<%@page import="java.util.List"%>
<%@page import="com.lwr.software.reporter.security.UserSecurityContext"%>
<%@page import="com.lwr.software.menu.MenuFactory"%>
<%@page import="com.lwr.software.reporter.DashboardConstants"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<section>
	<%
		Set<Report> reports = ReportManager.getReportManager().getReports();
		if(reports == null || reports.isEmpty()){
			ReportManager.getReportManager().reload();
			if(reports == null || reports.isEmpty()){
				%>
					<jsp:forward page="getstarted"></jsp:forward>
				<%
			}
		}
		%>
		<script>
			function search(){
				var text = $("#searchtext").val().toLowerCase();
				var rows = $(".repotlisttable");
				
				$(rows).each(function() {
					var link = $(this).html();
					if(link.toLowerCase().indexOf(text)>=0){
						$(this).parent().show();							
					}else{
						var description = $(this).parent().find(".reportdescr").text().toLowerCase();
						if(description.indexOf(text)>=0){
							$(this).parent().show();							
						}else{
							$(this).parent().hide();
						}
					}
				});
			}
		</script>
		<div align="right">
			<table id="homesearchtable">
				<tr>
					<td>Report Search</td>
					<td><input width="100%" type="text" onkeyup="search()" id="searchtext" value=""></input></td>
				</tr>
			</table>
		</div>
		<br>
<div>
<ul class="list-group">
		<%
		for(Report report: reports){
			String title = report.getTitle();
			String descrption = report.getDescription();
			%>
    			<li class="list-group-item" style="padding:0px">
            			<a class="homepagelinks" title="Click to run report" alt="Click to run report" href="/lwr/report?name=<%=title%>">
            				<h5 style="padding-left:10px;color:blue;font-weight: bold"><%=title%></h5>
            			</a>
            			<span class="repotlisttable" style="color:black;padding-left:10px"><%=descrption%></span>	
        		</li>
			<%
		}
	%>
	</ul>
</div>
</section>
<%@ include file="footer.jsp"%>