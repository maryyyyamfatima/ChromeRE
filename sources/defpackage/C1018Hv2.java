package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018Hv2 implements Callback {
    public final /* synthetic */ String a;
    public final /* synthetic */ Callback g;
    public final /* synthetic */ C1537Lv2 h;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C1018Hv2(C1537Lv2 c1537Lv2, String str, Callback callback) {
        this.h = c1537Lv2;
        this.a = str;
        this.g = callback;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Integer num = (Integer) obj;
        C1537Lv2 c1537Lv2 = this.h;
        if (((C2791Vm1) c1537Lv2.e.remove(this.a)) == null) {
            return;
        }
        this.g.onResult(num);
        if (c1537Lv2.e.isEmpty()) {
            C1537Lv2.a(c1537Lv2);
        }
    }
}
