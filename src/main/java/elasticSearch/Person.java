package elasticSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@Document(indexName = "person_data")
public class Person {
    @Id
    private Integer id;
    @Field(type = FieldType.Text)
    private String firstName;
    @Field(type = FieldType.Text)
    private String lastName;
    @Field(type = FieldType.Text)
    private String fatherName;
    @Field(type = FieldType.Text)
    private String motherName;
    @Field(type = FieldType.Boolean)
    private boolean married;
    @Field(type = FieldType.Integer)
    private int age;
    @Field(type = FieldType.Keyword)
    private String mobileNumber;
    @Field(type = FieldType.Keyword)
    private String email;

}
