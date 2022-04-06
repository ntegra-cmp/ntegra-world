package com.stsarabia.ntegra.tools;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;


public class WebAppTools {

    public static String getVersion() throws IOException {
        Manifest manifest = new Manifest(WebAppTools.class.getResourceAsStream("/META-INF/MANIFEST.MF"));
        Attributes attr = manifest.getMainAttributes();
        
        return attr.getValue("Ntegra-Version");
    }
}
