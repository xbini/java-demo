package mini.chatroom.user.modles;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import mini.chatroom.Utils;

@Data
@TableName(schema = "mini_chatroom")
public class User {
    private String id;
    private String name;
    private String loginName;
    private String email;
    private String phone;
    private Timestamp createdAt;
    private Timestamp lastModifiedAt;
    private Timestamp lastLoginAt;

    public User(String name, String loginName, String email, String phone) {
        this.id = Utils.generateUUID();
        this.name = name;
        this.loginName = loginName;
        this.email = email;
        this.phone = phone;
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.lastModifiedAt = null;
        this.lastLoginAt = null;
    }

    public static User create(String name, String loginName, String email, String phone) {
        return new User(name, loginName, email, phone);
    };

    // User update(){

    // };
}
