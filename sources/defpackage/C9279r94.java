package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9279r94 extends CameraCaptureSession.StateCallback {
    public final ImageReader a;
    public final CaptureRequest b;
    public final long c;
    public final /* synthetic */ B94 d;

    public C9279r94(B94 b94, ImageReader imageReader, CaptureRequest captureRequest, long j) {
        this.d = b94;
        this.a = imageReader;
        this.b = captureRequest;
        this.c = j;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        long j = this.c;
        B94 b94 = this.d;
        TraceEvent.h("VideoCaptureCamera2.java", "CrPhotoSessionListener.onConfigured");
        try {
            TraceEvent.h("VideoCaptureCamera2.java", "Calling CameraCaptureSession.capture()");
            cameraCaptureSession.capture(this.b, null, null);
        } catch (CameraAccessException e) {
            AbstractC4851eH1.a("VideoCapture", "capture() CameraAccessException", e);
            b94.d(j);
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("VideoCapture", "capture() IllegalStateException", e2);
            b94.d(j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC4851eH1.a("VideoCapture", "failed configuring capture session", new Object[0]);
        this.d.d(this.c);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.a.close();
    }
}
