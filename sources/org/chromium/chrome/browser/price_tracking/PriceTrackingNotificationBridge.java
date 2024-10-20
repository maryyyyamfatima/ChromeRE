package org.chromium.chrome.browser.price_tracking;

import android.content.Context;
import android.text.TextUtils;
import defpackage.AbstractC2207Qz2;
import defpackage.AbstractC7157kz2;
import defpackage.C1038Hz2;
import defpackage.C10589uz2;
import defpackage.C7549m72;
import defpackage.C8395oc0;
import defpackage.C8875pz2;
import defpackage.InterfaceC6813jz2;
import defpackage.V60;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PriceTrackingNotificationBridge {
    public final C10589uz2 a;
    public final InterfaceC6813jz2 b;

    public PriceTrackingNotificationBridge(C10589uz2 c10589uz2, C8875pz2 c8875pz2) {
        this.a = c10589uz2;
        this.b = c8875pz2;
    }

    public static PriceTrackingNotificationBridge create(long j) {
        Context context = V60.a;
        return new PriceTrackingNotificationBridge(new C10589uz2(context, new C7549m72(context)), AbstractC7157kz2.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c9, code lost:            if (android.text.TextUtils.isEmpty(r10.k) == false) goto L193;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:            if (r0 == 0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:            if (r0 != 2) goto L72;     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0339  */
    /* JADX WARN: Type inference failed for: r5v1, types: [qz2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showNotification(byte[] r23) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.price_tracking.PriceTrackingNotificationBridge.showNotification(byte[]):void");
    }

    public static String a(C1038Hz2 c1038Hz2) {
        String str = c1038Hz2.k;
        long j = c1038Hz2.l;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C8395oc0 c8395oc0 = new C8395oc0(str, Locale.getDefault());
        String a = AbstractC2207Qz2.a(j, c8395oc0);
        c8395oc0.a();
        return a;
    }
}
