package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Us0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2690Us0 {
    public Bitmap c;
    public final ArrayList a = new ArrayList();
    public final C7549m72 b = new C7549m72(V60.a);
    public final C4372ct0 d = AbstractC4029bt0.a;
    public final C11914yr0 e = new C11914yr0();

    public final void e(C6161i50 c6161i50, String str, OTRProfileID oTRProfileID, boolean z, boolean z2, Bitmap bitmap, GURL gurl, boolean z3, boolean z4, int i) {
        f(c6161i50, str, new C4266cb2(0L, null, 2), 0L, 0L, oTRProfileID, z, z2, bitmap, gurl, z3, i);
    }

    public final void f(C6161i50 c6161i50, String str, C4266cb2 c4266cb2, long j, long j2, OTRProfileID oTRProfileID, boolean z, boolean z2, Bitmap bitmap, GURL gurl, boolean z3, int i) {
        int b = b(c6161i50);
        Context context = V60.a;
        C5059et0 c5059et0 = new C5059et0();
        c5059et0.a = c6161i50;
        c5059et0.b = str;
        c5059et0.m = c4266cb2;
        c5059et0.q = j;
        c5059et0.o = j2;
        c5059et0.f = oTRProfileID;
        OTRProfileID oTRProfileID2 = OTRProfileID.b;
        c5059et0.e = oTRProfileID != null;
        c5059et0.i = z2;
        c5059et0.d = bitmap;
        c5059et0.k = gurl;
        c5059et0.l = z3;
        c5059et0.j = b;
        c5059et0.t = i;
        Notification b2 = AbstractC2430Ss0.b(context, 0, new C5403ft0(c5059et0), b);
        g(b, b2, c6161i50, new C3685at0(c6161i50, b, oTRProfileID, z, str, true, z2));
        this.e.d(0, b, b2, context);
        ArrayList arrayList = this.a;
        if (arrayList.contains(c6161i50)) {
            return;
        }
        arrayList.add(c6161i50);
    }

    public final void d(C6161i50 c6161i50, String str, boolean z, boolean z2, OTRProfileID oTRProfileID, boolean z3, Bitmap bitmap, GURL gurl, boolean z4, boolean z5, boolean z6, int i) {
        C3685at0 b = this.d.b(c6161i50);
        if (!z) {
            c(c6161i50, str, bitmap, gurl, z4, oTRProfileID, 1);
            return;
        }
        if (b == null || b.e || z6) {
            boolean z7 = b == null ? false : b.c;
            ArrayList arrayList = this.a;
            if (z2 || i != 0) {
                e(c6161i50, str, oTRProfileID, z7, z3, bitmap, gurl, z4, z5, i);
                arrayList.remove(c6161i50);
                return;
            }
            int b2 = b == null ? b(c6161i50) : b.a;
            Context context = V60.a;
            C5059et0 c5059et0 = new C5059et0();
            c5059et0.a = c6161i50;
            c5059et0.b = str;
            c5059et0.f = oTRProfileID;
            OTRProfileID oTRProfileID2 = OTRProfileID.b;
            c5059et0.e = oTRProfileID != null;
            c5059et0.i = z3;
            c5059et0.d = bitmap;
            c5059et0.k = gurl;
            c5059et0.l = z4;
            c5059et0.j = b2;
            Notification b3 = AbstractC2430Ss0.b(context, 1, new C5403ft0(c5059et0), b2);
            g(b2, b3, c6161i50, new C3685at0(c6161i50, b2, oTRProfileID, z7, str, z2, z3));
            this.e.d(1, b2, b3, context);
            arrayList.remove(c6161i50);
        }
    }

    public final void c(C6161i50 c6161i50, String str, Bitmap bitmap, GURL gurl, boolean z, OTRProfileID oTRProfileID, int i) {
        if (TextUtils.isEmpty(str)) {
            C3685at0 b = this.d.b(c6161i50);
            if (b == null) {
                return;
            } else {
                str = b.d;
            }
        }
        int b2 = b(c6161i50);
        Context context = V60.a;
        C5059et0 c5059et0 = new C5059et0();
        c5059et0.a = c6161i50;
        c5059et0.b = str;
        c5059et0.d = bitmap;
        c5059et0.f = oTRProfileID;
        OTRProfileID oTRProfileID2 = OTRProfileID.b;
        c5059et0.e = oTRProfileID != null;
        c5059et0.k = gurl;
        c5059et0.l = z;
        c5059et0.s = i;
        Notification b3 = AbstractC2430Ss0.b(context, 4, new C5403ft0(c5059et0), b2);
        g(b2, b3, c6161i50, null);
        this.e.d(4, b2, b3, context);
        this.a.remove(c6161i50);
    }

    public final void g(int i, Notification notification, C6161i50 c6161i50, C3685at0 c3685at0) {
        C7432ln3 c = C7432ln3.c();
        try {
            C7549m72 c7549m72 = this.b;
            if (notification == null) {
                c7549m72.getClass();
                AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
            } else {
                c7549m72.a.c(null, i, notification);
            }
            c.close();
            C4372ct0 c4372ct0 = this.d;
            if (!(c4372ct0.b(c6161i50) != null)) {
                U72.a.b(AbstractC8531oz1.c(c6161i50) ? 1 : 0, notification);
            }
            if (c3685at0 != null) {
                c4372ct0.a(c3685at0, false);
            } else {
                c4372ct0.c(c6161i50);
            }
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final int b(C6161i50 c6161i50) {
        C3685at0 b = this.d.b(c6161i50);
        if (b == null) {
            Q83 q83 = O83.a;
            int f = q83.f(1000000, "NextDownloadNotificationId");
            q83.q(f != Integer.MAX_VALUE ? f + 1 : 1000000, "NextDownloadNotificationId");
            return f;
        }
        return b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r12 = this;
            org.chromium.content.browser.BrowserStartupControllerImpl r0 = defpackage.RC.a()
            boolean r0 = r0.e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            org.chromium.chrome.browser.profiles.Profile r0 = org.chromium.chrome.browser.profiles.Profile.d()
            long r3 = r0.b
            boolean r0 = J.N.MrGvO7pv(r3, r0)
            if (r0 == 0) goto L1a
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            ct0 r3 = r12.d
            java.util.ArrayList r4 = r3.a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L28:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r4.next()
            at0 r5 = (defpackage.C3685at0) r5
            org.chromium.chrome.browser.profiles.OTRProfileID r6 = r5.b
            org.chromium.chrome.browser.profiles.OTRProfileID r7 = org.chromium.chrome.browser.profiles.OTRProfileID.b
            if (r6 == 0) goto L3c
            r6 = r1
            goto L3d
        L3c:
            r6 = r2
        L3d:
            if (r6 != 0) goto L40
            goto L28
        L40:
            i50 r6 = r5.f
            at0 r7 = r3.b(r6)
            r8 = 3
            if (r7 != 0) goto L4a
            goto L63
        L4a:
            android.content.Context r9 = defpackage.V60.a
            yr0 r10 = r12.e
            int r7 = r7.a
            r11 = 0
            r10.d(r8, r7, r11, r9)
            m72 r9 = r12.b
            k72 r9 = r9.a
            r9.b(r7, r11)
            r3.c(r6)
            java.util.ArrayList r7 = r12.a
            r7.remove(r6)
        L63:
            if (r0 == 0) goto L28
            boolean r7 = defpackage.AbstractC8531oz1.b(r6)
            if (r7 == 0) goto L7a
            nE r7 = defpackage.UN.a
            java.lang.String r7 = "UseDownloadOfflineContentProvider"
            boolean r7 = J.N.M09VlOh_(r7)
            if (r7 != 0) goto L7a
            org.chromium.chrome.browser.download.DownloadManagerService r7 = org.chromium.chrome.browser.download.DownloadManagerService.i()
            goto L7e
        L7a:
            Ga2 r7 = defpackage.AbstractC0913Ha2.a()
        L7e:
            java.lang.String r9 = "Android.DownloadManager.Cancel"
            defpackage.EI2.h(r2, r8, r9)
            org.chromium.chrome.browser.profiles.OTRProfileID r5 = r5.b
            r7.c(r6, r5)
            r7.g()
            goto L28
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2690Us0.a():void");
    }
}
