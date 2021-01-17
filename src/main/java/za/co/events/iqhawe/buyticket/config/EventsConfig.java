package za.co.events.iqhawe.buyticket.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import za.co.events.iqhawe.buyticket.jpa.repository.VideoRepository;
import za.co.events.iqhawe.buyticket.servie.EventsService;
import za.co.events.iqhawe.buyticket.servie.EventsServiceImpl;

@Configuration
@EnableJpaRepositories(basePackages = "za.co.events.iqhawe.buyticket.jpa.repository")
@ComponentScan(basePackages = "za.co.events.iqhawe.buyticket.jpa.repository")
@EntityScan(basePackages = "za.co.events.iqhawe.buyticket.jpa.entity")
public class EventsConfig {

	@Bean
	public EventsService eventsService(VideoRepository videoRepository) {
		return new EventsServiceImpl(videoRepository);
	}
}
