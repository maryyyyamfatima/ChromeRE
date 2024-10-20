package org.chromium.media;

import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.SparseArray;
import defpackage.AbstractC4851eH1;
import defpackage.B94;
import defpackage.C94;
import defpackage.D94;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class VideoCaptureFactory {
    public static int getCaptureFormatWidth(VideoCaptureFormat videoCaptureFormat) {
        return videoCaptureFormat.a;
    }

    public static int getCaptureFormatHeight(VideoCaptureFormat videoCaptureFormat) {
        return videoCaptureFormat.b;
    }

    public static int getCaptureFormatFramerate(VideoCaptureFormat videoCaptureFormat) {
        return videoCaptureFormat.c;
    }

    public static int getNumberOfCameras() {
        if (D94.a == -1) {
            String[] strArr = B94.G;
            int i = 0;
            try {
                CameraManager cameraManager = (CameraManager) V60.a.getSystemService("camera");
                if (cameraManager != null) {
                    try {
                        i = cameraManager.getCameraIdList().length;
                    } catch (CameraAccessException | AssertionError | SecurityException e) {
                        AbstractC4851eH1.a("VideoCapture", "getNumberOfCameras: getCameraIdList(): ", e);
                    }
                }
            } catch (IllegalArgumentException e2) {
                AbstractC4851eH1.a("VideoCapture", "getSystemService(Context.CAMERA_SERVICE): ", e2);
            }
            D94.a = i;
        }
        return D94.a;
    }

    public static int getCaptureFormatPixelFormat(VideoCaptureFormat videoCaptureFormat) {
        return videoCaptureFormat.d;
    }

    public static VideoCapture createVideoCapture(int i, long j) {
        if (isLegacyOrDeprecatedDevice(i)) {
            return new C94(i, j);
        }
        return new B94(i, j);
    }

    public static int getCaptureApiType(int i) {
        if (isLegacyOrDeprecatedDevice(i)) {
            return C94.e(i) == null ? 12 : 6;
        }
        CameraCharacteristics i2 = B94.i(B94.k(i));
        if (i2 == null) {
            return 12;
        }
        int intValue = ((Integer) i2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue != 2) {
            int[] iArr = (int[]) i2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            int length = iArr.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (iArr[i3] == 0) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (!z) {
                return 12;
            }
            if (intValue == 0) {
                return 9;
            }
            if (intValue == 1) {
                return 8;
            }
        }
        return 7;
    }

    public static boolean isZoomSupported(int i) {
        if (isLegacyOrDeprecatedDevice(i)) {
            SparseArray sparseArray = C94.r;
            try {
                Camera open = Camera.open(i);
                Camera.Parameters f = C94.f(open);
                if (f == null) {
                    return false;
                }
                boolean isZoomSupported = f.isZoomSupported();
                open.release();
                return isZoomSupported;
            } catch (RuntimeException e) {
                AbstractC4851eH1.a("VideoCapture", "Camera.open: ", e);
                return false;
            }
        }
        CameraCharacteristics i2 = B94.i(B94.k(i));
        if (i2 == null) {
            return false;
        }
        return ((Float) i2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 1.0f;
    }

    public static int getFacingMode(int i) {
        if (isLegacyOrDeprecatedDevice(i)) {
            Camera.CameraInfo e = C94.e(i);
            if (e != null) {
                int i2 = e.facing;
                if (i2 == 0) {
                    return 2;
                }
                if (i2 == 1) {
                    return 1;
                }
            }
            return 0;
        }
        CameraCharacteristics i3 = B94.i(B94.k(i));
        if (i3 != null) {
            int intValue = ((Integer) i3.get(CameraCharacteristics.LENS_FACING)).intValue();
            if (intValue == 0) {
                return 1;
            }
            if (intValue == 1) {
                return 2;
            }
        }
        return 0;
    }

    public static String getDeviceId(int i) {
        if (isLegacyOrDeprecatedDevice(i)) {
            SparseArray sparseArray = C94.r;
            return Integer.toString(i);
        }
        return B94.j(i);
    }

    public static String getDeviceName(int i) {
        Integer num;
        if (isLegacyOrDeprecatedDevice(i)) {
            Camera.CameraInfo e = C94.e(i);
            if (e == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder("camera ");
            sb.append(i);
            sb.append(", facing ");
            sb.append(e.facing != 1 ? "back" : "front");
            return sb.toString();
        }
        CameraCharacteristics i2 = B94.i(B94.k(i));
        if (i2 == null) {
            return null;
        }
        int intValue = ((Integer) i2.get(CameraCharacteristics.LENS_FACING)).intValue();
        boolean z = Build.VERSION.SDK_INT >= 29 && (num = (Integer) i2.get(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)) != null && num.equals(6);
        StringBuilder sb2 = new StringBuilder("camera2 ");
        sb2.append(i);
        sb2.append(", facing ");
        sb2.append(intValue != 0 ? "back" : "front");
        sb2.append(z ? " infrared" : "");
        return sb2.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:19|(2:21|(2:25|26)(2:23|24))|27|28|(1:30)|31|(1:33)|34|(8:37|(1:39)|40|(1:42)|43|(2:46|44)|47|35)|48|26|17) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006b, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006c, code lost:            defpackage.AbstractC4851eH1.a("VideoCapture", "Camera.Parameters.getSupportedPreviewFpsRange: ", r0);        r0 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.media.VideoCaptureFormat[] getDeviceSupportedFormats(int r18) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.VideoCaptureFactory.getDeviceSupportedFormats(int):org.chromium.media.VideoCaptureFormat[]");
    }

    public static boolean isLegacyOrDeprecatedDevice(int i) {
        CameraCharacteristics i2 = B94.i(i);
        return i2 != null && ((Integer) i2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
    }
}
