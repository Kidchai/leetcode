package kidchai.calories.counter.dao;

import kidchai.calories.counter.model.Meal;

import java.util.Collection;

public interface MealDao {
    Meal save(Meal meal);
    Meal get(int id);
    void remove(int id);
    Collection<Meal> getAll();
}
