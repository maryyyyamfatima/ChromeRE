package defpackage;

import android.util.LruCache;
import org.chromium.base.SysUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zh */
/* loaded from: classes.dex */
public final class C12196zh {
    public LruCache a;
    public final C11510xh b;

    public C12196zh(AbstractC11276wz3 abstractC11276wz3) {
        if (abstractC11276wz3 == null || !(!SysUtils.isLowEndDevice())) {
            return;
        }
        this.b = new C11510xh(this, abstractC11276wz3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.chromium.chrome.browser.tab.Tab r10) {
        /*
            r9 = this;
            org.chromium.url.GURL r0 = r10.getUrl()
            boolean r0 = defpackage.T34.h(r0)
            boolean r1 = org.chromium.base.SysUtils.isLowEndDevice()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r10.isIncognito()
            if (r1 != 0) goto L1b
            if (r0 == 0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r0 != 0) goto L1f
            return
        L1f:
            org.chromium.url.GURL r0 = r10.getUrl()
            java.lang.String r0 = r0.i()
            r1 = 100
            if (r0 != 0) goto L2c
            goto L52
        L2c:
            android.util.LruCache r4 = r9.a
            if (r4 != 0) goto L37
            android.util.LruCache r4 = new android.util.LruCache
            r4.<init>(r1)
            r9.a = r4
        L37:
            android.util.LruCache r4 = r9.a
            java.lang.Object r4 = r4.get(r0)
            yh r4 = (defpackage.C11853yh) r4
            if (r4 == 0) goto L52
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r4.a
            long r5 = r5 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L50
            goto L52
        L50:
            r4 = r2
            goto L53
        L52:
            r4 = r3
        L53:
            r5 = 3
            java.lang.String r6 = "CopylessPaste.CacheHit"
            if (r4 == 0) goto L82
            if (r0 != 0) goto L5b
            goto L77
        L5b:
            android.util.LruCache r10 = r9.a
            if (r10 != 0) goto L66
            android.util.LruCache r10 = new android.util.LruCache
            r10.<init>(r1)
            r9.a = r10
        L66:
            android.util.LruCache r10 = r9.a
            java.lang.Object r10 = r10.get(r0)
            yh r10 = (defpackage.C11853yh) r10
            if (r10 == 0) goto L77
            boolean r10 = r10.b
            if (r10 != 0) goto L75
            goto L77
        L75:
            r10 = r2
            goto L78
        L77:
            r10 = r3
        L78:
            if (r10 == 0) goto L7e
            defpackage.EI2.h(r3, r5, r6)
            return
        L7e:
            defpackage.EI2.h(r2, r5, r6)
            goto Lb1
        L82:
            r1 = 2
            defpackage.EI2.h(r1, r5, r6)
            org.chromium.content_public.browser.WebContents r10 = r10.b()
            if (r10 != 0) goto L8d
            goto L9a
        L8d:
            org.chromium.content_public.browser.RenderFrameHost r10 = r10.O()
            if (r10 != 0) goto L94
            goto L9a
        L94:
            boolean r1 = r10.a()
            if (r1 != 0) goto L9c
        L9a:
            r10 = 0
            goto La4
        L9c:
            Fq0 r1 = defpackage.AbstractC1640Mq0.a
            kp1 r10 = r10.e(r1)
            Eq0 r10 = (defpackage.InterfaceC0601Eq0) r10
        La4:
            if (r10 != 0) goto La7
            return
        La7:
            wh r1 = new wh
            r1.<init>()
            Kq0 r10 = (defpackage.C1381Kq0) r10
            r10.c(r1)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12196zh.a(org.chromium.chrome.browser.tab.Tab):void");
    }
}
