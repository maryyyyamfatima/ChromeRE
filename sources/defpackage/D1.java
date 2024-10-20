package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D1 implements InterfaceC11609xx3 {
    public final /* synthetic */ AccessibilityTabModelWrapper a;

    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.a;
        boolean a = accessibilityTabModelWrapper.j.a();
        InterfaceC10590uz3 interfaceC10590uz3 = accessibilityTabModelWrapper.q;
        if (interfaceC10590uz3 == null || a == ((AbstractC11276wz3) interfaceC10590uz3).o()) {
            return;
        }
        ((C0129Az3) accessibilityTabModelWrapper.q).f();
        ((C0129Az3) accessibilityTabModelWrapper.q).t(a);
        accessibilityTabModelWrapper.b();
        accessibilityTabModelWrapper.announceForAccessibility(accessibilityTabModelWrapper.getResources().getString(a ? R.string.0_resource_name_obfuscated_res_0x7f140173 : R.string.0_resource_name_obfuscated_res_0x7f140175));
    }

    public D1(AccessibilityTabModelWrapper accessibilityTabModelWrapper) {
        this.a = accessibilityTabModelWrapper;
    }
}
