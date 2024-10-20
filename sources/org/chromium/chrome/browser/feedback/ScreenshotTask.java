package org.chromium.chrome.browser.feedback;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import defpackage.FX2;
import org.chromium.chrome.browser.app.ChromeActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ScreenshotTask implements FX2 {
    public final Activity a;
    public boolean b;
    public Bitmap c;
    public Runnable d;
    public final int e = 0;

    public ScreenshotTask(Activity activity) {
        this.a = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[RETURN] */
    @Override // defpackage.FX2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Runnable r6) {
        /*
            r5 = this;
            r5.d = r6
            r6 = 0
            r0 = 1
            android.app.Activity r1 = r5.a
            int r2 = r5.e
            if (r2 == 0) goto L29
            if (r2 == r0) goto L22
            r3 = 2
            if (r2 == r3) goto L11
            goto L8a
        L11:
            if (r1 != 0) goto L14
            goto L1f
        L14:
            QF3 r6 = defpackage.AbstractC5103f04.a
            IX2 r2 = new IX2
            r2.<init>(r5, r1)
            org.chromium.base.task.PostTask.c(r6, r2)
            r6 = r0
        L1f:
            if (r6 == 0) goto L8a
            return
        L22:
            boolean r6 = r5.e(r1)
            if (r6 == 0) goto L8a
            return
        L29:
            boolean r2 = r1 instanceof org.chromium.chrome.browser.app.ChromeActivity
            if (r2 != 0) goto L2e
            goto L6f
        L2e:
            r2 = r1
            org.chromium.chrome.browser.app.ChromeActivity r2 = (org.chromium.chrome.browser.app.ChromeActivity) r2
            org.chromium.chrome.browser.tab.Tab r3 = r2.g1()
            u6 r4 = r2.H
            QB r4 = defpackage.UB.a(r4)
            org.chromium.components.browser_ui.bottomsheet.m r4 = (org.chromium.components.browser_ui.bottomsheet.m) r4
            boolean r4 = r4.n()
            if (r4 == 0) goto L44
            goto L6f
        L44:
            boolean r4 = r2.A1()
            if (r4 == 0) goto L57
            boolean r4 = defpackage.AbstractC5241fQ2.d(r2)
            if (r4 != 0) goto L6f
            boolean r2 = defpackage.AbstractC5177fD3.b(r2)
            if (r2 == 0) goto L57
            goto L6f
        L57:
            if (r3 != 0) goto L5a
            goto L6d
        L5a:
            boolean r2 = r3.isUserInteractable()
            if (r2 != 0) goto L61
            goto L6d
        L61:
            g12 r2 = r3.x()
            if (r2 != 0) goto L6f
            boolean r2 = defpackage.C8693pT2.W0(r3)
            if (r2 != 0) goto L6f
        L6d:
            r2 = r0
            goto L70
        L6f:
            r2 = r6
        L70:
            if (r2 == 0) goto L79
            boolean r2 = r5.e(r1)
            if (r2 == 0) goto L79
            return
        L79:
            if (r1 != 0) goto L7c
            goto L87
        L7c:
            QF3 r6 = defpackage.AbstractC5103f04.a
            IX2 r2 = new IX2
            r2.<init>(r5, r1)
            org.chromium.base.task.PostTask.c(r6, r2)
            r6 = r0
        L87:
            if (r6 == 0) goto L8a
            return
        L8a:
            QF3 r6 = defpackage.AbstractC5103f04.a
            HX2 r0 = new HX2
            r0.<init>(r5)
            org.chromium.base.task.PostTask.c(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.feedback.ScreenshotTask.c(java.lang.Runnable):void");
    }

    @Override // defpackage.FX2
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.FX2
    public final Bitmap b() {
        return this.c;
    }

    public final void onBytesReceived(byte[] bArr) {
        d(bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null);
    }

    public final void d(Bitmap bitmap) {
        this.b = true;
        this.c = bitmap;
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
        this.d = null;
    }

    public final boolean e(Activity activity) {
        if (activity == null) {
            return false;
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getRootView().getWindowVisibleDisplayFrame(rect);
        N.MJ03E235(this, ((ChromeActivity) activity).H, rect.width(), rect.height());
        return true;
    }
}
