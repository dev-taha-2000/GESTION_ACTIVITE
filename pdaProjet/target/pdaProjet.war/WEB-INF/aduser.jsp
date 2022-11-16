<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 16/11/2022
  Time: 00:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="java.util.ArrayList"
         import="com.pdaProjet.Entitys.Role" %>
<html>
<head>
    <title>add user</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>


              <div class="w-50 m-auto mt-5 rounded shadow p-3 mb-5 bg-body rounded">
                   <h1 class="text-center">Add User</h1>
                  <form action="SaveUser" method="post">
                       <div>
                           <label>name</label>
                           <input type="test" name="name" class="form-control" placeholder="firstname" />
                       </div>


                      <div  class="mt-2">
                          <label>phoneNumber</label>
                          <input type="test" name="phoneNumber" class="form-control" placeholder="phoneNumber" />
                      </div>

                      <div  class="mt-2">
                          <label>email</label>
                          <input type="email" name="email" class="form-control" placeholder="email" />
                      </div>

                      <div  class="mt-2">
                          <label>password</label>
                          <input type="password" name="password" class="form-control" placeholder="password" />
                      </div>


                      <div  class="mt-2">
                          <label>Role</label>
                          <select class="form-control" name="role">
                              <option value="1" selected>Choose Role</option>
                              <%
                                  ArrayList<Role> roleList = (ArrayList<Role>) request.getAttribute("roles");
                                  for(Role roles : roleList) {%>
                              <option value="<%=roles.getId_role()%>">
                                  <%=roles.getName()%>
                              </option>
                              <%}%>
                          </select>
                      </div>


                      <div class="mt-3 text-center">
                           <button type="submit" class="btn btn-primary w-50 m-auto">submit</button>
                      </div>


                  </form>
              </div>
</body>
</html>
