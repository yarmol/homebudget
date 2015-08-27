package HomeBudget;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
public class User implements Serializable {

public enum userRole {
     USER_ROLE, ADMIN_ROLE
}

    @Id
@GeneratedValue(generator = "increment")
@Column (name = "userId")
private int userId;

@Column(name = "name")
private String name;


@Column(name = "userRole")
@Enumerated(EnumType.STRING)
private userRole userRole;

@Column (name = "email")
private String email;

@Column (name = "password")
private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getUserRole() {
        return userRole;
    }

    public void setUserRole(User.userRole userRole) {
        this.userRole = userRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

