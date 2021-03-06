package springsecurity.login.app.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "rno")
@ToString(of = {"rno", "roleName"})
public class MemberRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String roleName;

    private String description;

    public MemberRole() {
    }

    public MemberRole(String roleName) {
        this.roleName = roleName;
    }


}
