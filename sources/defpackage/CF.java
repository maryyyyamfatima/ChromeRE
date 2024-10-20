package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.os.HandlerThread;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CF extends SurfaceView implements SurfaceHolder.Callback {
    public final Context a;
    public final Camera.PreviewCallback g;
    public final Camera.ErrorCallback h;
    public int i;
    public Camera j;
    public HandlerThread k;

    public CF(Context context, Camera.PreviewCallback previewCallback, SF2 sf2) {
        super(context);
        this.a = context;
        this.g = previewCallback;
        this.h = sf2;
    }

    public final void b() {
        if (this.j == null) {
            return;
        }
        c();
        this.j.release();
        this.j = null;
        HandlerThread handlerThread = this.k;
        if (handlerThread != null) {
            handlerThread.quit();
            this.k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:6:0x000e, B:15:0x0040, B:19:0x0048, B:20:0x0059, B:23:0x0050), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:6:0x000e, B:15:0x0040, B:19:0x0048, B:20:0x0059, B:23:0x0050), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            android.hardware.Camera$ErrorCallback r0 = r7.h
            android.view.SurfaceHolder r1 = r7.getHolder()
            r1.addCallback(r7)
            android.hardware.Camera r1 = r7.j
            if (r1 != 0) goto Le
            return
        Le:
            android.view.SurfaceHolder r2 = r7.getHolder()     // Catch: java.lang.Exception -> L7e
            r1.setPreviewDisplay(r2)     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera r1 = r7.j     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.Exception -> L7e
            r2.<init>()     // Catch: java.lang.Exception -> L7e
            int r3 = r7.i     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera.getCameraInfo(r3, r2)     // Catch: java.lang.Exception -> L7e
            android.content.Context r3 = r7.a     // Catch: java.lang.Exception -> L7e
            Op0 r3 = defpackage.AbstractC1895Op0.b(r3)     // Catch: java.lang.Exception -> L7e
            int r3 = r3.g     // Catch: java.lang.Exception -> L7e
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3f
            if (r3 == r4) goto L3c
            r6 = 2
            if (r3 == r6) goto L39
            r6 = 3
            if (r3 == r6) goto L36
            goto L3f
        L36:
            r3 = 270(0x10e, float:3.78E-43)
            goto L40
        L39:
            r3 = 180(0xb4, float:2.52E-43)
            goto L40
        L3c:
            r3 = 90
            goto L40
        L3f:
            r3 = r5
        L40:
            int r6 = r2.facing     // Catch: java.lang.Exception -> L7e
            if (r6 != 0) goto L45
            goto L46
        L45:
            r4 = r5
        L46:
            if (r4 == 0) goto L50
            int r2 = r2.orientation     // Catch: java.lang.Exception -> L7e
            int r2 = r2 - r3
            int r2 = r2 + 360
            int r2 = r2 % 360
            goto L59
        L50:
            int r2 = r2.orientation     // Catch: java.lang.Exception -> L7e
            int r2 = r2 + r3
            int r2 = r2 % 360
            int r2 = 360 - r2
            int r2 = r2 % 360
        L59:
            r1.setDisplayOrientation(r2)     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera r1 = r7.j     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera$PreviewCallback r2 = r7.g     // Catch: java.lang.Exception -> L7e
            r1.setOneShotPreviewCallback(r2)     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera r1 = r7.j     // Catch: java.lang.Exception -> L7e
            r1.setErrorCallback(r0)     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera r1 = r7.j     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = "continuous-picture"
            r1.setFocusMode(r2)     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera r2 = r7.j     // Catch: java.lang.Exception -> L7e
            r2.setParameters(r1)     // Catch: java.lang.Exception -> L7e
            android.hardware.Camera r1 = r7.j     // Catch: java.lang.Exception -> L7e
            r1.startPreview()     // Catch: java.lang.Exception -> L7e
            goto L85
        L7e:
            r1 = 1003(0x3eb, float:1.406E-42)
            android.hardware.Camera r2 = r7.j
            r0.onError(r1, r2)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CF.a():void");
    }

    public final void c() {
        getHolder().removeCallback(this);
        Camera camera = this.j;
        if (camera == null) {
            return;
        }
        camera.setOneShotPreviewCallback(null);
        this.j.setErrorCallback(null);
        try {
            this.j.stopPreview();
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        c();
        a();
    }
}
