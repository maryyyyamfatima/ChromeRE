package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import com.android.chrome.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionBridge;
import org.chromium.chrome.browser.ui.android.webid.data.Account;
import org.chromium.chrome.browser.ui.android.webid.data.ClientIdMetadata;
import org.chromium.chrome.browser.ui.android.webid.data.IdentityProviderMetadata;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c4 */
/* loaded from: classes2.dex */
public final class C4091c4 {
    public boolean a;
    public boolean b;
    public final N3 c;
    public final PropertyModel d;
    public final C7616mK1 e;
    public final ImageFetcher f;
    public final int g;
    public final QB h;
    public final M3 i;
    public EnumC6496j4 l;
    public String m;
    public String n;
    public IdentityProviderMetadata o;
    public Bitmap p;
    public ClientIdMetadata q;
    public List r;
    public Account s;
    public final Handler k = new Handler();
    public final C3404a4 t = new C3404a4(this);
    public final C3748b4 j = new C3748b4(this);

    public C4091c4(N3 n3, PropertyModel propertyModel, C7616mK1 c7616mK1, QB qb, M3 m3, ImageFetcher imageFetcher, int i) {
        this.c = n3;
        this.d = propertyModel;
        this.e = c7616mK1;
        this.f = imageFetcher;
        this.g = i;
        this.h = qb;
        this.i = m3;
    }

    public final void e() {
        Runnable runnable = (this.b || this.s == null || this.r.size() == 1) ? null : new Runnable() { // from class: U3
            @Override // java.lang.Runnable
            public final void run() {
                C4091c4 c4091c4 = C4091c4.this;
                c4091c4.s = null;
                c4091c4.d(c4091c4.m, c4091c4.n, c4091c4.r, c4091c4.o, c4091c4.q, false, AbstractC7184l4.d);
            }
        };
        M3 m3 = this.i;
        m3.h = runnable;
        m3.i.p(Boolean.valueOf(runnable != null));
    }

