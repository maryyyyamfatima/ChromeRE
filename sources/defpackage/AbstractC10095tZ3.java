package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tZ3 */
/* loaded from: classes.dex */
public abstract class AbstractC10095tZ3 {
    public static final EZ3 a;
    public static final C5210fK1 b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new BZ3();
        } else if (i >= 28) {
            a = new C11810yZ3();
        } else if (i >= 26) {
            a = new C11467xZ3();
        } else {
            if (i >= 24) {
                Method method = C10781vZ3.c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    a = new C10781vZ3();
                }
            }
            a = new C10438uZ3();
        }
        b = new C5210fK1(16);
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:            if (r0.equals(r4) == false) goto L259;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r7, defpackage.ZR0 r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, defpackage.DP2 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10095tZ3.a(android.content.Context, ZR0, android.content.res.Resources, int, java.lang.String, int, int, DP2, boolean):android.graphics.Typeface");
    }
}
