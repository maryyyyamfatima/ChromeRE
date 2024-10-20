package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.tab.Tab;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Da0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391Da0 extends AbstractC4368cs2 {
    public static final String[] p = {"https://www.googleapis.com/auth/userinfo.email", "https://www.googleapis.com/auth/userinfo.profile"};
    public static final long q = TimeUnit.HOURS.toMillis(1);
    public static final C5463g32 r = new C5463g32("coupon_persisted_tab_data");
    public C0001Aa0 o;

    @Override // defpackage.AbstractC4368cs2
    public final String i() {
        return "COPTD";
    }

    public C0391Da0(Tab tab) {
        super(tab, EnumC6773js2.a(C0391Da0.class, tab.isIncognito()).b(), EnumC6773js2.a(C0391Da0.class, tab.isIncognito()).a);
    }

    @Override // defpackage.AbstractC4368cs2
    public final boolean b(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            try {
                C0261Ca0 c0261Ca0 = C0261Ca0.m;
                XF0 c = XF0.c();
                DV h = DV.h(byteBuffer, false);
                C0261Ca0 c0261Ca02 = new C0261Ca0();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c0261Ca02.getClass());
                        EV ev = h.d;
                        if (ev == null) {
                            ev = new EV(h);
                        }
                        b.e(c0261Ca02, ev, c);
                        b.b(c0261Ca02);
                        QX0.i(c0261Ca02);
                        QX0.i(c0261Ca02);
                        this.o = new C0001Aa0(c0261Ca02.k, c0261Ca02.l);
                        return true;
                    } catch (IOException e) {
                        if (e.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e.getCause());
                        }
                        throw new C1127Ir1(e);
                    } catch (RuntimeException e2) {
                        if (e2.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e2.getCause());
                        }
                        throw e2;
                    }
                } catch (C1127Ir1 e3) {
                    if (e3.g) {
                        throw new C1127Ir1(e3);
                    }
                    throw e3;
                } catch (C6827k14 e4) {
                    throw e4.a();
                }
            } catch (C1127Ir1 e5) {
                AbstractC4851eH1.a("COPTD", String.format(Locale.US, "There was a problem deserializing CouponPersistedTabData. Details: %s", e5.getMessage()), new Object[0]);
            }
        }
        return false;
    }

    public static C0001Aa0 m(JSONArray jSONArray) {
        try {
            JSONObject optJSONObject = jSONArray.optJSONObject(0).optJSONObject("freeListingDiscountInfo");
            return new C0001Aa0(optJSONObject.optString("longTitle"), optJSONObject.optString("couponCode"));
        } catch (NullPointerException e) {
            AbstractC4851eH1.a("COPTD", "Error parsing JSON: %s", e.getMessage());
            return null;
        }
    }

    @Override // defpackage.AbstractC4368cs2
    public final long h() {
        return (int) q;
    }

    @Override // defpackage.AbstractC4368cs2
    public final InterfaceC7876n43 g() {
        final C0131Ba0 c0131Ba0 = (C0131Ba0) C0261Ca0.m.j();
        C0001Aa0 c0001Aa0 = this.o;
        if (c0001Aa0 != null) {
            String str = c0001Aa0.b;
            if (str != null) {
                if (c0131Ba0.h) {
                    c0131Ba0.l();
                    c0131Ba0.h = false;
                }
                C0261Ca0 c0261Ca0 = (C0261Ca0) c0131Ba0.g;
                c0261Ca0.getClass();
                str.getClass();
                c0261Ca0.j |= 2;
                c0261Ca0.l = str;
            }
            String str2 = this.o.a;
            if (str2 != null) {
                if (c0131Ba0.h) {
                    c0131Ba0.l();
                    c0131Ba0.h = false;
                }
                C0261Ca0 c0261Ca02 = (C0261Ca0) c0131Ba0.g;
                c0261Ca02.getClass();
                str2.getClass();
                c0261Ca02.j |= 1;
                c0261Ca02.k = str2;
            }
        }
        return new InterfaceC7876n43() { // from class: wa0
            @Override // defpackage.InterfaceC7876n43
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.InterfaceC7876n43
            public final ByteBuffer get() {
                return ((C0261Ca0) C0131Ba0.this.j()).c().s();
            }
        };
    }
}
