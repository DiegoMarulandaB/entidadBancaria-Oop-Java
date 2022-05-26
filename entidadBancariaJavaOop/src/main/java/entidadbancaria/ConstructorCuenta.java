package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/21/2022
 * time:13:45 PM
 * projectName:oop2
 * */

//TODO septima parte

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class ConstructorCuenta {

	private static final Logger logger = LogManager.getLogger(ConstructorCuenta.class);

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(800);
		Cuenta cuenta2 = new Cuenta(600);
		Cuenta cuenta3 = new Cuenta(200);
	//	cuenta.setAgencia(-6);
	//	logger.info(cuenta.getAgencia());
	}

}
