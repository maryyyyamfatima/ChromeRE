package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E {
    public final AbstractC6232iI1 a;

    public abstract InterfaceC5462g31 a(Level level);

    public E(AbstractC6232iI1 abstractC6232iI1) {
        AbstractC5203fJ.a(abstractC6232iI1, "backend");
        this.a = abstractC6232iI1;
    }

    public final InterfaceC5462g31 e() {
        return a(Level.SEVERE);
    }

    public final InterfaceC5462g31 f() {
        return a(Level.WARNING);
    }

    public final InterfaceC5462g31 d() {
        return a(Level.INFO);
    }

    public final InterfaceC5462g31 b() {
        return a(Level.FINE);
    }

    public final InterfaceC5462g31 c() {
        return a(Level.FINEST);
    }

    public final boolean g(Level level) {
        return this.a.c(level);
    }

    public static void h(String str, InterfaceC6913kH1 interfaceC6913kH1) {
        StringBuilder sb = new StringBuilder();
        AbstractC5118f31 abstractC5118f31 = (AbstractC5118f31) interfaceC6913kH1;
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(abstractC5118f31.b))));
        sb.append(": logging error [");
        OH1 oh1 = abstractC5118f31.d;
        if (oh1 != null) {
            OV1.b(oh1, sb);
            sb.append("]: ");
            sb.append(str);
            System.err.println(sb);
            System.err.flush();
            return;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }
}
