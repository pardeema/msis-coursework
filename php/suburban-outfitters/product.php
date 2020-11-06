<?php include_once 'header.php';
	  include_once 'fake_data.php'; //Temporary to display fake data.
	
	$id = $_GET['id'];
	foreach($products as $dept => $category)
		foreach($category as $products => $items)
			foreach($items as $key => $value)
				if ($id == $value[1]){
					$product = $value[0];
					break;
				}	
	
	echo "<h1> $product </h1>";
	
	echo "<div class=row>";
	echo "<div class=col-md-8><p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu ligula a mauris varius elementum vel nec risus. Duis commodo consectetur aliquet. Donec vel odio congue, hendrerit augue auctor, finibus urna. Aenean vestibulum nisi nibh, quis efficitur justo egestas id. Nullam aliquam, mauris ut fermentum convallis, lorem nulla luctus urna, vitae suscipit mauris ante nec justo. Fusce quam neque, mattis a laoreet eget, iaculis in velit. Suspendisse potenti. Vivamus id tincidunt velit. Quisque non ipsum vitae turpis efficitur ultricies. Phasellus ac nibh ac neque commodo gravida. Curabitur non rutrum arcu. Praesent elementum maximus tellus at ornare. Aenean volutpat urna a lectus lacinia, in sollicitudin sapien laoreet. Proin a augue eget mi hendrerit tincidunt vitae et nunc.</p></div>";
	
	echo "<div class=col-md-2><span class='margin'><b>Price: </b>\t $40.00</span></div>";
	echo "<div class=col-md-2><span class='margin'>
	<form action='add_to_cart.php' method='POST'>
		<input name='quantity' value='1'>
		<input name='id' value=$id type='hidden'>
		<input name='name' type='hidden' value=$product>
	<button class='add-button' type='submit'>Add to Cart</button></form></span></div>";
	
?>

	