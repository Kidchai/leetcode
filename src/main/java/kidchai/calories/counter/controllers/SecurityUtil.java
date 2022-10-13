package kidchai.calories.counter.controllers;

import static kidchai.calories.counter.util.MealsUtil.CALORIES_PER_DAY;

public class SecurityUtil {

    public static int authUserId() {
        return 1;
    }

    public static int authUserCaloriesPerDay() {
        return CALORIES_PER_DAY;
    }
}
