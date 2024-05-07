package kim.bidetchoong.repository;

import kim.bidetchoong.member.Member;
import kim.bidetchoong.toilet.Toilet;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ToiletRepository {

    private static Map<Long, Toilet> store = new HashMap<>();
    public Long save(Toilet toilet) {
        store.put(toilet.getId(), toilet);
        return toilet.getId();
    }

    //오름차순 , 내림차순 정렬 -->
}
