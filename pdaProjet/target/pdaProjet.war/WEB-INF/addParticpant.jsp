
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="includes/header.jsp" %>
<div class="text-center mx-5">
    <div class="input-group mb-3 w-25 p-3 form-group">

        <form action="save.com" method="POST">
            <label class="control-label">
                titre :
            </label>
            <input type="text" name="titre" class="form-control">

            <p></p>
            <label class="control-label">
                domain :
            </label>
            <input type="text" name="domain" class="form-control">
            <p></p>
            <label class="control-label">
                structure  :
            </label>
            <input type="text" name="structure" class="form-control">
            <label class="control-label">
                date de fin  :
            </label>
            <input type="date" name="date_fin" class="form-control">
            <label class="control-label">
                satus :
            </label>
            <select name="participant">
                <option>Select Activite</option>
                <c:forEach items="${activite}" var="p">
                   <!-- <option>Activite </option>-->
                </c:forEach>
            </select>
            </br>
            </br></br>
            <button type="submit" class="btn btn-primary">insert data</button>

        </form>

    </div>
</div>
</body>
</html>