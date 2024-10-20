package defpackage;

import android.view.View;
import org.chromium.chrome.browser.keyboard_accessory.bar_component.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11052wL1 implements InterfaceC7458ls {
    public final CL1 a = new CL1();
    public final C12157za2 g = new C12157za2();

    public final boolean a(View view) {
        CL1 cl1 = this.a;
        if (!cl1.a1() || cl1.b1(view)) {
            return false;
        }
        e eVar = cl1.m;
        LD2 ld2 = AbstractC6104hv1.b;
        C2961Wu1 c2961Wu1 = eVar.a;
        return c2961Wu1.a.j(ld2) && ((C7822mv1) c2961Wu1.h).a() != null;
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        CL1 cl1 = this.a;
        if (cl1.f1()) {
            cl1.d1();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.a.v;
    }
}
