package kim.bidetchoong.domain.repository;

import kim.bidetchoong.domain.toilet.Toilet;
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

}
