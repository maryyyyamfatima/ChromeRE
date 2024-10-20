package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C53 implements Runnable {
    public final /* synthetic */ G53 a;
    public final /* synthetic */ C1634Mp g;

    public C53(G53 g53, C1634Mp c1634Mp) {
        this.a = g53;
        this.g = c1634Mp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1642Mq2 c1642Mq2 = (C1642Mq2) this.a;
        c1642Mq2.getClass();
        C1634Mp c1634Mp = this.g;
        c1634Mp.m();
        c1642Mq2.v.d(c1634Mp);
        C8545p13 c8545p13 = c1642Mq2.D;
        if (c8545p13 != null) {
            c8545p13.a(c1634Mp);
            c1642Mq2.z.o(1, c1642Mq2.D);
        }
        C40 c40 = c1642Mq2.E;
        if (c40 != null) {
            c40.f(c1634Mp);
            c1642Mq2.z.o(3, c1642Mq2.E);
        }
    }
}
