package org.chromium.chrome.browser.omnibox;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ LocationBarTablet a;
    public final /* synthetic */ int g;
    public final /* synthetic */ g h;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LocationBarTablet locationBarTablet = this.a;
        if (locationBarTablet.z == 0.0f) {
            locationBarTablet.y = false;
            locationBarTablet.C = 0;
            locationBarTablet.f();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        LocationBarTablet locationBarTablet = this.a;
        locationBarTablet.y = true;
        locationBarTablet.C = this.g;
        g gVar = this.h;
        gVar.K = true;
        gVar.i0();
    }

    public e(g gVar, LocationBarTablet locationBarTablet, int i) {
        this.h = gVar;
        this.a = locationBarTablet;
        this.g = i;
    }
}
