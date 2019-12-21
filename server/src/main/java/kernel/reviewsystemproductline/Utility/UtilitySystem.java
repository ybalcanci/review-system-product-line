package kernel.reviewsystemproductline.Utility;
import kernel.reviewsystemproductline.Helpers.ReadFile;

import java.io.FileNotFoundException;

public class UtilitySystem {

    boolean hasUploadImgFeature;
    Image imageUtil;

    public UtilitySystem() {
        System.out.println("utility system is generated");

        try {
            hasUploadImgFeature = Boolean.parseBoolean(ReadFile.readFile("hasUploadImgFeature"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (hasUploadImgFeature) {
            Image imageUtil = new Image();
        }
    }
}
