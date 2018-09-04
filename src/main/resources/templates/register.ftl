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
<h1 style="position: absolute;right: 200px;top:100px">注册页面</h1>


<!--form表单通过里面的name与controller中的request相连接-->
<!--Spring中可以不用request直接传递形参，有两种匹配的方式-->
<div class="form-group" style="position:absolute;right: 200px;top: 170px;" >
<form role="form" action="/request">

       <label for="register">账号注册</label>

      <!--  <label for="name">姓名</label>-->
    <tr>
        <td>姓名</td>
        <td><input type="text" class="form-control" id="name" name="name" placeholder="姓名" /></td>

    </tr>
    <tr>
        <td>邮箱</td>
        <td>
            <input type="text" class="form-control" id="mail"  name="mail" placeholder="邮箱" />
        </td>


    </tr>
    <tr>
        <td>手机</td>
        <td>
            <input type="text" class="form-control" id="phone"  name="phone" placeholder="手机号"\>
        </td>
    </tr>

    <tr>
        <td>密码</td>
        <td>
            <input type="password" class="form-control" id="password"  name="password" placeholder="密码" th:field="*{password}"\>
        </td>

    </tr>
    <tr>
        <td>确认密码</td>
        <td><input type="password" class="form-control" id="confirm" name="confirm" placeholder="确认密码"\></td>
    </tr>
    <tr>
        <button type="submit" class="btn btn-default" style="position: absolute;right: 70px">注册</button>
    </tr>


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
