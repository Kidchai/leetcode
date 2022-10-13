package kidchai.calories.counter.repository;

import kidchai.calories.counter.model.Meal;

import java.util.Collection;

public interface MealRepository {
    Meal save(Meal meal);
    Meal get(int id);
    void remove(int id);
    Collection<Meal> getAll();
}
