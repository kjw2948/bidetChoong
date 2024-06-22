package kim.bidetchoong.domain.toilet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Toilet {
    @Id @GeneratedValue
    private Long id;
    private String toiletName;
    private String location;
    private Long grade = 0L; // 화장실 별점

    public Toilet() {

    }
    public Toilet(String toiletName, String location) {
        this.toiletName = toiletName;
        this.location = location;
    }


    public void editToilet(Toilet toilet) {
        this.toiletName = toilet.getToiletName();
        this.location = toilet.getLocation();
        this.grade = toilet.getGrade();
    }
}
