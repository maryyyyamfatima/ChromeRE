package com.google.vr.ndk.base;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import com.google.vr.sdk.proto.nano.CardboardDevice$DaydreamInternalParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$ScreenAlignmentMarker;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import defpackage.AbstractC5729gq0;
import defpackage.C8772ph4;
import defpackage.Ih4;
import defpackage.Yh4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class AbstractDaydreamTouchListener {
    private float borderSizeMeters;
    private double[] currentMarkerBestDists;
    private DisplayMetrics displayMetrics;
    private boolean lastMotionEventInHeadset;
    private int[] markerBestTouch;
    private float[][] markersInPixels;
    private int mostTouchesSeen;
    private float rotation;
    private int[] touchBestMarker;
    private boolean useRotationalAlignmentCorrection;
    private float xMetersPerPixel;
    private float yMetersPerPixel;
    private final String logTag = getClass().getSimpleName();
    private int angleSamplesReceived = 0;
    private float[] pixelTranslation = new float[2];
    private boolean enabled = true;
    private float[] lastTranslation = new float[2];
    private float[] translation = new float[2];

    public abstract boolean isDaydreamImageAlignmentEnabled();

    public abstract void logEvent(int i, Yh4 yh4);

    public abstract void setLensOffset(float f, float f2, float f3);

    public void setEnabled(boolean z) {
        this.enabled = z;
        if (z) {
            return;
        }
        resetTrackingState();
    }

    public void getTranslationInScreenSpace(float[] fArr) {
        if (fArr.length < 2) {
            throw new IllegalArgumentException("Translation array too small");
        }
        if (this.displayMetrics == null) {
            Log.e(this.logTag, "displayMetrics must be set before calling getTranslationInScreenSpace.");
            return;
        }
        float[] fArr2 = this.pixelTranslation;
        float f = fArr2[0] / r0.widthPixels;
        fArr[0] = f;
        float f2 = fArr2[1] / r0.heightPixels;
        fArr[1] = f2;
        fArr[0] = f * 2.0f;
        fArr[1] = f2 * (-2.0f);
    }

    public final boolean handleTouch(MotionEvent motionEvent, float f, float f2) {
        if (!processMotionEvent(motionEvent, f, f2)) {
            return false;
        }
        getTranslationInScreenSpace(this.translation);
        float[] fArr = this.translation;
        float f3 = fArr[0];
        float[] fArr2 = this.lastTranslation;
        if (f3 != fArr2[0] || fArr[1] != fArr2[1]) {
            fArr2[0] = f3;
            fArr2[1] = fArr[1];
            setLensOffset(fArr[0], fArr[1], this.rotation);
        }
        return true;
    }

    public final void initWithDisplayParams(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams) {
        this.displayMetrics = displayMetrics;
        this.borderSizeMeters = AbstractC5729gq0.a(display$DisplayParams);
        DisplayMetrics displayMetrics2 = this.displayMetrics;
        this.xMetersPerPixel = 0.0254f / displayMetrics2.xdpi;
        this.yMetersPerPixel = 0.0254f / displayMetrics2.ydpi;
        resetTrackingState();
    }

    public final void setDeviceParams(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams;
        CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr;
        if (cardboardDevice$DeviceParams == null || (cardboardDevice$DaydreamInternalParams = cardboardDevice$DeviceParams.daydreamInternal) == null || (cardboardDevice$ScreenAlignmentMarkerArr = cardboardDevice$DaydreamInternalParams.alignmentMarkers) == null) {
            Log.e(this.logTag, "Null deviceParams or no alignment markers found.");
            this.markersInPixels = null;
            return;
        }
        if (this.displayMetrics == null) {
            Log.e(this.logTag, "displayMetrics must be set before calling setDeviceParams.");
            return;
        }
        this.markersInPixels = new float[cardboardDevice$ScreenAlignmentMarkerArr.length];
        this.currentMarkerBestDists = new double[cardboardDevice$ScreenAlignmentMarkerArr.length];
        this.markerBestTouch = new int[cardboardDevice$ScreenAlignmentMarkerArr.length];
        for (int i = 0; i < cardboardDevice$ScreenAlignmentMarkerArr.length; i++) {
            CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = cardboardDevice$ScreenAlignmentMarkerArr[i];
            float[] fArr = new float[2];
            this.markersInPixels[i] = fArr;
            fArr[0] = (this.displayMetrics.widthPixels / 2) + (cardboardDevice$ScreenAlignmentMarker.getHorizontal() / this.xMetersPerPixel);
            this.markersInPixels[i][1] = this.displayMetrics.heightPixels - (((cardboardDevice$ScreenAlignmentMarker.getVertical() + cardboardDevice$DeviceParams.getTrayToLensDistance()) - this.borderSizeMeters) / this.yMetersPerPixel);
        }
        this.useRotationalAlignmentCorrection = cardboardDevice$DeviceParams.daydreamInternal.getUseRotationalAlignmentCorrection();
    }

    public boolean viewerNeedsTouchProcessing() {
        float[][] fArr;
        return this.enabled && (fArr = this.markersInPixels) != null && fArr.length > 0;
    }

    public boolean processMotionEvent(MotionEvent motionEvent, float f, float f2) {
        if (!viewerNeedsTouchProcessing()) {
            this.lastMotionEventInHeadset = false;
            return false;
        }
        if (!isDaydreamImageAlignmentEnabled()) {
            return true;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > this.mostTouchesSeen) {
            this.touchBestMarker = new int[pointerCount];
            this.mostTouchesSeen = pointerCount;
        }
        for (int i = 0; i < this.markersInPixels.length; i++) {
            this.markerBestTouch[i] = -1;
            this.currentMarkerBestDists[i] = 2.25E-4d;
        }
        for (int i2 = 0; i2 < pointerCount; i2++) {
            this.touchBestMarker[i2] = -1;
            int i3 = 0;
            double d = 2.25E-4d;
            while (true) {
                float[][] fArr = this.markersInPixels;
                if (i3 < fArr.length) {
                    float x = (fArr[i3][0] - (motionEvent.getX(i2) + f)) * this.xMetersPerPixel;
                    float y = (this.markersInPixels[i3][1] - (motionEvent.getY(i2) + f2)) * this.yMetersPerPixel;
                    double d2 = (x * x) + (y * y);
                    if (d2 < d) {
                        this.touchBestMarker[i2] = i3;
                        d = d2;
                    }
                    double[] dArr = this.currentMarkerBestDists;
                    if (d2 < dArr[i3]) {
                        dArr[i3] = d2;
                        this.markerBestTouch[i3] = i2;
                    }
                    i3++;
                }
            }
        }
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            int[] iArr = this.markerBestTouch;
            if (i4 >= iArr.length) {
                break;
            }
            int i6 = iArr[i4];
            if (i6 != -1) {
                if (this.touchBestMarker[i6] != i4) {
                    iArr[i4] = -1;
                } else {
                    i5++;
                    f3 += (motionEvent.getX(i6) + f) - this.markersInPixels[i4][0];
                    f4 += (motionEvent.getY(this.markerBestTouch[i4]) + f2) - this.markersInPixels[i4][1];
                }
            }
            i4++;
        }
        if (i5 > 0) {
            this.lastMotionEventInHeadset = true;
            float[] fArr2 = this.pixelTranslation;
            float f5 = i5;
            fArr2[0] = f3 / f5;
            fArr2[1] = f4 / f5;
        } else {
            this.lastMotionEventInHeadset = false;
            float[] fArr3 = this.pixelTranslation;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
        }
        if (i5 == 2 && this.useRotationalAlignmentCorrection) {
            this.rotation = getRotationRadians(motionEvent);
        } else {
            this.rotation = 0.0f;
        }
        if (pointerCount > 0) {
            int i7 = this.angleSamplesReceived + 1;
            this.angleSamplesReceived = i7;
            if (i7 == 200) {
                logPhoneAlignment(motionEvent, f, f2);
            }
        }
        return true;
    }

    public float getRotationRadians(MotionEvent motionEvent) {
        float[][] fArr = this.markersInPixels;
        if (fArr == null || fArr.length != 2) {
            Log.e(this.logTag, "No touch markers or the wrong number of touch markers.");
            return 0.0f;
        }
        double atan2 = Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1));
        float[][] fArr2 = this.markersInPixels;
        float f = fArr2[0][0];
        float[] fArr3 = fArr2[1];
        float atan22 = (float) (atan2 - Math.atan2(r1[1] - fArr3[1], f - fArr3[0]));
        if (atan22 > 1.5707963267948966d) {
            atan22 -= 3.1415927f;
        }
        return ((double) atan22) < -1.5707963267948966d ? atan22 + 3.1415927f : atan22;
    }

    private void resetTrackingState() {
        this.lastMotionEventInHeadset = false;
        float[] fArr = this.pixelTranslation;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.rotation = 0.0f;
        this.mostTouchesSeen = 0;
    }

    private void logPhoneAlignment(MotionEvent motionEvent, float f, float f2) {
        int pointerCount = motionEvent.getPointerCount();
        Yh4 yh4 = new Yh4();
        C8772ph4 c8772ph4 = new C8772ph4();
        yh4.E = c8772ph4;
        c8772ph4.a = new Ih4[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            Ih4[] ih4Arr = yh4.E.a;
            Ih4 ih4 = new Ih4();
            ih4Arr[i] = ih4;
            ih4.a = Float.valueOf(motionEvent.getX(i) + f);
            yh4.E.a[i].g = Float.valueOf(motionEvent.getY(i) + f2);
        }
        C8772ph4 c8772ph42 = yh4.E;
        Ih4 ih42 = new Ih4();
        c8772ph42.g = ih42;
        ih42.a = Float.valueOf(this.pixelTranslation[0]);
        yh4.E.g.g = Float.valueOf(this.pixelTranslation[1]);
        if (pointerCount == 2 && this.markersInPixels.length == 2) {
            double degrees = Math.toDegrees(getRotationRadians(motionEvent));
            yh4.E.h = Float.valueOf((float) degrees);
            String str = this.logTag;
            StringBuilder sb = new StringBuilder(58);
            sb.append("Phone angle in headset (degrees): ");
            sb.append(degrees);
            Log.i(str, sb.toString());
            String str2 = this.logTag;
            float x = motionEvent.getX(0) + f;
            float y = motionEvent.getY(0) + f2;
            StringBuilder sb2 = new StringBuilder(49);
            sb2.append("  Touch point 1: ");
            sb2.append(x);
            sb2.append(", ");
            sb2.append(y);
            Log.i(str2, sb2.toString());
            String str3 = this.logTag;
            float x2 = motionEvent.getX(1) + f;
            float y2 = motionEvent.getY(1) + f2;
            StringBuilder sb3 = new StringBuilder(49);
            sb3.append("  Touch point 2: ");
            sb3.append(x2);
            sb3.append(", ");
            sb3.append(y2);
            Log.i(str3, sb3.toString());
        }
        logEvent(2012, yh4);
    }
}
