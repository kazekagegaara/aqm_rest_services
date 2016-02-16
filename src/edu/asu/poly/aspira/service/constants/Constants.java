package edu.asu.poly.aspira.service.constants;

public class Constants {
private static String dbUrl = "localhost";
private static String dbPort = "3306";
private static String dbName = "aspira";
private static String dbUser = "dbuser";
private static String dbPwd = "root123";
public static String getDbUrl() {
	return dbUrl;
}
public static void setDbUrl(String dbUrl) {
	Constants.dbUrl = dbUrl;
}
public static String getDbPort() {
	return dbPort;
}
public static void setDbPort(String dbPort) {
	Constants.dbPort = dbPort;
}
public static String getDbName() {
	return dbName;
}
public static void setDbName(String dbName) {
	Constants.dbName = dbName;
}
public static String getDbUser() {
	return dbUser;
}
public static void setDbUser(String dbUser) {
	Constants.dbUser = dbUser;
}
public static String getDbPwd() {
	return dbPwd;
}
public static void setDbPwd(String dbPwd) {
	Constants.dbPwd = dbPwd;
}

}
