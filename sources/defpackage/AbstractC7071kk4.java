package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.ShortcutHelper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kk4 */
/* loaded from: classes2.dex */
public abstract class AbstractC7071kk4 {
    /* JADX WARN: Removed duplicated region for block: B:129:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0386  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.Mn4 b(android.content.Intent r53, java.lang.String r54, java.lang.String r55, int r56, boolean r57, boolean r58, defpackage.D63 r59, java.lang.String r60) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7071kk4.b(android.content.Intent, java.lang.String, java.lang.String, int, boolean, boolean, D63, java.lang.String):Mn4");
    }

    public static Mn4 a(Intent intent) {
        D63 d63;
        List list;
        int i;
        Uri uri;
        String w = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapk_package_name");
        if (TextUtils.isEmpty(w)) {
            return null;
        }
        boolean j = AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.webapk_force_navigation", true);
        String w2 = AbstractC2281Ro1.w(intent, "org.chromium.webapk.selected_share_target_activity_class_name");
        if (TextUtils.isEmpty(w2)) {
            d63 = null;
        } else {
            String w3 = AbstractC2281Ro1.w(intent, "android.intent.extra.SUBJECT");
            String w4 = AbstractC2281Ro1.w(intent, "android.intent.extra.TEXT");
            ArrayList c = AbstractC2281Ro1.c(intent, "android.intent.extra.STREAM");
            if (c == null && (uri = (Uri) AbstractC2281Ro1.s(intent, "android.intent.extra.STREAM")) != null) {
                c = new ArrayList();
                c.add(uri);
            }
            d63 = new D63(w3, w4, c);
        }
        String w5 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapp_url");
        int p = AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.webapp_source");
        if (p >= 17) {
            i = 0;
        } else {
            if (p == 9 && C1761No1.c(intent) == 5) {
                p = 14;
            } else if (p == 13 && d63 != null && (list = d63.c) != null && list.size() > 0) {
                p = 15;
            }
            i = p;
        }
        return b(intent, w, w5, i, j, AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.webapk.splash_provided_by_webapk", false), d63, w2);
    }

    public static Mn4 c(Intent intent, String str, String str2, Jn4 jn4, Jn4 jn42, String str3, String str4, int i, int i2, int i3, long j, long j2, int i4, boolean z, boolean z2, String str5, int i5, String str6, String str7, String str8, String str9, int i6, HashMap hashMap, Ik4 ik4, boolean z3, boolean z4, D63 d63, ArrayList arrayList, int i7) {
        if (str7 == null || str5 == null) {
            AbstractC4851eH1.a("WebApkInfo", IR0.a("Incomplete data provided: ", str7, ", ", str5), new Object[0]);
            return null;
        }
        String str10 = TextUtils.isEmpty(str) ? str7 : str;
        String b = TextUtils.isEmpty(str2) ? ShortcutHelper.b(str7) : str2;
        String str11 = TextUtils.isEmpty(str9) ? str6 : str9;
        In4 in4 = new In4(On4.b(str5), str10, b, jn4, str3, str4, i, i2, i3, j2 != 2147483648L ? Integer.valueOf((int) j2) : null, i4, false, z, z3);
        Xj4 xj4 = new Xj4(str5, jn42, z2, i5, str6, str7, str8, str11, i6, hashMap, ik4, z4, arrayList, i7);
        boolean z5 = j != 2147483648L;
        return new Mn4(intent, z5 ? (int) j : -1, z5, d63, in4, xj4);
    }
}
