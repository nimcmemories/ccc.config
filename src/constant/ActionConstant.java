package constant;

import java.io.FilePermission;

public class ActionConstant {
	//ACTION CONSTANTS
	
	public static short LOGIN_A = 0;
	public static short LOGIN_UPDATE = 2;
	public static short USER_UPDATE = 3;
	public static short USER_READ = 4;
	public static short DASHBOARD = 15;
	public static short TAIL = 20;
	public static short INITBUILD = 19;
	
	//CONSTANTS FOR config.file
	/*
	 *Later these constants could be read at the time of application start
	 */
	public static String FILEPATH="/tmp/tail.txt";
}
