package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/caculator")
public class CaculatorController {
    @GetMapping("")
    public ModelAndView tc(){
        ModelAndView m = new ModelAndView("view");
        return m;
    }
    @GetMapping("/cacu")
    public ModelAndView count(){
        ModelAndView m = new ModelAndView("view");
        return m;
    }
    @PostMapping()
    public String validate (@RequestParam("count") String c, Model model, @RequestParam("1") String count,@RequestParam("2") String count1){
        int result = 0;
        if ("+".equals(c)){
            result = Integer.parseInt(count) + Integer.parseInt(count1);
        } else if ("-".equals(c)){
            result = Integer.parseInt(count) - Integer.parseInt(count1);
        }else if ("x".equals(c)){
            result = Integer.parseInt(count) * Integer.parseInt(count1);
        }else if ("/".equals(c)){
            result = Integer.parseInt(count) / Integer.parseInt(count1);
        }
        String resultt = String.valueOf(result);
        model.addAttribute("result",resultt);
        return "view";
    }
}
