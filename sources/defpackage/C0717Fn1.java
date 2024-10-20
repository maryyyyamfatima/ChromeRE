package defpackage;

import J.N;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fn1 */
/* loaded from: classes2.dex */
public final class C0717Fn1 extends AbstractC1367Kn1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ InstanceIDBridge c;

    @Override // defpackage.AbstractC1367Kn1
    public final Object a() {
        C1626Mn1 c1626Mn1 = this.c.c;
        c1626Mn1.getClass();
        return Long.valueOf(C0457Dn1.e.a(c1626Mn1.a.b).b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0717Fn1(InstanceIDBridge instanceIDBridge, int i) {
        super(instanceIDBridge);
        this.c = instanceIDBridge;
        this.b = i;
    }

    @Override // defpackage.AbstractC1367Kn1
    public final void c(Object obj) {
        InstanceIDBridge instanceIDBridge = this.c;
        N.M1_H2CVT(instanceIDBridge.b, instanceIDBridge, this.b, ((Long) obj).longValue());
    }
}
