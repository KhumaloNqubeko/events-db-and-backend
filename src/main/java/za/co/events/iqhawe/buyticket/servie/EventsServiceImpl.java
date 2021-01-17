package za.co.events.iqhawe.buyticket.servie;

import java.util.List;

import za.co.events.iqhawe.buyticket.jpa.entity.VideoEntity;
import za.co.events.iqhawe.buyticket.jpa.repository.VideoRepository;

public class EventsServiceImpl implements EventsService{
	private final VideoRepository videoRepository;

	public EventsServiceImpl(VideoRepository videoRepository) {
		this.videoRepository = videoRepository;
	}

	@Override
	public void uploadVideo(VideoEntity videoEntity) {
		videoRepository.save(videoEntity);
	}
	
	@Override
	public List<VideoEntity> findAll() {
		return videoRepository.findAll();
	}
}
