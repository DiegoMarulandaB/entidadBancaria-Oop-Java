package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/21/2022
 * time:11:08 AM
 * projectName:entidadBancaria
 * */

//TODO sexta parte, relacionada con testReferencia3

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class ModificadorAccesoCliente {
	private static final Logger logger = LogManager.getLogger(ModificadorAccesoCliente.class);

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(10);
		ClienteDelBanco cliente = new ClienteDelBanco();
		cliente.setNombreDelCliente("Carlos"); //setter,siempre va a solicitar un dato o valor
		cliente.setDocumentoDeIdentidad("37689592");

		cuenta.setTitular(cliente);
		logger.info(cliente.getNombreDelCliente()); //getter sirve para obtener el valor de una clase privada
		logger.info(cliente);
	}
}
