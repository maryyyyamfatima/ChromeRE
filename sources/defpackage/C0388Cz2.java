package defpackage;

import org.chromium.chrome.browser.tasks.tab_management.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cz2 */
/* loaded from: classes.dex */
public final class C0388Cz2 extends KV1 {
    public static final int g;
    public final InterfaceC0128Az2 c;
    public final InterfaceC0258Bz2 d;
    public final InterfaceC6813jz2 e;
    public C12304zz2 f;

    static {
        g = AbstractC5177fD3.g() ? 2 : 1;
    }

    public C0388Cz2(c cVar, ZC3 zc3, C8875pz2 c8875pz2) {
        super(3);
        this.f = null;
        this.c = cVar;
        this.d = zc3;
        this.e = c8875pz2;
    }

    public final boolean e(int i, C12304zz2 c12304zz2) {
        int i2 = g;
        if (i == 0) {
            Q83 q83 = AbstractC2077Pz2.a;
            q83.q(q83.f(0, "Chrome.PriceTracking.PriceWelcomeShowCount") + 1, "Chrome.PriceTracking.PriceWelcomeShowCount");
            if (q83.f(0, "Chrome.PriceTracking.PriceWelcomeShowCount") > i2 * 10) {
                KV1.b(3, "PriceWelcomeMessageCard");
                q83.p("Chrome.PriceTracking.PriceWelcome", false);
                return false;
            }
            if (AbstractC2077Pz2.a()) {
                q83.q(q83.f(0, "Chrome.PriceTracking.PriceAlertsShowCount") - 1, "Chrome.PriceTracking.PriceAlertsShowCount");
            }
        } else if (i == 1) {
            Q83 q832 = AbstractC2077Pz2.a;
            q832.q(q832.f(0, "Chrome.PriceTracking.PriceAlertsShowCount") + 1, "Chrome.PriceTracking.PriceAlertsShowCount");
            if (q832.f(0, "Chrome.PriceTracking.PriceAlertsShowCount") > i2 * 10) {
                KV1.b(3, "PriceAlertsMessageCard");
                q832.p("Chrome.PriceTracking.PriceAlerts", false);
                return false;
            }
        }
        this.f = null;
        d();
        this.f = c12304zz2;
        c(new C11961yz2(i, c12304zz2, new TU1() { // from class: wz2
            public final /* synthetic */ int b;

            public /* synthetic */ C11275wz2(int i3) {
                r2 = i3;
            }

            @Override // defpackage.TU1
            public final void a() {
                C0388Cz2 c0388Cz2 = C0388Cz2.this;
                int i3 = r2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        c0388Cz2.getClass();
                        return;
                    }
                    C8875pz2 c8875pz2 = (C8875pz2) c0388Cz2.e;
                    if (c8875pz2.a()) {
                        c8875pz2.b();
                    } else {
                        c8875pz2.d();
                    }
                    KV1.b(1, "PriceAlertsMessageCard");
                    AbstractC2077Pz2.a.p("Chrome.PriceTracking.PriceAlerts", false);
                    FI2.a("Commerce.PriceAlertsMessageCard.Reviewed");
                    return;
                }
                int i4 = c0388Cz2.f.a;
                c cVar = (c) c0388Cz2.c;
                int G = cVar.l.G(i4);
                ZC3 zc3 = (ZC3) c0388Cz2.d;
                zc3.j.o(AbstractC1678Mx3.d, Integer.valueOf(G));
                ((C7272lK1) cVar.l.get(G)).b.k(AbstractC9627sA3.D, true);
                KV1.b(1, "PriceWelcomeMessageCard");
                AbstractC2077Pz2.a.p("Chrome.PriceTracking.PriceWelcome", false);
                c0388Cz2.f = null;
                FI2.a("Commerce.PriceWelcomeMessageCard.Reviewed");
            }
        }, new RU1() { // from class: xz2
            public final /* synthetic */ int b;

            public /* synthetic */ C11618xz2(int i3) {
                r2 = i3;
            }

            @Override // defpackage.RU1
            public final void a(int i3) {
                C0388Cz2 c0388Cz2 = C0388Cz2.this;
                int i4 = r2;
                if (i4 == 0) {
                    c0388Cz2.getClass();
                    KV1.b(2, "PriceWelcomeMessageCard");
                    AbstractC2077Pz2.a.p("Chrome.PriceTracking.PriceWelcome", false);
                    c0388Cz2.f = null;
                    FI2.a("Commerce.PriceWelcomeMessageCard.Dismissed");
                    return;
                }
                if (i4 != 1) {
                    c0388Cz2.getClass();
                    return;
                }
                c0388Cz2.getClass();
                KV1.b(2, "PriceAlertsMessageCard");
                AbstractC2077Pz2.a.p("Chrome.PriceTracking.PriceAlerts", false);
                FI2.a("Commerce.PriceAlertsMessageCard.Dismissed");
            }
        }));
        return true;
    }
}
