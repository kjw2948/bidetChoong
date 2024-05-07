package kim.bidetchoong.toilet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ToiletEvaluation {
    @Id @GeneratedValue
    private String toiletName;

    private long grade = 0;
    private int evaluatePeople = 0;

    public void toiletEvaluate(int star) {
        long total = this.grade * this.evaluatePeople;
        total += star;
        this.evaluatePeople ++;

        this.grade = total / this.evaluatePeople;
    }
}
