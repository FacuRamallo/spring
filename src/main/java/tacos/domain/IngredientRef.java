package tacos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class IngredientRef {

    @Id
    private String ingredient;
}
