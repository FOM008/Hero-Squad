package com.example.controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;

import java.util.HashMap;
import java.util.Map;

import com.casualsuperman.portent.VelocityTemplateEngine;

import static spark.Spark.*;

public class HeroController {
    public static void main(String[] args) {
        staticFileLocation("/public");

        Spark.get("/heroes", (req, res) -> {
            // Fetch and display list of heroes
            Map<String, Object> model = new HashMap<>();
            // Populate model with hero data
            return new ModelAndView(model, "heroes.vm");
        }, new VelocityTemplateEngine());

        // Add more routes for handling hero operations
    }

    private static void get(String path, Object acceptType, VelocityTemplateEngine velocityTemplateEngine) {
    }
}