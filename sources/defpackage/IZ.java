package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class IZ implements InterfaceC11463xZ {
    public final /* synthetic */ DK3 a;
    public final /* synthetic */ Executor b;

    public /* synthetic */ IZ(DK3 dk3, Executor executor) {
        this.a = dk3;
        this.b = executor;
    }

    @Override // defpackage.InterfaceC11463xZ
    public final void a(final C4252cZ c4252cZ) {
        DK3 dk3 = this.a;
        Executor executor = this.b;
        try {
            final RD1 rd1 = (RD1) dk3.get();
            EnumC7791mq0.e(c4252cZ, new OF(new KF() { // from class: JZ
                @Override // defpackage.KF
                public final void cancel() {
                    RD1.this.cancel(false);
                }
            }));
            LZ lz = new LZ(c4252cZ);
            int i = AbstractC4575dU3.a;
            rd1.f(new RunnableC5269fW0(rd1, new YT3(AbstractC6294iU3.g(), lz)), executor);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            Runnable runnable = new Runnable() { // from class: KZ
                @Override // java.lang.Runnable
                public final void run() {
                    ((C4252cZ) c4252cZ).b(th);
                }
            };
            int i2 = AbstractC4575dU3.a;
            executor.execute(new XT3(AbstractC6294iU3.g(), runnable));
        }
    }
}
