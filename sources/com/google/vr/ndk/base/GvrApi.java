package com.google.vr.ndk.base;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.Preferences$DeveloperPrefs;
import com.google.vr.sdk.proto.nano.Preferences$UserPrefs;
import defpackage.AbstractC5729gq0;
import defpackage.AbstractC9595s51;
import defpackage.Qi4;
import defpackage.Si4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrApi {
    private static final boolean IS_ROBOLECTRIC_BUILD = "robolectric".equals(Build.FINGERPRINT);
    private static PoseTracker sPoseTrackerForTesting;
    private final Context context;
    private final DisplaySynchronizer displaySynchronizer;
    private long nativeGvrContext;
    private final boolean ownsNativeGvrContext;
    private ArrayList swapChainRefs;
    private final Qi4 vrParamsProvider;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    interface IdleListener {
        void onIdleChanged(boolean z);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public interface PoseTracker {
        void getHeadPoseInStartSpace(float[] fArr, long j);
    }

    public static native byte[] nativeAnalyticsCreateSample(long j, byte[] bArr);

    public static native long nativeBufferSpecCreate(long j);

    public static native void nativeBufferSpecDestroy(long j);

    public static native int nativeBufferSpecGetSamples(long j);

    public static native void nativeBufferSpecGetSize(long j, Point point);

    public static native void nativeBufferSpecSetColorFormat(long j, int i);

    public static native void nativeBufferSpecSetDepthStencilFormat(long j, int i);

    public static native void nativeBufferSpecSetMultiviewLayers(long j, int i);

    public static native void nativeBufferSpecSetSamples(long j, int i);

    public static native void nativeBufferSpecSetSize(long j, int i, int i2);

    public static native long nativeBufferViewportCreate(long j);

    public static native void nativeBufferViewportDestroy(long j);

    public static native boolean nativeBufferViewportEqual(long j, long j2);

    public static native int nativeBufferViewportGetExternalSurfaceId(long j);

    public static native float nativeBufferViewportGetOpacity(long j);

    public static native int nativeBufferViewportGetReprojection(long j);

    public static native int nativeBufferViewportGetSourceBufferIndex(long j);

    public static native void nativeBufferViewportGetSourceFov(long j, RectF rectF);

    public static native void nativeBufferViewportGetSourceUv(long j, RectF rectF);

    public static native int nativeBufferViewportGetTargetEye(long j);

    public static native void nativeBufferViewportGetTransform(long j, float[] fArr);

    public static native void nativeBufferViewportGetVignetteFraction(long j, PointF pointF);

    private native long nativeBufferViewportListCreate(long j);

    public static native void nativeBufferViewportListDestroy(long j);

    public static native void nativeBufferViewportListGetItem(long j, int i, long j2);

    public static native int nativeBufferViewportListGetSize(long j);

    public static native void nativeBufferViewportListSetItem(long j, int i, long j2);

    public static native void nativeBufferViewportSetExternalSurface(long j, long j2);

    public static native void nativeBufferViewportSetExternalSurfaceId(long j, int i);

    public static native void nativeBufferViewportSetEyeFromWorldMatrix(long j, float[] fArr);

    public static native void nativeBufferViewportSetOpacity(long j, float f);

    public static native void nativeBufferViewportSetReprojection(long j, int i);

    public static native void nativeBufferViewportSetSourceBufferIndex(long j, int i);

    public static native void nativeBufferViewportSetSourceFov(long j, float f, float f2, float f3, float f4);

    public static native void nativeBufferViewportSetSourceLayer(long j, int i);

    public static native void nativeBufferViewportSetSourceUv(long j, float f, float f2, float f3, float f4);

    public static native void nativeBufferViewportSetTargetEye(long j, int i);

    public static native void nativeBufferViewportSetTransform(long j, float[] fArr);

    public static native void nativeBufferViewportSetVignetteFraction(long j, float f, float f2);

    public static native void nativeBufferViewportUnsetEyeFromWorldMatrix(long j);

    private native int nativeClearError(long j);

    private native float[] nativeComputeDistortedPoint(long j, int i, float[] fArr);

    private native long nativeCreate(ClassLoader classLoader, Context context, long j, int i, int i2, float f, float f2, PoseTracker poseTracker);

    public static native long nativeCreateEvent();

    public static native long nativeCreateValue();

    public static native void nativeDestroyEvent(long j);

    public static native void nativeDestroyValue(long j);

    private native void nativeDistortToScreen(long j, int i, long j2, float[] fArr, long j3);

    private native void nativeDumpDebugData(long j);

    public static native long nativeExternalSurfaceCreate(long j);

    public static native long nativeExternalSurfaceCreateWithListeners(long j, Runnable runnable, Runnable runnable2, Handler handler);

    public static native void nativeExternalSurfaceDestroy(long j);

    public static native int nativeExternalSurfaceGetId(long j);

    public static native Surface nativeExternalSurfaceGetSurface(long j);

    public static native void nativeFrameBindBuffer(long j, int i);

    public static native void nativeFrameGetBufferSize(long j, int i, Point point);

    public static native int nativeFrameGetFramebufferObject(long j, int i);

    public static native void nativeFrameSubmit(long j, long j2, float[] fArr);

    public static native void nativeFrameUnbind(long j);

    private native boolean nativeGetAsyncReprojectionEnabled(long j);

    private native float nativeGetBorderSizeMeters(long j);

    private native long nativeGetCurrentProperties(long j);

    private native int nativeGetError(long j);

    private static native String nativeGetErrorString(int i);

    public static native long nativeGetEventFlags(long j);

    public static native long nativeGetEventTimestamp(long j);

    public static native int nativeGetEventType(long j);

    private native void nativeGetEyeFromHeadMatrix(long j, int i, float[] fArr);

    private native void nativeGetHeadSpaceFromStartSpaceRotation(long j, float[] fArr, long j2);

    private native void nativeGetHeadSpaceFromStartSpaceTransform(long j, float[] fArr, long j2);

    private native void nativeGetMaximumEffectiveRenderTargetSize(long j, Point point);

    public static native boolean nativeGetProperty(long j, int i, long j2);

    public static native long nativeGetRecenterEventFlags(long j);

    public static native void nativeGetRecenterEventStartSpaceFromTrackingSpaceTransform(long j, float[] fArr);

    public static native int nativeGetRecenterEventType(long j);

    private native void nativeGetRecommendedBufferViewports(long j, long j2);

    private native void nativeGetScreenBufferViewports(long j, long j2);

    private native void nativeGetScreenTargetSize(long j, Point point);

    private native long nativeGetUserPrefs(long j);

    private native String nativeGetViewerModel(long j);

    private native int nativeGetViewerType(long j);

    private native String nativeGetViewerVendor(long j);

    private native int[] nativeGetWindowBounds(long j);

    private native void nativeInitializeGl(long j);

    private native boolean nativeIsFeatureSupported(long j, int i);

    private native void nativeOnPauseReprojectionThread(long j);

    private native void nativeOnSurfaceChangedReprojectionThread(long j);

    private native void nativeOnSurfaceCreatedReprojectionThread(long j);

    private native void nativePause(long j);

    private native void nativePauseTracking(long j);

    private native byte[] nativePauseTrackingGetState(long j);

    private native boolean nativePollEvent(long j, long j2);

    private native void nativeRecenterTracking(long j);

    private native void nativeReconnectSensors(long j);

    private native void nativeReleaseGvrContext(long j);

    private native Point nativeRenderReprojectionThread(long j);

    private native void nativeRequestContextSharing(long j, EglReadyListener eglReadyListener);

    private native void nativeResetTracking(long j);

    private native void nativeResume(long j);

    private native void nativeResumeTracking(long j);

    private native void nativeResumeTrackingSetState(long j, byte[] bArr);

    private static native void nativeSetApplicationState(ClassLoader classLoader, Context context);

    private native boolean nativeSetAsyncReprojectionEnabled(long j, boolean z);

    private native void nativeSetDefaultFramebufferActive(long j);

    private native boolean nativeSetDefaultViewerProfile(long j, String str);

    private native void nativeSetDisplayMetrics(long j, int i, int i2, float f, float f2);

    private static native void nativeSetDynamicLibraryLoadingEnabled(boolean z);

    private native void nativeSetIdleListener(long j, IdleListener idleListener);

    private native void nativeSetIgnoreManualPauseResumeTracker(long j, boolean z);

    private native void nativeSetLensOffset(long j, float f, float f2, float f3);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    private native boolean nativeSetViewerParams(long j, byte[] bArr);

    public static native long nativeSwapChainAcquireFrame(long j);

    public static native long nativeSwapChainCreate(long j, long[] jArr);

    public static native void nativeSwapChainDestroy(long j);

    public static native int nativeSwapChainGetBufferCount(long j);

    public static native void nativeSwapChainGetBufferSize(long j, int i, Point point);

    public static native void nativeSwapChainResizeBuffer(long j, int i, int i2, int i3);

    public static native int nativeUserPrefsGetControllerHandedness(long j);

    public static native boolean nativeUserPrefsGetPerformanceHudEnabled(long j);

    public static native boolean nativeUserPrefsGetPerformanceMonitoringEnabled(long j);

    private static native boolean nativeUsingDynamicLibrary();

    private static native boolean nativeUsingShimLibrary();

    private native boolean nativeUsingVrDisplayService(long j);

    public static native long nativeValueAsFlags(long j);

    public static native float nativeValueAsFloat(long j);

    public static native int nativeValueAsInt(long j);

    public static native void nativeValueAsMat4f(long j, float[] fArr);

    public static native long nativeValueGetFlags(long j);

    public static boolean usingDynamicLibrary(Context context) {
        setApplicationState(context);
        return nativeUsingDynamicLibrary();
    }

    public static boolean usingShimLibrary() {
        return nativeUsingShimLibrary();
    }

    public GvrApi(Context context, DisplaySynchronizer displaySynchronizer) {
        long j;
        this.context = context;
        this.displaySynchronizer = displaySynchronizer;
        if (displaySynchronizer == null) {
            j = 0;
        } else {
            displaySynchronizer.a();
            j = displaySynchronizer.a;
        }
        Qi4 a = Si4.a(context);
        this.vrParamsProvider = a;
        Display$DisplayParams c = a.c();
        this.swapChainRefs = new ArrayList();
        DisplayMetrics computeCurrentDisplayMetrics = computeCurrentDisplayMetrics(c);
        this.ownsNativeGvrContext = true;
        if (IS_ROBOLECTRIC_BUILD) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            this.nativeGvrContext = nativeCreate(getClass().getClassLoader(), context.getApplicationContext(), j, computeCurrentDisplayMetrics.widthPixels, computeCurrentDisplayMetrics.heightPixels, computeCurrentDisplayMetrics.xdpi, computeCurrentDisplayMetrics.ydpi, sPoseTrackerForTesting);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            if (this.nativeGvrContext == 0) {
                throw new IllegalStateException("Native GVR context creation failed, implementation unavailable.");
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public GvrApi(Context context, long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Invalid wrapped native GVR context.");
        }
        this.context = context;
        this.ownsNativeGvrContext = false;
        this.nativeGvrContext = j;
        this.vrParamsProvider = Si4.a(context);
        this.displaySynchronizer = null;
        this.swapChainRefs = new ArrayList();
        setApplicationState(context);
    }

    public void requestContextSharing(EglReadyListener eglReadyListener) {
        nativeRequestContextSharing(this.nativeGvrContext, eglReadyListener);
    }

    public static DisplaySynchronizer createDefaultDisplaySynchronizer(Context context) {
        return new DisplaySynchronizer(context, AbstractC5729gq0.b(context));
    }

    public void finalize() {
        try {
            if (this.nativeGvrContext != 0) {
                Log.w("GvrApi", "GvrApi.shutdown() should be called to ensure resource cleanup");
                shutdown();
            }
        } finally {
            super.finalize();
        }
    }

    public Vr$VREvent$SdkConfigurationParams getSdkConfigurationParams() {
        return SdkConfigurationReader.getParams(this.context);
    }

    public void pause() {
        nativePause(this.nativeGvrContext);
    }

    public void resume() {
        nativeResume(this.nativeGvrContext);
    }

    public void shutdown() {
        ArrayList arrayList = this.swapChainRefs;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AbstractC9595s51.a(((WeakReference) obj).get());
        }
        if (this.nativeGvrContext != 0) {
            this.vrParamsProvider.close();
            if (this.ownsNativeGvrContext) {
                nativeReleaseGvrContext(this.nativeGvrContext);
            }
            this.nativeGvrContext = 0L;
        }
    }

    public long getNativeGvrContext() {
        return this.nativeGvrContext;
    }

    public boolean isOpenGLKHRDebugEnabled() {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs;
        Preferences$UserPrefs d = this.vrParamsProvider.d();
        return (d == null || (preferences$DeveloperPrefs = d.developerPrefs) == null || !preferences$DeveloperPrefs.getOpenglKhrDebugEnabled()) ? false : true;
    }

    public void dumpDebugData() {
        nativeDumpDebugData(this.nativeGvrContext);
    }

    public void onSurfaceCreatedReprojectionThread() {
        nativeOnSurfaceCreatedReprojectionThread(this.nativeGvrContext);
    }

    public void onSurfaceChangedReprojectionThread() {
        nativeOnSurfaceChangedReprojectionThread(this.nativeGvrContext);
    }

    public Point renderReprojectionThread() {
        return nativeRenderReprojectionThread(this.nativeGvrContext);
    }

    public void onPauseReprojectionThread() {
        nativeOnPauseReprojectionThread(this.nativeGvrContext);
    }

    public void setIgnoreManualTrackerPauseResume(boolean z) {
        nativeSetIgnoreManualPauseResumeTracker(this.nativeGvrContext, z);
    }

    public byte[] pauseTrackingGetState() {
        return nativePauseTrackingGetState(this.nativeGvrContext);
    }

    public void resumeTrackingSetState(byte[] bArr) {
        nativeResumeTrackingSetState(this.nativeGvrContext, bArr);
    }

    public void recenterTracking() {
        nativeRecenterTracking(this.nativeGvrContext);
    }

    public void setIdleListener(IdleListener idleListener) {
        nativeSetIdleListener(this.nativeGvrContext, idleListener);
    }

    public void refreshDisplayMetrics() {
        setDisplayMetrics(computeCurrentDisplayMetrics(this.vrParamsProvider.c()));
    }

    public int getViewerType() {
        return nativeGetViewerType(this.nativeGvrContext);
    }

    public boolean setAsyncReprojectionEnabled(boolean z) {
        return nativeSetAsyncReprojectionEnabled(this.nativeGvrContext, z);
    }

    public boolean getAsyncReprojectionEnabled() {
        return nativeGetAsyncReprojectionEnabled(this.nativeGvrContext);
    }

    public void setLensOffset(float f, float f2, float f3) {
        nativeSetLensOffset(this.nativeGvrContext, f, f2, f3);
    }

    public DisplayMetrics computeCurrentDisplayMetrics(Display$DisplayParams display$DisplayParams) {
        Display display;
        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        if (displaySynchronizer != null) {
            display = displaySynchronizer.h;
        } else {
            display = AbstractC5729gq0.b(this.context);
        }
        return AbstractC5729gq0.d(display, display$DisplayParams);
    }

    public void setDisplayMetrics(DisplayMetrics displayMetrics) {
        nativeSetDisplayMetrics(this.nativeGvrContext, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi);
    }

    public boolean usingVrDisplayService() {
        return nativeUsingVrDisplayService(this.nativeGvrContext);
    }

    private static void setApplicationState(Context context) {
        if (IS_ROBOLECTRIC_BUILD) {
            return;
        }
        nativeSetApplicationState(GvrApi.class.getClassLoader(), context.getApplicationContext());
    }

    static {
        DefaultNativeLibraryLoader.maybeLoadDefaultLibrary();
    }
}
