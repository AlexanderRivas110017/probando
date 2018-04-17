<?php 
	$mysqli = new mysqli("localhost", "root", "", "bodegaproyecto");

	$salida = "";
	$query = "SELECT * FROM categoria ORDER BY idCategoria";

	if (isset($_POST['consulta'])) {
		
		$q = $mysqli->real_escape_string($_POST['consulta']);
		$query = "SELECT idCategoria, nombreCategoria, descripcionCategoria, creacionCategoria FROM categoria
					WHERE nombreCategoria LIKE '%".$q."%'";
	}

	$resultado = $mysqli->query($query);

	if ($resultado->num_rows > 0) {
		$salida.=' <table border="1" class="table table-bordered" style="margin-top: 2%;">
            <tr>
              <td>Herramienta</td>
              <td>Nombre</td>
              <td>descripcionCategoria</td>
              <td>Estado</td>
 
            </tr>';

          while ($fila = $resultado->fetch_assoc()) {
          	$salida.= '<tr>
          					<td>'.$fila["idCategoria"].'</td>
          					<td>'.$fila["nombreCategoria"].'</td>
          					<td>'.$fila["descripcionCategoria"].'</td>
          					<td>'.$fila["creacionCategoria"].'</td>
          				</tr>';
          }

          $salida.="</table>";
	}
	else{
		$salida.="no hay nada :'v";

	}
	echo $salida;
	$mysqli->close();
 ?>