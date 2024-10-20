package defpackage;

import android.graphics.Bitmap;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gg3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5672gg3 implements InterfaceC9782se4 {
    public Bitmap a;

    @Override // defpackage.InterfaceC9782se4
    public final boolean a() {
        return false;
    }

    @Override // defpackage.InterfaceC9782se4
    public final void c(View view, float f) {
    }

    @Override // defpackage.InterfaceC9782se4
    public final void b() {
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0008, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:16:0x0036, B:17:0x003d, B:19:0x0041, B:21:0x004e, B:22:0x0063, B:29:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0008, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:16:0x0036, B:17:0x003d, B:19:0x0041, B:21:0x004e, B:22:0x0063, B:29:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0008, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:16:0x0036, B:17:0x003d, B:19:0x0041, B:21:0x004e, B:22:0x0063, B:29:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.InterfaceC9782se4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r12, android.graphics.Rect r13, float r14, defpackage.InterfaceC3470aG r15, defpackage.C9439re4 r16) {
        /*
            r11 = this;
            r1 = r11
            java.lang.String r0 = "SoftwareDraw:syncCaptureBitmap"
            r2 = 0
            org.chromium.base.TraceEvent r8 = org.chromium.base.TraceEvent.i(r0, r2)
            int r0 = r12.getWidth()     // Catch: java.lang.Throwable -> L72
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L72
            float r0 = r0 * r14
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L72
            int r3 = r12.getHeight()     // Catch: java.lang.Throwable -> L72
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L72
            float r3 = r3 * r14
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L72
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L1f
            if (r3 != 0) goto L1d
            goto L1f
        L1d:
            r10 = r4
            goto L20
        L1f:
            r10 = r9
        L20:
            if (r10 == 0) goto L24
            r0 = r9
            r3 = r0
        L24:
            android.graphics.Bitmap r5 = r1.a     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L3d
            int r5 = r5.getWidth()     // Catch: java.lang.Throwable -> L72
            if (r5 != r0) goto L36
            android.graphics.Bitmap r5 = r1.a     // Catch: java.lang.Throwable -> L72
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> L72
            if (r5 == r3) goto L3d
        L36:
            android.graphics.Bitmap r5 = r1.a     // Catch: java.lang.Throwable -> L72
            r5.recycle()     // Catch: java.lang.Throwable -> L72
            r1.a = r2     // Catch: java.lang.Throwable -> L72
        L3d:
            android.graphics.Bitmap r2 = r1.a     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L4c
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L72
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r3, r2)     // Catch: java.lang.Throwable -> L72
            r0.setHasAlpha(r9)     // Catch: java.lang.Throwable -> L72
            r1.a = r0     // Catch: java.lang.Throwable -> L72
        L4c:
            if (r10 != 0) goto L5e
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L72
            android.graphics.Bitmap r0 = r1.a     // Catch: java.lang.Throwable -> L72
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L72
            r6 = 1
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            defpackage.AbstractC4157cG.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L72
            goto L63
        L5e:
            android.graphics.Bitmap r0 = r1.a     // Catch: java.lang.Throwable -> L72
            r0.setPixel(r4, r4, r4)     // Catch: java.lang.Throwable -> L72
        L63:
            android.graphics.Bitmap r0 = r1.a     // Catch: java.lang.Throwable -> L72
            r2 = r16
            r2.onResult(r0)     // Catch: java.lang.Throwable -> L72
            r0 = r10 ^ 1
            if (r8 == 0) goto L71
            r8.close()
        L71:
            return r0
        L72:
            r0 = move-exception
            if (r8 == 0) goto L78
            r8.close()     // Catch: java.lang.Throwable -> L78
        L78:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5672gg3.d(android.view.View, android.graphics.Rect, float, aG, re4):boolean");
    }
}
