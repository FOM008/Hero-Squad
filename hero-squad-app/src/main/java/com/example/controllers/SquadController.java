package com.example.controllers;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateEngine;

import java.util.HashMap;
import java.util.Map;

import com.casualsuperman.portent.VelocityTemplateEngine;

import static spark.Spark.*;

public class SquadController {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/squads", (req, res) -> {
            // Fetch and display list of squads
            Map<String, Object> model = new HashMap<>();
            // Populate model with squad data
            return new ModelAndView(model, "squads.vm");
        }, new VelocityTemplateEngine());

        // Add more routes for handling squad operations
    }
}