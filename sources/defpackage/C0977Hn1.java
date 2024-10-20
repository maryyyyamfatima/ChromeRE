package defpackage;

import J.N;
import java.io.IOException;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hn1 */
/* loaded from: classes2.dex */
public final class C0977Hn1 extends AbstractC1367Kn1 {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ InstanceIDBridge e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977Hn1(InstanceIDBridge instanceIDBridge, String str, String str2, int i) {
        super(instanceIDBridge);
        this.e = instanceIDBridge;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // defpackage.AbstractC1367Kn1
    public final void c(Object obj) {
        InstanceIDBridge instanceIDBridge = this.e;
        N.MWbugtkA(instanceIDBridge.b, instanceIDBridge, this.d, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.AbstractC1367Kn1
    public final Object a() {
        String str = this.b;
        InstanceIDBridge instanceIDBridge = this.e;
        try {
            C1626Mn1 c1626Mn1 = instanceIDBridge.c;
            String str2 = instanceIDBridge.a;
            c1626Mn1.a.b(str, this.c);
            String a = AbstractC7156kz1.a(str2, str);
            if (AbstractC7156kz1.d(a)) {
                AbstractC7156kz1.b(a);
            }
            V60.a.getSharedPreferences("org.chromium.components.gcm_driver.subscription_flags", 0).edit().remove(str2 + str).apply();
            return Boolean.TRUE;
        } catch (IOException unused) {
            return Boolean.FALSE;
        }
    }
}
