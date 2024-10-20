package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A70 implements Runnable {
    public final /* synthetic */ C70 a;

    public A70(C70 c70) {
        this.a = c70;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70 c70 = this.a;
        Q70 q70 = c70.a.v;
        if (q70 != null) {
            q70.A();
        }
        c70.a.u.b(5);
    }
}
