<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<html>
<head>
	<title>MiniNetDisk</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div id="basic" style="background-color:#548B54;width:1000px;height:1100px;">
	<!-- 顶部logo，登录级个人信息 -->
	<div id="top" style="background:#EFF4F8;height:100px;">
		<table id="header" width="100%" height="100px">
			<tr >
				<td>
					<p style="color:#46A3FF; font-size:46px; margin-left:46px; margin-bottom:1px;">Mini云盘</p>
					<p style="color:#708090; font-size:16px; margin-left:88%">欢迎，jack，<a>点我注销</a></p>
				</td>
			</tr>
		</table>
	</div>
	<!-- 中心区域 -->
	<div id="middle" style="background-color:#654654;width:100%;height:670px;">
		<!-- 左侧菜单 -->
		<div id="middle_left" style="background-color:#EFF4F8;width:20%;height:100%;float:left">
			<ul class="nav nav-pills nav-stacked" style="max-width:360px;">
				<li class="active">
					<a href="#">
						<span class="badge pull-right">42</span>
						全部文件
					</a>
				</li>
				<li><a href="#">视频</a></li>
				<li>
					<a href="#">
						<span class="badge pull-right">3</span>
						音乐
					</a>
				</li>
				<li><a href="#">图片</a></li>
				<li><a href="#">文档</a></li>
				<li><a href="#">电子书</a></li>
				<li><a href="#">其他</a></li>
			</ul>
			<div>
				<table width="96%" height="30%">
					<tr>
						<td align="center">
							&nbsp;&nbsp;&nbsp;&nbsp;<font style="margin-bottom:10px" color="#337AB7">容量:1000G/1000T</font>
							<div class="progress">
								<div class="progress-bar progress-bar-info" role="progressbar"
									 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
									 style="width: 60%;">
									<span class="sr-only">30% 完成（信息）</span>
								</div>
							</div>
						</td>
					</tr>

				</table>
			</div>
		</div>
		<!-- 右侧搜索+文件展示-->
		<div id="middle_right" style="background-color:#FFFFFF;width:80%;height:100%;float:left">
			<!-- 搜索栏+查看好友网盘-->

			<div style="background-color:#FFFFFF;width:40%;height:10%;float:left;margin-top:10px">
				&nbsp; &nbsp; &nbsp;<button type="button" class="btn btn-primary btn-lg ">上传文件</button>
				&nbsp; &nbsp; &nbsp;<button type="button" class="btn btn-primary btn-lg ">新建文件夹</button>
			</div>

			<div style="background-color:#FFFFFF;width:60%;height:10%;float:right">
				<div style="background-color:#FFFFFF;width:45%;height:10%;float:left;margin-top:13px">
					<form >
						<div class="input-group">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default 
								dropdown-toggle" data-toggle="dropdown">好友列表
									<span class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li>
										<a href="#">好友A</a>
									</li>
									<li>
										<a href="#">好友B</a>
									</li>
									<li>
										<a href="#">tom</a>
									</li>

									<li>
										<a href="#">jack</a>
									</li>
								</ul>
							</div><!-- /btn-group -->
							<input type="text" class="form-control"><span class="input-group-btn">
                        <button class="btn btn-default" type="button">Go!</button>
                    </span>
						</div><!-- /input-group -->

					</form>

				</div>
				<div style="margin-top:1%;float:right">
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">提交</button>
					</form>
				</div>

			</div>
			<!--文件展示 -->
			<div>
				<table  class="table table-hover">
					<thead>
					<tr>
						<th width="100px" style="padding-left:20px">选择</th>
						<th width="50%">文件名</th>
						<th>大小</th>
						<th>修改日期</th>
					</tr>
					</thead>
					<tbody>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding-left:30px"><input type="checkbox" name="id[]" value="1" /></td>
						<td>
							<img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" width="40" height="30"><span>java大数据</span>
						</td>
						<td>Anna</td>
						<td>2011-11-1</td>
					</tr>
					<tr>
						<td style="padding:30px 0px 30px 30px;"><input type="checkbox" id="checkall"/>全选 </td>
						<td style="padding-left:20px;padding-top:20px;">
							<button type="button" class="btn btn-primary btn-lg " style="font-size: 14px">
								<span class="glyphicon glyphicon-cloud-download"> 下载 </span>
							</button>
							<button type="button" class="btn btn-primary btn-lg " style="font-size: 14px">
								<span class="glyphicon glyphicon-remove"> 删除 </span>
							</button>
						</td>
						<td colspan="4">
							<div style="margin:0 auto;">
								<ul class="pagination" style="text-align:center;float:right;padding-right:100px;">
									<li><a href="#">&laquo;</a></li>
									<li class="active"><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">5</a></li>
									<li><a href="#">&raquo;</a></li>
								</ul>
							</div>
						</td>
					</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
    //全选
    $("#checkall").click(function(){
        $("input[name='id[]']").each(function(){
            if (this.checked) {
                this.checked = false;
            }
            else {
                this.checked = true;
            }
        });
    })
</script>
</body>
</html>