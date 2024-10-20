package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SF3 implements InterfaceC7371ld2, InterfaceC2872Wc2, InterfaceC0663Fc2 {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.InterfaceC7371ld2
    public final void a(Object obj) {
        this.a.countDown();
    }

    @Override // defpackage.InterfaceC2872Wc2
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.InterfaceC0663Fc2
    public final void d() {
        this.a.countDown();
    }
}
