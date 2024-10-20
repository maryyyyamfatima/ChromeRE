package defpackage;

import J.N;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10308u94 extends CameraCaptureSession.StateCallback {
    public final CaptureRequest a;
    public final /* synthetic */ B94 b;

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.b.h = null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        B94 b94 = this.b;
        b94.f(3);
        b94.h = null;
        N.MhmwjISE(b94.e, b94, 70, "Camera session configuration error");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        B94 b94 = this.b;
        b94.h = cameraCaptureSession;
        try {
            cameraCaptureSession.setRepeatingRequest(this.a, new C9965t94(this), null);
            b94.f(2);
            N.MPaf3s5k(b94.e, b94);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            AbstractC4851eH1.a("VideoCapture", "setRepeatingRequest: ", e);
        }
    }

    public C10308u94(B94 b94, CaptureRequest captureRequest) {
        this.b = b94;
        this.a = captureRequest;
    }
}
