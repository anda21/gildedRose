package com.test.gildedRose.controllers;

import com.test.gildedRose.models.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class WebController {
    @Autowired
    private ItemControllor itemControllor;

    @RequestMapping("")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test",itemControllor.getAllItems());
        modelAndView.setViewName("index");
        return modelAndView;
    }
    /*
     * Update a survey request
     */
    @PostMapping("")
    public ModelAndView updateItem(@ModelAttribute ItemModel itemModel) {
        ModelAndView modelAndView = index();
        modelAndView.addObject("itemModel",itemControllor.update());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