    public final void g(List list, boolean z, PD2 pd2) {
        View view;
        boolean z2;
        boolean z3;
        PropertyModel propertyModel;
        PropertyModel propertyModel2;
        Account account;
        C7616mK1 c7616mK1 = this.e;
        c7616mK1.clear();
        Iterator it = list.iterator();
        while (true) {
            view = null;
            if (!it.hasNext()) {
                break;
            }
            Account account2 = (Account) it.next();
            HashMap e = PropertyModel.e(AbstractC4778e4.d);
            JD2 jd2 = AbstractC4778e4.b;
            GD2 gd2 = new GD2();
            gd2.a = account2;
            e.put(jd2, gd2);
            JD2 jd22 = AbstractC4778e4.c;
            Callback callback = z ? new Callback() { // from class: Z3
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C4091c4.this.b((Account) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            } : null;
            GD2 gd22 = new GD2();
            gd22.a = callback;
            final PropertyModel a = AbstractC1996Pj1.a(e, jd22, gd22, e);
            c7616mK1.s(new C7272lK1(1, a));
            Account account3 = (Account) a.i(jd2);
            final String str = account3.c;
            String i = account3.e.i();
            boolean isEmpty = i.isEmpty();
            int i2 = this.g;
            if (isEmpty) {
                a.o(AbstractC4778e4.a, new C4435d4(i2, null, str));
            } else {
                this.f.d(C0037Ah1.a(i2, i, i2, "WebIDAccountSelection"), new Callback() { // from class: X3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        a.o(AbstractC4778e4.a, new C4435d4(C4091c4.this.g, (Bitmap) obj, str));
                    }
                });
            }
        }
        f();
        EnumC6496j4 enumC6496j4 = this.l;
        if (enumC6496j4 != EnumC6496j4.SIGN_IN || (account = this.s) == null) {
            z2 = false;
            z3 = false;
        } else {
            z2 = !account.f;
            z3 = true;
        }
        EnumC6496j4 enumC6496j42 = EnumC6496j4.AUTO_SIGN_IN;
        PD2 pd22 = AbstractC7184l4.a;
        PropertyModel propertyModel3 = this.d;
        if (enumC6496j4 == enumC6496j42) {
            HashMap e2 = PropertyModel.e(AbstractC5122f4.b);
            JD2 jd23 = AbstractC5122f4.a;
            Runnable runnable = new Runnable() { // from class: Y3
                @Override // java.lang.Runnable
                public final void run() {
                    C4091c4 c4091c4 = C4091c4.this;
                    c4091c4.a();
                    long j = ((AccountSelectionBridge) c4091c4.c).a;
                    if (j != 0) {
                        N.MAiOVOJ9(j);
                    }
                }
            };
            GD2 gd23 = new GD2();
            gd23.a = runnable;
            propertyModel3.o(pd22, AbstractC1996Pj1.a(e2, jd23, gd23, e2));
            this.k.postDelayed(new Runnable() { // from class: W3
                @Override // java.lang.Runnable
                public final void run() {
                    C4091c4 c4091c4 = C4091c4.this;
                    c4091c4.b(c4091c4.s);
                }
            }, 5000L);
        } else {
            propertyModel3.o(pd22, null);
        }
        PD2 pd23 = AbstractC7184l4.b;
        if (z3) {
            Account account4 = this.s;
            IdentityProviderMetadata identityProviderMetadata = this.o;
            HashMap e3 = PropertyModel.e(AbstractC5466g4.d);
            JD2 jd24 = AbstractC5466g4.b;
            GD2 gd24 = new GD2();
            gd24.a = identityProviderMetadata;
            e3.put(jd24, gd24);
            JD2 jd25 = AbstractC5466g4.a;
            GD2 gd25 = new GD2();
            gd25.a = account4;
            e3.put(jd25, gd25);
            JD2 jd26 = AbstractC5466g4.c;
            Callback callback2 = new Callback() { // from class: Z3
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C4091c4.this.b((Account) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            };
            GD2 gd26 = new GD2();
            gd26.a = callback2;
            propertyModel = AbstractC1996Pj1.a(e3, jd26, gd26, e3);
        } else {
            propertyModel = null;
        }
        propertyModel3.o(pd23, propertyModel);
        PD2 pd24 = AbstractC7184l4.c;
        if (z2) {
            String str2 = this.n;
            ClientIdMetadata clientIdMetadata = this.q;
            C5810h4 c5810h4 = new C5810h4();
            c5810h4.a = str2;
            c5810h4.b = clientIdMetadata.a.j();
            c5810h4.c = clientIdMetadata.b.j();
            HashMap e4 = PropertyModel.e(AbstractC6154i4.b);
            JD2 jd27 = AbstractC6154i4.a;
            GD2 gd27 = new GD2();
            gd27.a = c5810h4;
            propertyModel2 = AbstractC1996Pj1.a(e4, jd27, gd27, e4);
        } else {
            propertyModel2 = null;
        }
        propertyModel3.o(pd24, propertyModel2);
        m mVar = (m) this.h;
        M3 m3 = this.i;
        if (!mVar.p(m3, true)) {
            c(0);
        } else if (!this.a) {
            this.a = true;
            mVar.a(this.j);
            C11939yv1.g.a(this.t);
        }
        View view2 = m3.a;
        if (view2 == null) {
            return;
        }
        if (pd2 == AbstractC7184l4.d) {
            view = view2.findViewById(R.id.header_title);
        } else if (pd2 == pd23) {
            view = view2.findViewById(R.id.account_selection_continue_btn);
        }
        if (view != null) {
            view.requestFocus();
            view.sendAccessibilityEvent(8);
        }
    }

    public final void d(String str, String str2, List list, IdentityProviderMetadata identityProviderMetadata, ClientIdMetadata clientIdMetadata, boolean z, PD2 pd2) {
        this.m = str;
        this.n = str2;
        this.r = list;
        this.o = identityProviderMetadata;
        this.q = clientIdMetadata;
        Account account = this.s;
        if (account != null) {
            list = Arrays.asList(account);
        }
        this.l = z ? EnumC6496j4.AUTO_SIGN_IN : EnumC6496j4.SIGN_IN;
        g(list, this.s == null, pd2);
        e();
    }

    public final void f() {
        EnumC6496j4 enumC6496j4 = this.l;
        String str = this.m;
        String str2 = this.n;
        Runnable runnable = new Runnable() { // from class: V3
            @Override // java.lang.Runnable
            public final void run() {
                C4091c4 c4091c4 = C4091c4.this;
                c4091c4.c(1);
                EI2.b("Blink.FedCm.CloseVerifySheet.Android", c4091c4.l == EnumC6496j4.VERIFY);
            }
        };
        HashMap e = PropertyModel.e(AbstractC6840k4.f);
        JD2 jd2 = AbstractC6840k4.d;
        Bitmap bitmap = this.p;
        GD2 gd2 = new GD2();
        gd2.a = bitmap;
        e.put(jd2, gd2);
        JD2 jd22 = AbstractC6840k4.a;
        GD2 gd22 = new GD2();
        gd22.a = runnable;
        e.put(jd22, gd22);
        JD2 jd23 = AbstractC6840k4.b;
        GD2 gd23 = new GD2();
        gd23.a = str2;
        e.put(jd23, gd23);
        JD2 jd24 = AbstractC6840k4.c;
        GD2 gd24 = new GD2();
        gd24.a = str;
        e.put(jd24, gd24);
        JD2 jd25 = AbstractC6840k4.e;
        GD2 gd25 = new GD2();
        gd25.a = enumC6496j4;
        PropertyModel a = AbstractC1996Pj1.a(e, jd25, gd25, e);
        this.d.o(AbstractC7184l4.d, a);
    }

    public final void a() {
        this.b = true;
        C11939yv1.g.h(this.t);
        ((m) this.h).l(this.i, true, 0);
        e();
    }

    public final void b(Account account) {
        if (this.b) {
            return;
        }
        Account account2 = this.s;
        this.s = account;
        if (account2 != null || account.f) {
            long j = ((AccountSelectionBridge) this.c).a;
            if (j != 0) {
                N.MrAQTS0E(j, new String[]{account.a, account.b, account.c, account.d}, account.e, account.f);
            }
            this.l = EnumC6496j4.VERIFY;
            g(Arrays.asList(account), false, AbstractC7184l4.d);
            e();
            return;
        }
        d(this.m, this.n, this.r, this.o, this.q, false, AbstractC7184l4.b);
    }

    public final void c(int i) {
        a();
        long j = ((AccountSelectionBridge) this.c).a;
        if (j != 0) {
            N.MTfNRxYD(j, i);
        }
    }
}
