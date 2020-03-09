package com.example.es2020demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CreateIndex {
    @Autowired
    private ElasticsearchTemplate template;
    //1.创建索引(理解为mysql的创建数据库)
    public Boolean addIndex(Object object){
       return template.createIndex(object.getClass());
    }
    //2.将索引的与对象的成员变量进行映射
    public Boolean mappingIndex(Object object){
        return template.putMapping(object.getClass());
    }
}
