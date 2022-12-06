package tacos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("INGREDIENT_REF")
@AllArgsConstructor
public class IngredientRef {

    @Id
    private String ingredient;
}
