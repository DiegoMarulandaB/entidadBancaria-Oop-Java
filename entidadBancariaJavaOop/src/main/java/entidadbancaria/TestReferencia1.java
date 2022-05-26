package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/20/2022
 * time:19:10 PM
 * projectName:entidadBancaria
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestReferencia1 {

	private static final Logger logger = LogManager.getLogger(TestReferencia1.class);

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(10);
		//primeraCuenta.saldo = 200;
		primeraCuenta.setSaldo(200);

		Cuenta segundaCuenta = primeraCuenta;
		//segundaCuenta.saldo = 100;
		segundaCuenta.setSaldo(100);

		logger.info("Saldo de la primera cuenta $" + primeraCuenta.getSaldo());
		logger.info("Saldo de la segunda cuenta $" + segundaCuenta.getSaldo());
		logger.info("");

		segundaCuenta.setSaldo(400);
		logger.info("Saldo de la primera cuenta $"
				+ primeraCuenta.getSaldo()); // si las variables hacen refrencia al mismo objeto, se ven afectados y pueden cambiar su valor en memoria
		logger.info("");

		logger.info("espacio en memoria primera cuenta ... " + primeraCuenta);
		logger.info("espacio en memoria de la segunda cuenta ... " + segundaCuenta);
		logger.info("");

		//	logger.info("" + segundaCuenta.saldo);

		if (primeraCuenta == segundaCuenta) {
			logger.info("son el mismo objeto");
		} else {
			logger.info("son objetos diferentes");
		}

	}

}
