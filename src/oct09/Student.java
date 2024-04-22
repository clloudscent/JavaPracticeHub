package oct09;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private Integer age;

}
