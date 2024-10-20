package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502Dw1 implements InterfaceC0096At0 {
    public boolean a;
    public final /* synthetic */ AbstractC0892Gw1 b;

    public C0502Dw1(AbstractC0892Gw1 abstractC0892Gw1) {
        this.b = abstractC0892Gw1;
        AccessibilityManager accessibilityManager = (AccessibilityManager) abstractC0892Gw1.i.getSystemService("accessibility");
        this.a = accessibilityManager.isEnabled();
        accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: Cw1
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                C0502Dw1 c0502Dw1 = C0502Dw1.this;
                c0502Dw1.a = z;
                c0502Dw1.b.t();
            }
        });
    }

    @Override // defpackage.InterfaceC0096At0
    public final boolean a() {
        return !this.a;
    }

    @Override // defpackage.InterfaceC0096At0
    public final boolean b() {
        return !this.a;
    }
}
