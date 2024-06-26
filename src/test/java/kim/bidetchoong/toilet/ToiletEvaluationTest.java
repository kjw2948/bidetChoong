package kim.bidetchoong.toilet;

import kim.bidetchoong.domain.toilet.ToiletEvaluation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ToiletEvaluationTest {

    @Test
    void test() {
        ToiletEvaluation te = new ToiletEvaluation();
        te.toiletEvaluate(5);

        Assertions.assertThat(te.getEvaluatePeople()).isEqualTo(1);
        Assertions.assertThat(te.getGrade()).isEqualTo(5);

        te.toiletEvaluate(3);
        te.toiletEvaluate(4);

        Assertions.assertThat(te.getEvaluatePeople()).isEqualTo(3);
        Assertions.assertThat(te.getGrade()).isEqualTo(4);
    }

}