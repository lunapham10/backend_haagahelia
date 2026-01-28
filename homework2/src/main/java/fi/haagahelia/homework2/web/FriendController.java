package fi.haagahelia.homework2.web;

import fi.haagahelia.homework2.domain.Friend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jakarta.validation.Valid;

import org.springframework.ui.Model;

@Controller
public class FriendController {
   private List<Friend> friends = new ArrayList<>();

   @RequestMapping(
      value = {"/addnewfriend"},
      method = {RequestMethod.GET}
   )
   public String addForm(Model model) {
      model.addAttribute("friend", new Friend());
      return "form";
   }

   @RequestMapping(
      value = {"/addnewfriend"},
      method = {RequestMethod.POST}
   )
   public String addSubmit(@Valid Friend friend, BindingResult bindingResult, Model model) {
      if (bindingResult.hasErrors()) {
         return "form";
      } else {
         friends.add(friend);
         model.addAttribute("friends", friends);
         return "result";
      }
   }
}
