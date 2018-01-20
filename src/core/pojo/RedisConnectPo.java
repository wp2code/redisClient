package core.pojo;

/**
 * @author liu_wp
 * @date 2018年1月17日
 * @see
 */
public class RedisConnectPo {
	private String host;
	private Integer port;
	private String password;

	public String getHost() {
		return host;
	}

	public String getPassword() {
		return password;
	}

	public Integer getPort() {
		return port;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
}
