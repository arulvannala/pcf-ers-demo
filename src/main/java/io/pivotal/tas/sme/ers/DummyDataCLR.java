package io.pivotal.tas.sme.ers;

import io.pivotal.tas.sme.ers.server.repo.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

@Component
public class DummyDataCLR  implements CommandLineRunner {

	@Autowired
	private AttendeeRepository attendeeRepository;

	@Override
	public void run(String... arg0) throws Exception {

		// MMB: Left here because I like the new Java 8 Stream API. A reminder for further research
		//Stream.of("Roy", "Darrel").forEach(a -> attendeeRepository.save(new Attendee(a)));
		attendeeRepository.findAll().forEach(System.out::println);
		attendeeRepository.findByFirstNameIgnoreCase("Roy", new PageRequest(1, 10)).forEach(System.out::println);
	}

}
