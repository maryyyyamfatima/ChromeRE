package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class X51 implements InterfaceC9782se4 {
    public static Handler e;
    public final IK3 a = new IK3();
    public V51 b;
    public boolean c;
    public W51 d;

    @Override // defpackage.InterfaceC9782se4
    public final boolean a() {
        return true;
    }

    public X51() {
        if (e == null) {
            HandlerThread handlerThread = new HandlerThread("HardwareDrawThread");
            handlerThread.start();
            e = new Handler(handlerThread.getLooper());
        }
    }

    @Override // defpackage.InterfaceC9782se4
    public final void c(View view, float f) {
        final int width = (int) (view.getWidth() * f);
        final int height = (int) (view.getHeight() * f);
        final V51 v51 = this.b;
        if (v51 != null) {
            v51.e.b(new Runnable() { // from class: Q51
                @Override // java.lang.Runnable
                public final void run() {
                    V51.this.b(width, height);
                }
            });
        } else {
            this.b = new V51(this, width, height);
        }
    }

    @Override // defpackage.InterfaceC9782se4
    public final void b() {
        U51 u51;
        V51 v51 = this.b;
        if (v51 == null || (u51 = v51.d) == null) {
            return;
        }
        u51.b = null;
    }

    @Override // defpackage.InterfaceC9782se4
    public final boolean d(View view, Rect rect, float f, InterfaceC3470aG interfaceC3470aG, C9439re4 c9439re4) {
        TraceEvent i = TraceEvent.i("HardwareDraw:syncCaptureBitmap", null);
        try {
            boolean e2 = e(view, rect, f, interfaceC3470aG, c9439re4);
            if (i != null) {
                i.close();
            }
            return e2;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:            r2.close();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(final android.view.View r15, android.graphics.Rect r16, final float r17, defpackage.InterfaceC3470aG r18, final defpackage.C9439re4 r19) {
        /*
            r14 = this;
            r1 = r14
            r0 = 0
            java.lang.String r2 = "HardwareDraw:captureWithHardwareDraw"
            org.chromium.base.TraceEvent r2 = org.chromium.base.TraceEvent.i(r2, r0)
            int r0 = r15.getWidth()     // Catch: java.lang.Throwable -> La9
            r3 = 0
            if (r0 == 0) goto La3
            int r0 = r15.getHeight()     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L17
            goto La3
        L17:
            V51 r0 = r1.b     // Catch: java.lang.Throwable -> La9
            U51 r0 = r0.d     // Catch: java.lang.Throwable -> La9
            boolean r4 = r0.c     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L9d
            boolean r4 = r16.isEmpty()     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L9d
            android.graphics.RenderNode r7 = new android.graphics.RenderNode     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = "bitmapRenderNode"
            r7.<init>(r4)     // Catch: java.lang.Throwable -> La9
            int r4 = r15.getWidth()     // Catch: java.lang.Throwable -> La9
            int r5 = r15.getHeight()     // Catch: java.lang.Throwable -> La9
            r7.setPosition(r3, r3, r4, r5)     // Catch: java.lang.Throwable -> La9
            android.graphics.RecordingCanvas r8 = r7.beginRecording()     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r9 = r15
            r10 = r16
            r11 = r17
            r13 = r18
            boolean r4 = defpackage.AbstractC4157cG.a(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La9
            r5 = 1
            if (r4 == 0) goto L4d
            r8 = r15
            r4 = r5
            goto L64
        L4d:
            java.lang.String r4 = "HardwareDraw::DrawAttemptedWhileDetached"
            org.chromium.base.TraceEvent.f(r4)     // Catch: java.lang.Throwable -> La9
            boolean r4 = r1.c     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L62
            r1.c = r5     // Catch: java.lang.Throwable -> La9
            P51 r4 = new P51     // Catch: java.lang.Throwable -> La9
            r4.<init>(r14)     // Catch: java.lang.Throwable -> La9
            r8 = r15
            r15.addOnAttachStateChangeListener(r4)     // Catch: java.lang.Throwable -> La9
            goto L63
        L62:
            r8 = r15
        L63:
            r4 = r3
        L64:
            r7.endRecording()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L97
            r0.c = r3     // Catch: java.lang.Throwable -> La9
            V51 r0 = r1.b     // Catch: java.lang.Throwable -> La9
            X51 r3 = r0.f     // Catch: java.lang.Throwable -> La9
            IK3 r3 = r3.a     // Catch: java.lang.Throwable -> La9
            r3.getClass()     // Catch: java.lang.Throwable -> La9
            int r3 = r0.c     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L84
            if (r3 == r5) goto L97
            r5 = 2
            r6 = 3
            if (r3 == r5) goto L81
            if (r3 == r6) goto L97
            goto L86
        L81:
            r0.c = r6     // Catch: java.lang.Throwable -> La9
            goto L86
        L84:
            r0.c = r5     // Catch: java.lang.Throwable -> La9
        L86:
            T51 r3 = new T51     // Catch: java.lang.Throwable -> La9
            r5 = r3
            r6 = r17
            r8 = r15
            r9 = r19
            r10 = r0
            r5.<init>()     // Catch: java.lang.Throwable -> La9
            N33 r0 = r0.e     // Catch: java.lang.Throwable -> La9
            r0.b(r3)     // Catch: java.lang.Throwable -> La9
        L97:
            if (r2 == 0) goto L9c
            r2.close()
        L9c:
            return r4
        L9d:
            if (r2 == 0) goto La2
            r2.close()
        La2:
            return r3
        La3:
            if (r2 == 0) goto La8
            r2.close()
        La8:
            return r3
        La9:
            r0 = move-exception
            if (r2 == 0) goto Laf
            r2.close()     // Catch: java.lang.Throwable -> Laf
        Laf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.X51.e(android.view.View, android.graphics.Rect, float, aG, re4):boolean");
    }
}
