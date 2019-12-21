package kernel.reviewsystemproductline.Utility;
import kernel.reviewsystemproductline.Helpers.ReadFile;

import java.io.FileNotFoundException;

public class UtilitySystem {

    boolean hasUploadImgFeature;
    Image imageUtil;

    public UtilitySystem(String type) {
        System.out.println("utility system is generated");

        try {
            hasUploadImgFeature = Boolean.parseBoolean(ReadFile.readFile(type, "hasUploadImgFeature"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (hasUploadImgFeature) {
            Image imageUtil = new Image();
        }
    }
}
