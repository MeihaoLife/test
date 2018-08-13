package cn.youngs.concurrent.research;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/13 22:59
 * @Description:
 * @Version:1.0
 */
public class User{

    private String userid;

    private String username;

    User(){}

    User(String uid,String uname){
        this.userid = uid;
        this.username = uname;
    }

    @Override
    public String toString() {
        return "userid:"+userid + " username:" + username;
    }
}
