package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.util.SparseIntArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SM1 extends AbstractC1598Mh3 {
    public C7549m72 b;
    public Q83 c;
    public final SparseIntArray d = new SparseIntArray();

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        return null;
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void b() {
        this.b = new C7549m72(V60.a);
        this.c = O83.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:            if ((r2.get(r4) != r5) == false) goto L543;     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    @Override // defpackage.AbstractC1598Mh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(android.content.Intent r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SM1.e(android.content.Intent, int, int):int");
    }

    public final void h() {
        Set k = this.c.k("WebRTCNotificationIds", null);
        if (k == null) {
            return;
        }
        Iterator it = k.iterator();
        while (it.hasNext()) {
            this.b.a(Integer.parseInt((String) it.next()), "MediaCaptureNotificationService");
        }
        this.c.m("WebRTCNotificationIds");
    }

    public final void j(int i, boolean z) {
        HashSet hashSet = new HashSet(this.c.k("WebRTCNotificationIds", new HashSet()));
        if (z && !hashSet.isEmpty() && hashSet.contains(String.valueOf(i))) {
            hashSet.remove(String.valueOf(i));
        } else if (!z) {
            hashSet.add(String.valueOf(i));
        }
        this.c.u("WebRTCNotificationIds", hashSet);
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void c() {
        h();
    }

    @Override // defpackage.AbstractC1598Mh3
    public final boolean g(Intent intent) {
        h();
        return super.g(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r5, int r6, org.chromium.content_public.browser.WebContents r7, org.chromium.url.GURL r8) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L5
            goto L23
        L5:
            boolean r2 = J.N.MDk3$bjp(r7)
            if (r2 == 0) goto Ld
            r7 = 4
            goto L24
        Ld:
            boolean r2 = J.N.MybJWOXK(r7)
            boolean r7 = J.N.MKIWbnaU(r7)
            if (r2 == 0) goto L1b
            if (r7 == 0) goto L1b
            r7 = r0
            goto L24
        L1b:
            if (r2 == 0) goto L1f
            r7 = 3
            goto L24
        L1f:
            if (r7 == 0) goto L23
            r7 = 2
            goto L24
        L23:
            r7 = r1
        L24:
            if (r7 == 0) goto L27
            goto L44
        L27:
            Q83 r2 = defpackage.O83.a
            java.lang.String r3 = "WebRTCNotificationIds"
            r4 = 0
            java.util.Set r2 = r2.k(r3, r4)
            if (r2 == 0) goto L43
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L43
            java.lang.String r3 = java.lang.String.valueOf(r6)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != 0) goto L47
            return
        L47:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<org.chromium.chrome.browser.media.MediaCaptureNotificationService> r1 = org.chromium.chrome.browser.media.MediaCaptureNotificationService.class
            r0.<init>(r5, r1)
            java.lang.String r1 = "org.chromium.chrome.browser.media.SCREEN_CAPTURE_UPDATE"
            r0.setAction(r1)
            java.lang.String r1 = "NotificationId"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "NotificationMediaUrl"
            java.lang.String r8 = r8.i()
            r0.putExtra(r1, r8)
            java.lang.String r8 = "NotificationMediaType"
            r0.putExtra(r8, r7)
            DD3 r7 = defpackage.ED3.a()
            org.chromium.chrome.browser.tab.Tab r7 = r7.b(r6)
            if (r7 == 0) goto L81
            DD3 r7 = defpackage.ED3.a()
            org.chromium.chrome.browser.tab.Tab r6 = r7.b(r6)
            boolean r6 = r6.isIncognito()
            java.lang.String r7 = "NotificationIsIncognito"
            r0.putExtra(r7, r6)
        L81:
            r5.startService(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SM1.i(android.content.Context, int, org.chromium.content_public.browser.WebContents, org.chromium.url.GURL):void");
    }
}
