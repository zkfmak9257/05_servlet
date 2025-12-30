<%--
  Created by IntelliJ IDEA.
  User: gangseonghun
  Date: 25. 12. 18.
  Time: 오후 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>전달된 request 객체에 저장된 Member 객체 출력하기 </h1>

<pre>
    member : ${requestScope.member}

    이름 : ${requestScope.member.getName()}
    나이 : ${requestScope.member.age}
    전화번호 : ${member.phone}
    이메일 : ${member.email}

</pre>

</body>
</html>
