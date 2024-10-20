package org.chromium.components.feature_engagement;

import android.text.TextUtils;
import defpackage.KU3;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CppWrappedTestTracker implements KU3 {
    @Override // defpackage.KU3
    public final void a(String str) {
    }

    @Override // defpackage.KU3
    public final String b() {
        return null;
    }

    @Override // defpackage.KU3
    public final void c(Runnable runnable, String str) {
    }

    @Override // defpackage.KU3
    public final void f(String str) {
    }

    public boolean hasEverTriggered(String str, boolean z) {
        return true;
    }

    @Override // defpackage.KU3
    public boolean isInitialized() {
        return true;
    }

    @Override // defpackage.KU3
    public void notifyEvent(String str) {
    }

    @Override // defpackage.KU3
    public final TriggerDetails e(String str) {
        return new TriggerDetails(TextUtils.equals(null, str), false);
    }

    @Override // defpackage.KU3
    public final void d(Callback callback) {
        callback.onResult(Boolean.TRUE);
    }

    @Override // defpackage.KU3
    public void dismissed(String str) {
        TextUtils.equals(null, str);
    }

    @Override // defpackage.KU3
    public void dismissedWithSnooze(String str, int i) {
        TextUtils.equals(null, str);
    }

    @Override // defpackage.KU3
    public int getTriggerState(String str) {
        return TextUtils.equals(null, str) ? 1 : 0;
    }

    @Override // defpackage.KU3
    public boolean shouldTriggerHelpUI(String str) {
        return TextUtils.equals(null, str);
    }

    @Override // defpackage.KU3
    public boolean wouldTriggerHelpUI(String str) {
        return TextUtils.equals(null, str);
    }
}
