package org.Frank;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) throws IOException {

        //Home Page
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //Hero page
        get("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("uniqueId", request.session().attribute("uniqueId"));
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        //Create a new hero
        post("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("heroName");
            int age = Integer.parseInt(request.queryParams("heroAge"));
            String power = request.queryParams("heroSpecialPower");
            String weakness = request.queryParams("heroWeakness");
            Hero newHero = new Hero(name, age, power, weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //creating the squad page
        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("uniqueId", request.session().attribute("uniqueId"));
            return new ModelAndView(model, "squadform.hbs");
        }, new HandlebarsTemplateEngine());




    }
}