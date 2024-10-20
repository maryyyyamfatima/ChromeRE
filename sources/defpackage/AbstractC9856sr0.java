package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9856sr0 {
    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 6;
        }
        Integer num = str.equals("application/ogg") ? 3 : null;
        if (num != null) {
            return num.intValue();
        }
        String[] split = str.toLowerCase(Locale.ROOT).split("/");
        if (split.length != 2) {
            return 6;
        }
        if ("video".equals(split[0])) {
            return 2;
        }
        if ("audio".equals(split[0])) {
            return 3;
        }
        if ("image".equals(split[0])) {
            return 4;
        }
        return "text".equals(split[0]) ? 5 : 6;
    }
}
