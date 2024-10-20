package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xl */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3044Xl implements Runnable {
    public final /* synthetic */ C4329cm a;

    public /* synthetic */ RunnableC3044Xl(C4329cm c4329cm) {
        this.a = c4329cm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4329cm c4329cm = this.a;
        if (c4329cm.f) {
            C5311fd4 c5311fd4 = c4329cm.i.f.a.l;
            if (!(c5311fd4 != null && c5311fd4.k())) {
                c4329cm.f = false;
                c4329cm.h(new Cdo(2), null);
            }
        }
        c4329cm.f = false;
    }
}
