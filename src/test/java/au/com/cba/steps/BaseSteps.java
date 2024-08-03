package au.com.cba.steps;

import au.com.cba.util.PropertyLoader;

public class BaseSteps {

    public BaseSteps()
    {
        prop = new PropertyLoader();
    }
    public static PropertyLoader prop;
}
