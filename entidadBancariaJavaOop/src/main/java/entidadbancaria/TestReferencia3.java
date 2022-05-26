package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/21/2022
 * time:11:20 AM
 * projectName:entidadBancaria
 * */

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar, usar Syste.out.println
import org.apache.logging.log4j.Logger;

public class TestReferencia3 {

	private static final Logger logger = LogManager.getLogger(TestReferencia3.class);

	public static void main(String[] args) {
		Cuenta cuentaDeCarlos = new Cuenta(10); //!al crear una new cuenta se inicializa un new ClienteDelBanco, ver clase Cuenta.java
		//	cuentaDeCarlos.titular = new ClienteDelBanco(); //inicializar nuevo clienteDelBanco
		//	cuentaDeCarlos.titular.nombreDelCliente = "Carlos";
		logger.info(cuentaDeCarlos.getTitular().getNombreDelCliente());
	}

}
