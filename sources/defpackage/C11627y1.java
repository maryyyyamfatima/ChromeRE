package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y1 */
/* loaded from: classes.dex */
public final class C11627y1 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ AccessibilityTabModelListItem g;

    public C11627y1(AccessibilityTabModelListItem accessibilityTabModelListItem) {
        this.g = accessibilityTabModelListItem;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
        this.g.G = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.g;
        C10598v1 c10598v1 = accessibilityTabModelListItem.C;
        int id = accessibilityTabModelListItem.z.getId();
        C10941w1 c10941w1 = c10598v1.a;
        TabModel tabModel = c10941w1.h;
        tabModel.k(AbstractC1558Lz3.c(tabModel, id), true, true);
        c10941w1.notifyDataSetChanged();
        accessibilityTabModelListItem.setTranslationX(0.0f);
        accessibilityTabModelListItem.setScaleX(1.0f);
        accessibilityTabModelListItem.setScaleY(1.0f);
        accessibilityTabModelListItem.setAlpha(0.0f);
        accessibilityTabModelListItem.e(true);
        accessibilityTabModelListItem.c(false);
        accessibilityTabModelListItem.I.postDelayed(accessibilityTabModelListItem.H, accessibilityTabModelListItem.h);
    }
}
