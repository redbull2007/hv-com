<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HELLO WORLD</title>

<!--     <link href="private/lib/css/bootstrap.min.css" rel="stylesheet" /> -->

    <script src="private/lib/js/jquery.min.js"></script>
    <script type="text/javascript"
	src="<%=request.getContextPath()%>/private/lib/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/private/lib/js/bootstrap.min.js"></script>
    
    <link href="<%=request.getContextPath()%>/private/lib/jquery-ui/jquery-ui.min.css" rel="stylesheet" />
    <script src="<%=request.getContextPath()%>/private/lib/jquery-ui/jquery-ui.min.js"></script>
</head>
<body>
<div class="container">
        <header class="nn-header row">
            <h1 class="nn-company">Java Technology Suite</h1>
            <h5 class="nn-slogan"></h5>
        </header>

        <nav class="navbar navbar-default">
		  	<div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#">Brand</a>
			    </div>
			
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
			        <li><a href="#">Link</a></li>
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="#">Action</a></li>
			            <li><a href="#">Another action</a></li>
			            <li><a href="#">Something else here</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="#">Separated link</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="#">One more separated link</a></li>
			          </ul>
			        </li>
			      </ul>
			      <form class="navbar-form navbar-left" role="search">
			        <div class="form-group">
			          <input type="text" class="form-control" placeholder="Search">
			        </div>
			        <button type="submit" class="btn btn-default">Submit</button>
			      </form>
			      <ul class="nav navbar-nav navbar-right">
			        <li><a href="#">Link</a></li>
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="#">Action</a></li>
			            <li><a href="#">Another action</a></li>
			            <li><a href="#">Something else here</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="#">Separated link</a></li>
			          </ul>
			        </li>
			      </ul>
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>

        <div class="nn-sheet row">

            <article class="col-md-9">
                <div class="nn-body">
                	<tiles:insertAttribute name="body">Nội dung trang web</tiles:insertAttribute>
                </div>
            </article>

            <aside class="col-md-3">
<!-- 		        <br/> -->
<!--                 Cart Info -->
<!--                 <tiles:insertAttribute name="cart-info"/> -->
<!--                 /Cart Info -->

<!--                 Chủng loại -->
<!--                 <tiles:insertAttribute name="category"/> -->
<!--                 /Chủng loại -->

<!--                 Nhà cung cấp -->
<!--                 <tiles:insertAttribute name="supplier"/> -->
<!--                 /Nhà cung cấp -->

<!--                 Hàng đặc biệt -->
<!--                 <tiles:insertAttribute name="special"/> -->
<!--                 /Hàng đặc biệt -->
            </aside>
        </div>
        <footer class="row" style="text-align:center">
            <p>&copy; 05-2016 - JAVA STUDY</p>
        </footer>
    </div>
</body>
</html>