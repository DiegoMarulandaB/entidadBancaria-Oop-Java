package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/25/2022
 * time:2:52 PM
 * projectName:entidadBancaria
 * */

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class TestReferencia2 {

	private static final Logger logger = LogManager.getLogger(TestReferencia2.class);

	public static void main(String[] args) {
		ClienteDelBanco carlos = new ClienteDelBanco();
		//carlos.nombreDelCliente = "Carlos";
		carlos.setNombreDelCliente("Carlos");
		//carlos.documentoDeIdentidad = "37689592";
		carlos.setDocumentoDeIdentidad("37689592");
		//carlos.numeroDeTelefono = "586960409";
		carlos.setNumeroDeTelefono("586960409");

		//se crea una nueva cuenta con carlos

		Cuenta cuentaDeCarlos = new Cuenta(10);
		//cuentaDeCarlos.agencia = 1;
		//cuentaDeCarlos.setAgencia(1);
		cuentaDeCarlos.getAgencia();
		//cuentaDeCarlos.titular = carlos;
		cuentaDeCarlos.setTitular(carlos);
		logger.info(
				"Informacion del documento de identidad de la cuenta de Carlos "
						+ cuentaDeCarlos.getTitular().getDocumentoDeIdentidad());
		logger.info(
				"Información del espacio en memoria de la cuenta de Carlos ...."
						+ cuentaDeCarlos.getTitular());
		logger.info(carlos);
	}

}
