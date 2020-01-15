package io.spring.demo.issuesdashboard;

import javax.validation.constraints.Pattern;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("github")
public class GithubProperties {

	/**
	 * Github API token ("user:sampletoken")
	 */
	@Pattern(regexp = "\\w+:\\w+")
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
