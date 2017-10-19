<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Max Ivanov">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Question</title>
    <!-- Bootstrap CSS -->
     <%--<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 20px;
        }
        .panel-title{
            color: #d1cbbc;
        }
        a.aEdit:link{
            margin-left: 100px;
            color: #786455;
        }

        a.aEdit:visited{
            color: #786455;
        }

        a.aEdit:hover{
            color: #60a870;
        }

        a.aEdit:active{
            color: #ded728;
        }

    </style>
</head>
<body class=".container-fluid" style="background-color:whitesmoke">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading" style="background-color:#786455">
            <h3 class="panel-title" style="color: #d1cbbc">
                Book Details
            </h3>
        </div>
        <div class="panel-body">
            <form:form id="EditQuestionForm" cssClass="form-horizontal" modelAttribute="book" method="post" action="save">
                <div class="form-group">
                    <a class="aEdit" href="edit?id=<c:out value='${book.id}'/>">Edit Book</a>
                </div>

                <div class="form-group">
                    <a class="aEdit" href="/editRead?id=<c:out value='${book.id}'/>">Edit field "isAlreadyRead"</a>
                </div>

            </form:form>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
