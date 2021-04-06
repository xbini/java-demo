package mini.chatroom;

import lombok.Data;

@Data
public class Result<T> {
    private String message;
    private int code;
    private T data;

    static public <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setMessage("operation successful.");
        result.setCode(0);
        result.setData(data);
        return result;
    }

    static public <T> Result<T> error(T data, int code, String message) {
        Result<T> result = new Result<T>();
        result.setMessage(message == null ? "operation occurred error." : message);
        result.setCode(code);
        result.setData(data);
        return result;
    }
}
