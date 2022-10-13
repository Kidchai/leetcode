package kidchai.calories.counter.controllers.user;

import kidchai.calories.counter.model.User;

import static kidchai.calories.counter.controllers.SecurityUtil.authUserId;

public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}
