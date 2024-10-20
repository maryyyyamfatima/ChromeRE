package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6683jd2 implements Runnable {
    public final /* synthetic */ AF3 a;
    public final /* synthetic */ C7027kd2 g;

    public RunnableC6683jd2(C7027kd2 c7027kd2, AF3 af3) {
        this.g = c7027kd2;
        this.a = af3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.b) {
            InterfaceC7371ld2 interfaceC7371ld2 = this.g.c;
            if (interfaceC7371ld2 != null) {
                interfaceC7371ld2.a(this.a.k());
            }
        }
    }
}
