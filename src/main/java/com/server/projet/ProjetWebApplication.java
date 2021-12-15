package com.server.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetWebApplication {
	/*
	Lancer le serveur BDD avec les lignes de commandes :
		-cd dans le dossier contenat hsqldb.jar
		-lancer la commande : java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:db_dev_web --dbname.0 db_dev_web --port 1234

	Pour lancer l'intzeface graphique de la BDD :
		-cd dans le dossier contenat hsqldb.jar
		-lancer la commande : java -cp hsqldb.jar org.hsqldb.util.DatabaseManagerSwing
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProjetWebApplication.class, args);
	}
}
