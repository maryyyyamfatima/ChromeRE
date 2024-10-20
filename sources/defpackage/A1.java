package defpackage;

import android.graphics.Bitmap;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A1 extends BA0 {
    public final /* synthetic */ AccessibilityTabModelListItem a;

    @Override // defpackage.BA0
    public final void k0(Tab tab, boolean z) {
        C10598v1 c10598v1;
        if (z) {
            AccessibilityTabModelListItem accessibilityTabModelListItem = this.a;
            if (accessibilityTabModelListItem.G || (c10598v1 = accessibilityTabModelListItem.C) == null) {
                return;
            }
            tab.getId();
            c10598v1.a.notifyDataSetChanged();
        }
    }

    public A1(AccessibilityTabModelListItem accessibilityTabModelListItem) {
        this.a = accessibilityTabModelListItem;
    }

    @Override // defpackage.BA0
    public final void x0(Tab tab, Bitmap bitmap) {
        int i = AccessibilityTabModelListItem.M;
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.a;
        accessibilityTabModelListItem.f();
        C10598v1 c10598v1 = accessibilityTabModelListItem.C;
        if (c10598v1 != null) {
            tab.getId();
            c10598v1.a.notifyDataSetChanged();
        }
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        int i = AccessibilityTabModelListItem.M;
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.a;
        accessibilityTabModelListItem.g();
        C10598v1 c10598v1 = accessibilityTabModelListItem.C;
        if (c10598v1 != null) {
            tab.getId();
            c10598v1.a.notifyDataSetChanged();
        }
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        int i = AccessibilityTabModelListItem.M;
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.a;
        accessibilityTabModelListItem.g();
        C10598v1 c10598v1 = accessibilityTabModelListItem.C;
        if (c10598v1 != null) {
            tabImpl.getId();
            c10598v1.a.notifyDataSetChanged();
        }
    }
}
