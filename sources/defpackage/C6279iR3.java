package defpackage;

import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iR3 */
/* loaded from: classes2.dex */
public final class C6279iR3 implements InterfaceC8876pz3 {
    public Tab a;
    public final C5935hR3 g = new C5935hR3(this);
    public final /* synthetic */ Fl4 h;
    public final /* synthetic */ C6621jR3 i;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void D(Tab tab, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void I(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void X(int i, Tab tab) {
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
    public final /* synthetic */ void o(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        this.i.b();
        Tab tab2 = this.a;
        Fl4 fl4 = this.h;
        if (tab2 != null && tab2.b() != null) {
            this.a.b().P(fl4);
        }
        if (tab.b() != null) {
            tab.b().h0(fl4);
        }
        this.a = tab;
        tab.v(this.g);
    }

    public C6279iR3(C6621jR3 c6621jR3, C5591gR3 c5591gR3) {
        this.i = c6621jR3;
        this.h = c5591gR3;
    }
}
