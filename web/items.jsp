<%-- 
    Document   : items
    Created on : Oct 24, 2019, 3:29:53 AM
    Author     : os_hoangpn
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="entities.Item"%>
<%@page import="java.util.List"%>
<%@page import="repositories.ItemDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MIO Store | Items</title>
        <link rel="stylesheet" href="css/items.css">
        <style>
            /*            div{
                            width: 20%;
                            text-align: right;
                        }*/
            html, body {
                height: 100%;
                margin: 0px;
            } 
        </style>
    </head>
    <body style="background-color: azure; height: 200px"">
        <div id="header" style="background-color: #e8e8e8; box-sizing: border-box; height: 150px">
            <div style="float: left; margin-left: 20px">
                <a href="/MIOStore/index.jsp"><img src="resources/logo.png" ></a>
            </div>
            <div style="float: left; margin-left: 100px; margin-top: 50px; background-color: white; border: 3px solid coral;">
                <form action="items.jsp" method="GET">
                    <input type="text" name="item_name" placeholder="Search everything you need..." style="width: 600px; height: 40px; float: left; border: none">
                    <input type="image" style="width: 50px; height: 40px; float: left" src="resources/searchbtn.png">
                </form>
            </div>
            <% if (session.getAttribute("customerID") == null) { %>
            <div style="float: left; margin-left: 100px; margin-top: 50px;">
                <a href="login.jsp" style="font-size: 24px; text-decoration: none; font-weight: bold; color: darkcyan">Login</a>
                <br>
                No account? <a href="register.jsp" style="color: red">Register Now!</a>    
            </div>
            <% } else {%>
            <div style="float: left; margin-left: 100px; margin-top: 50px;">
                Hello <%= session.getAttribute("name")%>
                <a href="/MIOStore/logout.jsp">Logout</a>
                <br>
                <% String mainPage = "store.jsp?customerID=" + session.getAttribute("customerID") + "&name=" + session.getAttribute("name");%>
                <a href="<%= mainPage%>">Go to main page</a>
            </div>
            <% }%>
        </div> 
        <h1>Our products based on customer choices. Updated hourly.</h1>
        <div id="items">
            <div  style="width: 100%; height: 100%; float: left; border: 1px solid white; text-align: center; font-size: 19px; text-decoration: underline; float: left">
                <div style="width: 8%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=books" style="color: black">Books</a></div>
                <div style="width: 12%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=electronics" style="color: black">Electronics</a></div>
                <div style="width: 12%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=clothes" style="color: black">Fashion</a></div>
                <div style="width: 12%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=phones" style="color: black">Mobile</a></div>
                <div style="width: 12%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=pclaptop" style="color: black">PC & Laptop</a></div>
                <div style="width: 12%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=sporting" style="color: black">Sporting</a></div>
                <div style="width: 12%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=homegarden" style="color: black">Home&Garden</a></div>
                <div style="width: 18%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace; float: left"><a href="items.jsp?category=business" style="color: black">Business</a></div>
            </div>
            <%
                String category = request.getParameter("category");
                String itemName = request.getParameter("item_name");

                ItemDAOImpl itemDAOImpl = new ItemDAOImpl();

                List<Item> items = new ArrayList<>();
                if (category == null || category.equals("")) {
                    if (itemName == null || itemName.equals("")) {
                        items = itemDAOImpl.findAll();
                    } else {
                        items = itemDAOImpl.getItemByName(itemName);
                    }
                }
                else{
                    items = itemDAOImpl.getItemByCategory(category);
                }
                Locale localeVN = new Locale("vi", "VN");
                NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
                for (int i = 0; i < items.size(); i++) {
                    int stt = i + 1;
                    Item item = items.get(i);
            %> 
            <div class="item">
                <div class="itemImg">
                    <img src="<%= "img?ImgUrl=" + item.getUrl()%>" alt="" width="200px" height="100%">
                </div>
                <div class="itemInfo">                
                    <div style="width: 5%; height: 100%; float: left">&nbsp;</div>
                    <div style="width: 90%; height: 100%; float: left">
                        <p class="itemName" style="font-weight: bold;  height: 36px"><%= item.getName()%></p>
                        <p class="itemAuthor"><%= item.getDescription()%></p>
                        <form action="cart" method="POST" >
                            <label class="itemPrice" style="text-decoration: underline"><%= currencyVN.format(item.getSalePrice())%> </label>
                            <input name="ItemID" hidden="true" value="<%= item.getId()%>">
                            <input name="CustomerID" hidden="true" value="<%= session.getAttribute("customerID")%>">
                            <input type="submit" value="Add to Cart" style="float: right;">
                        </form>  
                    </div>
                    <div style="width: 50%; height: 100%; float: left">&nbsp;</div>
                </div>
            </div>
            <%}
            %>
        </div>
        <div style="clear: both">
            <br>
        </div>
    </body>
</html>
