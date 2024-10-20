package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10641v80 implements Runnable {
    public final /* synthetic */ AF3 a;
    public final /* synthetic */ C10984w80 g;

    public RunnableC10641v80(C10984w80 c10984w80, AF3 af3) {
        this.g = c10984w80;
        this.a = af3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d) {
            AF3 af3 = this.g.c;
            synchronized (af3.a) {
                if (af3.c) {
                    return;
                }
                af3.c = true;
                af3.d = true;
                af3.b.b(af3);
                return;
            }
        }
        try {
            this.g.c.n(this.g.b.a(this.a));
        } catch (JR2 e) {
            if (e.getCause() instanceof Exception) {
                this.g.c.m((Exception) e.getCause());
            } else {
                this.g.c.m(e);
            }
        } catch (Exception e2) {
            this.g.c.m(e2);
        }
    }
}
