package com.google.vr.ndk.base;

import android.content.Context;
import android.util.Log;
import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import com.google.vr.sdk.proto.nano.SdkConfiguration$SdkConfigurationRequest;
import defpackage.Qi4;
import defpackage.Si4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class SdkConfigurationReader {
    public static final Vr$VREvent$SdkConfigurationParams DEFAULT_PARAMS;
    static final Vr$VREvent$SdkConfigurationParams REQUESTED_PARAMS;
    static Vr$VREvent$SdkConfigurationParams sParams;

    public static Vr$VREvent$SdkConfigurationParams getParams(Context context) {
        synchronized (SdkConfigurationReader.class) {
            Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = sParams;
            if (vr$VREvent$SdkConfigurationParams != null) {
                return vr$VREvent$SdkConfigurationParams;
            }
            Qi4 a = Si4.a(context);
            Vr$VREvent$SdkConfigurationParams readParamsFromProvider = readParamsFromProvider(a);
            synchronized (SdkConfigurationReader.class) {
                sParams = readParamsFromProvider;
            }
            a.close();
            return sParams;
        }
    }

    private static Vr$VREvent$SdkConfigurationParams readParamsFromProvider(Qi4 qi4) {
        SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest = new SdkConfiguration$SdkConfigurationRequest();
        sdkConfiguration$SdkConfigurationRequest.requestedParams = REQUESTED_PARAMS;
        sdkConfiguration$SdkConfigurationRequest.sdkVersion = "1.130.0";
        Vr$VREvent$SdkConfigurationParams b = qi4.b(sdkConfiguration$SdkConfigurationRequest);
        if (b == null) {
            Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
            return DEFAULT_PARAMS;
        }
        new StringBuilder(String.valueOf(b).length() + 38);
        return b;
    }

    static {
        Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = new Vr$VREvent$SdkConfigurationParams();
        REQUESTED_PARAMS = vr$VREvent$SdkConfigurationParams;
        Boolean bool = Boolean.TRUE;
        vr$VREvent$SdkConfigurationParams.useSystemClockForSensorTimestamps = bool;
        vr$VREvent$SdkConfigurationParams.useMagnetometerInSensorFusion = bool;
        vr$VREvent$SdkConfigurationParams.useStationaryBiasCorrection = bool;
        vr$VREvent$SdkConfigurationParams.allowDynamicLibraryLoading = bool;
        vr$VREvent$SdkConfigurationParams.cpuLateLatchingEnabled = bool;
        vr$VREvent$SdkConfigurationParams.daydreamImageAlignment = 1;
        vr$VREvent$SdkConfigurationParams.asyncReprojectionConfig = new Vr$VREvent$SdkConfigurationParams.AsyncReprojectionConfig();
        vr$VREvent$SdkConfigurationParams.useOnlineMagnetometerCalibration = bool;
        vr$VREvent$SdkConfigurationParams.useDeviceIdleDetection = bool;
        vr$VREvent$SdkConfigurationParams.allowDynamicJavaLibraryLoading = bool;
        vr$VREvent$SdkConfigurationParams.touchOverlayEnabled = bool;
        vr$VREvent$SdkConfigurationParams.enableForcedTrackingCompat = bool;
        vr$VREvent$SdkConfigurationParams.allowVrcoreHeadTracking = bool;
        vr$VREvent$SdkConfigurationParams.allowVrcoreCompositing = bool;
        vr$VREvent$SdkConfigurationParams.screenCaptureConfig = new Vr$VREvent$SdkConfigurationParams.ScreenCaptureConfig();
        vr$VREvent$SdkConfigurationParams.dimUiLayer = bool;
        vr$VREvent$SdkConfigurationParams.disallowMultiview = bool;
        vr$VREvent$SdkConfigurationParams.useDirectModeSensors = bool;
        Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams2 = new Vr$VREvent$SdkConfigurationParams();
        DEFAULT_PARAMS = vr$VREvent$SdkConfigurationParams2;
        Boolean bool2 = Boolean.FALSE;
        vr$VREvent$SdkConfigurationParams2.useSystemClockForSensorTimestamps = bool2;
        vr$VREvent$SdkConfigurationParams2.useMagnetometerInSensorFusion = bool2;
        vr$VREvent$SdkConfigurationParams2.useStationaryBiasCorrection = bool2;
        vr$VREvent$SdkConfigurationParams2.allowDynamicLibraryLoading = bool2;
        vr$VREvent$SdkConfigurationParams2.cpuLateLatchingEnabled = bool2;
        vr$VREvent$SdkConfigurationParams2.daydreamImageAlignment = 3;
        vr$VREvent$SdkConfigurationParams2.asyncReprojectionConfig = null;
        vr$VREvent$SdkConfigurationParams2.useOnlineMagnetometerCalibration = bool2;
        vr$VREvent$SdkConfigurationParams2.useDeviceIdleDetection = bool2;
        vr$VREvent$SdkConfigurationParams2.allowDynamicJavaLibraryLoading = bool2;
        vr$VREvent$SdkConfigurationParams2.touchOverlayEnabled = bool2;
        vr$VREvent$SdkConfigurationParams2.enableForcedTrackingCompat = bool2;
        vr$VREvent$SdkConfigurationParams2.allowVrcoreHeadTracking = bool2;
        vr$VREvent$SdkConfigurationParams2.allowVrcoreCompositing = bool2;
        vr$VREvent$SdkConfigurationParams2.screenCaptureConfig = null;
        vr$VREvent$SdkConfigurationParams2.dimUiLayer = bool2;
        vr$VREvent$SdkConfigurationParams2.disallowMultiview = bool2;
        vr$VREvent$SdkConfigurationParams2.useDirectModeSensors = bool2;
    }
}
