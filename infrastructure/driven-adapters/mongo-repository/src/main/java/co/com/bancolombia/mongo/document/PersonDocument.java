package co.com.bancolombia.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDocument {

    @Id
    private String id;

    private String name;
}
