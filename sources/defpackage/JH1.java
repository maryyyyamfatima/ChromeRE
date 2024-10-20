package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JH1 implements GT {
    public static final Charset b = Charset.forName("UTF-8");
    public static final C0748Ft2 c = new C0748Ft2(null, AbstractC5405ft2.a("com.google.android.gms.clearcut.public"), "gms:playlog:service:samplingrules_", "LogSamplingRulesV2__", false, false, false, false, null);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static Boolean e = null;
    public static Long f = null;
    public final Context a;

    public JH1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext != null) {
            AbstractC0878Gt2.h(applicationContext);
        }
    }
}
