package org.chromium.chrome.browser.download;

import J.N;
import android.app.Activity;
import defpackage.AbstractC8828pr0;
import defpackage.C3205Yr0;
import defpackage.C6493j32;
import defpackage.EI2;
import defpackage.UD2;
import defpackage.ZX1;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadDialogBridge {
    public long a;
    public final C3205Yr0 b;
    public WindowAndroid c;
    public int d;
    public String e;

    public DownloadDialogBridge(long j, C3205Yr0 c3205Yr0) {
        this.a = j;
        this.b = c3205Yr0;
    }

    public static DownloadDialogBridge create(long j) {
        C3205Yr0 c3205Yr0 = new C3205Yr0();
        DownloadDialogBridge downloadDialogBridge = new DownloadDialogBridge(j, c3205Yr0);
        c3205Yr0.a = downloadDialogBridge;
        return downloadDialogBridge;
    }

    public void destroy() {
        this.a = 0L;
        C3205Yr0 c3205Yr0 = this.b;
        ZX1 zx1 = c3205Yr0.k;
        if (zx1 != null) {
            zx1.c(4, c3205Yr0.g);
        }
        UD2 ud2 = c3205Yr0.i;
        if (ud2 != null) {
            ud2.b();
        }
    }

    public final void showDialog(WindowAndroid windowAndroid, long j, int i, int i2, String str, boolean z, boolean z2) {
        this.c = windowAndroid;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity != null) {
            AbstractC8828pr0.a.a(new Callback(activity, i2, j, i, str, z, z2) { // from class: ir0
                public final /* synthetic */ Activity g;
                public final /* synthetic */ int h;
                public final /* synthetic */ long i;
                public final /* synthetic */ String j;
                public final /* synthetic */ boolean k;

                {
                    this.j = str;
                    this.k = z2;
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // org.chromium.base.Callback
                public final void onResult(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.util.ArrayList r14 = (java.util.ArrayList) r14
                        org.chromium.chrome.browser.download.DownloadDialogBridge r0 = org.chromium.chrome.browser.download.DownloadDialogBridge.this
                        r0.getClass()
                        if (r14 == 0) goto Lc
                        r14.size()
                    Lc:
                        android.app.Activity r1 = r13.g
                        r2 = r1
                        aY1 r2 = (defpackage.InterfaceC3562aY1) r2
                        ZX1 r2 = r2.N()
                        nE r3 = defpackage.UN.a
                        java.lang.String r3 = "SmartSuggestionForLargeDownloads"
                        boolean r3 = J.N.M09VlOh_(r3)
                        long r4 = r13.i
                        if (r3 == 0) goto L66
                        java.lang.String r3 = J.N.M4fixBWD()
                        r6 = 0
                        int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        r7 = 0
                        if (r6 > 0) goto L2d
                        goto L58
                    L2d:
                        java.util.Iterator r14 = r14.iterator()
                        r6 = r7
                    L32:
                        boolean r8 = r14.hasNext()
                        if (r8 == 0) goto L5c
                        java.lang.Object r8 = r14.next()
                        Do0 r8 = (defpackage.C0461Do0) r8
                        long r9 = r8.c
                        long r9 = r9 - r4
                        double r9 = (double) r9
                        long r11 = r8.d
                        double r11 = (double) r11
                        double r9 = r9 / r11
                        r11 = 4587366580439587226(0x3fa999999999999a, double:0.05)
                        int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                        if (r9 >= 0) goto L50
                        goto L32
                    L50:
                        java.lang.String r6 = r8.b
                        boolean r6 = r3.equals(r6)
                        if (r6 == 0) goto L5a
                    L58:
                        r6 = r7
                        goto L5c
                    L5a:
                        r6 = 1
                        goto L32
                    L5c:
                        if (r6 == 0) goto L66
                        r14 = 2
                        java.lang.String r3 = "MobileDownload.Location.Dialog.Suggestion.Events"
                        defpackage.EI2.h(r7, r14, r3)
                        r14 = 6
                        goto L68
                    L66:
                        int r14 = r13.h
                    L68:
                        org.chromium.chrome.browser.profiles.Profile r3 = org.chromium.chrome.browser.profiles.Profile.d()
                        defpackage.R44.a(r3)
                        r0.d = r14
                        java.lang.String r3 = r13.j
                        r0.e = r3
                        Yr0 r0 = r0.b
                        r0.getClass()
                        if (r1 == 0) goto L9e
                        if (r2 != 0) goto L7f
                        goto L9e
                    L7f:
                        r0.o = r1
                        r0.k = r2
                        r0.l = r4
                        r0.m = r14
                        r0.n = r3
                        boolean r14 = J.N.MGOzH4qx()
                        r0.r = r14
                        boolean r14 = r13.k
                        r0.q = r14
                        rr0 r14 = defpackage.AbstractC8828pr0.a
                        Wr0 r1 = new Wr0
                        r1.<init>()
                        r14.a(r1)
                        goto La3
                    L9e:
                        r14 = 8
                        r0.a(r14)
                    La3:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C6422ir0.onResult(java.lang.Object):void");
                }
            });
            return;
        }
        long j2 = this.a;
        if (j2 == 0) {
            return;
        }
        N.M9BtabC7(j2, this);
        WindowAndroid windowAndroid2 = this.c;
        if (windowAndroid2 != null) {
            C6493j32.V0(windowAndroid2);
            this.c = null;
        }
    }

    public final void a(String str) {
        this.e = str;
        if (this.d == 6) {
            EI2.b("MobileDownload.Location.Dialog.SuggestionSelected", !str.equals(N.M4fixBWD()));
        }
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.Molx_ess(j, this, this.e, false, -1L);
    }
}
