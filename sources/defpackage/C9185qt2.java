package defpackage;

import java.util.Locale;
import org.chromium.base.task.PostTask;
import org.chromium.components.crash.CrashKeys;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qt2 */
/* loaded from: classes.dex */
public final class C9185qt2 {
    public static C9185qt2 b;
    public static boolean c;
    public final C0748Ft2 a;

    public static C9185qt2 a() {
        C0748Ft2 c0748Ft2;
        if (!c) {
            C9185qt2 c9185qt2 = null;
            if (!new C8842pt2(new C4374ct2(V60.a)).a(3)) {
                AbstractC4851eH1.d("PhenotypeFact", "Received no configuration for %s", "com.google.android.partnersetup");
                c0748Ft2 = null;
            } else {
                AbstractC0878Gt2.h(V60.a);
                c0748Ft2 = new C0748Ft2(null, AbstractC5405ft2.a("com.google.android.partnersetup"), "", "AdcpChromeAndroidConfig__", false, false, false, false, null);
            }
            if (c0748Ft2 != null) {
                Object obj = AbstractC0878Gt2.g;
                C0358Ct2 c0358Ct2 = new C0358Ct2(c0748Ft2, "config_id");
                if (!((String) c0358Ct2.c()).isEmpty()) {
                    c9185qt2 = new C9185qt2(c0748Ft2, c0358Ct2, new C12271zt2(c0748Ft2, "chrome_last_modified", 0L, false));
                }
            }
            b = c9185qt2;
            c = true;
        }
        return b;
    }

    public C9185qt2(C0748Ft2 c0748Ft2, C0358Ct2 c0358Ct2, C12271zt2 c12271zt2) {
        this.a = c0748Ft2;
        final String format = String.format(Locale.ENGLISH, "%.16s:%d", (String) c0358Ct2.c(), Long.valueOf(((Long) c12271zt2.c()).longValue()));
        AbstractC4851eH1.d("PhenotypeFact", "Config key: '%s'", format);
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: ot2
            @Override // java.lang.Runnable
            public final void run() {
                CrashKeys.getInstance().set(6, format);
            }
        });
    }
}
