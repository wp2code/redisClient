package core.utils;

/**
 * @author liu_wp
 * @date 2018年1月7日
 * @see
 */
public class Constants {

	private static String clientId;

	private static boolean ignore;

	public static String getClientId() {
		return clientId;
	}

	public static boolean isIgnore() {
		return ignore;
	}

	public static void setClientId(String clientId) {
		Constants.clientId = clientId;
	}

	public static void setIgnore(boolean ignore) {
		Constants.ignore = ignore;
	}

}
