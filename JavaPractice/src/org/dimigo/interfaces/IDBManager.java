/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *		|_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * <pre>
 *
 * @author 0707
 * @version 1.0
 */
public interface IDBManager {
	
	public static String ORACLE_DATABASE = "ORACLE";
	public static String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database){
			if(database.equals(ORACLE_DATABASE)){
				return new OracleDB();
			}
			if(database.equals(SYBASE_DATABASE)){
				return new SybaseDB();
			}
			else return null;
	}
}
