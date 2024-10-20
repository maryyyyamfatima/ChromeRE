package defpackage;

import android.os.IInterface;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ub1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC10447ub1 extends IInterface {
    void applyColorfulFade(int i, long j, int i2);

    void applyFade(int i, long j);

    void deprecated_setLensOffsets(float f, float f2, float f3, float f4);

    void dumpDebugData();

    int getTargetApiVersion();

    void invokeCloseAction();

    void recenterHeadTracking();

    HeadTrackingState requestStopTracking();

    void resumeHeadTracking(HeadTrackingState headTrackingState);

    void setLensOffset(float f, float f2, float f3);
}
