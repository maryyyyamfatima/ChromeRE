package org.chromium.components.feature_engagement.internal;

import J.N;
import defpackage.AX;
import defpackage.KU3;
import org.chromium.base.Callback;
import org.chromium.components.feature_engagement.TriggerDetails;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TrackerImpl implements KU3 {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class DisplayLockHandleAndroid {
        public final void clearNativePtr() {
        }

        public static DisplayLockHandleAndroid create(long j) {
            return new DisplayLockHandleAndroid();
        }
    }

    public static TrackerImpl create(long j) {
        return new TrackerImpl(j);
    }

    public TrackerImpl(long j) {
        this.a = j;
    }

    @Override // defpackage.KU3
    public final void notifyEvent(String str) {
        N.M0aLPz1m(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final boolean shouldTriggerHelpUI(String str) {
        if (AX.e().g("enable-screenshot-ui-mode")) {
            return false;
        }
        return N.Mr$ygyBZ(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final TriggerDetails e(String str) {
        if (!AX.e().g("enable-screenshot-ui-mode")) {
            return (TriggerDetails) N.M3inO0zt(this.a, this, str);
        }
        return new TriggerDetails(false, false);
    }

    @Override // defpackage.KU3
    public final boolean wouldTriggerHelpUI(String str) {
        return N.ME$bTNVi(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final int getTriggerState(String str) {
        return N.MtnFGh0Q(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final void dismissed(String str) {
        N.M21A_pP$(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final void dismissedWithSnooze(String str, int i) {
        N.MOZVkFuy(this.a, this, str, i);
    }

    @Override // defpackage.KU3
    public final void f(String str) {
        N.MmhduNJ3(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final String b() {
        return N.MU51Y3Q_(this.a, this);
    }

    @Override // defpackage.KU3
    public final void c(Runnable runnable, String str) {
        N.M4jLRdty(this.a, this, str, runnable);
    }

    @Override // defpackage.KU3
    public final void a(String str) {
        N.M67MuK6a(this.a, this, str);
    }

    @Override // defpackage.KU3
    public final boolean isInitialized() {
        return N.MzNVGr12(this.a, this);
    }

    @Override // defpackage.KU3
    public final void d(Callback callback) {
        N.MLFWzkLW(this.a, this, callback);
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }

    public final long getNativePtr() {
        return this.a;
    }

    public static TriggerDetails createTriggerDetails(boolean z, boolean z2) {
        return new TriggerDetails(z, z2);
    }
}
