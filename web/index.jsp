<%-- 
    Document   : index
    Created on : Jul 9, 2023, 8:30:39 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Shop Homepage - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="#!">Giúp việc Đà Nẵng </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <c:if test="${sessionScope.acc != null}"><li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">Hello ${sessionScope.acc.user}</a></li></c:if> 
                       <c:if test="${sessionScope.acc.admin == 1}"> <li class="nav-item"><a class="nav-link" href="#!">Admin</a></li></c:if>
                        <c:if test="${sessionScope.acc.seller == 1}"><li class="nav-item"><a class="nav-link" href="manage">Manager</a></li></c:if>
                        <c:if test="${sessionScope.acc != null}"> <li class="nav-item"><a class="nav-link" href="loguot">Logout</a></li></c:if>
                        <c:if test="${sessionScope.acc == null}"> <li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li></c:if>
                    </ul>
                    <form method="post" class="example" action="search" style="margin:auto;max-width:300px">
                        <input type="text" placeholder="Search.." name="txt" style="border-radius:14px">
                        <button type="submit" style="border-radius:14px"><i class="fa fa-search" style="border-radius:14px"></i>Search</button>
                    </form>
                    <form class="d-flex">
                        <button class="btn btn-outline-dark" type="submit">
                            <i class="bi-cart-fill me-1"></i>
                            Favorite
                            <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                        </button>
                    </form>
                </div>
            </div>
        </nav>
        <!-- Header-->
        <header class="bg-dark py-5">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-4 fw-bolder">Giúp việc tại nhà</h1>
                    <p class="lead fw-normal text-white-50 mb-0">Chuyên nghiệp - Uy tín - Hàng đầu Việt Nam</p>
                </div>
            </div>
        </header>
        <!-- Section-->
        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row">
                    <div class="col-md-3">
                        <h3>DỊCH VỤ</h3>
                        <ul class="list-group">
                            <c:forEach items="${list}" var="c">
                                <span style="text-decoration: none;color: inherit;">   <li class="list-group-item" ><a href="filterCategory?categoryId=${c.id}">${c.name}</a></li></span>
                                </c:forEach>
                        </ul></div>
                    <div class="col-md-9"> <h3>NGƯỜI GIÚP VIỆC</h3><div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3  justify-content-center">
                            <c:forEach items="${plist}" var="p">
                                <div class="col mb-5">
                                    
                                    <div class="card h-100">
                                        <!-- Sale badge-->
                                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">FPT</div>
                                        <!-- Product image-->
                                        <img class="card-img-top" src="${p.image}" alt="..." />
                                        <!-- Product details-->
                                        <div class="card-body p-4">
                                            <div class="text-center">
                                                <!-- Product name-->
                                                <h5 class="fw-bolder" ><a href="detailSeve?pid=${p.id}">${p.name}</a></h5>
                                                <!-- Product reviews-->
                                                <div class="d-flex justify-content-center small text-warning mb-2">
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                </div>
                                                <!-- Product price-->
                                                <span class="">Khu vực:</span>
                                                ${p.areaWork}
                                            </div>
                                        </div>
                                        <!-- Product actions-->
                                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="detailSeve?pid=${p.id}">Chi tiết</a></div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <nav aria-label="Page navigation example" class="d-flex justify-content-center">
                                <ul class="pagination">
                                    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                                    <li class="page-item"><a class="page-link" href="ListAll?page=1">1</a></li>
                                    <li class="page-item"><a class="page-link" href="ListAll?page=2">2</a></li>
                                    <li class="page-item"><a class="page-link" href="ListAll?page=3">3</a></li>
                                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div></div>

            </div>

        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>

