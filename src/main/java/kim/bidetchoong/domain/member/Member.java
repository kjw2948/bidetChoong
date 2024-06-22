package kim.bidetchoong.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLException;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String username;

    public Member() {

    }
    public Member(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    //로그인 로직 추가
    public boolean login() {
        if (isValid(this)) {
            return  true;
        }
        throw new RuntimeException();
    }

    public boolean isValid(Member member) {
        if (this.id==member.getId()) {
            return false;
        }
        return true;
    }


}
