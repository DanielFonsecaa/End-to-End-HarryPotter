package io.codeforall.bootcamp.harrypotter.controller.web;

import io.codeforall.bootcamp.harrypotter.persistence.model.Spell;
import io.codeforall.bootcamp.harrypotter.services.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller responsible for rendering {@link Spell} related views
 */
@Controller
@RequestMapping("/spell")
public class SpellController {

    private SpellService spellService;

    /**
     * Sets the spell service
     *
     * @param spellService the spell service to set
     */
    @Autowired
    public void setSpellService(SpellService spellService) {
        this.spellService = spellService;
    }


    /**
     * Renders a view with a list of spells
     *
     * @param model the model object
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listSpells(Model model) {
        model.addAttribute("spells", spellService.list());
        return "spell/list";
    }

    /**
     * Renders a view with spell details
     *
     * @param id    the spell id
     * @param model the model object
     * @return the view to render
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showSpell(@PathVariable Integer id, Model model) throws Exception {


        //Spell spell = eventService.get(id);

        // command objects for spell show view
        model.addAttribute("spell", spellService.get(id));

        return "spell/show";
    }

}
