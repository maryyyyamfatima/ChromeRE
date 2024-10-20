package org.chromium.chrome.browser.tab;

import J.N;
import android.graphics.Bitmap;
import com.android.chrome.R;
import defpackage.CD3;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabFavicon extends CD3 {
    public final TabImpl g;
    public final long h;
    public final int i;
    public Bitmap j;
    public int k;
    public int l;
    public GURL m;

    public static Bitmap e(Tab tab) {
        Bitmap bitmap;
        GURL gurl;
        TabFavicon tabFavicon = (tab == null || !tab.isInitialized()) ? null : (TabFavicon) tab.F().b(TabFavicon.class);
        if (tabFavicon == null) {
            return null;
        }
        TabImpl tabImpl = tabFavicon.g;
        if (tabImpl.isNativePage() || tabImpl.l == null) {
            return null;
        }
        if (tabFavicon.j == null || (gurl = tabFavicon.m) == null || !gurl.equals(tabImpl.getUrl())) {
            bitmap = (Bitmap) N.MmmF426r(tabFavicon.h, tabFavicon);
        } else {
            bitmap = tabFavicon.j;
        }
        return bitmap;
    }

    public TabFavicon(Tab tab) {
        super(tab);
        TabImpl tabImpl = (TabImpl) tab;
        this.g = tabImpl;
        this.i = tabImpl.i.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08017a);
        this.h = N.MMZhE4x7(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:            if (r7 != false) goto L209;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFaviconAvailable(android.graphics.Bitmap r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            org.chromium.chrome.browser.tab.TabImpl r0 = r10.g
            org.chromium.url.GURL r1 = r0.getUrl()
            org.chromium.url.GURL r2 = r10.m
            boolean r2 = r1.equals(r2)
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = "AndroidScrollOptimizations"
            int r5 = r10.i
            if (r2 != 0) goto L48
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            r7 = 0
            if (r2 != r5) goto L26
            if (r6 != r5) goto L26
            r8 = r3
            goto L27
        L26:
            r8 = r7
        L27:
            if (r8 == 0) goto L2a
            goto L45
        L2a:
            int r8 = r10.k
            int r9 = r10.l
            if (r8 == r9) goto L33
            if (r2 != r6) goto L33
            goto L45
        L33:
            if (r8 != r9) goto L38
            if (r2 == r6) goto L38
            goto L46
        L38:
            if (r8 < r5) goto L3d
            if (r9 < r5) goto L3d
            goto L46
        L3d:
            if (r2 <= r8) goto L41
            if (r6 >= r9) goto L45
        L41:
            if (r2 < r8) goto L46
            if (r6 <= r9) goto L46
        L45:
            r7 = r3
        L46:
            if (r7 == 0) goto L78
        L48:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r11, r5, r5, r3)
            r10.j = r2
            int r2 = r11.getWidth()
            r10.k = r2
            int r2 = r11.getHeight()
            r10.l = r2
            r10.m = r1
            nE r1 = defpackage.UN.a
            boolean r1 = J.N.M09VlOh_(r4)
            if (r1 == 0) goto L78
            ya2 r1 = r0.P()
        L68:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            BA0 r2 = (defpackage.BA0) r2
            r2.x0(r0, r11)
            goto L68
        L78:
            nE r1 = defpackage.UN.a
            boolean r1 = J.N.M09VlOh_(r4)
            if (r1 == 0) goto L81
            return
        L81:
            ya2 r1 = r0.P()
        L85:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r1.next()
            BA0 r2 = (defpackage.BA0) r2
            r2.x0(r0, r11)
            goto L85
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.tab.TabFavicon.onFaviconAvailable(android.graphics.Bitmap):void");
    }

    @Override // defpackage.CD3
    public final void b() {
        N.M221q0MR(this.h, this);
    }

    @Override // defpackage.CD3
    public final void c(WebContents webContents) {
        N.MP93Z_9Y(this.h, this, webContents);
    }

    @Override // defpackage.CD3
    public final void a(WebContents webContents) {
        N.Mmp1Icg1(this.h, this);
    }
}
