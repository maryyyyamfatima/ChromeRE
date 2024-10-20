package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bm */
/* loaded from: classes.dex */
public final class C3986bm {
    public final /* synthetic */ CS a;
    public final /* synthetic */ C4329cm b;

    public C3986bm(C4329cm c4329cm, CS cs) {
        this.b = c4329cm;
        this.a = cs;
    }

    public final void a(C2264Rl c2264Rl) {
        BT bt = this.b.i.d;
        bt.getClass();
        CS cs = this.a;
        if (!cs.a.c) {
            ((InterfaceC5462g31) BT.e.b().g("com/google/chrome/elements/ve/ClearcutLogSender", 65, "send", "ClearcutLogSender.java")).d(1, "Dropping attention log {eventCode=%d}");
        } else {
            bt.c.execute(new RunnableC11776yT(bt, cs, 1, c2264Rl, null, 1));
        }
    }
}
