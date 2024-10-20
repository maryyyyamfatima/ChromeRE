package org.chromium.chrome.browser.toolbar.optional_button;

import android.transition.TransitionManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    public final /* synthetic */ OptionalButtonView a;

    @Override // java.lang.Runnable
    public final void run() {
        OptionalButtonView optionalButtonView = this.a;
        if (!optionalButtonView.A.a()) {
            optionalButtonView.e(false);
            return;
        }
        TransitionManager.beginDelayedTransition(optionalButtonView.m, optionalButtonView.a());
        optionalButtonView.i.setColorFilter(optionalButtonView.p);
        optionalButtonView.h.setVisibility(8);
        optionalButtonView.d(optionalButtonView.a);
        optionalButtonView.r = 6;
    }

    public c(OptionalButtonView optionalButtonView) {
        this.a = optionalButtonView;
    }
}
