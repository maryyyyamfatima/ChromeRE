package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9965t94 extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ C10308u94 a;

    public C9965t94(C10308u94 c10308u94) {
        this.a = c10308u94;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l == null) {
            return;
        }
        this.a.b.w = l.longValue();
    }
}
