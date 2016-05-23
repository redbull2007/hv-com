<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Home</title>
   </head>
   <body>
      <div align="center">
         <h1>List records</h1>
         <table border="1">
            <tr>
               <th>No</th>
               <th>Name</th>
            </tr>
            <c:forEach var="employee" items="${list}" varStatus="status">
               <tr>
                  <td>${status.index + 1}</td>
                  <td>${employee.name}</td>
               </tr>
            </c:forEach>
         </table>
         <%--For displaying Previous link except for the 1st page --%>
         <c:if test="${currentPage != 1}">
            <td><a href="showlist?page=${currentPage - 1}">Previous</a></td>
         </c:if>
         <%--For displaying Page numbers. 
            The when condition does not display a link for the current page--%>
<!--          <table border="1" cellpadding="5" cellspacing="5"> -->
<!--             <tr> -->
<%--                <c:forEach begin="1" end="${noOfPages}" var="i"> --%>
<%--                   <c:choose> --%>
<%--                      <c:when test="${currentPage eq i}"> --%>
<%--                         <td>${i}</td> --%>
<%--                      </c:when> --%>
<%--                      <c:otherwise> --%>
<%--                         <td><a href="showlist?page=${i}">${i}</a></td> --%>
<%--                      </c:otherwise> --%>
<%--                   </c:choose> --%>
<%--                </c:forEach> --%>
<!--             </tr> -->
<!--          </table> -->
<%--          For displaying Next link --%>
<%--          <c:if test="${currentPage lt noOfPages}"> --%>
<%--             <td><a href="showlist?page=${currentPage + 1}">Next</a></td> --%>
<%--          </c:if> --%>
      </div>
   </body>
</html>
