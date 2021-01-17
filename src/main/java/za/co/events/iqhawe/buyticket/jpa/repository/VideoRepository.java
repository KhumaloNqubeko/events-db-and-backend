package za.co.events.iqhawe.buyticket.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.events.iqhawe.buyticket.jpa.entity.VideoEntity;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Long>{

}
