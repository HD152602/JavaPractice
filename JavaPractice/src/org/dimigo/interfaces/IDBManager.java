/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ IDBManager
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public interface IDBManager {
	public static final String PKG_NAME = "org.dimigo.interfaces.";
	public static final String ORACLE_DATABASE = "OracleDB";
	public static final String SYBASE_DATABASE = "SybaseDB";
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManager getDBObject(String database) throws Exception {
		Class cls =  Class.forName(PKG_NAME+database);  // org.dimigo.interfaces.OracleDB
		IDBManager db = (IDBManager)cls.newInstance();
		return db;
	}
}
