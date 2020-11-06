<!DOCTYPE html>

<html>
    <head>
        <title>Suburban Outfitters</title>
    
    </head>

    <body>
	<?php include_once 'header.php'; ?>

	<!-- Login form -->
	<hr>
		<!-- POST to the same URI can work, but might need a different endpoint to hit for simplicity, we'll figure it out -->
			
		<!--Currently blocked out to demo functionality --
			<form action="login.php" method="post">
				<input type="text" name="username" placeholder="username"><br>
				<input type="password" name="password" placeholder="password"><br><br>
				<input type="submit" value="Submit">
			</form>    
		-->
		<form action="order_history.php" method="GET">
			<input type="text" name="username" placeholder="username"><br>
			<input type="password" name="password" placeholder="password"><br><br>
			<input type="submit" value="Submit">
		</form>
    
    </body>

</html>