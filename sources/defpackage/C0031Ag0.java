package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ag0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031Ag0 {
    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (!str.substring(0, indexOf).endsWith(";base64")) {
            throw new IllegalArgumentException("Not a base64 image data URL.");
        }
        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
    }
}
