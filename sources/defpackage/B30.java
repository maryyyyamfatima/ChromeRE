package defpackage;

import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class B30 implements Runnable {
    public final ZN a;
    public int g;
    public final String h = "Icing";

    public void a() {
    }

    public void b() {
    }

    public abstract void c(ZN zn);

    public abstract void d(Runnable runnable, long j);

    public B30(ZN zn) {
        this.a = zn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ZN zn = this.a;
        StringBuilder sb = new StringBuilder("GCore:");
        String str = this.h;
        sb.append(str);
        sb.append(":run");
        TraceEvent.b(sb.toString(), null);
        try {
            if (((AbstractC3510aO) zn).a()) {
                try {
                    c(zn);
                    ((AbstractC3510aO) zn).b.e();
                    a();
                } catch (Throwable th) {
                    ((AbstractC3510aO) zn).b.e();
                    a();
                    throw th;
                }
            }
            int i = this.g + 1;
            this.g = i;
            if (i < 5) {
                AbstractC3510aO abstractC3510aO = (AbstractC3510aO) zn;
                abstractC3510aO.getClass();
                TraceEvent.b("ChromeGoogleApiClientImpl:isGooglePlayServicesAvailable", null);
                try {
                    abstractC3510aO.c.getClass();
                    if (C4502dG0.b()) {
                        d(this, 10000L);
                    }
                } finally {
                    TraceEvent.c("ChromeGoogleApiClientImpl:isGooglePlayServicesAvailable");
                }
            }
            b();
            a();
        } finally {
            TraceEvent.c("GCore:" + str + ":run");
        }
    }
}
