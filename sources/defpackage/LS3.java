package defpackage;

import J.N;
import android.content.Context;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LS3 {
    public final Context a;
    public final InterfaceC1422Ky1 b;
    public final IS3 c;
    public final Callback d;
    public final C10452uc0 e;
    public final JC f;
    public final KS3 g;
    public final QS3 h;
    public final PropertyModel i;
    public final boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public final void b() {
        boolean z = true;
        if (!(((CC) this.f).w > 0.0f) && this.k && !this.j) {
            z = false;
        }
        this.i.k(MS3.d, z);
    }

    public LS3(PropertyModel propertyModel, Context context, InterfaceC1422Ky1 interfaceC1422Ky1, Callback callback, C8385oa2 c8385oa2, FC fc, QS3 qs3, int i, boolean z) {
        this.a = context;
        this.b = interfaceC1422Ky1;
        this.d = callback;
        this.f = fc;
        this.h = qs3;
        this.i = propertyModel;
        this.j = z;
        C9897sy1 c9897sy1 = (C9897sy1) interfaceC1422Ky1;
        this.m = (c9897sy1.o() & i) > 0;
        d();
        IS3 is3 = new IS3(this, i);
        this.c = is3;
        c9897sy1.e(is3);
        Callback callback2 = new Callback() { // from class: HS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tab tab = (Tab) obj;
                LS3 ls3 = LS3.this;
                if (tab == null) {
                    ls3.getClass();
                    return;
                }
                ls3.d();
                ls3.c(tab);
                ls3.a();
            }
        };
        C10452uc0 c10452uc0 = new C10452uc0(c8385oa2, new JS3(this), callback2);
        this.e = c10452uc0;
        callback2.onResult((Tab) c8385oa2.g);
        c10452uc0.c.onResult((Tab) c8385oa2.g);
        KS3 ks3 = new KS3(this);
        this.g = ks3;
        ((CC) fc).d(ks3);
    }

    public final void c(Tab tab) {
        int g = this.h.g(tab);
        ND2 nd2 = MS3.e;
        PropertyModel propertyModel = this.i;
        propertyModel.m(nd2, g);
        propertyModel.m(MS3.f, AbstractC3494aK3.a(this.a, tab, g));
    }

    public final void a() {
        if (DeviceFormFactor.a(this.a)) {
            return;
        }
        PD2 pd2 = MS3.b;
        PropertyModel propertyModel = this.i;
        if (propertyModel.i(pd2) == null) {
            propertyModel.o(pd2, new NU());
        }
        this.d.onResult((NU) propertyModel.i(pd2));
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DisableCompositedProgressBar")) {
            return;
        }
        propertyModel.o(pd2, (NU) propertyModel.i(pd2));
    }

    public final void d() {
        LD2 ld2 = MS3.h;
        boolean z = this.j;
        PropertyModel propertyModel = this.i;
        if (z) {
            propertyModel.k(ld2, this.l && this.m);
        } else {
            propertyModel.k(ld2, !((((CC) this.f).w > 1.0f ? 1 : (((CC) this.f).w == 1.0f ? 0 : -1)) == 0) && this.m);
        }
    }
}
