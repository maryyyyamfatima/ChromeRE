package com.google.vr.sdk.proto.nano;

import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Preferences$DeveloperPrefs extends RF0 implements Cloneable {
    private int bitField0_;
    private boolean captureEnabled_;
    private boolean dEPRECATEDGvrPlatformLibraryEnabled_;
    private boolean dEPRECATEDHeadTrackingServiceEnabled_;
    private boolean dEPRECATEDMotophoPatchEnabled_;
    private boolean developerLoggingEnabled_;
    private boolean forceUndistortedRendering_;
    private boolean frameTrackerEnabled_;
    private int motophoPatchMode_;
    private boolean openglKhrDebugEnabled_;
    private boolean performanceHudEnabled_;
    private boolean performanceLoggingActivated_;
    private boolean performanceMonitoringEnabled_;
    public Preferences$SafetyCylinderParams safetyCylinderParams;
    private boolean sensorLoggingEnabled_;

    public static int checkMotophoPatchModeOrThrow(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append(i);
        sb.append(" is not a valid enum MotophoPatchMode");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean getOpenglKhrDebugEnabled() {
        return this.openglKhrDebugEnabled_;
    }

    public Preferences$DeveloperPrefs() {
        clear();
    }

    public final Preferences$DeveloperPrefs clear() {
        this.bitField0_ = 0;
        this.performanceMonitoringEnabled_ = false;
        this.sensorLoggingEnabled_ = false;
        this.dEPRECATEDMotophoPatchEnabled_ = false;
        this.developerLoggingEnabled_ = false;
        this.forceUndistortedRendering_ = false;
        this.performanceHudEnabled_ = false;
        this.dEPRECATEDGvrPlatformLibraryEnabled_ = false;
        this.dEPRECATEDHeadTrackingServiceEnabled_ = false;
        this.captureEnabled_ = false;
        this.safetyCylinderParams = null;
        this.frameTrackerEnabled_ = false;
        this.motophoPatchMode_ = 0;
        this.performanceLoggingActivated_ = false;
        this.openglKhrDebugEnabled_ = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Preferences$DeveloperPrefs clone() {
        try {
            Preferences$DeveloperPrefs preferences$DeveloperPrefs = (Preferences$DeveloperPrefs) a();
            Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = this.safetyCylinderParams;
            if (preferences$SafetyCylinderParams != null) {
                preferences$DeveloperPrefs.safetyCylinderParams = preferences$SafetyCylinderParams.clone();
            }
            return preferences$DeveloperPrefs;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.n(1, this.performanceMonitoringEnabled_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.n(2, this.sensorLoggingEnabled_);
        }
        if ((this.bitField0_ & 4) != 0) {
            gv.n(3, this.dEPRECATEDMotophoPatchEnabled_);
        }
        if ((this.bitField0_ & 8) != 0) {
            gv.n(4, this.developerLoggingEnabled_);
        }
        if ((this.bitField0_ & 16) != 0) {
            gv.n(5, this.forceUndistortedRendering_);
        }
        if ((this.bitField0_ & 32) != 0) {
            gv.n(6, this.performanceHudEnabled_);
        }
        if ((this.bitField0_ & 64) != 0) {
            gv.n(7, this.dEPRECATEDGvrPlatformLibraryEnabled_);
        }
        if ((this.bitField0_ & 128) != 0) {
            gv.n(8, this.dEPRECATEDHeadTrackingServiceEnabled_);
        }
        if ((this.bitField0_ & 256) != 0) {
            gv.n(9, this.captureEnabled_);
        }
        Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = this.safetyCylinderParams;
        if (preferences$SafetyCylinderParams != null) {
            gv.t(10, preferences$SafetyCylinderParams);
        }
        if ((this.bitField0_ & 512) != 0) {
            gv.n(11, this.frameTrackerEnabled_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            gv.r(12, this.motophoPatchMode_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            gv.n(13, this.performanceLoggingActivated_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            gv.n(14, this.openglKhrDebugEnabled_);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.a(1);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += GV.a(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += GV.a(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += GV.a(4);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += GV.a(5);
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += GV.a(6);
        }
        if ((this.bitField0_ & 64) != 0) {
            computeSerializedSize += GV.a(7);
        }
        if ((this.bitField0_ & 128) != 0) {
            computeSerializedSize += GV.a(8);
        }
        if ((this.bitField0_ & 256) != 0) {
            computeSerializedSize += GV.a(9);
        }
        Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = this.safetyCylinderParams;
        if (preferences$SafetyCylinderParams != null) {
            computeSerializedSize += GV.f(10, preferences$SafetyCylinderParams);
        }
        if ((this.bitField0_ & 512) != 0) {
            computeSerializedSize += GV.a(11);
        }
        if ((this.bitField0_ & 1024) != 0) {
            computeSerializedSize += GV.d(12, this.motophoPatchMode_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            computeSerializedSize += GV.a(13);
        }
        return (this.bitField0_ & 4096) != 0 ? computeSerializedSize + GV.a(14) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Preferences$DeveloperPrefs mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            switch (m) {
                case 0:
                    return this;
                case 8:
                    this.performanceMonitoringEnabled_ = c12129zV.c();
                    this.bitField0_ |= 1;
                    break;
                case 16:
                    this.sensorLoggingEnabled_ = c12129zV.c();
                    this.bitField0_ |= 2;
                    break;
                case 24:
                    this.dEPRECATEDMotophoPatchEnabled_ = c12129zV.c();
                    this.bitField0_ |= 4;
                    break;
                case 32:
                    this.developerLoggingEnabled_ = c12129zV.c();
                    this.bitField0_ |= 8;
                    break;
                case 40:
                    this.forceUndistortedRendering_ = c12129zV.c();
                    this.bitField0_ |= 16;
                    break;
                case 48:
                    this.performanceHudEnabled_ = c12129zV.c();
                    this.bitField0_ |= 32;
                    break;
                case 56:
                    this.dEPRECATEDGvrPlatformLibraryEnabled_ = c12129zV.c();
                    this.bitField0_ |= 64;
                    break;
                case 64:
                    this.dEPRECATEDHeadTrackingServiceEnabled_ = c12129zV.c();
                    this.bitField0_ |= 128;
                    break;
                case 72:
                    this.captureEnabled_ = c12129zV.c();
                    this.bitField0_ |= 256;
                    break;
                case 82:
                    if (this.safetyCylinderParams == null) {
                        this.safetyCylinderParams = new Preferences$SafetyCylinderParams();
                    }
                    c12129zV.f(this.safetyCylinderParams);
                    break;
                case 88:
                    this.frameTrackerEnabled_ = c12129zV.c();
                    this.bitField0_ |= 512;
                    break;
                case 96:
                    this.bitField0_ |= 1024;
                    int i = c12129zV.e - c12129zV.b;
                    try {
                        this.motophoPatchMode_ = checkMotophoPatchModeOrThrow(c12129zV.j());
                        this.bitField0_ |= 1024;
                        break;
                    } catch (IllegalArgumentException unused) {
                        c12129zV.n(i);
                        storeUnknownField(c12129zV, m);
                        break;
                    }
                case 104:
                    this.performanceLoggingActivated_ = c12129zV.c();
                    this.bitField0_ |= 2048;
                    break;
                case 112:
                    this.openglKhrDebugEnabled_ = c12129zV.c();
                    this.bitField0_ |= 4096;
                    break;
                default:
                    if (!super.storeUnknownField(c12129zV, m)) {
                        return this;
                    }
                    break;
            }
        }
    }
}
