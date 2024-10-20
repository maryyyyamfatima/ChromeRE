package defpackage;

import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JM0 extends AbstractC0185Bl {
    public final /* synthetic */ KM0 h;

    public JM0(KM0 km0) {
        this.h = km0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        final InterfaceC7461ls2 interfaceC7461ls2 = (InterfaceC7461ls2) obj;
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: IM0
            @Override // java.lang.Runnable
            public final void run() {
                JM0.this.h.d.onResult(interfaceC7461ls2);
            }
        });
        this.h.f.k();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return this.h.c();
    }
}
