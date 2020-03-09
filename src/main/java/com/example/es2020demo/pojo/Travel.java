package com.example.es2020demo.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@Document(indexName = "travel_index",type = "docs")
public class Travel {
    @Id
    private Long id;
    /**
     * 与Es对应
     */
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String address;

    @Field(type = FieldType.Double)
    private Double price;

    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String shortIntroduce;

    @Field(type = FieldType.Date)
    private Date createTime;

    @Field(type = FieldType.Date)
    private Date updateTime;
}
