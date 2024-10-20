package defpackage;

import J.N;
import java.io.IOException;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: In1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1107In1 extends AbstractC1367Kn1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ InstanceIDBridge c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107In1(InstanceIDBridge instanceIDBridge, int i) {
        super(instanceIDBridge);
        this.c = instanceIDBridge;
        this.b = i;
    }

    @Override // defpackage.AbstractC1367Kn1
    public final void c(Object obj) {
        InstanceIDBridge instanceIDBridge = this.c;
        N.MB$4Dsst(instanceIDBridge.b, instanceIDBridge, this.b, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.AbstractC1367Kn1
    public final Object a() {
        try {
            C1626Mn1 c1626Mn1 = this.c.c;
            c1626Mn1.getClass();
            synchronized (C1626Mn1.c) {
                C1626Mn1.b.remove(c1626Mn1.a.b);
                c1626Mn1.a.a();
            }
            return Boolean.TRUE;
        } catch (IOException unused) {
            return Boolean.FALSE;
        }
    }
}
