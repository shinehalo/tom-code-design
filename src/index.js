<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0">

    <link rel="stylesheet" type="text/css" href="//at.alicdn.com/t/font_2957388_ck90fk3cqqj.css">
<title><%=process.env.title%></title>

    <style>
    /* 去掉 user agent stylesheet 白边 */
    * {
        margin: 0;
padding: 0;
box-sizing: border-box;
}

html,
    body {
    padding: 0;
    margin: 0;
    height: 100%;
    box-sizing: border-box;
    color: #222;
    background-color: #EFEFEF;
}

/* color 全局属性 */

@media screen and (max-width: 960px) {}

@media screen and (min-width: 960px) {

    html,
.mint-tabbar {
        width: 400px;
        margin: 0 auto;
    }
}

.weui_msg_title {
    text-align: center;
}

</style>
</head>

<body>
<div id="app"></div>
    <!-- built files will be auto injected -->
    <script type=text/javascript> window.alert=function(name){ var iframe=document.createElement("IFRAME");
    iframe.style.display="none" ; iframe.setAttribute("src", 'data:text/plain,' );
    document.documentElement.appendChild(iframe); window.frames[0].window.alert(name);
    iframe.parentNode.removeChild(iframe); }; window.confirm=function (message) { var
    iframe=document.createElement("IFRAME"); iframe.style.display="none" ; iframe.setAttribute("src", 'data:text/plain,'
); document.documentElement.appendChild(iframe); var alertFrame=window.frames[0]; var
    result=alertFrame.window.confirm(message); iframe.parentNode.removeChild(iframe); return result; }; </script>
</body> </html>
