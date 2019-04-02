package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CurrencyConverter  {
    @PostMapping("/convert")
    public String Convert(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response , ModelMap model) {
        float usdCurrency = Float.parseFloat(request.getParameter("txtCurrencyUSA"));
        double vndCurrency = (double) usdCurrency *230000;
        model.addAttribute("usdCurrency",usdCurrency);
        model.addAttribute("vndCurrency",vndCurrency);
        model.addAttribute("message" , "Success!");
        return "homepage";
    }



}
