package defpackage;

import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PM0 extends AbstractC0185Bl {
    public final /* synthetic */ QM0 h;

    public PM0(QM0 qm0) {
        this.h = qm0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: OM0
            @Override // java.lang.Runnable
            public final void run() {
                PM0.this.h.e.onResult(1);
            }
        });
        this.h.f.k();
    }

    @Override // defpackage.AbstractC0185Bl
    public final void l() {
        this.h.d.a();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return this.h.c();
    }
}
