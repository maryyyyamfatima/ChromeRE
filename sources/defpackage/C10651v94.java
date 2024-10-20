package defpackage;

import J.N;
import android.hardware.camera2.CameraDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10651v94 extends CameraDevice.StateCallback {
    public final /* synthetic */ B94 a;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        B94 b94 = this.a;
        if (b94.h != null) {
            b94.h = null;
        }
        b94.m.open();
    }

    public C10651v94(B94 b94) {
        this.a = b94;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        AbstractC4851eH1.a("VideoCapture", "CameraDevice.StateCallback onOpened", new Object[0]);
        B94 b94 = this.a;
        b94.g = cameraDevice;
        b94.m.close();
        b94.f(1);
        B94.e(b94, 114);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC4851eH1.a("VideoCapture", "cameraDevice was closed unexpectedly", new Object[0]);
        cameraDevice.close();
        B94 b94 = this.a;
        b94.g = null;
        b94.f(3);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC4851eH1.a("VideoCapture", "cameraDevice encountered an error", new Object[0]);
        cameraDevice.close();
        B94 b94 = this.a;
        b94.g = null;
        b94.f(3);
        N.MhmwjISE(b94.e, b94, 69, "Camera device error " + Integer.toString(i));
    }
}
