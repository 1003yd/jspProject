
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

			<%
				UserVO user = (UserVO) request.getAttribute("userVo");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
			//	if(user.getProfile()== null){
				//	user.setProfile("/profile/noimage.png");
				//}
				 
			%>


			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">사용자 사진</label>
						<div class="col-sm-10">
							<img src="<%=user.getProfile()== null ? "/profile/noimage.png" : user.getProfile()%>"/>
						</div>
					</div>
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">사용자 아이디</label>
						<div class="col-sm-10">
							<label class="control-label"><%=user.getUserId()%></label>
						</div>
					</div>

					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">이름</label>
						<div class="col-sm-10">
							<label class="control-label"><%=user.getName()%></label>
						</div>
					</div>
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">주소</label>
						<div class="col-sm-10">
							<label class="control-label"><%=user.getAddr1()%></label>
						</div>
					</div>
					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">상세주소</label>
						<div class="col-sm-10">
							<label class="control-label"><%=user.getAddr2()%></label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">우편번호</label>
						<div class="col-sm-10">
							<label class="control-label"><%=user.getZipcd()%></label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">생년월일</label>
						<div class="col-sm-10">
							<label class="control-label"><%=sdf.format(user.getBirth())%></label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">이메일</label>
						<div class="col-sm-10">
							<label class="control-label"><%=user.getEmail()%></label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">연락처</label>
						<div class="col-sm-10">
							<label class="control-label">0<%=user.getTel()%></label>
						</div>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>
