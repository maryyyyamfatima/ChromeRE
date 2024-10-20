package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nQ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7991nQ2 extends C5929hQ2 {
    public static final Uri g = Uri.parse("content://com.google.settings/partner");
    public static final Uri h = Uri.parse("content://com.google.android.partnersetup.rlzappprovider/");
    public final AtomicReference b = new AtomicReference();
    public String c;
    public String d;
    public final Uri e;
    public boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:            r9.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:            if (r9 == null) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:            if (r9 != null) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:            if (android.text.TextUtils.isEmpty(r1) == false) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:            return "";     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.net.Uri r9, java.lang.String[] r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            r0 = 0
            r1 = 0
            android.content.Context r2 = defpackage.V60.a     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r8 = 0
            r4 = r9
            r5 = r10
            r6 = r12
            r7 = r11
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r9 == 0) goto L20
            boolean r10 = r9.moveToNext()     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L43
            if (r10 == 0) goto L20
            java.lang.String r1 = r9.getString(r0)     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L43
            goto L20
        L1e:
            r10 = move-exception
            goto L28
        L20:
            if (r9 == 0) goto L39
            goto L36
        L23:
            r9 = move-exception
            goto L46
        L25:
            r9 = move-exception
            r10 = r9
            r9 = r1
        L28:
            java.lang.String r11 = "RevenueStats"
            java.lang.String r12 = "Exception while retrieving"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L43
            r2[r0] = r10     // Catch: java.lang.Throwable -> L43
            defpackage.AbstractC4851eH1.a(r11, r12, r2)     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L39
        L36:
            r9.close()
        L39:
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 == 0) goto L42
            java.lang.String r9 = ""
            return r9
        L42:
            return r1
        L43:
            r10 = move-exception
            r1 = r9
            r9 = r10
        L46:
            if (r1 == 0) goto L4b
            r1.close()
        L4b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7991nQ2.b(android.net.Uri, java.lang.String[], java.lang.String[], java.lang.String):java.lang.String");
    }

    public static String d() {
        if ((V60.a.getApplicationInfo().flags & 1) != 0) {
            return b(g, new String[]{"value"}, new String[]{"chrome_client_id"}, "name=?");
        }
        return "chrome-mobile";
    }

    @Override // defpackage.C5929hQ2
    public final void a(TabImpl tabImpl) {
        if (((V60.a.getApplicationInfo().flags & 1) != 0) && !this.f) {
            tabImpl.v(new C6959kQ2(this));
        }
    }

    public C7991nQ2() {
        if ((V60.a.getApplicationInfo().flags & 1) != 0) {
            SharedPreferences sharedPreferences = T60.a;
            String string = sharedPreferences.getString("com.google.android.apps.chrome.rlz.CHROME_CLIENT_ID", null);
            long j = -1;
            try {
                j = sharedPreferences.getLong("com.google.android.apps.chrome.rlz.CHROME_VERSION_CODE", -1L);
            } catch (ClassCastException unused) {
            }
            if (TextUtils.isEmpty(string) || j != AbstractC6547jD.a.d) {
                new C6273iQ2(this).c(AbstractC0185Bl.e);
            } else {
                c(string);
            }
            Uri withAppendedPath = Uri.withAppendedPath(h, V60.a.getResources().getString(R.string.f84660_resource_name_obfuscated_res_0x7f140966));
            this.e = withAppendedPath;
            Q83 q83 = O83.a;
            boolean e = q83.e("rlz_first_search_notified", false);
            this.f = e;
            if (!e) {
                String string2 = T60.a.getString("com.google.android.apps.chrome.rlz.RLZ_STRING", null);
                if (string2 == null) {
                    new C7303lQ2(this).c(AbstractC0185Bl.e);
                } else {
                    e(string2);
                }
            } else {
                String string3 = T60.a.getString("com.google.android.apps.chrome.rlz.RLZ_STRING", null);
                if (string3 == null) {
                    new C7647mQ2(this).c(AbstractC0185Bl.e);
                } else {
                    e(string3);
                    if (!this.f) {
                        q83.p("rlz_first_search_notified", true);
                        this.f = true;
                    }
                }
            }
            try {
                V60.a.getContentResolver().registerContentObserver(withAppendedPath, false, new C6615jQ2(this, new Handler()));
                return;
            } catch (SecurityException unused2) {
                AbstractC4851eH1.a("RevenueStats", "No content provider for %s", withAppendedPath);
                return;
            }
        }
        this.e = null;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "chrome-mobile";
        }
        this.c = str;
        if (TextUtils.isEmpty((CharSequence) this.b.get())) {
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.d)) {
                return;
            }
            this.d = str2;
            N.MplsWNeH(str2);
        }
    }

    public final void e(String str) {
        this.b.set(str);
        N.MHjlpGv0(str);
        String str2 = TextUtils.isEmpty(str) ? this.c : "";
        String str3 = str2 != null ? str2 : "";
        if (TextUtils.equals(str3, this.d)) {
            return;
        }
        this.d = str3;
        N.MplsWNeH(str3);
    }
}
