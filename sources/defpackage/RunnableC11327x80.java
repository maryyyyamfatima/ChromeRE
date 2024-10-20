package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x80 */
/* loaded from: classes.dex */
public final class RunnableC11327x80 implements Runnable {
    public final /* synthetic */ AF3 a;
    public final /* synthetic */ C11670y80 g;

    public RunnableC11327x80(C11670y80 c11670y80, AF3 af3) {
        this.g = c11670y80;
        this.a = af3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11670y80 c11670y80 = this.g;
        try {
            AF3 af3 = (AF3) c11670y80.b.a(this.a);
            if (af3 == null) {
                c11670y80.c(new NullPointerException("Continuation returned null"));
                return;
            }
            ExecutorC9652sF3 executorC9652sF3 = AbstractC10681vF3.b;
            af3.f(executorC9652sF3, c11670y80);
            af3.d(executorC9652sF3, c11670y80);
            af3.b.a(new C0533Ec2(executorC9652sF3, c11670y80));
            af3.i();
        } catch (JR2 e) {
            if (e.getCause() instanceof Exception) {
                c11670y80.c.m((Exception) e.getCause());
            } else {
                c11670y80.c.m(e);
            }
        } catch (Exception e2) {
            c11670y80.c.m(e2);
        }
    }
}
