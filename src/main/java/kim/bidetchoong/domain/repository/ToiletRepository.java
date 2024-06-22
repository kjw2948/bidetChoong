package kim.bidetchoong.domain.repository;

import kim.bidetchoong.domain.toilet.Toilet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ToiletRepository {

    private static Map<Long, Toilet> toiletStore = new HashMap<>();
    public Long save(Toilet toilet) {
        toiletStore.put(toilet.getId(), toilet);
        return toilet.getId();
    }

    public Toilet findById(Long id) {
        return toiletStore.get(id);
    }

    public List<Toilet> findAll() {
        return new ArrayList<>(toiletStore.values());
    }
}
