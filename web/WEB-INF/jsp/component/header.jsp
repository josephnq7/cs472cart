<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Books Store</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="<c:url value="resources/css/bootstrap.min.css" />">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <link href="<c:url value="resources/css/style.css" />" rel="stylesheet">

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom fixed-top shadow-sm p-3 mb-5">
    <div class="container">
        <a class="navbar-brand" href="#">Books Store</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <c:if test="${email == null}">
                    <li class="nav-item active">
                        <a class="nav-link" href="login">Login</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Register</a>
                    </li>
                </c:if>
                <c:if test="${email != null}">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Profile</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="logout">Logout</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">

    <div class="row">

        <div class="col-lg-3">

            <h1 class="my-4">Books Store</h1>
            <div class="list-group">
                <a href="/cart" class="list-group-item d-flex justify-content-between align-items-center">
                    Home
                </a>
                <a href="#" class="list-group-item d-flex justify-content-between align-items-center">
                    Category1
                </a>
                <a href="#" class="list-group-item d-flex justify-content-between align-items-center">
                    Category2
                </a>
                <a href="shopping-cart" class="list-group-item d-flex justify-content-between align-items-center">
                    View Cart
                    <span>
                        <i class="fa fa-shopping-cart"></i>
                        <span id="num-of-items" class="badge badge-primary badge-pill">${numItems}</span>
                    </span>
                </a>
            </div>

        </div>
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

            <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid" src="<c:url value="resources/images/banner1.jpg" />" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="<c:url value="resources/images/banner2.jpg" />" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="<c:url value="resources/images/banner3.jpg" />" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
