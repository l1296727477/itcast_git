package pojo;

import java.io.Serializable;

/**
 * @Author 刘仕合
 * @Date 2019/8/2 15:09
 * @Version 2018.1.1
 */
public class User implements Serializable {
    private String usernaaasdadsdme;//用户名
    private String passsadasdaword;//密码

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
