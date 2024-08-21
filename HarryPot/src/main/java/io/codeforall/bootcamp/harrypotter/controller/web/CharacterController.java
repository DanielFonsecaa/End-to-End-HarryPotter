package io.codeforall.bootcamp.harrypotter.controller.web;

import io.codeforall.bootcamp.harrypotter.persistence.model.Character;
import io.codeforall.bootcamp.harrypotter.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Controller responsible for rendering {@link Character} related views
 */
@Controller
@RequestMapping("/character")
public class CharacterController {

    private CharacterService characterService;

    /**
     * Sets the character service
     *
     * @param characterService the character service to set
     */
    @Autowired
    public void setCustomerService(CharacterService characterService) {
        this.characterService = characterService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/home"})
    public String home(Model model) {
        List<Character> characters = characterService.list();

        model.addAttribute("characters", characters);

        return "character/home";
    }


    /**
     * Renders a view with a list of characters
     *
     * @param model the model object
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listCharacters(Model model) {
        List<Character> characters = characterService.list();

        model.addAttribute("characters", characters);

        return "character/list";
    }

    /**
     * Renders a view with character details
     *
     * @param id    the character id
     * @param model the model object
     * @return the view to render
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showCharacter(@PathVariable Integer id, Model model) throws Exception {

        //Character character = characterService.get(id);

        // command objects for character show view
        model.addAttribute("character", characterService.get(id));

        return "character/show";
    }
}
