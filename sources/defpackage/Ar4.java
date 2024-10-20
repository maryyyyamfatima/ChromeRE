package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ar4 implements DK3 {
    public final /* synthetic */ Cr4 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ AbstractC9053qX c;
    public final /* synthetic */ C4370cs4 d;

    public Ar4(Cr4 cr4, Object obj, AbstractC9053qX abstractC9053qX, C4370cs4 c4370cs4) {
        this.a = cr4;
        this.b = obj;
        this.c = abstractC9053qX;
        this.d = c4370cs4;
    }

    @Override // defpackage.DK3, j$.util.function.Supplier
    public final Object get() {
        C11232wr4 c11232wr4 = this.a.c;
        c11232wr4.getClass();
        C4370cs4 c4370cs4 = this.d;
        AbstractC0087Ar1.e(c4370cs4, "dependencies");
        final C10889vr4 c10889vr4 = new C10889vr4(c11232wr4.h, this.b, this.c, c4370cs4);
        RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(AbstractC4575dU3.a(new InterfaceC2909Wk() { // from class: Dr4
            @Override // defpackage.InterfaceC2909Wk
            public final /* synthetic */ RD1 call() {
                return (RD1) c10889vr4.d();
            }
        }));
        c11232wr4.g.execute(runnableFutureC9399rX3);
        return runnableFutureC9399rX3;
    }
}
