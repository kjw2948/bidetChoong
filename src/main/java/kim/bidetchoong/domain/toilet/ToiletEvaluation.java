package kim.bidetchoong.domain.toilet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ToiletEvaluation {
    @Id @GeneratedValue
    private Long toiletId;

    private long grade = 0;
    private int evaluatePeople = 0;

    public long toiletEvaluate(int star) {
        long total = this.grade * this.evaluatePeople;
        total += star;
        this.evaluatePeople ++;
        this.grade = total / this.evaluatePeople;

        return total;
    }
}
