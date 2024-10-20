package defpackage;

import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1237Jn1 extends AbstractC0185Bl {
    public final /* synthetic */ AbstractC1367Kn1 h;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        if (InstanceIDBridge.d) {
            return;
        }
        AbstractC1367Kn1 abstractC1367Kn1 = this.h;
        if (abstractC1367Kn1.a.b != 0) {
            abstractC1367Kn1.c(obj);
        }
    }

    public C1237Jn1(AbstractC1367Kn1 abstractC1367Kn1) {
        this.h = abstractC1367Kn1;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        synchronized (this.h.a) {
            InstanceIDBridge instanceIDBridge = this.h.a;
            if (instanceIDBridge.c == null) {
                instanceIDBridge.c = C1626Mn1.a(instanceIDBridge.a);
            }
        }
        return this.h.a();
    }
}
