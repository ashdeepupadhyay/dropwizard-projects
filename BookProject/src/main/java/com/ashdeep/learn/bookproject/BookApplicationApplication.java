package com.ashdeep.learn.bookproject;

import com.ashdeep.learn.bookproject.controller.BookController;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BookApplicationApplication extends Application<BookApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BookApplicationApplication().run(args);
    }

    @Override
    public String getName() {
        return "BookApplication";
    }

    @Override
    public void initialize(final Bootstrap<BookApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final BookApplicationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new BookController());

    }

}
