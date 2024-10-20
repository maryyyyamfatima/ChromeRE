package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.util.Size;
import java.util.ArrayList;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class A94 implements Runnable {
    public final long a;
    public final /* synthetic */ B94 g;

    public A94(B94 b94, long j) {
        this.g = b94;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TraceEvent.h("VideoCaptureCamera2.java", "TakePhotoTask.run");
        B94 b94 = this.g;
        CameraDevice cameraDevice = b94.g;
        long j = this.a;
        if (cameraDevice == null || b94.o != 2) {
            AbstractC4851eH1.a("VideoCapture", "TakePhoto failed because mCameraDevice == null || mCameraState != CameraState.STARTED", new Object[0]);
            b94.d(j);
            return;
        }
        CameraCharacteristics i = B94.i(b94.d);
        if (i == null) {
            AbstractC4851eH1.a("VideoCapture", "cameraCharacteristics error", new Object[0]);
            b94.d(j);
            return;
        }
        Size h = B94.h(((StreamConfigurationMap) i.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256), b94.r, b94.s);
        int i2 = b94.r;
        int i3 = b94.s;
        if (h != null) {
            h.getWidth();
            h.getHeight();
        }
        TraceEvent.h("VideoCaptureCamera2.java", "TakePhotoTask.run creating ImageReader");
        ImageReader newInstance = ImageReader.newInstance(h != null ? h.getWidth() : b94.c.a, h != null ? h.getHeight() : b94.c.b, 256, 1);
        newInstance.setOnImageAvailableListener(new C8937q94(b94, j), b94.l);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(newInstance.getSurface());
        try {
            CaptureRequest.Builder createCaptureRequest = b94.g.createCaptureRequest(2);
            if (createCaptureRequest == null) {
                AbstractC4851eH1.a("VideoCapture", "photoRequestBuilder error", new Object[0]);
                b94.d(j);
                return;
            }
            createCaptureRequest.addTarget(newInstance.getSurface());
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(b94.a()));
            TraceEvent.h("VideoCaptureCamera2.java", "TakePhotoTask.run calling configureCommonCaptureSettings");
            b94.g(createCaptureRequest);
            TraceEvent.h("VideoCaptureCamera2.java", "TakePhotoTask.run calling photoRequestBuilder.build()");
            C9279r94 c9279r94 = new C9279r94(this.g, newInstance, createCaptureRequest.build(), this.a);
            try {
                TraceEvent.h("VideoCaptureCamera2.java", "TakePhotoTask.run calling mCameraDevice.createCaptureSession()");
                b94.g.createCaptureSession(arrayList, c9279r94, b94.l);
            } catch (CameraAccessException | IllegalArgumentException | SecurityException e) {
                AbstractC4851eH1.a("VideoCapture", "createCaptureSession: " + e, new Object[0]);
                b94.d(j);
            }
        } catch (CameraAccessException e2) {
            AbstractC4851eH1.a("VideoCapture", "createCaptureRequest() error ", e2);
            b94.d(j);
        }
    }
}
