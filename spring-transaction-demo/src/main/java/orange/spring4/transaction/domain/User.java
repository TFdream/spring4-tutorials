package orange.spring4.transaction.domain;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-11 23:05
 */
public class User {
    private Long id;
    private String username;    //用户名
    private String password;    //密码
    private double balance; //账号余额

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
