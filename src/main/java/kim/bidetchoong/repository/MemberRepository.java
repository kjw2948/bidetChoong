package kim.bidetchoong.repository;

import kim.bidetchoong.member.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();

    public Long save(Member member) {
        store.put(member.getId(), member);
        return member.getId();
    }

    public Member findById(Long id) {
        return store.get(id);
    }
}
