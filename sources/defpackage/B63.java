package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B63 implements XX1 {
    public final /* synthetic */ C63 a;

    @Override // defpackage.XX1
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.XX1
    public final void b() {
        C63 c63 = this.a;
        C8610pD c8610pD = c63.k;
        c8610pD.b = true;
        c63.a(c8610pD.a);
    }

    @Override // defpackage.XX1
    public final void d(PropertyModel propertyModel) {
        C63 c63 = this.a;
        C8610pD c8610pD = c63.k;
        c8610pD.b = false;
        c63.a(c8610pD.a);
    }

    public B63(C63 c63) {
        this.a = c63;
    }
}
