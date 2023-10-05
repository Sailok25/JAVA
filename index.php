<?php
	echo "Hola mon! <br>";
	
	$edat=18;
	
	if ($edat<18){
		echo "Es menor d'edat!";
	} else{
		echo "Es major d'edat!";
	}
	if ($edat<18){
		echo "Es menor d'edat!";
	}else if($edat==18){
		echo "Es major d'edat (just d'aquest any)";
	}else{
		echo("Es major d'edat!");
	}
?>