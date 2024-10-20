package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dt2 */
/* loaded from: classes.dex */
public final class C0488Dt2 extends AbstractC0878Gt2 {
    public final /* synthetic */ InterfaceC0618Et2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488Dt2(InterfaceC0618Et2 interfaceC0618Et2, C0748Ft2 c0748Ft2, QX0 qx0, String str, boolean z) {
        super(c0748Ft2, str, qx0, z);
        this.k = interfaceC0618Et2;
    }

    @Override // defpackage.AbstractC0878Gt2
    public final Object b(Object obj) {
        if (obj instanceof String) {
            try {
                return this.k.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String str = this.a.d;
        String str2 = this.b;
        if (str == null || !str.isEmpty()) {
            str2 = AbstractC7848n0.a(str, str2);
        }
        Log.e("PhenotypeFlag", "Invalid byte[] value for " + str2 + ": " + String.valueOf(obj));
        return null;
    }
}
