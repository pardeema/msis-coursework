<?php
	include_once 'header.php';
?>	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
	<body>
	<br><br>
	<div class='row'>
		<div class='col-md-12 col-lg-12'>
			<div class='row'>
				<div class='col-md-1'>
				</div>
				<div class='col-md-3'>
					<b>Tracking Number:</b><br>
					<?php echo $_GET['id']; ?>
				</div>
				<div class='col-md-4'>
					<b>Address: </b><br>
					123 Fake Str<br>Springfield, IL 12345
				</div>

				<div class='col-md-3'>
					<b>Order ID:</b><br>
					<?php echo $_GET['order_id']; ?> <br>
					<button class="btn" data-toggle="modal" data-target="#myModal">View Order Details</button>
				</div>
				<div class='col-md-1'></div>
			</div>
			
			<div class='row'>
				<div class='col-md-4'>
				</div>
				<div class='col-md-4'>
				<br><br>
				<b><i>Tracking History</b></i><br>
				<ul>
					<li>Departed Shipping facility - <i>Denver, CO</i> - 2020/03/08 12:00AM MT
					<li>Dropped off at facility - <i>Castle Rock, CO</i> - 2020/03/07 2:00PM MT
				</ul>
				</div>
				<div class='col-md-4'>
				</div>
			</div>
		</div>
	</div>
	

	<div id="myModal" class="modal fade" role="dialog">
		<div class="modal-dialog">
		
		<!--Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Order Details</h4>
			</div>
			<div class='modal-body'>
				<h4>Order #: <?php echo $_GET['order_id'];?></h4>
			
				<p> Items: &lt;TODO: Pull actual items across request, easier done with DB implementation&gt;<br>
					<ul>
						<li> <a href="#">Item 1</a><span class='wide'> <a href="#">Return</a></span>
						<li> <a href="#">Item 2</a><span class='wide'> <a href="#">Return</a></span>
					</ul>
				</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
	</div>
	</body>

	
	<style>
	.modal{

		z-index: 100000;
	}
	.wide{
		margin: 75px;
	}
	</style>