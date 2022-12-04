package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.data.IngredientRepository;
import tacos.domain.Ingredient;
import tacos.domain.IngredientRef;

@Component
public class IngredientRefByIdConverter implements Converter<String, IngredientRef> {

    @Override
    public IngredientRef convert(String id) {
        return new IngredientRef(id);
    }
}
