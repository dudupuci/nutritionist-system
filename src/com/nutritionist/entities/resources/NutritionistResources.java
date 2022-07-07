package com.nutritionist.entities.resources;

import java.util.List;

import com.nutritionist.entities.Nutritionist;

public interface NutritionistResources {
	public void registerNutritonist(List<Nutritionist> list, Nutritionist nutritionist);
	public void deleteNutritionistByIndex(List<Nutritionist> list, Nutritionist nutritionist);


}
