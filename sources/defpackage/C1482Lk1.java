package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lk1 */
/* loaded from: classes2.dex */
public final class C1482Lk1 implements InterfaceC11609xx3 {
    public final /* synthetic */ IncognitoToggleTabLayout a;

    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        IncognitoToggleTabLayout incognitoToggleTabLayout = this.a;
        boolean a = incognitoToggleTabLayout.V.a();
        InterfaceC10590uz3 interfaceC10590uz3 = incognitoToggleTabLayout.g0;
        if (interfaceC10590uz3 == null || a == ((AbstractC11276wz3) interfaceC10590uz3).o()) {
            return;
        }
        ((C0129Az3) incognitoToggleTabLayout.g0).f();
        ((C0129Az3) incognitoToggleTabLayout.g0).t(a);
        if (a) {
            EI2.b("Android.TabSwitcher.IncognitoClickedIsEmpty", incognitoToggleTabLayout.h0.f == 0);
        }
        incognitoToggleTabLayout.announceForAccessibility(incognitoToggleTabLayout.getResources().getString(a ? R.string.0_resource_name_obfuscated_res_0x7f140173 : R.string.0_resource_name_obfuscated_res_0x7f140175));
    }

    public C1482Lk1(IncognitoToggleTabLayout incognitoToggleTabLayout) {
        this.a = incognitoToggleTabLayout;
    }
}
