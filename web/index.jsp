<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="WEB-INF/jsp/component/header.jsp"></jsp:include>


      <div class="row">

        <c:forEach items="${products}" var="product">
          <c:url value="shopping-cart" var="linkAddToCart">
            <c:param name="productId" value="${product.id}"/>
          </c:url>
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="<c:url value="resources/images/${product.image}" />" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">${product.name}</a>
                </h4>
                <h5>$24.99</h5>
                <p class="card-text">${product.shortDescription}</p>
              </div>
              <div class="card-footer text-center">
                <a href="${linkAddToCart}" class="btn btn-primary btn-lg active addToCart" role="button" aria-pressed="true">Add to cart</a>
              </div>
            </div>
          </div>
        </c:forEach>

      </div>

<jsp:include page="WEB-INF/jsp/component/footer.jsp"></jsp:include>