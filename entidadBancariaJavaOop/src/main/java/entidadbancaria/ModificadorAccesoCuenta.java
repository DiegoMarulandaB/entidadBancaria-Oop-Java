package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/21/2022
 * time:10:10 AM
 * projectName:entidadBancaria
 * */

//TODO quinta parte encapsulamiento
//evitar saldo negativo y que el usuario disponga solo del saldo que tenga actual en su cuenta
//private es un modificador de acceso
//esto se consigue con priavte saldo, ver Cuenta.java

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class ModificadorAccesoCuenta {

	private static final Logger logger = LogManager.getLogger(ModificadorAccesoCuenta.class);

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(10);
	//	cuenta.setAgencia(-22); //setter,siempre va asolicitar un dato o valor
		cuenta.getAgencia();
		cuenta.depositarDinero(400);
		cuenta.retirarDinero(300);
		logger.info(cuenta.getSaldo());
		logger.info("Muestra el numéro de la agencia ... " + cuenta.getAgencia());
	}

}
