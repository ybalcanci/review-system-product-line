package kernel.reviewsystemproductline.Explore.Filter;

import kernel.reviewsystemproductline.Helpers.ReadFile;
import kernel.reviewsystemproductline.Utility.Image;

import java.io.FileNotFoundException;

public class FilteringSystem {

    public boolean isHasAgeLimit() {
        return hasAgeLimit;
    }

    boolean hasAgeLimit;
    AgeLimitation ageLim;

    public FilteringSystem(String type) {
        System.out.println("filtering system is generated");

        try {
            hasAgeLimit = Boolean.parseBoolean(ReadFile.readFile(type, "hasAgeLimit"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (hasAgeLimit) {
            if (!(type.equals("hotel") || type.equals("movie")))
                hasAgeLimit = false;
            ageLim = new AgeLimitation();

        }
    }

}
