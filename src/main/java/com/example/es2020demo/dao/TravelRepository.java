package com.example.es2020demo.dao;

import com.example.es2020demo.pojo.Travel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepository extends ElasticsearchRepository<Travel,Long> {
    List<Travel> findTravelByShortIntroduceContaining(String content);
    Integer deleteTravelById(Long id);
}
