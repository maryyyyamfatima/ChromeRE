package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z1 */
/* loaded from: classes.dex */
public final class C11970z1 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ AccessibilityTabModelListItem g;

    public C11970z1(AccessibilityTabModelListItem accessibilityTabModelListItem) {
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
        int i = AccessibilityTabModelListItem.M;
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.g;
        accessibilityTabModelListItem.e(false);
        accessibilityTabModelListItem.setAlpha(1.0f);
        accessibilityTabModelListItem.s.setAlpha(1.0f);
        accessibilityTabModelListItem.x.setAlpha(1.0f);
        accessibilityTabModelListItem.a();
        C10598v1 c10598v1 = accessibilityTabModelListItem.C;
        int id = accessibilityTabModelListItem.z.getId();
        C10941w1 c10941w1 = c10598v1.a;
        if (c10941w1.h.z(id)) {
            c10941w1.h.C(id);
        } else {
            TabModel tabModel = c10941w1.h;
            Tab c = AbstractC1558Lz3.c(tabModel, id);
            if (c != null) {
                tabModel.k(c, true, false);
            }
        }
        c10941w1.notifyDataSetChanged();
    }
}
