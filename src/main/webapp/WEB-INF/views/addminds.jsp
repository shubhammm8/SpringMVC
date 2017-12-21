
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Ranga Reddy">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employee Information</title>
    <!-- Bootstrap CSS -->
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 40px;
            	background-color:#f9f9f9;
        }
    </style>
</head>
<body class=".container-fluid">
    <div class="container myrow-container">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">
                   Give Details
                </h3>
            </div>
            <div class="panel-body">
                <form:form id="employeeRegisterForm" cssClass="form-horizontal" modelAttribute="a" method="post" action="save">
    
                    <div class="form-group">
                        
    
                   <div class="form-group">
                        <form:label path="leadid" cssClass="control-label col-xs-3">Lead id</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="leadid" value="${aObject.leadid}"/>
                        </div>
                    </div>
                      <div class="form-group">
                        <form:label path="leadname" cssClass="control-label col-xs-3">Lead Name</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="leadname" value="${aObject.leadname}"/>
                        </div>
                    </div>
                      <div class="form-group">
                        <form:label path="trackid" cssClass="control-label col-xs-3">Track id</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="trackid" value="${aObject.trackid}"/>
                        </div>
                    </div>
                      <div class="form-group">
                        <form:label path="trackname" cssClass="control-label col-xs-3">Track name</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="trackname" value="${aObject.trackname}"/>
                        </div>
                    </div>
                      <div class="form-group">
                        <form:label path="mindid" cssClass="control-label col-xs-3">Mind id</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="mindid" value="${aObject.mindid}"/>
                        </div>
                    </div>
                      <div class="form-group">
                        <form:label path="mindname" cssClass="control-label col-xs-3">Mind name</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="mindname" value="${aObject.mindname}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="row">
                            <div class="col-xs-4">
                            </div>
                            <div class="col-xs-4">
                                <input type="submit" id="save" class="btn btn-primary" value="Save"/>
                            </div>
                            <div class="col-xs-4">
                            </div>
                        </div>
                    </div>
    
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
   
</body>
</html>