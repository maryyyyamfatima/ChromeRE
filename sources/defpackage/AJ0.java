package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AJ0 implements BJ0 {
    public static final C6492j31 f = C6492j31.k("com/google/chrome/elements/appflows/FeedNetworkRequestFlow");
    public static final TL2 g;
    public final C6622jS a;
    public final int b;
    public long c;
    public final C2800Vo0 d;
    public C1495Ln e;

    static {
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        Integer valueOf = Integer.valueOf(AbstractC2629Ug.l.b());
        C3019Xg c3019Xg = AbstractC2629Ug.m;
        c0822Gi1.b(valueOf, new C4629de3(Integer.valueOf(c3019Xg.b())));
        c0822Gi1.b(Integer.valueOf(AbstractC2629Ug.r.b()), new C4629de3(Integer.valueOf(c3019Xg.b())));
        c0822Gi1.b(Integer.valueOf(AbstractC2629Ug.p.b()), new C4629de3(Integer.valueOf(c3019Xg.b())));
        Integer valueOf2 = Integer.valueOf(c3019Xg.b());
        C3019Xg c3019Xg2 = AbstractC2629Ug.q;
        Integer valueOf3 = Integer.valueOf(c3019Xg2.b());
        C2889Wg c2889Wg = AbstractC2629Ug.o;
        c0822Gi1.b(valueOf2, AbstractC1472Li1.r(valueOf3, Integer.valueOf(c2889Wg.a())));
        Integer valueOf4 = Integer.valueOf(c3019Xg2.b());
        C3019Xg c3019Xg3 = AbstractC2629Ug.n;
        c0822Gi1.b(valueOf4, new C4629de3(Integer.valueOf(c3019Xg3.b())));
        c0822Gi1.b(Integer.valueOf(c3019Xg3.b()), new C4629de3(Integer.valueOf(c2889Wg.a())));
        g = c0822Gi1.a(true);
    }

    public AJ0(C6622jS c6622jS, int i, C2800Vo0 c2800Vo0) {
        this.a = c6622jS;
        this.b = i;
        this.d = c2800Vo0;
    }

    @Override // defpackage.BJ0
    public final void d(long j) {
        g(AbstractC2629Ug.l.a(), j);
    }

    @Override // defpackage.BJ0
    public final void c(long j) {
        g(AbstractC2629Ug.p.a(), j);
    }

    @Override // defpackage.BJ0
    public final void a(long j) {
        g(AbstractC2629Ug.r.a(), j);
    }

    @Override // defpackage.BJ0
    public final void b(long j) {
        g(AbstractC2629Ug.m.a(), j);
        this.c = j;
    }

    @Override // defpackage.BJ0
    public final void e(long j, long j2, long j3) {
        g(AbstractC2629Ug.q.a(), (this.c + j2) - j);
        g(AbstractC2629Ug.n.a(), j3);
    }

    @Override // defpackage.BJ0
    public final void f(int i, long j) {
        int a = NV.a(i);
        if (a == 0) {
            ((InterfaceC5462g31) f.e().g("com/google/chrome/elements/appflows/FeedNetworkRequestFlow", 97, "logRequestFinished", "FeedNetworkRequestFlow.java")).d(i, "Unknown network status code %d");
            a = 3;
        }
        C2369Sg c2369Sg = new C2369Sg(AbstractC2629Ug.o.a);
        c2369Sg.e = new C3242Yy2(Integer.valueOf(NV.b(a)));
        c2369Sg.f = C5785h.a;
        g(c2369Sg, j);
    }

    public final void g(C2369Sg c2369Sg, long j) {
        C1495Ln b = c2369Sg.b();
        C1495Ln c1495Ln = this.e;
        C6622jS c6622jS = this.a;
        c6622jS.getClass();
        C6622jS.a(c1495Ln, b, g);
        this.e = b;
        c2369Sg.j = j;
        c2369Sg.i = true;
        c2369Sg.c("request_id", Integer.toString(this.b));
        c6622jS.b(c2369Sg, this.d);
    }
}
