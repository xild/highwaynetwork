package br.com.highwaynetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class HighwayApplication {

	/**
	 * Roda a aplicação como standalone
	 * 
	 * @param args
	 * Program arguments - ignored.
	 */
	public static void main(String[] args) {
		SpringApplication.run(HighwayApplication.class, args);
	}
	
	
	@Bean(name = "messageSource")
	public ReloadableResourceBundleMessageSource messageSource() {
	  ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
	  messageBundle.setBasename("classpath:messages");
	  messageBundle.setDefaultEncoding("UTF-8");
	  return messageBundle;
	}
}
