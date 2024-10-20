package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10274u40 extends IX3 {
    public final /* synthetic */ C6741jn0 a;

    public C10274u40(C6741jn0 c6741jn0) {
        this.a = c6741jn0;
    }

    @Override // defpackage.IX3
    public final void a(String str, Bundle bundle) {
        boolean equals = "consume.response".equals(str);
        C6741jn0 c6741jn0 = this.a;
        if (!equals) {
            AbstractC4851eH1.f("DigitalGoods", AbstractC4199cO1.a("Wrong callback name given: ", str, "."), new Object[0]);
            AbstractC10617v40.a(c6741jn0);
        } else if (bundle == null) {
            AbstractC4851eH1.f("DigitalGoods", "No args provided.", new Object[0]);
            AbstractC10617v40.a(c6741jn0);
        } else if (!(bundle.get("consume.responseCode") instanceof Integer)) {
            AbstractC4851eH1.f("DigitalGoods", "Poorly formed args provided.", new Object[0]);
            AbstractC10617v40.a(c6741jn0);
        } else {
            c6741jn0.a(Integer.valueOf(AbstractC2270Rm0.b(bundle.getInt("consume.responseCode"), bundle)));
        }
    }
}
