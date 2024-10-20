package defpackage;

import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bj3 */
/* loaded from: classes2.dex */
public final class C0179Bj3 implements InterfaceC8876pz3 {
    public final /* synthetic */ ViewOnClickListenerC0699Fj3 a;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void I(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void R(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Z(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void a0(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        if (viewOnClickListenerC0699Fj3.w != 1 || ((AbstractC11276wz3) viewOnClickListenerC0699Fj3.h).j(false).getCount() > 1) {
            return;
        }
        viewOnClickListenerC0699Fj3.B(false);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void L() {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        if (viewOnClickListenerC0699Fj3.i.j(AbstractC0829Gj3.e)) {
            if (viewOnClickListenerC0699Fj3.w != 1) {
                return;
            }
            viewOnClickListenerC0699Fj3.B(((AbstractC11276wz3) viewOnClickListenerC0699Fj3.h).j(false).getCount() > 0 && !viewOnClickListenerC0699Fj3.s);
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void X(int i, Tab tab) {
        OJ0 i2;
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        if (viewOnClickListenerC0699Fj3.w == 1 && i != 5 && (i2 = viewOnClickListenerC0699Fj3.i()) != null) {
            i2.a(25, false);
        }
        boolean z = (((AbstractC11276wz3) viewOnClickListenerC0699Fj3.h).j(false).getCount() == 0 && i == 5) ? false : true;
        viewOnClickListenerC0699Fj3.M = z;
        if (viewOnClickListenerC0699Fj3.w != 1 || z) {
            return;
        }
        if (viewOnClickListenerC0699Fj3.i.j(AbstractC6910kG3.g)) {
            return;
        }
        viewOnClickListenerC0699Fj3.B(!viewOnClickListenerC0699Fj3.s);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        if (viewOnClickListenerC0699Fj3.w == 1) {
            viewOnClickListenerC0699Fj3.B(true);
        }
    }

    public C0179Bj3(ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3) {
        this.a = viewOnClickListenerC0699Fj3;
    }
}
