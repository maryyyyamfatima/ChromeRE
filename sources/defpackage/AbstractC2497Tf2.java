package defpackage;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2497Tf2 {
    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
