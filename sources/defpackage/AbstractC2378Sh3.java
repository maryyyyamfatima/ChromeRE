package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2378Sh3 {
    public static InterfaceC2248Rh3 a(Context context) {
        C4045bv4 c4045bv4;
        synchronized (AbstractC5425fw4.class) {
            if (AbstractC5425fw4.a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                AbstractC5425fw4.a = new C4045bv4(new Jw4(context));
            }
            c4045bv4 = AbstractC5425fw4.a;
        }
        return (InterfaceC2248Rh3) c4045bv4.a.a();
    }
}
