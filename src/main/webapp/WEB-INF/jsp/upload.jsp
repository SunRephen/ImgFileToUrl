<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>uploadPage</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>请选择要上传的文件：</td>
            <td><input type="file" name="files" multiple></td>
        </tr>
        <tr>
            <td align="right"><input type="reset" value="重填"></td>
            <td><input type="submit" value="上传"></td>
        </tr>
    </table>
</form>

</body>
</html>
