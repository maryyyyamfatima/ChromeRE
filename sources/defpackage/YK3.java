package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YK3 implements Runnable {
    public final /* synthetic */ C5561gL3 a;

    public YK3(C5561gL3 c5561gL3) {
        this.a = c5561gL3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5561gL3 c5561gL3 = this.a;
        c5561gL3.a();
        while (true) {
            OI3 oi3 = (OI3) c5561gL3.h.poll();
            if (oi3 == null) {
                return;
            }
            if (!(oi3 instanceof XK3)) {
                c5561gL3.f(oi3);
            }
        }
    }
}
