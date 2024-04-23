package com.ashdeep.learn;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class test_project1Application extends Application<test_project1Configuration> {

    public static void main(final String[] args) throws Exception {
        new test_project1Application().run(args);
    }

    @Override
    public String getName() {
        return "test_project1";
    }

    @Override
    public void initialize(final Bootstrap<test_project1Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final test_project1Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
