<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>
<h1 style="position: absolute;right: 200px;top:100px">登陆页面</h1>
<div style="background-color: antiquewhite;border-bottom-left-radius: 25px">

</div>
<div class="form-group" style="position: absolute;right: 200px;top: 170px;">
    <form role="form" action="loginConfirm">

        <label for="name">账号登陆</label><br>
        账号：<input type="text" class="form-control" id="name" name="name" placeholder="请输入用户名/邮箱/手机号"><br>
       密码：<input type="password" class="form-control" id="name" name="password" placeholder="输入密码"><br>

    &nbsp <button  onclick="{location.href='/loginConfirm'}" type="submit" class="btn btn-default">登陆</button>

    &nbsp<button onclick="{location.href='/register'}" type="button" class="btn btn-default">注册</button>

    </form>
</div>

 </div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
