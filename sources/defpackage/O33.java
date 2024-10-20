package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O33 extends PF3 implements N33 {
    public final AtomicInteger l;
    public volatile boolean m;

    public O33(QF3 qf3) {
        super(qf3, "SequencedTaskRunnerImpl", 1);
        this.l = new AtomicInteger();
    }

    @Override // defpackage.PF3
    public final void h() {
        if (this.l.getAndIncrement() == 0) {
            super.h();
        }
    }

    @Override // defpackage.PF3
    public final void g() {
        super.g();
        if (this.l.decrementAndGet() > 0) {
            if (!this.m) {
                super.h();
            } else {
                super.e();
            }
        }
    }

    @Override // defpackage.PF3
    public final void e() {
        this.m = true;
        if (this.l.getAndIncrement() == 0) {
            super.e();
        }
    }
}
