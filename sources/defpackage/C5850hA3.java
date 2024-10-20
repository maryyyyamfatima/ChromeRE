package defpackage;

import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hA3 */
/* loaded from: classes.dex */
public final class C5850hA3 implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ C9284rA3 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C5850hA3(C9284rA3 c9284rA3, int i) {
        this.g = c9284rA3;
        this.a = i;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        List list = (List) obj;
        String q = OD3.q(this.a);
        C9284rA3 c9284rA3 = this.g;
        c9284rA3.d(q, true);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            c9284rA3.d((String) list.get(i), true);
        }
    }
}
