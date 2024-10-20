package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FM extends AbstractC6042hl {
    public final /* synthetic */ CountDownLatch c;

    public FM(CountDownLatch countDownLatch) {
        this.c = countDownLatch;
    }

    @Override // defpackage.AbstractC6042hl
    public final void b() {
        this.c.countDown();
    }

    @Override // defpackage.AbstractC6042hl
    public final void a(C6540jB2 c6540jB2) {
        this.c.countDown();
    }
}
