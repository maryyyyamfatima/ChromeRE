package com.google.common.logging.nano;

import defpackage.AbstractC8015nV1;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Vr$VREvent$SdkConfigurationParams extends RF0 implements Cloneable {
    public Boolean daydreamImageAlignmentEnabled = null;
    public Boolean useSystemClockForSensorTimestamps = null;
    public Boolean useMagnetometerInSensorFusion = null;
    public Boolean allowDynamicLibraryLoading = null;
    public Boolean cpuLateLatchingEnabled = null;
    public Integer daydreamImageAlignment = null;
    public AsyncReprojectionConfig asyncReprojectionConfig = null;
    public Boolean useOnlineMagnetometerCalibration = null;
    public Boolean useDeviceIdleDetection = null;
    public Boolean useStationaryBiasCorrection = null;
    public Boolean allowDynamicJavaLibraryLoading = null;
    public Boolean touchOverlayEnabled = null;
    public Boolean allowVrcoreHeadTracking = null;
    public Boolean allowVrcoreCompositing = null;
    public PerformanceOverlayInfo performanceOverlayInfo = null;
    public Boolean enableForcedTrackingCompat = null;
    public ScreenCaptureConfig screenCaptureConfig = null;
    public Boolean disallowMultiview = null;
    public Boolean dimUiLayer = null;
    public Boolean useDirectModeSensors = null;

    public Vr$VREvent$SdkConfigurationParams() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public final class PerformanceOverlayInfo extends RF0 implements Cloneable {
        public String version = null;

        public PerformanceOverlayInfo() {
            this.unknownFieldData = null;
            this.cachedSize = -1;
        }

        public final Object clone() {
            try {
                return (PerformanceOverlayInfo) a();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.AbstractC8015nV1
        public final AbstractC8015nV1 clone() {
            try {
                return (PerformanceOverlayInfo) a();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.RF0, defpackage.AbstractC8015nV1
        public final void writeTo(GV gv) {
            String str = this.version;
            if (str != null) {
                gv.x(1, str);
            }
            super.writeTo(gv);
        }

        @Override // defpackage.RF0, defpackage.AbstractC8015nV1
        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            String str = this.version;
            return str != null ? computeSerializedSize + GV.i(1, str) : computeSerializedSize;
        }

        @Override // defpackage.AbstractC8015nV1
        public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
            while (true) {
                int m = c12129zV.m();
                if (m == 0) {
                    break;
                }
                if (m != 10) {
                    if (!super.storeUnknownField(c12129zV, m)) {
                        break;
                    }
                } else {
                    this.version = c12129zV.l();
                }
            }
            return this;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public final class ScreenCaptureConfig extends RF0 implements Cloneable {
        public Boolean allowCasting = null;
        public Boolean allowScreenRecord = null;
        public Boolean allowScreenshot = null;

        public ScreenCaptureConfig() {
            this.unknownFieldData = null;
            this.cachedSize = -1;
        }

        public final Object clone() {
            try {
                return (ScreenCaptureConfig) a();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.AbstractC8015nV1
        public final AbstractC8015nV1 clone() {
            try {
                return (ScreenCaptureConfig) a();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.RF0, defpackage.AbstractC8015nV1
        public final void writeTo(GV gv) {
            Boolean bool = this.allowCasting;
            if (bool != null) {
                gv.n(1, bool.booleanValue());
            }
            Boolean bool2 = this.allowScreenRecord;
            if (bool2 != null) {
                gv.n(2, bool2.booleanValue());
            }
            Boolean bool3 = this.allowScreenshot;
            if (bool3 != null) {
                gv.n(3, bool3.booleanValue());
            }
            super.writeTo(gv);
        }

        @Override // defpackage.RF0, defpackage.AbstractC8015nV1
        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            Boolean bool = this.allowCasting;
            if (bool != null) {
                bool.booleanValue();
                computeSerializedSize += GV.a(1);
            }
            Boolean bool2 = this.allowScreenRecord;
            if (bool2 != null) {
                bool2.booleanValue();
                computeSerializedSize += GV.a(2);
            }
            Boolean bool3 = this.allowScreenshot;
            if (bool3 == null) {
                return computeSerializedSize;
            }
            bool3.booleanValue();
            return computeSerializedSize + GV.a(3);
        }

        @Override // defpackage.AbstractC8015nV1
        public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
            while (true) {
                int m = c12129zV.m();
                if (m == 0) {
                    break;
                }
                if (m == 8) {
                    this.allowCasting = Boolean.valueOf(c12129zV.c());
                } else if (m == 16) {
                    this.allowScreenRecord = Boolean.valueOf(c12129zV.c());
                } else if (m != 24) {
                    if (!super.storeUnknownField(c12129zV, m)) {
                        break;
                    }
                } else {
                    this.allowScreenshot = Boolean.valueOf(c12129zV.c());
                }
            }
            return this;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public final class AsyncReprojectionConfig extends RF0 implements Cloneable {
        public Long flags = null;
        public Long displayLatencyMicros = null;
        public Long blackBoost = null;
        public Long vsyncGracePeriodMicros = null;
        public Long stripsPerFrame = null;

        public AsyncReprojectionConfig() {
            this.unknownFieldData = null;
            this.cachedSize = -1;
        }

        public final Object clone() {
            try {
                return (AsyncReprojectionConfig) a();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.AbstractC8015nV1
        public final AbstractC8015nV1 clone() {
            try {
                return (AsyncReprojectionConfig) a();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.RF0, defpackage.AbstractC8015nV1
        public final void writeTo(GV gv) {
            Long l = this.flags;
            if (l != null) {
                gv.s(1, l.longValue());
            }
            Long l2 = this.displayLatencyMicros;
            if (l2 != null) {
                gv.s(2, l2.longValue());
            }
            Long l3 = this.blackBoost;
            if (l3 != null) {
                gv.s(3, l3.longValue());
            }
            Long l4 = this.vsyncGracePeriodMicros;
            if (l4 != null) {
                gv.s(4, l4.longValue());
            }
            Long l5 = this.stripsPerFrame;
            if (l5 != null) {
                gv.s(5, l5.longValue());
            }
            super.writeTo(gv);
        }

        @Override // defpackage.RF0, defpackage.AbstractC8015nV1
        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            Long l = this.flags;
            if (l != null) {
                computeSerializedSize += GV.e(1, l.longValue());
            }
            Long l2 = this.displayLatencyMicros;
            if (l2 != null) {
                computeSerializedSize += GV.e(2, l2.longValue());
            }
            Long l3 = this.blackBoost;
            if (l3 != null) {
                computeSerializedSize += GV.e(3, l3.longValue());
            }
            Long l4 = this.vsyncGracePeriodMicros;
            if (l4 != null) {
                computeSerializedSize += GV.e(4, l4.longValue());
            }
            Long l5 = this.stripsPerFrame;
            return l5 != null ? computeSerializedSize + GV.e(5, l5.longValue()) : computeSerializedSize;
        }

        @Override // defpackage.AbstractC8015nV1
        public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
            while (true) {
                int m = c12129zV.m();
                if (m == 0) {
                    break;
                }
                if (m == 8) {
                    this.flags = Long.valueOf(c12129zV.k());
                } else if (m == 16) {
                    this.displayLatencyMicros = Long.valueOf(c12129zV.k());
                } else if (m == 24) {
                    this.blackBoost = Long.valueOf(c12129zV.k());
                } else if (m == 32) {
                    this.vsyncGracePeriodMicros = Long.valueOf(c12129zV.k());
                } else if (m == 40) {
                    this.stripsPerFrame = Long.valueOf(c12129zV.k());
                } else if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            }
            return this;
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final Vr$VREvent$SdkConfigurationParams clone() {
        try {
            Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = (Vr$VREvent$SdkConfigurationParams) a();
            AsyncReprojectionConfig asyncReprojectionConfig = this.asyncReprojectionConfig;
            if (asyncReprojectionConfig != null) {
                try {
                    vr$VREvent$SdkConfigurationParams.asyncReprojectionConfig = (AsyncReprojectionConfig) asyncReprojectionConfig.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            PerformanceOverlayInfo performanceOverlayInfo = this.performanceOverlayInfo;
            if (performanceOverlayInfo != null) {
                try {
                    vr$VREvent$SdkConfigurationParams.performanceOverlayInfo = (PerformanceOverlayInfo) performanceOverlayInfo.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            ScreenCaptureConfig screenCaptureConfig = this.screenCaptureConfig;
            if (screenCaptureConfig != null) {
                try {
                    vr$VREvent$SdkConfigurationParams.screenCaptureConfig = (ScreenCaptureConfig) screenCaptureConfig.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            return vr$VREvent$SdkConfigurationParams;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Boolean bool = this.daydreamImageAlignmentEnabled;
        if (bool != null) {
            gv.n(1, bool.booleanValue());
        }
        Boolean bool2 = this.useSystemClockForSensorTimestamps;
        if (bool2 != null) {
            gv.n(2, bool2.booleanValue());
        }
        Boolean bool3 = this.useMagnetometerInSensorFusion;
        if (bool3 != null) {
            gv.n(3, bool3.booleanValue());
        }
        Boolean bool4 = this.allowDynamicLibraryLoading;
        if (bool4 != null) {
            gv.n(4, bool4.booleanValue());
        }
        Boolean bool5 = this.cpuLateLatchingEnabled;
        if (bool5 != null) {
            gv.n(5, bool5.booleanValue());
        }
        Integer num = this.daydreamImageAlignment;
        if (num != null) {
            gv.r(6, num.intValue());
        }
        AsyncReprojectionConfig asyncReprojectionConfig = this.asyncReprojectionConfig;
        if (asyncReprojectionConfig != null) {
            gv.t(7, asyncReprojectionConfig);
        }
        Boolean bool6 = this.useOnlineMagnetometerCalibration;
        if (bool6 != null) {
            gv.n(8, bool6.booleanValue());
        }
        Boolean bool7 = this.useDeviceIdleDetection;
        if (bool7 != null) {
            gv.n(9, bool7.booleanValue());
        }
        Boolean bool8 = this.useStationaryBiasCorrection;
        if (bool8 != null) {
            gv.n(10, bool8.booleanValue());
        }
        Boolean bool9 = this.allowDynamicJavaLibraryLoading;
        if (bool9 != null) {
            gv.n(11, bool9.booleanValue());
        }
        Boolean bool10 = this.touchOverlayEnabled;
        if (bool10 != null) {
            gv.n(12, bool10.booleanValue());
        }
        Boolean bool11 = this.allowVrcoreHeadTracking;
        if (bool11 != null) {
            gv.n(13, bool11.booleanValue());
        }
        Boolean bool12 = this.allowVrcoreCompositing;
        if (bool12 != null) {
            gv.n(14, bool12.booleanValue());
        }
        PerformanceOverlayInfo performanceOverlayInfo = this.performanceOverlayInfo;
        if (performanceOverlayInfo != null) {
            gv.t(15, performanceOverlayInfo);
        }
        Boolean bool13 = this.enableForcedTrackingCompat;
        if (bool13 != null) {
            gv.n(16, bool13.booleanValue());
        }
        ScreenCaptureConfig screenCaptureConfig = this.screenCaptureConfig;
        if (screenCaptureConfig != null) {
            gv.t(17, screenCaptureConfig);
        }
        Boolean bool14 = this.disallowMultiview;
        if (bool14 != null) {
            gv.n(18, bool14.booleanValue());
        }
        Boolean bool15 = this.dimUiLayer;
        if (bool15 != null) {
            gv.n(19, bool15.booleanValue());
        }
        Boolean bool16 = this.useDirectModeSensors;
        if (bool16 != null) {
            gv.n(20, bool16.booleanValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Boolean bool = this.daydreamImageAlignmentEnabled;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(1);
        }
        Boolean bool2 = this.useSystemClockForSensorTimestamps;
        if (bool2 != null) {
            bool2.booleanValue();
            computeSerializedSize += GV.a(2);
        }
        Boolean bool3 = this.useMagnetometerInSensorFusion;
        if (bool3 != null) {
            bool3.booleanValue();
            computeSerializedSize += GV.a(3);
        }
        Boolean bool4 = this.allowDynamicLibraryLoading;
        if (bool4 != null) {
            bool4.booleanValue();
            computeSerializedSize += GV.a(4);
        }
        Boolean bool5 = this.cpuLateLatchingEnabled;
        if (bool5 != null) {
            bool5.booleanValue();
            computeSerializedSize += GV.a(5);
        }
        Integer num = this.daydreamImageAlignment;
        if (num != null) {
            computeSerializedSize += GV.d(6, num.intValue());
        }
        AsyncReprojectionConfig asyncReprojectionConfig = this.asyncReprojectionConfig;
        if (asyncReprojectionConfig != null) {
            computeSerializedSize += GV.f(7, asyncReprojectionConfig);
        }
        Boolean bool6 = this.useOnlineMagnetometerCalibration;
        if (bool6 != null) {
            bool6.booleanValue();
            computeSerializedSize += GV.a(8);
        }
        Boolean bool7 = this.useDeviceIdleDetection;
        if (bool7 != null) {
            bool7.booleanValue();
            computeSerializedSize += GV.a(9);
        }
        Boolean bool8 = this.useStationaryBiasCorrection;
        if (bool8 != null) {
            bool8.booleanValue();
            computeSerializedSize += GV.a(10);
        }
        Boolean bool9 = this.allowDynamicJavaLibraryLoading;
        if (bool9 != null) {
            bool9.booleanValue();
            computeSerializedSize += GV.a(11);
        }
        Boolean bool10 = this.touchOverlayEnabled;
        if (bool10 != null) {
            bool10.booleanValue();
            computeSerializedSize += GV.a(12);
        }
        Boolean bool11 = this.allowVrcoreHeadTracking;
        if (bool11 != null) {
            bool11.booleanValue();
            computeSerializedSize += GV.a(13);
        }
        Boolean bool12 = this.allowVrcoreCompositing;
        if (bool12 != null) {
            bool12.booleanValue();
            computeSerializedSize += GV.a(14);
        }
        PerformanceOverlayInfo performanceOverlayInfo = this.performanceOverlayInfo;
        if (performanceOverlayInfo != null) {
            computeSerializedSize += GV.f(15, performanceOverlayInfo);
        }
        Boolean bool13 = this.enableForcedTrackingCompat;
        if (bool13 != null) {
            bool13.booleanValue();
            computeSerializedSize += GV.a(16);
        }
        ScreenCaptureConfig screenCaptureConfig = this.screenCaptureConfig;
        if (screenCaptureConfig != null) {
            computeSerializedSize += GV.f(17, screenCaptureConfig);
        }
        Boolean bool14 = this.disallowMultiview;
        if (bool14 != null) {
            bool14.booleanValue();
            computeSerializedSize += GV.a(18);
        }
        Boolean bool15 = this.dimUiLayer;
        if (bool15 != null) {
            bool15.booleanValue();
            computeSerializedSize += GV.a(19);
        }
        Boolean bool16 = this.useDirectModeSensors;
        if (bool16 == null) {
            return computeSerializedSize;
        }
        bool16.booleanValue();
        return computeSerializedSize + GV.a(20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:            return r6;     */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams.mergeFrom(zV):nV1");
    }
}
