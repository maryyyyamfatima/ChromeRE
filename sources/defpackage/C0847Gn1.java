package defpackage;

import J.N;
import java.io.IOException;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0847Gn1 extends AbstractC1367Kn1 {
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ InstanceIDBridge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0847Gn1(InstanceIDBridge instanceIDBridge, String str, int i, String str2, int i2) {
        super(instanceIDBridge);
        this.f = instanceIDBridge;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = i2;
    }

    @Override // defpackage.AbstractC1367Kn1
    public final void c(Object obj) {
        InstanceIDBridge instanceIDBridge = this.f;
        N.MgpbhGOm(instanceIDBridge.b, instanceIDBridge, this.e, (String) obj);
    }

    @Override // defpackage.AbstractC1367Kn1
    public final Object a() {
        String str = this.b;
        InstanceIDBridge instanceIDBridge = this.f;
        try {
            String a = AbstractC7156kz1.a(instanceIDBridge.a, str);
            int i = this.c;
            AbstractC7156kz1.f(a, (i & 1) == 1);
            String str2 = instanceIDBridge.a + str;
            if (i != 0) {
                V60.a.getSharedPreferences("org.chromium.components.gcm_driver.subscription_flags", 0).edit().putInt(str2, i).apply();
            } else {
                V60.a.getSharedPreferences("org.chromium.components.gcm_driver.subscription_flags", 0).edit().remove(str2).apply();
            }
            return instanceIDBridge.c.b(str, this.d);
        } catch (IOException unused) {
            return "";
        }
    }
}
