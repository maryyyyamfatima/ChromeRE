package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC12023z94 implements Runnable {
    public final /* synthetic */ B94 a;

    @Override // java.lang.Runnable
    public final void run() {
        B94 b94 = this.a;
        CameraDevice cameraDevice = b94.g;
        if (cameraDevice == null) {
            return;
        }
        cameraDevice.close();
        b94.f(3);
        b94.q = new Rect();
    }

    public RunnableC12023z94(B94 b94) {
        this.a = b94;
    }
}
