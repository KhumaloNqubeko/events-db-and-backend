package za.co.events.iqhawe.buyticket.servie;

import java.util.List;

import za.co.events.iqhawe.buyticket.jpa.entity.VideoEntity;

public interface EventsService {
	void uploadVideo(VideoEntity videoEntity);
	
	List<VideoEntity> findAll();
}
