package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nV2 */
/* loaded from: classes.dex */
public final class C8016nV2 implements InterfaceC9388rV2 {
    public final C9731sV2 a;
    public boolean b;
    public Bundle c;
    public final C2958Wt3 d;

    public C8016nV2(C9731sV2 c9731sV2, InterfaceC12177zd4 interfaceC12177zd4) {
        AbstractC0087Ar1.e(c9731sV2, "savedStateRegistry");
        AbstractC0087Ar1.e(interfaceC12177zd4, "viewModelStoreOwner");
        this.a = c9731sV2;
        this.d = new C2958Wt3(new C7672mV2(interfaceC12177zd4));
    }

    @Override // defpackage.InterfaceC9388rV2
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C8360oV2) this.d.a()).h.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        X5.a(entry.getValue());
        throw null;
    }
}
