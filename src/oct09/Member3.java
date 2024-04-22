package oct09;
import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Member3 {
    @NonNull
    private String id;
    private String name;
    private int age;
}
