package co.com.bancolombia.model.personmodel;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
public class PersonModel {

    private String id;
    private String name;
}
