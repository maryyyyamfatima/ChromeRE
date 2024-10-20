package defpackage;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ry, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9552ry {
    public static String a(Bitmap bitmap) {
        if (bitmap == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}
