package defpackage;

import J.N;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: En1 */
/* loaded from: classes2.dex */
public final class C0587En1 extends AbstractC1367Kn1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ InstanceIDBridge c;

    @Override // defpackage.AbstractC1367Kn1
    public final Object a() {
        return C0457Dn1.d(C0457Dn1.e.a(this.c.c.a.b).a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587En1(InstanceIDBridge instanceIDBridge, int i) {
        super(instanceIDBridge);
        this.c = instanceIDBridge;
        this.b = i;
    }

    @Override // defpackage.AbstractC1367Kn1
    public final void c(Object obj) {
        InstanceIDBridge instanceIDBridge = this.c;
        N.MdjzqME2(instanceIDBridge.b, instanceIDBridge, this.b, (String) obj);
    }
}
