package com.example.es2020demo;

import com.example.es2020demo.dao.CreateIndex;
import com.example.es2020demo.dao.TravelRepository;
import com.example.es2020demo.pojo.Travel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.util.List;

@SpringBootTest
class Es2020demoApplicationTests {
    @Autowired
    private CreateIndex createIndex;
    @Autowired
    private TravelRepository repository;
    @Autowired
    private ElasticsearchTemplate template;
    @Test
    void contextLoads() {
//        Travel travel=new Travel();
//        //创建索引
//    //    createIndex.addIndex(travel);
//        //映射
//        createIndex.mappingIndex(travel);
//
//        List<Travel> travelList=new ArrayList<>();
//        for (Integer i=0;i<100;i++){
//            Travel travel=new Travel();
//            travel.setId(i.longValue());
//            travel.setAddress("撒旦放假时间你啊还是你发个函");
//            travel.setShortIntroduce("哦打死就购票时间都给你就奥迪今年高三的和胳膊加厚尿素黑搞不好你是否地虎");
//            travel.setPrice(i.doubleValue());
//            travel.setCreateTime(new Date());
//            travel.setUpdateTime(new Date());
//            travelList.add(travel);
//        }
//        repository.saveAll(travelList);
//        Iterable<Travel> all = repository.findAll();
//        all.forEach(travel -> System.out.println(travel.toString()));
        List<Travel> msg = repository.findTravelsByShortIntroduceLike("哦打死");
        System.out.println(msg.size());

    }

}
