package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P72 {
    public final Profile a;
    public final Context b;
    public final NotificationManager c;

    public P72(Profile profile) {
        this.a = profile;
        Context context = V60.a;
        this.b = context;
        this.c = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r14.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            int r1 = r14.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r14.size()
            int r2 = r2 * 3
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r2]
            r3 = 0
        L1c:
            int r4 = r14.size()
            if (r3 >= r4) goto L91
            java.lang.Object r4 = r14.get(r3)
            W72 r4 = (defpackage.W72) r4
            android.app.Notification r4 = r4.a
            java.lang.Object r5 = r14.get(r3)
            W72 r5 = (defpackage.W72) r5
            n72 r5 = r5.b
            java.lang.String r5 = r5.b
            r0[r3] = r5
            java.lang.String r6 = org.chromium.chrome.browser.notifications.NotificationPlatformBridge.c(r5)
            r1[r3] = r6
            int r6 = r3 * 3
            int r7 = r6 + 0
            android.graphics.drawable.Icon r8 = r4.getLargeIcon()
            android.content.Context r9 = r13.b
            r10 = 0
            r11 = 1
            if (r8 == 0) goto L5c
            int r12 = defpackage.AbstractC12192zg1.a(r8)
            if (r12 == r11) goto L51
            goto L5c
        L51:
            android.graphics.drawable.Drawable r8 = r8.loadDrawable(r9)
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r8 = r8.getBitmap()
            goto L5d
        L5c:
            r8 = r10
        L5d:
            r2[r7] = r8
            int r7 = r6 + 1
            android.graphics.drawable.Icon r8 = r4.getSmallIcon()
            if (r8 == 0) goto L78
            int r12 = defpackage.AbstractC12192zg1.a(r8)
            if (r12 == r11) goto L6e
            goto L78
        L6e:
            android.graphics.drawable.Drawable r8 = r8.loadDrawable(r9)
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r10 = r8.getBitmap()
        L78:
            r2[r7] = r10
            int r6 = r6 + 2
            android.os.Bundle r4 = r4.extras
            java.lang.String r7 = "android.picture"
            java.lang.Object r4 = r4.get(r7)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r2[r6] = r4
            android.app.NotificationManager r4 = r13.c
            r6 = -1
            r4.cancel(r5, r6)
            int r3 = r3 + 1
            goto L1c
        L91:
            org.chromium.chrome.browser.profiles.Profile r14 = r13.a
            J.N.Mj9WitTn(r14, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.P72.a(java.util.List):void");
    }
}
