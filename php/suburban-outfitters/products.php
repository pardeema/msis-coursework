<?php
	include_once 'header.php';
	include_once 'fake_data.php'; //needed for now to populate fake product data. outputs array of array called $products
	if (!isset($_GET['category'])){
		$_GET['category']='all';
	}
	$cat = $_GET['category'];
	


	//Array to track product filters 
	
	foreach($products as $category => $product_types)
		if ($cat == $category or $cat == 'all'){
			foreach($product_types as $products => $items)
				foreach($items as $key => $value)
					echo "<b>Product Type</b>:\t $products \t <b>Item:</b> <a href='product.php?id=$value[1]'>$value[0]</a> <br>";
		};
	
	
?>
	<script defer >
		var tag = <?php echo $cat ?> 
		tag.classList.add('active');
	</script>


