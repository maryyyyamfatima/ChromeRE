package defpackage;

import J.N;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.base.TraceEvent;
import org.chromium.media.VideoCapture;
import org.chromium.media.VideoCaptureFormat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class B94 extends VideoCapture {
    public static final String[] G = {"Pixel 3", "Pixel 3 XL"};
    public static final SparseIntArray H;
    public int A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public final Object f;
    public CameraDevice g;
    public CameraCaptureSession h;
    public CaptureRequest i;
    public CaptureRequest.Builder j;
    public ImageReader k;
    public final Handler l;
    public final ConditionVariable m;
    public Range n;
    public int o;
    public final float p;
    public Rect q;
    public int r;
    public int s;
    public int t;
    public float u;
    public int v;
    public long w;
    public MeteringRectangle x;
    public int y;
    public int z;

    @Override // org.chromium.media.VideoCapture
    public final void deallocate() {
    }

    public static CameraCharacteristics i(int i) {
        try {
            return ((CameraManager) V60.a.getSystemService("camera")).getCameraCharacteristics(String.valueOf(i));
        } catch (CameraAccessException | AssertionError | IllegalArgumentException | NullPointerException e) {
            AbstractC4851eH1.a("VideoCapture", "getCameraCharacteristics: ", e);
            return null;
        }
    }

    public static String j(int i) {
        try {
            String[] cameraIdList = ((CameraManager) V60.a.getSystemService("camera")).getCameraIdList();
            if (i < cameraIdList.length) {
                return cameraIdList[i];
            }
            AbstractC4851eH1.a("VideoCapture", "Invalid camera index: ", Integer.valueOf(i));
            return null;
        } catch (CameraAccessException e) {
            AbstractC4851eH1.a("VideoCapture", "manager.getCameraIdList: ", e);
            return null;
        }
    }

    public static int l(int i) {
        try {
            String[] cameraIdList = ((CameraManager) V60.a.getSystemService("camera")).getCameraIdList();
            for (int i2 = 0; i2 < cameraIdList.length; i2++) {
                if (Integer.parseInt(cameraIdList[i2]) == i) {
                    return i2;
                }
            }
            return -1;
        } catch (CameraAccessException e) {
            AbstractC4851eH1.a("VideoCapture", "manager.getCameraIdList: ", e);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[Catch: all -> 0x01fa, TryCatch #1 {all -> 0x01fa, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0049, B:10:0x0051, B:12:0x0068, B:18:0x007a, B:19:0x00d3, B:21:0x00d7, B:24:0x00e0, B:25:0x0131, B:27:0x0140, B:28:0x016d, B:32:0x0174, B:33:0x0181, B:35:0x0189, B:36:0x018e, B:38:0x0191, B:46:0x01af, B:47:0x019d, B:51:0x01aa, B:40:0x0196, B:57:0x01b5, B:59:0x01be, B:61:0x01c2, B:62:0x01d8, B:64:0x01e0, B:65:0x01e7, B:67:0x01eb, B:75:0x0153, B:77:0x0166, B:79:0x00f1, B:85:0x0128, B:86:0x00fb, B:87:0x010e, B:90:0x0117, B:92:0x011f, B:14:0x0074, B:95:0x0082, B:97:0x0093, B:99:0x009f, B:101:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0140 A[Catch: all -> 0x01fa, TryCatch #1 {all -> 0x01fa, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0049, B:10:0x0051, B:12:0x0068, B:18:0x007a, B:19:0x00d3, B:21:0x00d7, B:24:0x00e0, B:25:0x0131, B:27:0x0140, B:28:0x016d, B:32:0x0174, B:33:0x0181, B:35:0x0189, B:36:0x018e, B:38:0x0191, B:46:0x01af, B:47:0x019d, B:51:0x01aa, B:40:0x0196, B:57:0x01b5, B:59:0x01be, B:61:0x01c2, B:62:0x01d8, B:64:0x01e0, B:65:0x01e7, B:67:0x01eb, B:75:0x0153, B:77:0x0166, B:79:0x00f1, B:85:0x0128, B:86:0x00fb, B:87:0x010e, B:90:0x0117, B:92:0x011f, B:14:0x0074, B:95:0x0082, B:97:0x0093, B:99:0x009f, B:101:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2 A[Catch: all -> 0x01fa, TryCatch #1 {all -> 0x01fa, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0049, B:10:0x0051, B:12:0x0068, B:18:0x007a, B:19:0x00d3, B:21:0x00d7, B:24:0x00e0, B:25:0x0131, B:27:0x0140, B:28:0x016d, B:32:0x0174, B:33:0x0181, B:35:0x0189, B:36:0x018e, B:38:0x0191, B:46:0x01af, B:47:0x019d, B:51:0x01aa, B:40:0x0196, B:57:0x01b5, B:59:0x01be, B:61:0x01c2, B:62:0x01d8, B:64:0x01e0, B:65:0x01e7, B:67:0x01eb, B:75:0x0153, B:77:0x0166, B:79:0x00f1, B:85:0x0128, B:86:0x00fb, B:87:0x010e, B:90:0x0117, B:92:0x011f, B:14:0x0074, B:95:0x0082, B:97:0x0093, B:99:0x009f, B:101:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0 A[Catch: all -> 0x01fa, TryCatch #1 {all -> 0x01fa, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0049, B:10:0x0051, B:12:0x0068, B:18:0x007a, B:19:0x00d3, B:21:0x00d7, B:24:0x00e0, B:25:0x0131, B:27:0x0140, B:28:0x016d, B:32:0x0174, B:33:0x0181, B:35:0x0189, B:36:0x018e, B:38:0x0191, B:46:0x01af, B:47:0x019d, B:51:0x01aa, B:40:0x0196, B:57:0x01b5, B:59:0x01be, B:61:0x01c2, B:62:0x01d8, B:64:0x01e0, B:65:0x01e7, B:67:0x01eb, B:75:0x0153, B:77:0x0166, B:79:0x00f1, B:85:0x0128, B:86:0x00fb, B:87:0x010e, B:90:0x0117, B:92:0x011f, B:14:0x0074, B:95:0x0082, B:97:0x0093, B:99:0x009f, B:101:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01eb A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #1 {all -> 0x01fa, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0049, B:10:0x0051, B:12:0x0068, B:18:0x007a, B:19:0x00d3, B:21:0x00d7, B:24:0x00e0, B:25:0x0131, B:27:0x0140, B:28:0x016d, B:32:0x0174, B:33:0x0181, B:35:0x0189, B:36:0x018e, B:38:0x0191, B:46:0x01af, B:47:0x019d, B:51:0x01aa, B:40:0x0196, B:57:0x01b5, B:59:0x01be, B:61:0x01c2, B:62:0x01d8, B:64:0x01e0, B:65:0x01e7, B:67:0x01eb, B:75:0x0153, B:77:0x0166, B:79:0x00f1, B:85:0x0128, B:86:0x00fb, B:87:0x010e, B:90:0x0117, B:92:0x011f, B:14:0x0074, B:95:0x0082, B:97:0x0093, B:99:0x009f, B:101:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1 A[Catch: all -> 0x01fa, TryCatch #1 {all -> 0x01fa, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0049, B:10:0x0051, B:12:0x0068, B:18:0x007a, B:19:0x00d3, B:21:0x00d7, B:24:0x00e0, B:25:0x0131, B:27:0x0140, B:28:0x016d, B:32:0x0174, B:33:0x0181, B:35:0x0189, B:36:0x018e, B:38:0x0191, B:46:0x01af, B:47:0x019d, B:51:0x01aa, B:40:0x0196, B:57:0x01b5, B:59:0x01be, B:61:0x01c2, B:62:0x01d8, B:64:0x01e0, B:65:0x01e7, B:67:0x01eb, B:75:0x0153, B:77:0x0166, B:79:0x00f1, B:85:0x0128, B:86:0x00fb, B:87:0x010e, B:90:0x0117, B:92:0x011f, B:14:0x0074, B:95:0x0082, B:97:0x0093, B:99:0x009f, B:101:0x0029), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.hardware.camera2.CaptureRequest.Builder r15) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B94.g(android.hardware.camera2.CaptureRequest$Builder):void");
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.append(2850, 2);
        sparseIntArray.append(2950, 4);
        sparseIntArray.append(4250, 3);
        sparseIntArray.append(4600, 7);
        sparseIntArray.append(5000, 5);
        sparseIntArray.append(6000, 6);
        sparseIntArray.append(7000, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:            if (r1 == null) goto L47;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.B94 r10, int r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B94.e(B94, int):void");
    }

    public final void f(int i) {
        synchronized (this.f) {
            this.o = i;
            this.f.notifyAll();
        }
    }

    public static Size h(Size[] sizeArr, int i, int i2) {
        if (sizeArr == null) {
            return null;
        }
        Size size = null;
        int i3 = Integer.MAX_VALUE;
        for (Size size2 : sizeArr) {
            int abs = (i > 0 ? Math.abs(size2.getWidth() - i) : 0) + (i2 > 0 ? Math.abs(size2.getHeight() - i2) : 0);
            if (abs < i3) {
                size = size2;
                i3 = abs;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            return size;
        }
        AbstractC4851eH1.a("VideoCapture", "Couldn't find resolution close to (%dx%d)", Integer.valueOf(i), Integer.valueOf(i2));
        return null;
    }

    public static int k(int i) {
        try {
            return Integer.parseInt(j(i));
        } catch (NumberFormatException unused) {
            AbstractC4851eH1.a("VideoCapture", "Invalid camera index: ", Integer.valueOf(i));
            return -1;
        }
    }

    public B94(int i, long j) {
        super(i, j);
        this.f = new Object();
        this.m = new ConditionVariable();
        this.o = 3;
        this.p = 1.0f;
        this.q = new Rect();
        this.t = 4;
        this.u = 1.0f;
        this.v = 4;
        this.z = 4;
        this.A = -1;
        this.D = 1;
        N.Mqw5545M(j, this);
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera2_CameraThread");
        handlerThread.start();
        this.l = new Handler(handlerThread.getLooper());
        CameraCharacteristics i2 = i(i);
        if (i2 != null) {
            this.p = ((Float) i2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
    }

    public final void finalize() {
        this.l.getLooper().quit();
    }

    @Override // org.chromium.media.VideoCapture
    public final boolean allocate(int i, int i2, int i3, boolean z) {
        N.Mqw5545M(this.e, this);
        synchronized (this.f) {
            int i4 = this.o;
            if (i4 != 0 && i4 != 1) {
                CameraCharacteristics i5 = i(this.d);
                if (i5 == null) {
                    return false;
                }
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) i5.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                int intValue = ((Integer) i5.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                this.a = intValue;
                if (intValue == 0 || intValue == 180) {
                    i2 = i;
                    i = i2;
                }
                Size h = h(streamConfigurationMap.getOutputSizes(35), i, i2);
                if (h == null) {
                    AbstractC4851eH1.a("VideoCapture", "No supported resolutions.", new Object[0]);
                    return false;
                }
                List<Range> asList = Arrays.asList((Range[]) i5.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                if (asList.isEmpty()) {
                    AbstractC4851eH1.a("VideoCapture", "No supported framerate ranges.", new Object[0]);
                    return false;
                }
                ArrayList arrayList = new ArrayList(asList.size());
                int i6 = ((Integer) ((Range) asList.get(0)).getUpper()).intValue() > 1000 ? 1 : 1000;
                for (Range range : asList) {
                    arrayList.add(new C7219l94(((Integer) range.getLower()).intValue() * i6, ((Integer) range.getUpper()).intValue() * i6));
                }
                C7219l94 c7219l94 = (C7219l94) Collections.min(arrayList, new C6875k94(i3 * 1000));
                this.n = new Range(Integer.valueOf(c7219l94.a / i6), Integer.valueOf(c7219l94.b / i6));
                h.getWidth();
                h.getHeight();
                this.n.getLower();
                this.n.getUpper();
                this.c = new VideoCaptureFormat(h.getWidth(), h.getHeight(), i3, 35);
                this.b = ((Integer) i5.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
                this.F = z;
                return true;
            }
            AbstractC4851eH1.a("VideoCapture", "allocate() invoked while Camera is busy opening/configuring.", new Object[0]);
            return false;
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final boolean startCaptureMaybeAsync() {
        int i = this.d;
        N.Mqw5545M(this.e, this);
        f(0);
        CameraManager cameraManager = (CameraManager) V60.a.getSystemService("camera");
        C10651v94 c10651v94 = new C10651v94(this);
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            int l = l(i);
            if (l < 0) {
                AbstractC4851eH1.a("VideoCapture", "Invalid camera Id: ", Integer.valueOf(i));
                return false;
            }
            TraceEvent.h("VideoCaptureCamera2.java", "VideoCaptureCamera2.startCaptureMaybeAsync calling manager.openCamera");
            cameraManager.openCamera(cameraIdList[l], c10651v94, this.l);
            return true;
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e) {
            AbstractC4851eH1.a("VideoCapture", "allocate: manager.openCamera: ", e);
            return false;
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final boolean stopCaptureAndBlockUntilStopped() {
        int i;
        N.Mqw5545M(this.e, this);
        TraceEvent i2 = TraceEvent.i("VideoCaptureCamera2.stopCaptureAndBlockUntilStopped", null);
        try {
            synchronized (this.f) {
                while (true) {
                    i = this.o;
                    if (i == 2 || i == 3) {
                        break;
                    }
                    try {
                        this.f.wait();
                    } catch (InterruptedException e) {
                        AbstractC4851eH1.a("VideoCapture", "CaptureStartedEvent: ", e);
                    }
                }
                if (i == 3) {
                    if (i2 != null) {
                        i2.close();
                    }
                    return true;
                }
                this.l.post(new RunnableC12023z94(this));
                this.m.block();
                if (i2 != null) {
                    i2.close();
                }
                return true;
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.media.VideoCapture
    public final void getPhotoCapabilitiesAsync(long j) {
        N.Mqw5545M(this.e, this);
        this.l.post(new RunnableC10994w94(this, j));
    }

    @Override // org.chromium.media.VideoCapture
    public final void setPhotoOptions(double d, int i, double d2, int i2, double d3, double d4, double[] dArr, boolean z, double d5, double d6, int i3, double d7, boolean z2, boolean z3, int i4, boolean z4, boolean z5, double d8) {
        N.Mqw5545M(this.e, this);
        this.l.post(new RunnableC11680y94(this, new C11337x94(this, d, i, d2, i2, d3, d4, dArr, z, d5, d6, i3, d7, z2, z3, i4, z4, z5, d8)));
    }

    @Override // org.chromium.media.VideoCapture
    public final void takePhotoAsync(long j) {
        N.Mqw5545M(this.e, this);
        TraceEvent.h("VideoCaptureCamera2.java", "takePhotoAsync");
        this.l.post(new A94(this, j));
    }
}
