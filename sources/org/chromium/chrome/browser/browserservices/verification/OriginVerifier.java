package org.chromium.chrome.browser.browserservices.verification;

import J.N;
import android.os.SystemClock;
import defpackage.A84;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC4983eg2;
import defpackage.C1193Je2;
import defpackage.C4502dG0;
import defpackage.C7432ln3;
import defpackage.EI2;
import defpackage.InterfaceC1323Ke2;
import defpackage.O83;
import defpackage.V60;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OriginVerifier {
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public final HashMap e;
    public long f;
    public final A84 g;
    public WebContents h;

    public OriginVerifier(String str, int i, WebContents webContents, C4502dG0 c4502dG0) {
        A84 a84 = A84.a;
        this.e = new HashMap();
        this.a = str;
        ArrayList b = AbstractC4983eg2.b(V60.a.getPackageManager(), str);
        this.b = b == null ? null : (String) b.get(0);
        this.c = i;
        this.h = webContents;
        this.g = a84;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.InterfaceC1323Ke2 r15, defpackage.C1193Je2 r16) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.browserservices.verification.OriginVerifier.b(Ke2, Je2):void");
    }

    public final void onOriginVerificationResult(String str, int i) {
        C1193Je2 c = C1193Je2.c(str);
        if (i == 0) {
            EI2.h(0, 7, "BrowserServices.VerificationResult");
            a(c, true, Boolean.TRUE);
            return;
        }
        if (i == 1) {
            EI2.h(1, 7, "BrowserServices.VerificationResult");
            a(c, false, Boolean.TRUE);
            return;
        }
        int i2 = 2;
        if (i != 2) {
            return;
        }
        AbstractC4851eH1.d("OriginVerifier", "Device is offline, checking saved verification result.", new Object[0]);
        C7432ln3 c2 = C7432ln3.c();
        try {
            A84 a84 = this.g;
            String str2 = this.a;
            String str3 = this.b;
            int i3 = this.c;
            a84.getClass();
            boolean contains = A84.a().contains(str2 + "," + c + "," + i3 + "," + str3);
            if (!contains) {
                i2 = 3;
            }
            EI2.h(i2, 7, "BrowserServices.VerificationResult");
            a(c, contains, Boolean.FALSE);
            c2.close();
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void a(C1193Je2 c1193Je2, boolean z, Boolean bool) {
        int i = this.c;
        String str = this.b;
        A84 a84 = this.g;
        String str2 = this.a;
        if (z) {
            a84.getClass();
            HashSet a = A84.a();
            a.add(str2 + "," + c1193Je2 + "," + i + "," + str);
            O83.a.u("verified_digital_asset_links", a);
        }
        if (z) {
            a84.getClass();
            HashSet a2 = A84.a();
            a2.add(str2 + "," + c1193Je2 + "," + i + "," + str);
            O83.a.u("verified_digital_asset_links", a2);
        } else {
            a84.getClass();
            HashSet a3 = A84.a();
            a3.remove(str2 + "," + c1193Je2 + "," + i + "," + str);
            O83.a.u("verified_digital_asset_links", a3);
        }
        HashMap hashMap = this.e;
        if (hashMap.containsKey(c1193Je2)) {
            Iterator it = ((Set) hashMap.get(c1193Je2)).iterator();
            while (it.hasNext()) {
                ((InterfaceC1323Ke2) it.next()).a(str2, c1193Je2, z, bool);
            }
            hashMap.remove(c1193Je2);
        }
        if (bool != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f;
            if (bool.booleanValue()) {
                EI2.n(uptimeMillis, "BrowserServices.VerificationTime.Online");
            } else {
                EI2.n(uptimeMillis, "BrowserServices.VerificationTime.Offline");
            }
        }
        if (hashMap.isEmpty()) {
            long j = this.d;
            if (j == 0) {
                return;
            }
            N.MSfT_7mi(j, this);
            this.d = 0L;
        }
    }

    public static void clearBrowsingData() {
        A84 a84 = A84.a;
        Object obj = ThreadUtils.a;
        O83.a.u("verified_digital_asset_links", Collections.emptySet());
        A84.b.clear();
    }
}
