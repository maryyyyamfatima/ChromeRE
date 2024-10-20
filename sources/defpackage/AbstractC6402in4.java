package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: in4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6402in4 {
    public static C4684dn4 a(C5037ep2 c5037ep2) {
        if (c5037ep2 == null) {
            return null;
        }
        C9840so2 c9840so2 = c5037ep2.c;
        return new C4684dn4(c9840so2 != null ? new C3997bn4(c9840so2.b, c9840so2.c) : null);
    }

    public static void b(Bundle bundle, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }
}
