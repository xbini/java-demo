package mini.chatroom.user;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mini.chatroom.user.modles.CreateOrUpdateRequest;
import mini.chatroom.user.modles.User;

interface IUserMapper extends BaseMapper<User> {
}

@Service
public class UserService {
    @Autowired
    private IUserMapper userMapper;

    @Transactional
    public List<User> findUsers() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @Transactional
    User createUser(CreateOrUpdateRequest request) {
        User user = RequestHandler.ofCreate(request);
        userMapper.insert(user);
        return user;
    }
}
