package kim.bidetchoong.domain.repository;

import kim.bidetchoong.domain.member.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberRepository {
    private static Map<Long, Member> memberStore = new HashMap<>();

    public Long save(Member member) {
        memberStore.put(member.getId(), member);
        return member.getId();
    }

    public Member findById(Long id) {
        return memberStore.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(memberStore.values());
    }
}
