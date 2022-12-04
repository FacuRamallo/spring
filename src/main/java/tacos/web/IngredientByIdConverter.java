package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.data.IngredientRepository;
import tacos.domain.Ingredient;
import tacos.domain.IngredientRef;

import java.util.HashMap;
import java.util.Map;

import static tacos.domain.Ingredient.Type.CHEESE;
import static tacos.domain.Ingredient.Type.PROTEIN;
import static tacos.domain.Ingredient.Type.SAUCE;
import static tacos.domain.Ingredient.Type.VEGGIES;
import static tacos.domain.Ingredient.Type.WRAP;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo; }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
