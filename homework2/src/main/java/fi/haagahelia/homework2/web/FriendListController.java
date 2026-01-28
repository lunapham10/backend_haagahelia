package fi.haagahelia.homework2.web;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.homework2.domain.Friend;
@Controller
public class FriendListController {
    @RequestMapping(value = "/friendlist")
    public String listFriends(Model model) {
        List<Friend> friendList = new ArrayList<>();

        Friend friend1 = new Friend();
        friend1.setFirstName("Minna");
        friend1.setLastName("Pellikka");
        friendList.add(friend1);

        Friend friend2 = new Friend();
        friend2.setFirstName("Tanja");
        friend2.setLastName("Bergius");
        friendList.add(friend2);

        Friend friend3 = new Friend();
        friend3.setFirstName("Jukka");
        friend3.setLastName("Juslin");
        friendList.add(friend3);

        model.addAttribute("friends", friendList);
        return "friendlist";
    }
}
