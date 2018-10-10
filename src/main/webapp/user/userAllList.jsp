
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<head>
<%@ include file="/common/basicLib.jsp"%>

</head>

<body>
	<%@ include file="/common/header.jsp"%>
	<div class="container-fluid">
		<div class="row">
			<%-- left --%>
			<%@ include file="/common/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">사용자</h2>
						<div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<th>번호</th>
									<th>사용자 아이디</th>
									<th>사용자 이름</th>
									<th>생일</th>
								</tr>
								<%
									List<UserVO> userList = (List) request.getAttribute("userList");
									int index = 0;
									for (UserVO uservo : userList) {
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
								%>
								<tr>
									<td><%=index%></td>
									<td><%=uservo.getUserId()%></td>
									<td><%=uservo.getName()%></td>
									<td><%=sdf.format(uservo.getBirth())%></td>
								</tr>

								<%
									index++;
									}
								%>
							</table>
						</div>

						<a class="btn btn-default pull-right">사용자 등록</a>

						<div class="text-center">
							<ul class="pagination">
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
							</ul>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
