package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class LandingController extends Controller {

    public Result index() {
        return ok(views.html.landing.render());
    }
}
