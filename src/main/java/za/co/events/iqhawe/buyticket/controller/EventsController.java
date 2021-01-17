package za.co.events.iqhawe.buyticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.events.iqhawe.buyticket.dto.EventsRequest;
import za.co.events.iqhawe.buyticket.jpa.entity.VideoEntity;
import za.co.events.iqhawe.buyticket.servie.EventsService;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EventsController {

	@Autowired
	private EventsService eventsService;
	
	@PostMapping("/upload")
	public boolean uploadVideo(@RequestBody EventsRequest request) {
		VideoEntity video = new VideoEntity();

		video.setContent(request.getContent());
		video.setNameOfDj("Stimming");
		video.setSlotNumber(3);
		eventsService.uploadVideo(video);
		return true;
	}
	
	@GetMapping("/get")
	public List<VideoEntity> getAll() {
		return eventsService.findAll();
	}
}
