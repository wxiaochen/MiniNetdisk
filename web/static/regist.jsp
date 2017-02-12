<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<html>
  <head>
    <title>注册</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
	<script src="/static/js/jquery.min.js"></script>
	 <script type="text/javascript">

		 var flag = false;
         function checkuser() {
             var user = $('#userName').val() ;
             var $result;

             $("#userdiv span:gt(0)").remove();
             if(user != ""){
                 $result = $("<span><font color='green' >√</font></span>");
                 flag=true;
             }
             else{
                 $result = $("<span><font color='red'>用户名不能为空</font></span>")
                 flag = false;
             }
             $('#userdiv').append($result);
         }
		 function checkemail() {
			 var emailreg =  /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
			 var emailValue = $('#email').val();
			 var $result;

			 $("#emaildiv span:gt(0)").remove();
			 if(emailreg.test(emailValue)){
			     $result = $("<span><font color='green' >√</font></span>");
			     flag=true;
			 }
			 else{
			     $result = $("<span><font color='red'>请输入正确的邮箱格式</font></span>");
                 flag = false;
			 }
			 $('#emaildiv').append($result);
         }

         function checkpass() {
			 var pass = $('#password').val();
			 var passreg = /((?=.*\d)(?=.*\D)|(?=.*[a-zA-Z])(?=.*[^a-zA-Z]))^.{8,16}$/;
             var $result;
             $("#passdiv span:gt(0)").remove();
             if(passreg.test(pass)){
                 $result = $("<span><font color='green' >√</font></span>");
                 flag=true;
             }
             else{
                 $result = $("<span><font color='red'>请输入正确的密码格式</font></span>");
                 flag=false;
             }
             $('#passdiv').append($result);

         }
         function checkrepass() {
             var repass = $('#repass').val();
             var passreg = /((?=.*\d)(?=.*\D)|(?=.*[a-zA-Z])(?=.*[^a-zA-Z]))^.{8,16}$/;
             var $result;
             $("#repassdiv span:gt(0)").remove();
             if(passreg.test(repass)){
                 if($('#password').val() == repass){
                     $result = $("<span><font color='green' >√</font></span>");
                     flag=true;
				 }
                 else{
                     $result = $("<span><font color='red' >密码输入不一致</font></span>");
                     flag=false;
				 }
             }
             else{
                 $result = $("<span><font color='red'>请输入正确的密码格式</font></span>");
                 flag=false;
             }
             $('#repassdiv').append($result);

         }
         
         function doSubmit() {
             checkuser();
             checkpass();
             checkemail();
             checkrepass();
             if(flag){
                 document.forms[0].submit();
			 }
             else{
                 alert("请检查表单！");
			 }
         }

	 </script>
  </head>
  <body > 
	<div class="container" style="width:400px; margin-top:150px;"> 
		<p style="color:#46A3FF; font-size:27px; margin-left:46px; margin-bottom:30px;">Mini云盘注册</p>
		<form action="/regist" method="post">
		<div id="userdiv" class="input-group " style="margin-bottom:20px;">
	      <span class="input-group-addon" style="width:50px;">用户名</span>
	      <input type="text" class="form-control" id="userName" name="userName" onchange="checkuser()" placeholder="昵称" style="width:200px">
	    </div>

	    <div id="emaildiv" class="input-group" style="margin-bottom:20px">
	      <span class="input-group-addon" style="width:50px;">邮箱</span>
	      <input type="text" class="form-control" id="email" onchange="checkemail()" name="email" style="width:213px">
	    </div>

	    <div id="passdiv" class="input-group" style="margin-bottom:20px">
	      <span class="input-group-addon" style="width:50px;">密码</span>
	      <input type="text" class="form-control" id="password" name="password" onchange="checkpass()" style="width:213px" placeholder="8-16位的字母数字或下划线">
	    </div>

	    <div id="repassdiv" class="input-group" style="margin-bottom:20px">
	      <span class="input-group-addon" style="width:50px;">确认密码</span>
	      <input type="text" class="form-control" id="repass" onchange="checkrepass()" style="width:185px" placeholder="8-16位的字母数字或下划线">
	    </div>
	    
	    <div class="input-group" style="margin-bottom:20px">
	      	<input type="button" class="btn btn-info" onclick="doSubmit()" style="width:266px; background:#46A3FF; color:white;" value="注册" >
	    </div>
		</form>
	</div>  
  </body>
</html>