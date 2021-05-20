package main;

import database.SQL_bean;
import database.SQL_connection;

public class SQL_Start {

	public static void main(String[] args) {
	
		if (SQL_connection.connectSQL()){
			System.out.println("Query som listar alla skådespelare som är med i filmen “Seven”: ");			
			SQL_connection.stateSQL(SQL_bean.actorSeven(), SQL_bean.requestQuery(), SQL_bean.id1());
			System.out.println("-------------");
			System.out.println("Query som listar alla filmer som fått en oscar för bästa film: ");
			SQL_connection.stateSQL(SQL_bean.oscarMovies(), SQL_bean.requestQuery2(), SQL_bean.id2());
			System.out.println("-------------");
			System.out.println("Query som listar alla filmer som skådespelaren Brad Pitt varit med i ");
			SQL_connection.stateSQL(SQL_bean.bradMovies(), SQL_bean.requestQuery3(), SQL_bean.id3());
			System.out.println("-------------");
			System.out.println("Query som listar alla priser som Brad Pitt's filmer har fått. ");
			SQL_connection.stateSQL(SQL_bean.pittAwards(), SQL_bean.requestQuery4(), SQL_bean.id4());
		}
	}
}
