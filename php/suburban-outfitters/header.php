<html>
    <head>
        <title>Suburban Outfitters</title>
    
    </head>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="styles.css" > 
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
	<nav class="navbar navbar-light bg-light">
		<div class="header">
			<div class="row">
			<!-- Logo and name -->
				<div class="col-md-9 col-sm-9 col-xs-12">
					<a href="index.php"><img src="images/logo.jpg" width='100' height='100' alt="Suburban Outfitters"></img></a>
					<span><a href="index.php" class="navbar-brand mx-sm-auto mr-auoto text-uppercase">Suburban <br>Outfitters</a></span>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-12">
					<!-- Search -->
					<form class="form-inline" action="submit.php" method="GET" >
						<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" input="search" name="search">
						<!-- <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> -->
					</form>
				</div>
			</div>

			<!-- the actual product menu navbar -->
		<div class="navbar-center" id="categories">
			<div class="row">
				<div class ="col-md-3 col-sm-3">
				</div>
				<div class ="col-md-6 col-sm-6">
					<ul class="nav navbar-nav navbar-center center">
						<li id="men"><a href="products.php?category=men">MEN</a></li>
						<li id="women"><a href="products.php?category=women">WOMEN</a></li>
						<li id="kids"><a href="products.php?category=kids">KIDS</a></li>
						<li id="accessories"><a href="products.php?category=accessories">ACCESORIES</a></li>
						<li id="shoes"><a href="products.php?category=shoes">SHOES</a></li>
						<li id="all"><a href="products.php">ALL</a></li>

					</ul>
				</div>
				<div class="col-md-3 col-sm-3 right-side">
					<ul class="nav navbar-nav">
						<li> <a href="login.php">My Account/Login</a></li>
				</div>
			</div>

		</div>
		</div>
	</nav>

