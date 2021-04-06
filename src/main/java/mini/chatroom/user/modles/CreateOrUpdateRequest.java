package mini.chatroom.user.modles;

import lombok.Data;

@Data
public class CreateOrUpdateRequest {
    private String name;
    private String loginName;
    private String email;
    private String phone;
}
