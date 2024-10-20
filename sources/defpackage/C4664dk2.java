package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.autofill.AutofillLogger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dk2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4664dk2 extends AbstractC6117hx2 implements InterfaceC1666Mv1 {
    public final Context c;
    public final C2056Pv1 d;

    public C4664dk2(Context context) {
        this.c = context;
        if (C2056Pv1.d == null) {
            C2056Pv1.d = new C2056Pv1(context);
        }
        this.d = C2056Pv1.d;
    }

    @Override // defpackage.InterfaceC1666Mv1
    public final void a(C1796Nv1 c1796Nv1) {
        C4320ck2 c4320ck2;
        String concat;
        Bundle bundle = new Bundle();
        String str = c1796Nv1.d;
        if (str != null) {
            bundle.putString("ProxyServer", str);
            bundle.putString("ProxyMode", "fixed_servers");
        }
        int i = 0;
        if (!c1796Nv1.b) {
            bundle.putBoolean("AutoFillEnabled", false);
            c4320ck2 = null;
        } else {
            c4320ck2 = new C4320ck2(this);
        }
        AutofillLogger.a = c4320ck2;
        if (!c1796Nv1.c) {
            bundle.putInt("DefaultCookiesSetting", 2);
        }
        if (!c1796Nv1.e) {
            bundle.putInt("DefaultJavaScriptSetting", 2);
        }
        if (!c1796Nv1.f) {
            bundle.putInt("DefaultPopupsSetting", 2);
        }
        if (c1796Nv1.i) {
            List<String> list = c1796Nv1.h;
            String[] strArr = new String[list.size()];
            for (String str2 : list) {
                int i2 = i + 1;
                if (str2.startsWith("http://")) {
                    str2 = str2.substring(7);
                } else if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                if (str2.startsWith("*.")) {
                    concat = str2.substring(2);
                } else {
                    concat = ".".concat(str2);
                }
                strArr[i] = concat;
                i = i2;
            }
            bundle.putStringArray("URLBlacklist", strArr);
        }
        if (c1796Nv1.a) {
            bundle.putInt("IncognitoModeAvailability", 1);
            Iterator it = this.a.f.iterator();
            while (it.hasNext()) {
                ((InterfaceC7679mX) it.next()).M();
            }
        }
        b(bundle);
    }

    @Override // defpackage.AbstractC6117hx2
    public final void c() {
        C2056Pv1 c2056Pv1 = this.d;
        c2056Pv1.getClass();
        new C1926Ov1(c2056Pv1, null, null, null).c(AbstractC0185Bl.f);
    }

    @Override // defpackage.AbstractC6117hx2
    public final void d() {
        C2056Pv1 c2056Pv1 = this.d;
        c2056Pv1.c.a(this);
        C1796Nv1 c1796Nv1 = c2056Pv1.b;
        if (c1796Nv1 != null) {
            a(c1796Nv1);
        }
    }
}
