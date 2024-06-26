package example0;

public class UserWithParam<T> {
    private T data;
    public UserWithParam(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
