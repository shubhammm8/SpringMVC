
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
    <title>Minds Information</title>
    <!-- Bootstrap CSS -->
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 40px;
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
                <form:form id="employeeRegisterForm" cssClass="form-horizontal" modelAttribute="a" method="post" action="updateinit">
    
                    <div class="form-group">
                        
    
                   <div class="form-group">
                        <form:label path="mindid" cssClass="control-label col-xs-3">Mind id to be Updated</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="mindid" value="${aObject.mindid}"/>
                        </div>
                    </div>
                     <div class="form-group">
                        <form:label path="mindname" cssClass="control-label col-xs-3">Mind name to be updated</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="mindname" value="${aObject.mindname}"/>
                        </div>
                    </div>
    
    
                    <div class="form-group">
                        <div class="row">
                            <div class="col-xs-4">
                            </div>
                            <div class="col-xs-4">
                                <input type="submit" id="updateinit" class="btn btn-primary" value="Save"/>
                            </div>
                            <div class="col-xs-4">
                            </div>
                        </div>
                    </div>
    </div>
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
        function submitEmployeeForm() {             
            
            // getting the employee form values
            var name = $('#name').val().trim();
            var age = $('#age').val();
            var salary = $('#salary').val();
            if(name.length ==0) {
                alert('Please enter name');
                $('#name').focus();
                return false;
            }
    
            if(age <= 0) {
                alert('Please enter proper age');
                $('#age').focus();
                return false;
            }
    
            if(salary <= 0) {
                alert('Please enter proper salary');
                $('#salary').focus();
                return false;
            }
            return true;
        };  
    </script>
</body>
</html>