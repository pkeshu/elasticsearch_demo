package com.keshar.basicelasticsearch.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "keshar-testing", indexStoreType = "fs", shards = 2)
//@Mapping(mappingPath = "C:\\Users\\Keshar\\Desktop\\elastic-search\\basic_elastic_search")
public class Customer {
    @Id
    private String id;
    @Field(type = FieldType.Text)
    private String firstname;
    @Field(type = FieldType.Text)
    private String lastname;
    @Field(type = FieldType.Integer)
    private int age;
}
