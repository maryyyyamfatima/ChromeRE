package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: br4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4021br4 {
    public static final C4021br4 b = new C4021br4();
    public C3147Yf2 a = null;

    public static C3147Yf2 a(Context context) {
        C3147Yf2 c3147Yf2;
        C4021br4 c4021br4 = b;
        synchronized (c4021br4) {
            if (c4021br4.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                c4021br4.a = new C3147Yf2(context);
            }
            c3147Yf2 = c4021br4.a;
        }
        return c3147Yf2;
    }
}
