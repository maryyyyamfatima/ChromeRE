package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6898kE1 implements InterfaceC6554jE1 {
    public final /* synthetic */ ExecutorC4027bs4 a;

    @Override // defpackage.InterfaceC6554jE1
    public final void a() {
    }

    public C6898kE1(ExecutorC4027bs4 executorC4027bs4) {
        this.a = executorC4027bs4;
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void b(Runnable runnable, String str) {
        this.a.execute(runnable);
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void c(Runnable runnable) {
        ExecutorC4027bs4 executorC4027bs4 = this.a;
        synchronized (executorC4027bs4.a) {
            C6854k61 c6854k61 = executorC4027bs4.a;
            c6854k61.getClass();
            RV.b(0, "count");
            c6854k61.h.getClass();
            c6854k61.i += 0 - r2.b(AbstractC7198l61.b(runnable), runnable);
        }
    }
}
