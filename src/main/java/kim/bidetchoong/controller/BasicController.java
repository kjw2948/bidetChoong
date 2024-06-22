package kim.bidetchoong.controller;

import kim.bidetchoong.domain.member.Member;
import kim.bidetchoong.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class BasicController {

    private final MemberRepository memberRepository;
    @GetMapping()
    public String home() {
        return "home";
    }


    @GetMapping("/members")
    public String members(Model model) {
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        return "list";
    }
}
