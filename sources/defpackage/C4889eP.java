package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.components.payments.PayerData;
import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eP */
/* loaded from: classes.dex */
public final class C4889eP implements PersonalDataManager.NormalizedAddressRequestDelegate, InterfaceC11910yq2 {
    public final C7446lq a;
    public final PaymentApp g;
    public final C7787mp2 h;
    public final C10881vq2 i;
    public final C1634Mp j;
    public InterfaceC11567xq2 k;
    public boolean l;
    public boolean m = true;
    public PayerData n;

    public C4889eP(C4733dw0 c4733dw0, C4733dw0 c4733dw02, C7446lq c7446lq, PaymentApp paymentApp, C7787mp2 c7787mp2) {
        C10881vq2 c10881vq2 = new C10881vq2(0);
        this.i = c10881vq2;
        c10881vq2.f = new C4001bo2(0);
        this.g = paymentApp;
        this.h = c7787mp2;
        this.a = c7446lq;
        if (c7787mp2.e && !paymentApp.u()) {
            c10881vq2.e = c4733dw02.l;
        }
        if (!c7787mp2.e || paymentApp.u()) {
            return;
        }
        C1634Mp c1634Mp = (C1634Mp) c4733dw0;
        this.j = c1634Mp;
        PersonalDataManager d = PersonalDataManager.d();
        String guid = c1634Mp.q.getGUID();
        d.getClass();
        Object obj = ThreadUtils.a;
        N.MT65YYp8(d.a, d, guid);
        c10881vq2.d = c1634Mp.n();
        this.l = true;
        PersonalDataManager d2 = PersonalDataManager.d();
        PersonalDataManager.AutofillProfile autofillProfile = c1634Mp.q;
        d2.getClass();
        N.M7ysHTTC(d2.a, d2, autofillProfile, 5, this);
    }

    @Override // defpackage.InterfaceC11910yq2
    public final void a(String str, String str2, PayerData payerData, InterfaceC11567xq2 interfaceC11567xq2) {
        this.k = interfaceC11567xq2;
        C10881vq2 c10881vq2 = this.i;
        c10881vq2.b = str;
        c10881vq2.c = str2;
        this.n = payerData;
        this.m = false;
        if (this.l) {
            return;
        }
        b();
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.NormalizedAddressRequestDelegate
    public final void onAddressNormalized(PersonalDataManager.AutofillProfile autofillProfile) {
        if (this.l) {
            this.l = false;
            if (autofillProfile != null) {
                C1634Mp c1634Mp = this.j;
                c1634Mp.o(autofillProfile);
                this.i.d = c1634Mp.n();
            }
            if (this.m) {
                return;
            }
            b();
        }
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.NormalizedAddressRequestDelegate
    public final void onCouldNotNormalize(PersonalDataManager.AutofillProfile autofillProfile) {
        onAddressNormalized(autofillProfile);
    }

    public final void b() {
        C7787mp2 c7787mp2 = this.h;
        boolean z = c7787mp2.e;
        PaymentApp paymentApp = this.g;
        C10881vq2 c10881vq2 = this.i;
        if (z && paymentApp.u()) {
            c10881vq2.d = AbstractC5031eo2.a(this.n.d);
            c10881vq2.e = this.n.e;
        }
        boolean z2 = c7787mp2.b;
        C7446lq c7446lq = this.a;
        if (z2) {
            if (paymentApp.s()) {
                c10881vq2.f.c = this.n.a;
            } else {
                c10881vq2.f.c = c7446lq.v;
            }
        }
        if (c7787mp2.d) {
            if (paymentApp.t()) {
                c10881vq2.f.d = this.n.b;
            } else {
                c10881vq2.f.d = c7446lq.w;
            }
        }
        if (c7787mp2.c) {
            if (paymentApp.r()) {
                c10881vq2.f.b = this.n.c;
            } else {
                c10881vq2.f.b = c7446lq.x;
            }
        }
        C4001bo2 c4001bo2 = c10881vq2.f;
        String str = c4001bo2.d;
        if (str != null) {
            c4001bo2.d = N.MntwGN0J(str);
        }
        ((C2287Rp2) this.k).p(c10881vq2);
    }
}
