package kim.bidetchoong.domain.repository;

import kim.bidetchoong.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberRepository {
    private static Map<Long, Member> memberStore = new HashMap<>();


    public Long save(Member member) {
        // 로그인 가능 로직
        if(member.login()) {
            memberStore.put(member.getId(), member);
            return member.getId();
        }
        throw new RuntimeException();
    }

    public Member findById(Long id) {
        return memberStore.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(memberStore.values());
    }
}
