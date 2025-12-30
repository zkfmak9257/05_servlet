<%--
  Created by IntelliJ IDEA.
  User: gangseonghun
  Date: 25. 12. 18.
  Time: 오후 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test EL1</title>
</head>
<body>
<h1>전달 된 request 객체에 저장된 속성 값 출력하기 </h1>

<h3>Expression Tag 방식</h3>
<pre>
    <%= request.getAttribute("name")%>
    <%= request.getAttribute("age")%>
    <%= request.getAttribute("phone")%>
    <%= request.getAttribute("items")%>
</pre>

<hr>
<h3>Expression Tag 방식</h3>
<pre>
    ${requestScope.name}
    ${requestScope.age}
    ${requestScope.phone}
    ${requestScope.items}

    --------------------------

    EL 구문은 page -> request -> session -> application 순서로 탐색한다!!

    ${name}
    ${age}
    ${phone}
    ${items}

    items[0] : ${items.get(0)}
    items[1] : ${items[1]}
    items[1] : ${items[2]}






</pre>





</body>
</html>
