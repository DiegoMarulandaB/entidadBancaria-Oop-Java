package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/20/2022
 * time:18:43 PM
 * projectName:entidadBancaria
 * */

// TODO segunda parte , va relacionado con testReferencia1

import org.apache.logging.log4j.LogManager;//los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class CrearCuentaCliente {

	public static final Logger logger = LogManager.getLogger(CrearCuentaCliente.class);

	public static void main(String[] args) {
		// las variables en java no guardan algun valor, sino que hace referencia a ese espacio en memoria de java

		// Variable          = valor
		Cuenta primeraCuenta = new Cuenta(10); //!para crear un nuevo objeto o una nueva cuenta se usa = new Cuenta(); y se agrupa todos los atributos usando los ()
		primeraCuenta.depositarDinero(1000); //se inicializa un atributo usando el .
		logger.info("la primera cuenta tiene un saldo de $" + primeraCuenta.getSaldo());
		logger.info(" ");

		Cuenta segundaCuenta = new Cuenta(10); //new representa un nuevo espacio en memoria de java para ese objeto
		segundaCuenta.depositarDinero(500);
		//System.out.println(sugundaCuenta.saldo);
		logger.info("la segunda cuenta tiene un saldo de $" + segundaCuenta.getSaldo());
		logger.info("referencia en espacio de memoria de ejava para el nuevo objeto " + segundaCuenta);
	}
}
