package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2183Qu3 {
    public static SharedPreferences e;
    public final InterfaceC10590uz3 a;
    public final C1923Ou3 b = new C1923Ou3();
    public final C1793Nu3 c;
    public final C2053Pu3 d;

    public static SharedPreferences d() {
        if (e == null) {
            e = V60.a.getSharedPreferences("tab_attribute_cache", 0);
        }
        return e;
    }

    public C2183Qu3(InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = interfaceC10590uz3;
        this.c = new C1793Nu3(interfaceC10590uz3);
        C2053Pu3 c2053Pu3 = new C2053Pu3(this);
        this.d = c2053Pu3;
        ((AbstractC11276wz3) interfaceC10590uz3).c(c2053Pu3);
    }

    public static String f(int i) {
        return i + "_title";
    }

    public static String g(int i) {
        return i + "_gurl";
    }

    public static String c(int i) {
        return i + "_rootID";
    }

    public static String e(int i) {
        return i + "_timestampMillis";
    }

    public static String b(int i) {
        return i + "_last_search_term";
    }

    public static void a(Tab tab) {
        String str;
        int i;
        if (tab.b() == null) {
            return;
        }
        int id = tab.getId();
        G12 q = tab.b().i().q();
        TemplateUrlService a = IG3.a();
        if (TextUtils.isEmpty(N.MfK2IDmL(a.c, a, tab.getUrl()))) {
            for (int i2 = q.b - 1; i2 >= 0; i2--) {
                GURL gurl = q.a(i2).c;
                TemplateUrlService a2 = IG3.a();
                String MfK2IDmL = N.MfK2IDmL(a2.c, a2, gurl);
                if (!TextUtils.isEmpty(MfK2IDmL)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    while (i3 < MfK2IDmL.length()) {
                        if (MfK2IDmL.charAt(i3) != '%' || (i = i3 + 2) >= MfK2IDmL.length()) {
                            sb.append(MfK2IDmL.charAt(i3));
                        } else if (Character.digit(MfK2IDmL.charAt(i3 + 1), 16) == -1 || Character.digit(MfK2IDmL.charAt(i), 16) == -1) {
                            sb.append(MfK2IDmL.charAt(i3));
                        } else {
                            i3 = i;
                        }
                        i3++;
                    }
                    str = sb.toString();
                    d().edit().putString(b(id), str).apply();
                }
            }
        }
        str = null;
        d().edit().putString(b(id), str).apply();
    }
}
