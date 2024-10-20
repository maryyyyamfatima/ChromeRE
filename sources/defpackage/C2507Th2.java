package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Th2 */
/* loaded from: classes2.dex */
public final class C2507Th2 {
    public final PropertyModel a;
    public WebContents b;

    public C2507Th2(PropertyModel propertyModel) {
        this.a = propertyModel;
        propertyModel.o(AbstractC2897Wh2.a, new Callback() { // from class: Qh2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2507Th2 c2507Th2 = C2507Th2.this;
                double M70wUYPG = N.M70wUYPG(c2507Th2.b);
                double[] dArr = AbstractC3027Xh2.a;
                int c = AbstractC3027Xh2.c(Math.round(M70wUYPG * 100.0d) / 100.0d, true);
                if (c >= 0) {
                    ND2 nd2 = AbstractC2897Wh2.g;
                    double[] dArr2 = AbstractC3027Xh2.a;
                    c2507Th2.a.m(nd2, AbstractC3027Xh2.b(dArr2[c]));
                    N.MItN0bQy(c2507Th2.b, dArr2[c]);
                    c2507Th2.a(dArr2[c]);
                }
            }
        });
        propertyModel.o(AbstractC2897Wh2.b, new Callback() { // from class: Rh2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2507Th2 c2507Th2 = C2507Th2.this;
                double M70wUYPG = N.M70wUYPG(c2507Th2.b);
                double[] dArr = AbstractC3027Xh2.a;
                int c = AbstractC3027Xh2.c(Math.round(M70wUYPG * 100.0d) / 100.0d, false);
                double[] dArr2 = AbstractC3027Xh2.a;
                if (c <= 17) {
                    c2507Th2.a.m(AbstractC2897Wh2.g, AbstractC3027Xh2.b(dArr2[c]));
                    N.MItN0bQy(c2507Th2.b, dArr2[c]);
                    c2507Th2.a(dArr2[c]);
                }
            }
        });
        propertyModel.o(AbstractC2897Wh2.c, new Callback() { // from class: Sh2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C2507Th2 c2507Th2 = C2507Th2.this;
                N.MItN0bQy(c2507Th2.b, AbstractC3027Xh2.a(intValue));
                c2507Th2.a.m(AbstractC2897Wh2.g, intValue);
                c2507Th2.a(AbstractC3027Xh2.a(intValue));
            }
        });
        propertyModel.m(AbstractC2897Wh2.f, 475);
    }

    public final void a(double d) {
        LD2 ld2 = AbstractC2897Wh2.d;
        double[] dArr = AbstractC3027Xh2.a;
        boolean z = d > dArr[0];
        PropertyModel propertyModel = this.a;
        propertyModel.k(ld2, z);
        propertyModel.k(AbstractC2897Wh2.e, d < dArr[17]);
    }
}
