package kim.bidetchoong.controller;

import kim.bidetchoong.domain.repository.ToiletRepository;
import kim.bidetchoong.domain.toilet.Toilet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/toilet")
public class ToiletController {

    private final ToiletRepository toiletRepository;

    @GetMapping("/")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/")
    public String save(Toilet toilet, Model model) {
        toiletRepository.save(toilet);
        model.addAttribute("toilet", toilet);
        return "save";
    }

    @GetMapping("/{id}")
    public String read(@PathVariable Long id, Model model) {
        Toilet findToilet = toiletRepository.findById(id);
        model.addAttribute("toilet", findToilet);
        return "redirect://home";
    }

    @GetMapping("/{id}/edit")
    public String editForm() {
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable Long id,  Toilet toilet, Model model) {
        Toilet findToilet = toiletRepository.findById(id);
        findToilet.editToilet(toilet);
        model.addAttribute("toilet", findToilet);
        return "redirect://home";
    }

    @GetMapping("")
}
