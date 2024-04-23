package com.ashdeep.test_project_artifact;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class test_projectApplication extends Application<test_projectConfiguration> {

    public static void main(final String[] args) throws Exception {
        new test_projectApplication().run(args);
    }

    @Override
    public String getName() {
        return "test_project";
    }

    @Override
    public void initialize(final Bootstrap<test_projectConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final test_projectConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
