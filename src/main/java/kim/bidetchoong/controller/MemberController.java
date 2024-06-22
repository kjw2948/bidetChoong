package kim.bidetchoong.controller;

import kim.bidetchoong.domain.member.Member;
import kim.bidetchoong.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;


    @GetMapping("/")
    public String memberSaveForm() {
        return "save";
    }

    @PostMapping("/")
    public String memberSave(Member member) {
        memberRepository.save(member);
        return "save";
    }

    @GetMapping("/{id}")
    public String findById(Long id, Model model) {
        Member findMember = memberRepository.findById(id);
        model.addAttribute("member", findMember);
        return "redirect://home";
    }

    @GetMapping("/edit/{id}")
    public String editForm() {
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String edit(Member member, Model model) {
        Member findMember = memberRepository.findById(member.getId());
        findMember.setId(member.getId());
        findMember.setUsername(member.getUsername());
        model.addAttribute("model", findMember);
        return "redirect://home";
    }


}
