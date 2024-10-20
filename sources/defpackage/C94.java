package defpackage;

import J.N;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.os.Build;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.media.PhotoCapabilities;
import org.chromium.media.VideoCapture;
import org.chromium.media.VideoCaptureFormat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class C94 extends VideoCapture implements Camera.PreviewCallback {
    public static final SparseArray r;
    public int f;
    public final Object g;
    public long h;
    public int i;
    public int j;
    public Camera.Area k;
    public Camera.Parameters l;
    public Camera m;
    public final ReentrantLock n;
    public boolean o;
    public int[] p;
    public SurfaceTexture q;

    static {
        SparseArray sparseArray = new SparseArray();
        r = sparseArray;
        sparseArray.append(2850, "incandescent");
        sparseArray.append(2950, "warm-fluorescent");
        sparseArray.append(4250, "fluorescent");
        sparseArray.append(4600, "twilight");
        sparseArray.append(5500, "daylight");
        sparseArray.append(6000, "cloudy-daylight");
        sparseArray.append(7000, "shade");
    }

    public static Camera.CameraInfo e(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (RuntimeException e) {
            AbstractC4851eH1.a("VideoCapture", "getCameraInfo: Camera.getCameraInfo: " + e, new Object[0]);
            return null;
        }
    }

    public static Camera.Parameters f(Camera camera) {
        try {
            return camera.getParameters();
        } catch (RuntimeException e) {
            AbstractC4851eH1.a("VideoCapture", "getCameraParameters: android.hardware.Camera.getParameters: " + e, new Object[0]);
            if (camera == null) {
                return null;
            }
            camera.release();
            return null;
        }
    }

    public C94(int i, long j) {
        super(i, j);
        this.g = new Object();
        this.n = new ReentrantLock();
    }

    @Override // org.chromium.media.VideoCapture
    public final boolean allocate(int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = this.d;
        try {
            this.m = Camera.open(i5);
            Camera.CameraInfo e = e(i5);
            if (e == null) {
                this.m.release();
                this.m = null;
                return false;
            }
            this.a = e.orientation;
            this.b = e.facing == 0;
            VideoCapture.b();
            Camera.Parameters f = f(this.m);
            if (f == null) {
                this.m = null;
                return false;
            }
            List<int[]> supportedPreviewFpsRange = f.getSupportedPreviewFpsRange();
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() == 0) {
                AbstractC4851eH1.a("VideoCapture", "allocate: no fps range found", new Object[0]);
                return false;
            }
            ArrayList arrayList = new ArrayList(supportedPreviewFpsRange.size());
            for (int[] iArr : supportedPreviewFpsRange) {
                arrayList.add(new C7219l94(iArr[0], iArr[1]));
            }
            C7219l94 c7219l94 = (C7219l94) Collections.min(arrayList, new C6875k94(i3 * 1000));
            int[] iArr2 = {c7219l94.a, c7219l94.b};
            int i6 = i;
            int i7 = i2;
            int i8 = Integer.MAX_VALUE;
            for (Camera.Size size : f.getSupportedPreviewSizes()) {
                int abs = Math.abs(size.height - i2) + Math.abs(size.width - i);
                if (abs < i8) {
                    int i9 = size.width;
                    if (i9 % 32 == 0) {
                        i7 = size.height;
                        i6 = i9;
                        i8 = abs;
                    }
                }
            }
            if (i8 == Integer.MAX_VALUE) {
                AbstractC4851eH1.a("VideoCapture", "allocate: can not find a multiple-of-32 resolution", new Object[0]);
                return false;
            }
            if (f.isVideoStabilizationSupported()) {
                f.getVideoStabilization();
                f.setVideoStabilization(true);
            }
            if (f.getSupportedFocusModes().contains("continuous-video")) {
                f.setFocusMode("continuous-video");
            }
            int i10 = iArr2[1] / 1000;
            String[] strArr = AbstractC7907n94.a;
            int i11 = 0;
            while (true) {
                if (i11 >= 6) {
                    i4 = 842094169;
                    break;
                }
                if (strArr[i11].contentEquals(Build.MODEL)) {
                    i4 = 17;
                    break;
                }
                i11++;
            }
            this.c = new VideoCaptureFormat(i6, i7, i10, i4);
            f.setPictureSize(i6, i7);
            f.setPreviewSize(i6, i7);
            f.setPreviewFpsRange(iArr2[0], iArr2[1]);
            f.setPreviewFormat(this.c.d);
            try {
                this.m.setParameters(f);
                int[] iArr3 = new int[1];
                this.p = iArr3;
                GLES20.glGenTextures(1, iArr3, 0);
                GLES20.glBindTexture(36197, this.p[0]);
                GLES20.glTexParameterf(36197, 10241, 9729.0f);
                GLES20.glTexParameterf(36197, 10240, 9729.0f);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.p[0]);
                this.q = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(null);
                try {
                    this.m.setPreviewTexture(this.q);
                    this.m.setErrorCallback(new C8251o94(this));
                    VideoCaptureFormat videoCaptureFormat = this.c;
                    this.f = (ImageFormat.getBitsPerPixel(videoCaptureFormat.d) * (videoCaptureFormat.a * videoCaptureFormat.b)) / 8;
                    for (int i12 = 0; i12 < 3; i12++) {
                        this.m.addCallbackBuffer(new byte[this.f]);
                    }
                    return true;
                } catch (IOException e2) {
                    AbstractC4851eH1.a("VideoCapture", "allocate: " + e2, new Object[0]);
                    return false;
                }
            } catch (RuntimeException e3) {
                AbstractC4851eH1.a("VideoCapture", "setParameters: " + e3, new Object[0]);
                return false;
            }
        } catch (RuntimeException e4) {
            AbstractC4851eH1.a("VideoCapture", "allocate: Camera.open: " + e4, new Object[0]);
            return false;
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final boolean startCaptureMaybeAsync() {
        if (this.m == null) {
            AbstractC4851eH1.a("VideoCapture", "startCaptureAsync: mCamera is null", new Object[0]);
            return false;
        }
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (this.o) {
                return true;
            }
            reentrantLock.unlock();
            this.m.setPreviewCallbackWithBuffer(this);
            try {
                this.m.startPreview();
                reentrantLock.lock();
                try {
                    N.MPaf3s5k(this.e, this);
                    this.o = true;
                    return true;
                } finally {
                }
            } catch (RuntimeException e) {
                AbstractC4851eH1.a("VideoCapture", "startCaptureAsync: Camera.startPreview: " + e, new Object[0]);
                return false;
            }
        } finally {
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final boolean stopCaptureAndBlockUntilStopped() {
        if (this.m == null) {
            AbstractC4851eH1.a("VideoCapture", "stopCaptureAndBlockUntilStopped: mCamera is null", new Object[0]);
            return true;
        }
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (!this.o) {
                return true;
            }
            this.o = false;
            reentrantLock.unlock();
            this.m.stopPreview();
            this.m.setPreviewCallbackWithBuffer(null);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final void getPhotoCapabilitiesAsync(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int indexOfValue;
        Camera.Parameters f = f(this.m);
        if (f == null) {
            this.m = null;
            N.MumkJZ3e(this.e, this, j, null);
            return;
        }
        boolean[] zArr = new boolean[3];
        double[] dArr = new double[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[3];
        int[][] iArr4 = new int[3];
        AbstractC4851eH1.d("VideoCapture", " CAM params: %s", f.flatten());
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        int i9 = 0;
        int i10 = Integer.MAX_VALUE;
        for (Camera.Size size : f.getSupportedPictureSizes()) {
            int i11 = size.width;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = size.height;
            if (i12 < i7) {
                i7 = i12;
            }
            if (i11 > i8) {
                i8 = i11;
            }
            if (i12 > i9) {
                i9 = i12;
            }
        }
        Camera.Size previewSize = f.getPreviewSize();
        iArr2[4] = i7;
        iArr2[5] = i9;
        iArr2[7] = 1;
        iArr2[6] = previewSize.height;
        iArr2[8] = i10;
        iArr2[9] = i8;
        iArr2[11] = 1;
        iArr2[10] = previewSize.width;
        if (f.isZoomSupported()) {
            i = f.getZoomRatios().get(f.getMaxZoom()).intValue();
            i3 = f.getZoomRatios().get(f.getZoom()).intValue();
            i4 = f.getZoomRatios().get(0).intValue();
            i2 = f.getZoomRatios().size() > 1 ? f.getZoomRatios().get(1).intValue() - f.getZoomRatios().get(0).intValue() : 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        dArr[0] = i4;
        dArr[1] = i;
        dArr[2] = i3;
        dArr[3] = i2;
        List<String> supportedFocusModes = f.getSupportedFocusModes();
        ArrayList arrayList = new ArrayList(3);
        if (supportedFocusModes.contains("continuous-video") || supportedFocusModes.contains("continuous-picture") || supportedFocusModes.contains("edof")) {
            arrayList.add(4);
        }
        if (supportedFocusModes.contains("auto") || supportedFocusModes.contains("macro")) {
            arrayList.add(3);
        }
        if (supportedFocusModes.contains("infinity") || supportedFocusModes.contains("fixed")) {
            arrayList.add(2);
        }
        iArr4[0] = (int[]) VideoCapture.c(arrayList).clone();
        String focusMode = f.getFocusMode();
        if (focusMode.equals("continuous-video") || focusMode.equals("continuous-picture") || focusMode.equals("edof")) {
            i5 = 4;
        } else if (focusMode.equals("auto") || focusMode.equals("macro")) {
            i5 = 3;
        } else {
            i5 = (focusMode.equals("infinity") || focusMode.equals("fixed")) ? 2 : 1;
        }
        iArr3[0] = i5;
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add(4);
        if (f.isAutoExposureLockSupported()) {
            arrayList2.add(2);
        }
        iArr4[1] = (int[]) VideoCapture.c(arrayList2).clone();
        iArr3[1] = (f.isAutoExposureLockSupported() && f.getAutoExposureLock()) ? 2 : 4;
        dArr[11] = f.getExposureCompensationStep();
        dArr[8] = f.getMinExposureCompensation() * r2;
        dArr[9] = f.getMaxExposureCompensation() * r2;
        dArr[10] = f.getExposureCompensation() * r2;
        ArrayList arrayList3 = new ArrayList(2);
        List<String> supportedWhiteBalance = f.getSupportedWhiteBalance();
        if (supportedWhiteBalance != null) {
            if (supportedWhiteBalance.isEmpty()) {
                i6 = 4;
            } else {
                i6 = 4;
                arrayList3.add(4);
            }
            if (f.isAutoWhiteBalanceLockSupported()) {
                arrayList3.add(2);
            }
        } else {
            i6 = 4;
        }
        iArr4[2] = (int[]) VideoCapture.c(arrayList3).clone();
        if (f.isAutoWhiteBalanceLockSupported() && f.getAutoWhiteBalanceLock()) {
            i6 = 2;
        }
        iArr3[2] = i6;
        SparseArray sparseArray = r;
        iArr2[12] = sparseArray.keyAt(0);
        iArr2[13] = sparseArray.keyAt(sparseArray.size() - 1);
        iArr2[15] = 50;
        if (i6 == 2 && (indexOfValue = sparseArray.indexOfValue(f.getWhiteBalance())) >= 0) {
            iArr2[14] = sparseArray.keyAt(indexOfValue);
        }
        List<String> supportedFlashModes = f.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            zArr[0] = supportedFlashModes.contains("torch");
            zArr[1] = "torch".equals(f.getFlashMode());
            zArr[2] = supportedFlashModes.contains("red-eye");
            ArrayList arrayList4 = new ArrayList(0);
            if (supportedFlashModes.contains("off")) {
                arrayList4.add(1);
            }
            if (supportedFlashModes.contains("auto")) {
                arrayList4.add(2);
            }
            if (supportedFlashModes.contains("on")) {
                arrayList4.add(3);
            }
            iArr = (int[]) VideoCapture.c(arrayList4).clone();
        } else {
            iArr = null;
        }
        N.MumkJZ3e(this.e, this, j, new PhotoCapabilities(zArr, dArr, iArr2, iArr, iArr3, iArr4));
    }

    @Override // org.chromium.media.VideoCapture
    public final void setPhotoOptions(double d, int i, double d2, int i2, double d3, double d4, double[] dArr, boolean z, double d5, double d6, int i3, double d7, boolean z2, boolean z3, int i4, boolean z4, boolean z5, double d8) {
        Camera.Area area;
        String str;
        int abs;
        Camera.Parameters f = f(this.m);
        if (f == null) {
            this.m = null;
            return;
        }
        if (f.isZoomSupported() && d > 0.0d) {
            List<Integer> zoomRatios = f.getZoomRatios();
            int i5 = 1;
            while (i5 < zoomRatios.size()) {
                List<Integer> list = zoomRatios;
                if (d < zoomRatios.get(i5).intValue()) {
                    break;
                }
                i5++;
                zoomRatios = list;
            }
            f.setZoom(i5 - 1);
        }
        if (i == 2) {
            f.setFocusMode("fixed");
        } else if (i == 3) {
            f.setFocusMode("auto");
        } else if (i == 4) {
            f.setFocusMode("continuous-picture");
        }
        if (f.isAutoExposureLockSupported()) {
            if (i2 == 2) {
                f.setAutoExposureLock(true);
            } else if (i2 != 1) {
                f.setAutoExposureLock(false);
            }
        }
        if (d3 > 0.0d) {
            this.i = (int) Math.round(d3);
        }
        if (d4 > 0.0d) {
            this.j = (int) Math.round(d4);
        }
        Camera.Area area2 = this.k;
        if (area2 == null || area2.rect.isEmpty() || d <= 0.0d) {
            area = null;
        } else {
            area = null;
            this.k = null;
        }
        if (i == 1 || i2 == 1) {
            this.k = area;
        }
        if ((f.getMaxNumMeteringAreas() > 0 || f.getMaxNumFocusAreas() > 0) && dArr.length > 0) {
            int round = (int) (Math.round(dArr[0] * 2000.0d) - 1000);
            int round2 = (int) (Math.round(dArr[1] * 2000.0d) - 1000);
            Camera.Area area3 = new Camera.Area(new Rect(Math.max(-1000, round - 125), Math.max(-1000, round2 - 125), Math.min(1000, round + 125), Math.min(1000, round2 + 125)), 1000);
            this.k = area3;
            area3.rect.toString();
        }
        Camera.Area area4 = this.k;
        if (area4 != null) {
            f.setFocusAreas(Arrays.asList(area4));
            f.setMeteringAreas(Arrays.asList(this.k));
        }
        if (z) {
            f.setExposureCompensation((int) Math.round(d5 / f.getExposureCompensationStep()));
        }
        if (i3 == 4 && f.getSupportedWhiteBalance() != null) {
            str = "auto";
            f.setWhiteBalance(str);
        } else {
            str = "auto";
            if (i3 == 2 && f.isAutoWhiteBalanceLockSupported()) {
                f.setAutoWhiteBalanceLock(true);
            }
        }
        if (d8 > 0.0d) {
            int i6 = (int) d8;
            List<String> supportedWhiteBalance = f.getSupportedWhiteBalance();
            int i7 = Integer.MAX_VALUE;
            int i8 = 0;
            String str2 = null;
            while (true) {
                SparseArray sparseArray = r;
                if (i8 >= sparseArray.size()) {
                    break;
                }
                if (supportedWhiteBalance.contains(sparseArray.valueAt(i8)) && (abs = Math.abs(i6 - sparseArray.keyAt(i8))) < i7) {
                    str2 = (String) sparseArray.valueAt(i8);
                    i7 = abs;
                }
                i8++;
            }
            if (str2 != null) {
                f.setWhiteBalance(str2);
            }
        }
        if (f.getSupportedFlashModes() != null) {
            if (z4 && z5) {
                f.setFlashMode("torch");
            } else if (i4 != 0) {
                if (i4 == 1) {
                    f.setFlashMode("off");
                } else if (i4 == 2) {
                    f.setFlashMode((z2 && z3) ? "red-eye" : str);
                } else if (i4 == 3) {
                    f.setFlashMode("on");
                }
            }
        }
        try {
            this.m.setParameters(f);
            if (i != 3) {
                return;
            }
            this.m.autoFocus(new C7563m94());
        } catch (RuntimeException e) {
            AbstractC4851eH1.a("VideoCapture", "setParameters: ", e);
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final void takePhotoAsync(long j) {
        if (this.m == null || !this.o) {
            AbstractC4851eH1.a("VideoCapture", "takePhotoAsync: mCamera is null or is not running", new Object[0]);
            d(j);
            return;
        }
        synchronized (this.g) {
            if (this.h != 0) {
                d(j);
                return;
            }
            this.h = j;
            Camera.Parameters f = f(this.m);
            this.l = f;
            if (f == null) {
                this.m = null;
                d(j);
                return;
            }
            Camera.Parameters f2 = f(this.m);
            if (f2 == null) {
                this.m = null;
                d(j);
                return;
            }
            f2.setRotation(a());
            if (this.i > 0 || this.j > 0) {
                Camera.Size size = null;
                int i = Integer.MAX_VALUE;
                for (Camera.Size size2 : f2.getSupportedPictureSizes()) {
                    int i2 = this.i;
                    int abs = i2 > 0 ? Math.abs(size2.width - i2) : 0;
                    int i3 = this.j;
                    int abs2 = abs + (i3 > 0 ? Math.abs(size2.height - i3) : 0);
                    if (abs2 < i) {
                        size = size2;
                        i = abs2;
                    }
                }
                if (i != Integer.MAX_VALUE) {
                    f2.setPictureSize(size.width, size.height);
                }
            }
            try {
                f2.flatten();
                this.m.setParameters(f2);
                this.m.takePicture(null, null, null, new C8594p94(this));
            } catch (RuntimeException e) {
                AbstractC4851eH1.a("VideoCapture", "setParameters " + e, new Object[0]);
                d(j);
            }
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final void deallocate() {
        if (this.m == null) {
            return;
        }
        stopCaptureAndBlockUntilStopped();
        try {
            this.m.setPreviewTexture(null);
            int[] iArr = this.p;
            if (iArr != null) {
                GLES20.glDeleteTextures(1, iArr, 0);
            }
            this.c = null;
            this.m.release();
            this.m = null;
        } catch (IOException e) {
            AbstractC4851eH1.a("VideoCapture", "deallocate: failed to deallocate camera, " + e, new Object[0]);
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (!this.o) {
                if (camera != null) {
                    return;
                } else {
                    return;
                }
            }
            int length = bArr.length;
            int i = this.f;
            if (length == i) {
                N.Mq5gIPzl(this.e, this, bArr, i, a());
            } else {
                N.M651cEC1(this.e, this, 8);
            }
            reentrantLock.unlock();
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        } finally {
            reentrantLock.unlock();
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }
}
