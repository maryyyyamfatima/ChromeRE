package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.ColorDrawable;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ne0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8063ne0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ColorDrawable a;
    public final /* synthetic */ CustomTabToolbar g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CustomTabToolbar customTabToolbar = this.g;
        customTabToolbar.D = false;
        CustomTabToolbar.c0(customTabToolbar, this.a.getColor());
    }

    public C8063ne0(CustomTabToolbar customTabToolbar, ColorDrawable colorDrawable) {
        this.g = customTabToolbar;
        this.a = colorDrawable;
    }
}
