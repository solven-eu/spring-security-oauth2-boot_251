package eu.solven;

import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;

public class CheckLoadedCLass {
	public static void main(String[] args) {
		System.out.println(
				OAuth2ClientProperties.class.getProtectionDomain().getCodeSource().getLocation().toExternalForm());
	}
}
