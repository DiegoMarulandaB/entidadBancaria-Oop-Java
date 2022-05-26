package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/20/2022
 * time:19:18 PM
 * projectName:entidadBancaria
 * */
//TODO tercera parte

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class ManejoDeCuentaDepositoYRetiro {

	private static final Logger logger = LogManager.getLogger(ManejoDeCuentaDepositoYRetiro.class);

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(10); //new representa un nuevo espacio en memoria de java para ese objeto
		miCuenta.depositarDinero(300);
		miCuenta.depositarDinero(200);
		//System.out.println(miCuenta.saldo);
		logger.info("primer saldo en mi cuenta $" + miCuenta.getSaldo());
		logger.info("");

		//atajo para ir al metodo retirarDinero, seleccionar la variable, control + clic
		miCuenta.retirarDinero(100);
		logger.info(
				"Segundo saldo en mi cuenta, despues de hacer el retiro $" + miCuenta.getSaldo());
		logger.info("");

		Cuenta cuentaDeCarlos = new Cuenta(10);
		cuentaDeCarlos.depositarDinero(1000);
		logger.info("Saldo en la cuenta de Carlos $" + cuentaDeCarlos.getSaldo());
		logger.info("");
		//cuentaDeCarlos.transferirDinero(400, miCuenta);

		//metodo que retorna valor
		boolean puedeTransferirDinero = cuentaDeCarlos.transferirDinero(400, miCuenta);
		if (puedeTransferirDinero) {
			logger.info("La transferencia realizada por Carlos a mi cuenta fue exitosa");
		} else {
			logger.info("Su transferencia no fue exitosa");
		}
		//logger.info("Nuevo saldo en la cuenta de Carlos, despues de hacer la transferencia a mi cuenta $" + cuentaDeCarlos.saldo);
		//logger.info("tercer saldo en mi cuenta, y se me adicionaron 400 $" + miCuenta.saldo);
	}

}
