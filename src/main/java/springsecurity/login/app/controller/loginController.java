package springsecurity.login.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import springsecurity.login.app.dto.LoginDto;
import springsecurity.login.app.service.MemberService;

@Slf4j
@Controller
@RequiredArgsConstructor
public class loginController {

    private final MemberService memberService;


    @GetMapping("/login")
    public String loginForm( LoginDto loginDto) {
        return "login/loginForm";
    }

    @PostMapping("/login")
    public String login( LoginDto loginDto) {

        return memberService.login(loginDto);
    }

}
