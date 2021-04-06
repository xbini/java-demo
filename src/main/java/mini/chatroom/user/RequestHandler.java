package mini.chatroom.user;

import mini.chatroom.user.modles.CreateOrUpdateRequest;
import mini.chatroom.user.modles.User;

public class RequestHandler {
    static User ofCreate(CreateOrUpdateRequest request) {
        return User.create(request.getName(), request.getLoginName(), request.getEmail(), request.getPhone());
    }
}
