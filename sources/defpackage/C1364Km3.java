package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.tab.Tab;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Km3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1364Km3 extends AbstractC4368cs2 {
    public static final String[] p = {"https://www.googleapis.com/auth/userinfo.email", "https://www.googleapis.com/auth/userinfo.profile"};
    public static final long q = TimeUnit.HOURS.toMillis(1);
    public C0974Hm3 o;

    @Override // defpackage.AbstractC4368cs2
    public final String i() {
        return "STPTD";
    }

    public C1364Km3(Tab tab, InterfaceC7805ms2 interfaceC7805ms2, String str) {
        super(tab, interfaceC7805ms2, str);
    }

    public C1364Km3(Tab tab, C0974Hm3 c0974Hm3) {
        super(tab, EnumC6773js2.a(C1364Km3.class, tab.isIncognito()).b(), EnumC6773js2.a(C1364Km3.class, tab.isIncognito()).a);
        this.o = c0974Hm3;
    }

    public final String o() {
        C0974Hm3 c0974Hm3 = this.o;
        if (c0974Hm3 == null) {
            return null;
        }
        int i = c0974Hm3.a;
        if (i <= 0 && c0974Hm3.b <= 0) {
            return null;
        }
        return m(i) + " - " + m(c0974Hm3.b);
    }

    @Override // defpackage.AbstractC4368cs2
    public final boolean b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return false;
        }
        try {
            C1234Jm3 c1234Jm3 = C1234Jm3.m;
            XF0 c = XF0.c();
            DV h = DV.h(byteBuffer, false);
            C1234Jm3 c1234Jm32 = new C1234Jm3();
            try {
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(c1234Jm32.getClass());
                            EV ev = h.d;
                            if (ev == null) {
                                ev = new EV(h);
                            }
                            b.e(c1234Jm32, ev, c);
                            b.b(c1234Jm32);
                            QX0.i(c1234Jm32);
                            QX0.i(c1234Jm32);
                            this.o = new C0974Hm3(c1234Jm32.k, c1234Jm32.l);
                            return true;
                        } catch (C6827k14 e) {
                            throw e.a();
                        }
                    } catch (C1127Ir1 e2) {
                        if (e2.g) {
                            throw new C1127Ir1(e2);
                        }
                        throw e2;
                    }
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e3.getCause());
                    }
                    throw e3;
                }
            } catch (IOException e4) {
                if (e4.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e4.getCause());
                }
                throw new C1127Ir1(e4);
            }
        } catch (C1127Ir1 e5) {
            AbstractC4851eH1.a("STPTD", "Error while deserializing: " + e5, new Object[0]);
            return false;
        }
    }

    public static String m(int i) {
        int i2 = i < 100 ? i + 1200 : i;
        if (i >= 1300) {
            i2 -= 1200;
        }
        boolean z = i >= 1200;
        if (i2 <= -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2));
        StringBuilder sb2 = new StringBuilder();
        if (i2 < 60) {
            sb2.append("12:");
            if (i2 < 10) {
                sb2.append("0");
            }
            sb2.append(i2);
        } else if (i2 < 1000) {
            sb2.append(sb.charAt(0));
            sb2.append(":");
            sb2.append(sb.substring(1, 3));
        } else if (i2 < 1200) {
            sb2.append(sb.substring(0, 2));
            sb2.append(":");
            sb2.append(sb.substring(2, 4));
        } else if (i2 < 1300) {
            sb2.append(sb.substring(0, 2));
            sb2.append(":");
            sb2.append(sb.substring(2, 4));
        } else {
            sb2.append(Integer.parseInt(sb.substring(0, 2)) - 12);
            sb2.append(":");
            sb2.append(sb.substring(2, 4));
        }
        if (z) {
            sb2.append(" P.M");
        } else {
            sb2.append(" A.M");
        }
        return sb2.toString();
    }

    @Override // defpackage.AbstractC4368cs2
    public final InterfaceC7876n43 g() {
        final C1104Im3 c1104Im3 = (C1104Im3) C1234Jm3.m.j();
        int i = this.o.a;
        if (c1104Im3.h) {
            c1104Im3.l();
            c1104Im3.h = false;
        }
        C1234Jm3 c1234Jm3 = (C1234Jm3) c1104Im3.g;
        c1234Jm3.j |= 1;
        c1234Jm3.k = i;
        int i2 = this.o.b;
        if (c1104Im3.h) {
            c1104Im3.l();
            c1104Im3.h = false;
        }
        C1234Jm3 c1234Jm32 = (C1234Jm3) c1104Im3.g;
        c1234Jm32.j |= 2;
        c1234Jm32.l = i2;
        return new InterfaceC7876n43() { // from class: Gm3
            @Override // defpackage.InterfaceC7876n43
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.InterfaceC7876n43
            public final ByteBuffer get() {
                String[] strArr = C1364Km3.p;
                return ((C1234Jm3) C1104Im3.this.j()).c().s();
            }
        };
    }

    @Override // defpackage.AbstractC4368cs2
    public final long h() {
        return q;
    }

    public static C0974Hm3 n(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4).optJSONObject("storeHours");
                int p2 = p(optJSONObject.optJSONArray("timeSpan").optJSONObject(0).optJSONObject("openingTime"), "openingTime");
                int p3 = p(optJSONObject.optJSONArray("timeSpan").optJSONObject(0).optJSONObject("closingTime"), "closingTime");
                int i5 = p3 - p2;
                if (i5 > i3) {
                    i2 = p3;
                    i = p2;
                    i3 = i5;
                }
            } catch (NullPointerException unused) {
            }
        }
        return new C0974Hm3(i, i2);
    }

    public static int p(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        int optInt = jSONObject.optInt("hour", -1);
        int optInt2 = jSONObject.optInt("minute", -1);
        String optString = jSONObject.optString("amPm", "missing");
        StringBuilder sb = new StringBuilder();
        if (optString.equals("PM") || (optString.equals("missing") && str.equals("closingTime"))) {
            optInt += 12;
        }
        if (optInt != -1) {
            sb.append(optInt);
        } else {
            sb.append("0");
        }
        if (optInt2 != -1) {
            if (optInt2 == 0) {
                sb.append("0");
            }
            sb.append(optInt2);
        } else {
            sb.append("00");
        }
        return Integer.parseInt(sb.toString());
    }
}
