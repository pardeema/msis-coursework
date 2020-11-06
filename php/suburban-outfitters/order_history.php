	<body>
	<?php include_once 'header.php'; 
			include_once 'fake_data.php';
	?>
	
	Welcome, User! 
	<br>
	<b>Order History:</b>
	<ul>
		<?php
		for($i=1; $i<=5; $i++){
				$product = $products['men']['Shirts'][$i - 1];
				$order=1234+$i;
				$shipping=8675309 - $i;
				echo "<li class='border'><b>Order ".$i ."</b><br>";
				echo "Product: <a href='product.php?id=$product[1]'>$product[0]</a>";
				echo "<span class='margin'>    Order Number:". $order."</span><br>";
				echo "<b>Track Shipping:</b>   <a href=shipping.php?id=$shipping&order_id=$order>$shipping</a><br>";
				echo "<a href='return.php?order_id=$order'>Return</a><br>";
		}
		?>
	</ul>
	</body>
<style>
	.margin{
		margin: 20px;
	}
	.border{
		border: 1px solid black;
	}
</style>