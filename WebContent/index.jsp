<%@page import="net.sf.json.JSONObject"%>
<%@page import="bean.UserBean"%>
<%@page import="view.DashboardView"%>
<%@page import="helper.DashboardHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="ValidateLogin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>

<%
	System.out.println("in index jsp");
	JSONObject branchList = (JSONObject)request.getAttribute("branchlist");
	DashboardHelper dashBoardHelper = new DashboardHelper(request);
	DashboardView dashboardView = new DashboardView();
	dashBoardHelper.prepareManagePage(request, dashboardView);
	String headings = dashboardView.getColumnHeadings().get(0).toString();
	String jsonData = dashboardView.getColumnData();	
	UserBean userBean  = (UserBean) session.getAttribute("userbean");
%>
<meta charset="utf-8">
<title>CCC Config.</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" type="text/css"
	href="lib/bootstrap/css/bootstrap.css">

<link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

<script src="lib/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="webpages/javascript/ajaxcall.js" type="text/javascript"></script>

<!-- Demo page code -->

<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

.brand .first {
	color: #ccc;
	font-style: italic;
}

.brand .second {
	color: #fff;
	font-weight: bold;
}
</style>

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="../assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../assets/ico/apple-touch-icon-57-precomposed.png">
</head>
<script type="text/javascript">

//window.location.href = window.location.pathname;;
</script>
<!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
<!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
<!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
<!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<body class="">
	<!--<![endif]-->
	<input type="hidden" id="frame" name="frame" value="0" />
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav pull-right">

				<li><a href="#"
					class="hidden-phone visible-tablet visible-desktop" role="button">Settings</a></li>
				<li id="fat-menu" class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <i
						class="icon-user"></i> <%=userBean.getFirstname() %> <i
						class="icon-caret-down"></i>
				</a>

					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">My Account</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" class="visible-phone" href="#">Settings</a></li>
						<li class="divider visible-phone"></li>
						<li><a tabindex="-1" href="sign-in.html">Logout</a></li>
					</ul></li>

			</ul>
			<a class="brand" href="index.html"><span class="first">CCC</span>
				<span class="second">Config.</span></a>
		</div>
	</div>




	<div class="sidebar-nav">
		<form class="search form-inline">
			<input type="text" placeholder="Search...">
		</form>

		<a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i
			class="icon-dashboard"></i>Dashboard</a>
		<ul id="dashboard-menu" class="nav nav-list collapse in">
			<li><a href="index.jsp">Dashboard</a></li>
			<li><a href="users.html" target="dshcenter">Depot</a></li>
			<li><a href="user.html" target="dshcenter">Build</a></li>
			<li><a href="media.html" target="dshcenter">Media</a></li>
			<li><a href="calendar.html" target="dshcenter">Calendar</a></li>

		</ul>

		<a href="#accounts-menu" class="nav-header" data-toggle="collapse"><i
			class="icon-briefcase"></i>Account<span class="label label-info">+3</span></a>
		<ul id="accounts-menu" class="nav nav-list collapse">
			<li><a href="sign-in.html" target="dshcenter">Sign In</a></li>
			<li><a href="sign-up.html" target="dshcenter">Sign Up</a></li>
			<li><a href="reset-password.html" target="dshcenter">Reset
					Password</a></li>
		</ul>

		<a href="#error-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-exclamation-sign"></i>Error
			Pages <i class="icon-chevron-up"></i></a>
		<ul id="error-menu" class="nav nav-list collapse">
			<li><a href="403.html">403 page</a></li>
			<li><a href="404.html">404 page</a></li>
			<li><a href="500.html">500 page</a></li>
			<li><a href="503.html">503 page</a></li>
		</ul>

		<a href="#legal-menu" class="nav-header" data-toggle="collapse"><i
			class="icon-legal"></i>Legal</a>
		<ul id="legal-menu" class="nav nav-list collapse">
			<li><a href="privacy-policy.html" target="dshcenter">Privacy
					Policy</a></li>
			<li><a href="terms-and-conditions.html" target="dshcenter">Terms
					and Conditions</a></li>
		</ul>

		<a href="help.html  target=" dshcenter" class="nav-header"><i
			class="icon-question-sign"></i>Help</a> <a href="faq.html"
			class="nav-header" target="dshcenter"><i class="icon-comment"></i>Faq</a>
	</div>


	<iframe src="/servlet/dashboard.jsp" name="dshcenter"
		style="border-left-width: 1px; width: 1107px; margin-right: 10px; border-right-width: 1px; margin-left: 240px; position: absolute; height: 632px;"
		src="/servlet/user.html"></iframe>
	<script src="lib/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
</body>
</html>


