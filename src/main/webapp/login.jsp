<%--
  Created by IntelliJ IDEA.
  User: xl
  Date: 2017/6/23
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    request.setAttribute("basePath", basePath);

%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hrms-login</title>
    <%-- ${pageContext.request.contextPath} --%>
    <script type="text/javascript" src="${basePath}jquery-easyui-1.3.3/jquery.min.js"></script>
    <style type=text/css>
        body {
            text-align: center;
            padding-bottom: 0px;
            background-color: #ddeef2;
            margin: 0px;
            padding-left: 0px;
            padding-right: 0px;
            padding-top: 0px
        }

        A:link {
            COLOR: #000000;
            text-decoration: none
        }

        A:visited {
            COLOR: #000000;
            text-decoration: none
        }

        A:hover {
            COLOR: #ff0000;
            text-decoration: underline
        }

        A:active {
            text-decoration: none
        }

        .input {
            border-bottom: #ccc 1px solid;
            border-left: #ccc 1px solid;
            line-height: 20px;
            width: 182px;
            height: 20px;
            border-top: #ccc 1px solid;
            border-right: #ccc 1px solid
        }

        .input1 {
            border-bottom: #ccc 1px solid;
            border-left: #ccc 1px solid;
            line-height: 20px;
            width: 120px;
            height: 20px;
            border-top: #ccc 1px solid;
            border-right: #ccc 1px solid;
        }
    </style>
    <script type="text/javascript">
        <%--登录--%>
        function login() {
            var username = $("username").val();
            var password = $("password").val();
            if(username == null|| username==""){
                alert("username can't be empty");
                return;
            }
            if(password ==null || password ==""){
                alert("password can't be empty");
                return;
            }
            $("#adminlogin").submit();
        }
        /* 用户名或密码错误时显示 */
        if ('${errorMsg}' != '') {
            alert('${errorMsg}');
        }
        /* 拦截器显示信息 */
        if ('${message}' != '') {
            alert('${message}');
        }

    </script>
</head>
<body>
<form id="adminlogin" method="post" name="adminlogin" action="${basePath}admin/login">
    <div></div>
    <table style="margin: auto; width: 100%; height: 100%" border=0
           cellSpacing=0 cellPadding=0>
        <tbody>
        <tr>
            <td height=150>&nbsp;</td>
        </tr>

        <tr style="height: 254px">
            <td>
                <div style="margin: 0px auto; width: 868px">
                    <img style="display: block"
                         src="${basePath}images/body_03.jpg">
                </div>
                <div style="background-color: #278296">
                    <div style="margin: 0px auto; width: 936px">
                        <div
                                style="BACKGROUND: url(${basePath}images/body_05.jpg) no-repeat; height: 155px">
                            <div
                                    style="text-align: left; width: 265px; float: right; height: 125px; _height: 95px">
                                <table border=0 cellSpacing=0 cellPadding=0 width="100%">
                                    <tbody>
                                    <tr>
                                        <td style="height: 45px">
                                            <input type="text" class=input value="${admin.username}" name="username" id="username"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="password" class=input value="${admin.password}" name="password" id="password" />
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div style="height: 1px; clear: both"></div>
                            <div style="width: 380px; float: right; clear: both">
                                <table border=0 cellSpacing=0 cellPadding=0 width=300>
                                    <tbody>
                                    <tr>
                                        <td width=100 align=right>
                                            <input style="border-right-width: 0px; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px"
                                                    id=btnLogin
                                                    src="${basePath}images/btn1.jpg"
                                                    type=image name=btnLogin onclick="javascript:login();">
                                        </td>

                                        <td width=100 align=middle>
                                            <input
                                                    style="border-right-width: 0px; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px"
                                                    id=btnReset
                                                    src="${basePath}images/btn2.jpg"
                                                    type=image name=btnReset
                                                    onclick="javascript:adminlogin.reset();">
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                </div>
                <div style="margin: 0px auto; width: 936px">
                    <img src="${basePath}images/body_06.jpg">
                </div>


            </td>
        </tr>
        <tr style="height: 30%">
            <td>&nbsp;</td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
