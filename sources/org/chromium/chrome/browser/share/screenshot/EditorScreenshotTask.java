package org.chromium.chrome.browser.share.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.InterfaceC2060Pw0;
import defpackage.QB;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EditorScreenshotTask implements InterfaceC2060Pw0 {
    public final Activity a;
    public final QB g;
    public Bitmap h;
    public Runnable i;

    public EditorScreenshotTask(Activity activity, QB qb) {
        this.a = activity;
        this.g = qb;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // defpackage.InterfaceC2060Pw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Runnable r6) {
        /*
            r5 = this;
            r5.i = r6
            r6 = 1
            r0 = 0
            android.app.Activity r1 = r5.a
            if (r1 == 0) goto L61
            boolean r2 = r1 instanceof org.chromium.chrome.browser.app.ChromeActivity
            if (r2 != 0) goto Ld
            goto L37
        Ld:
            r2 = r1
            org.chromium.chrome.browser.app.ChromeActivity r2 = (org.chromium.chrome.browser.app.ChromeActivity) r2
            org.chromium.chrome.browser.tab.Tab r2 = r2.g1()
            QB r3 = r5.g
            org.chromium.components.browser_ui.bottomsheet.m r3 = (org.chromium.components.browser_ui.bottomsheet.m) r3
            boolean r3 = r3.n()
            if (r3 == 0) goto L1f
            goto L37
        L1f:
            if (r2 != 0) goto L22
            goto L35
        L22:
            boolean r3 = r2.isUserInteractable()
            if (r3 != 0) goto L29
            goto L35
        L29:
            g12 r3 = r2.x()
            if (r3 != 0) goto L37
            boolean r2 = r2.u()
            if (r2 != 0) goto L37
        L35:
            r2 = r6
            goto L38
        L37:
            r2 = r0
        L38:
            if (r2 != 0) goto L3b
            goto L61
        L3b:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.Window r3 = r1.getWindow()
            android.view.View r3 = r3.getDecorView()
            android.view.View r3 = r3.getRootView()
            r3.getWindowVisibleDisplayFrame(r2)
            r3 = r1
            org.chromium.chrome.browser.app.ChromeActivity r3 = (org.chromium.chrome.browser.app.ChromeActivity) r3
            u6 r3 = r3.H
            int r4 = r2.width()
            int r2 = r2.height()
            J.N.MRY3Qp1V(r5, r3, r4, r2)
            r2 = r6
            goto L62
        L61:
            r2 = r0
        L62:
            if (r2 == 0) goto L65
            return
        L65:
            if (r1 != 0) goto L69
            r6 = r0
            goto L73
        L69:
            QF3 r0 = defpackage.AbstractC5103f04.a
            Rw0 r2 = new Rw0
            r2.<init>(r5, r1)
            org.chromium.base.task.PostTask.c(r0, r2)
        L73:
            if (r6 == 0) goto L76
            return
        L76:
            QF3 r6 = defpackage.AbstractC5103f04.a
            Qw0 r0 = new Qw0
            r0.<init>(r5)
            org.chromium.base.task.PostTask.c(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.share.screenshot.EditorScreenshotTask.c(java.lang.Runnable):void");
    }

    @Override // defpackage.InterfaceC2060Pw0
    public final Bitmap b() {
        return this.h;
    }

    public final void onBytesReceived(byte[] bArr) {
        a(bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null);
    }

    public final void a(Bitmap bitmap) {
        this.h = bitmap;
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
        this.i = null;
    }
}
