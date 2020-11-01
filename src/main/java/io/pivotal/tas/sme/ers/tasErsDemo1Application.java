package io.pivotal.tas.sme.ers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * tasErsDemo1Application
 *
 * I just want to highlight the RibbonClient configuration (used by feign
 * clients). We would typically use Eureka (service registry), but for
 * simplicity we decided to support external configuration (in addition to the properties files).
 *
 * @TODO: - Git versioning (maven plugin) - concourse CI/CD -
 *
 * @author mborges
 *
 */
@SpringBootApplication
public class tasErsDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(tasErsDemo1Application.class, args);
	}
}
