package defpackage;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2285Rp0 {
    public static Point a(String str, Display display) {
        String str2;
        if (display.getDisplayId() == 0) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str2 = (String) cls.getMethod("get", String.class).invoke(cls, str);
            } catch (Exception unused) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    String[] split = str2.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                    throw new NumberFormatException();
                } catch (NumberFormatException unused2) {
                }
            }
        }
        return null;
    }
}
