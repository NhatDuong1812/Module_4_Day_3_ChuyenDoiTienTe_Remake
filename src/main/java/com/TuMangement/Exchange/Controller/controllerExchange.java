package com.TuMangement.Exchange.Controller;

import com.TuMangement.Exchange.Model.Money;
import com.TuMangement.Exchange.Model.Services.IMoneyType;
import com.TuMangement.Exchange.Model.Services.MoneyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exchange")
public class controllerExchange {
    @Autowired
    private IMoneyType moneyService;
   @GetMapping
   public ModelAndView demo(){
       ModelAndView modelAndView=new ModelAndView("exchangeRate");
       //modelAndView.addObject("money",money);
       return modelAndView;
   }
   @PostMapping
    public ModelAndView demo(@ModelAttribute Money money ){
        ModelAndView modelAndView=new ModelAndView("exchangeRate");
         int money1 = moneyService.exchangeMoney();
       modelAndView.addObject("money",money1);
        return modelAndView;
    }
}
