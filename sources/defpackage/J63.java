package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.regex.Pattern;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J63 {
    public final QB a;
    public final I5 b;
    public final InterfaceC0079Ap3 c;
    public final InterfaceC0079Ap3 d;
    public final InterfaceC0079Ap3 e;
    public final I63 f;
    public final boolean g;
    public long h;

    public J63(m mVar, I5 i5, C6166i6 c6166i6, C0649Ez3 c0649Ez3, C0519Dz3 c0519Dz3, I63 i63, boolean z) {
        this.a = mVar;
        this.b = i5;
        this.c = c6166i6;
        this.d = c0649Ez3;
        this.e = c0519Dz3;
        this.f = i63;
        this.g = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:            if ((r14.b != 0) == false) goto L144;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C6862k73 r22, defpackage.EP r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            long r4 = r0.h
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L16
            long r4 = java.lang.System.currentTimeMillis()
            r0.h = r4
        L16:
            QB r9 = r0.a
            I5 r10 = r0.b
            Ap3 r11 = r0.c
            F63 r13 = new F63
            r13.<init>()
            long r4 = r0.h
            boolean r8 = r0.g
            r12 = 1
            r8 = r8 ^ r12
            I63 r14 = r0.f
            r14.getClass()
            Ap3 r15 = r0.e
            java.lang.Object r14 = r15.get()
            org.chromium.chrome.browser.profiles.Profile r14 = (org.chromium.chrome.browser.profiles.Profile) r14
            r16 = 0
            r17 = r13
            if (r14 == 0) goto L46
            long r12 = r14.b
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L42
            r12 = 1
            goto L44
        L42:
            r12 = r16
        L44:
            if (r12 != 0) goto L4a
        L46:
            org.chromium.chrome.browser.profiles.Profile r14 = org.chromium.chrome.browser.profiles.Profile.d()
        L4a:
            boolean r12 = r2.b
            if (r12 == 0) goto L5e
            android.content.ComponentName r2 = defpackage.O63.f()
            if (r2 != 0) goto L56
            goto Lc6
        L56:
            r3 = 2
            defpackage.N63.d(r3)
            defpackage.O63.h(r1, r2)
            goto Lc6
        L5e:
            r12 = 9
            if (r8 == 0) goto Lbc
            boolean r8 = r2.f
            if (r8 != 0) goto Lbc
            if (r14 == 0) goto Lbc
            java.lang.String r8 = "Sharing.SharingHubAndroid.Opened"
            defpackage.EI2.h(r3, r12, r8)
            r3 = 1
            defpackage.N63.d(r3)
            Ap3 r8 = r0.d
            boolean r12 = r8.i()
            if (r12 == 0) goto L89
            java.lang.Object r8 = r8.get()
            uz3 r8 = (defpackage.InterfaceC10590uz3) r8
            wz3 r8 = (defpackage.AbstractC11276wz3) r8
            boolean r8 = r8.o()
            if (r8 == 0) goto L89
            r16 = r3
        L89:
            O73 r3 = new O73
            b83 r12 = new b83
            android.content.Context r8 = defpackage.V60.a
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            r12.<init>(r9, r8, r14)
            org.chromium.components.favicon.LargeIconBridge r13 = new org.chromium.components.favicon.LargeIconBridge
            r13.<init>(r14)
            org.chromium.chrome.browser.AppHooks r8 = org.chromium.chrome.browser.AppHooks.get()
            th1 r18 = r8.w()
            KU3 r19 = defpackage.LU3.a(r14)
            r8 = r3
            r14 = r13
            r13 = r17
            r20 = r15
            r15 = r16
            r16 = r18
            r17 = r19
            r18 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.l(r1, r2, r4)
            goto Lc6
        Lbc:
            java.lang.String r4 = "Sharing.DefaultSharesheetAndroid.Opened"
            defpackage.EI2.h(r3, r12, r4)
            boolean r2 = r2.a
            defpackage.O63.i(r1, r14, r2)
        Lc6:
            r0.h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J63.c(k73, EP, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [E63] */
    /* JADX WARN: Type inference failed for: r12v0, types: [Eb2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final int r19, final org.chromium.chrome.browser.tab.Tab r20, final boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            long r2 = java.lang.System.currentTimeMillis()
            r0.h = r2
            if (r1 != 0) goto Le
            goto Lf2
        Le:
            E63 r10 = new E63
            r2 = r19
            r3 = r21
            r10.<init>()
            Lb2 r2 = defpackage.AbstractC2217Rb2.a
            boolean r2 = r20.isInitialized()
            r3 = 0
            if (r2 != 0) goto L25
            r10.onResult(r3)
            goto Lf2
        L25:
            boolean r2 = defpackage.AbstractC2217Rb2.e(r20)
            java.lang.String r4 = "OfflinePages.SharedPageWasOffline"
            defpackage.EI2.b(r4, r2)
            r11 = 1
            r4 = 0
            java.lang.String r5 = "Unable to share current tab as an offline page."
            java.lang.String r6 = "OfflinePageUtils"
            if (r2 != 0) goto L82
            nE r2 = defpackage.UN.a
            java.lang.String r2 = "OfflinePagesLivePageSharing"
            boolean r2 = J.N.M09VlOh_(r2)
            if (r2 == 0) goto L7d
            Lb2 r2 = defpackage.AbstractC2217Rb2.a()
            org.chromium.content_public.browser.WebContents r7 = r20.b()
            org.chromium.chrome.browser.profiles.Profile r7 = org.chromium.chrome.browser.profiles.Profile.b(r7)
            r2.getClass()
            org.chromium.chrome.browser.offlinepages.OfflinePageBridge r14 = org.chromium.chrome.browser.offlinepages.OfflinePageBridge.a(r7)
            if (r14 != 0) goto L5b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            defpackage.AbstractC4851eH1.a(r6, r5, r1)
            goto L61
        L5b:
            org.chromium.content_public.browser.WebContents r2 = r20.b()
            if (r2 != 0) goto L63
        L61:
            r11 = r4
            goto L76
        L63:
            OY0 r2 = new OY0
            r2.<init>(r1, r10, r14)
            java.lang.String r16 = "live_page_sharing"
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            long r12 = r14.a
            r17 = r2
            J.N.MJ$y30Dy(r12, r14, r15, r16, r17)
        L76:
            if (r11 != 0) goto Lf2
            r10.onResult(r3)
            goto Lf2
        L7d:
            r10.onResult(r3)
            goto Lf2
        L82:
            Lb2 r2 = defpackage.AbstractC2217Rb2.a()
            org.chromium.content_public.browser.WebContents r7 = r20.b()
            org.chromium.chrome.browser.profiles.Profile r7 = org.chromium.chrome.browser.profiles.Profile.b(r7)
            r2.getClass()
            org.chromium.chrome.browser.offlinepages.OfflinePageBridge r7 = org.chromium.chrome.browser.offlinepages.OfflinePageBridge.a(r7)
            if (r7 != 0) goto La0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            defpackage.AbstractC4851eH1.a(r6, r5, r1)
            r10.onResult(r3)
            goto Lf2
        La0:
            org.chromium.content_public.browser.WebContents r6 = r20.b()
            if (r6 != 0) goto Laa
            r10.onResult(r3)
            goto Lf2
        Laa:
            long r4 = r7.a
            java.lang.Object r2 = J.N.MzjNdQag(r4, r7, r6)
            org.chromium.chrome.browser.offlinepages.OfflinePageItem r2 = (org.chromium.chrome.browser.offlinepages.OfflinePageItem) r2
            if (r2 != 0) goto Lb8
            r10.onResult(r3)
            goto Lf2
        Lb8:
            org.chromium.chrome.browser.offlinepages.ClientId r3 = r2.c
            java.lang.String r3 = r3.a
            long r4 = r7.a
            boolean r3 = J.N.MB5pa3Na(r4, r7, r3)
            java.lang.String r5 = r20.getTitle()
            org.chromium.url.GURL r1 = r20.getUrl()
            java.lang.String r1 = r1.i()
            Eb2 r12 = new Eb2
            r4 = r12
            r8 = r2
            r9 = r3
            r4.<init>()
            if (r3 == 0) goto Leb
            java.lang.String r2 = r2.e
            int r3 = r2.length()
            if (r3 <= r11) goto Leb
            QF3 r3 = defpackage.QF3.j
            Gb2 r4 = new Gb2
            r4.<init>()
            org.chromium.base.task.PostTask.c(r3, r4)
            goto Lf2
        Leb:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r12.onResult(r1)
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J63.b(int, org.chromium.chrome.browser.tab.Tab, boolean):void");
    }

    public final void d(WindowAndroid windowAndroid, WebContents webContents, String str, GURL gurl, GURL gurl2, int i, boolean z) {
        String i2;
        if (gurl2 == null || gurl2.k()) {
            i2 = gurl.i();
        } else if (!"https".equals(gurl.h())) {
            i2 = gurl.i();
        } else {
            Pattern pattern = T34.a;
            if (!T34.l(gurl2.h())) {
                i2 = gurl.i();
            } else {
                i2 = gurl2.i();
            }
        }
        if (!TextUtils.isEmpty(i2) && !TextUtils.isEmpty(i2)) {
            i2 = ((GURL) N.M1WDPiaY(i2)).i();
        }
        c(new C6862k73(windowAndroid, str, null, null, i2, null, null, null, null, null, null, null, null, null), new EP(!z, z, true, null, null, false, false, false, null, 0), i);
        if (webContents == null || webContents.isDestroyed()) {
            return;
        }
        N.MKWAPOgN(webContents);
    }

    public static void a(GURL gurl, GURL gurl2) {
        int i;
        if (!"https".equals(gurl.h())) {
            i = 0;
        } else if (gurl2 == null || gurl2.k()) {
            i = 2;
        } else {
            String h = gurl2.h();
            if (!"https".equals(h)) {
                i = !"http".equals(h) ? 3 : 6;
            } else {
                i = gurl.equals(gurl2) ? 5 : 4;
            }
        }
        EI2.h(i, 7, "Mobile.CanonicalURLResult");
    }
}
