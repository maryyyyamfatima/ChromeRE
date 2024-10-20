package defpackage;

import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11284x1 implements Runnable {
    public final /* synthetic */ AccessibilityTabModelListItem a;

    public RunnableC11284x1(AccessibilityTabModelListItem accessibilityTabModelListItem) {
        this.a = accessibilityTabModelListItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = AccessibilityTabModelListItem.M;
        this.a.b();
    }
}
