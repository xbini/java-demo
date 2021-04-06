package mini.chatroom.user;

import java.util.List;

import mini.chatroom.Result;
import mini.chatroom.user.modles.CreateOrUpdateRequest;
import mini.chatroom.user.modles.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    private Result<List<User>> getUsers() {
        return Result.success(userService.findUsers());
    }

    @PostMapping
    private String create(@RequestBody CreateOrUpdateRequest request) {
        userService.createUser(request);
        return "operation successful.";
    }
}
