package tech.stabnashiamunashe.omni.models;

import java.security.SecureRandom;
import java.util.Base64;

public class APIKeyGenerator {
    private static  final SecureRandom newSecureRandom = new SecureRandom();
    private static final Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();

    public static String generateKey(){
        byte[] buffer = new byte[32];
        newSecureRandom.nextBytes(buffer);
        return encoder.encodeToString(buffer);
    }
}
