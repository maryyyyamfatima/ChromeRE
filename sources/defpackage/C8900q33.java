package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q33 */
/* loaded from: classes.dex */
public final class C8900q33 extends BA0 implements InterfaceC7458ls, InterfaceC8876pz3 {
    public final C8385oa2 a = new C8385oa2();
    public final C8557p33 g = new Callback() { // from class: p33
        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }

        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            C8900q33.this.a.p(Boolean.valueOf(((Boolean) obj).booleanValue()));
        }
    };
    public SelectionPopupControllerImpl h;
    public Tab i;

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

    /* JADX WARN: Type inference failed for: r0v1, types: [p33] */
    public C8900q33(InterfaceC10590uz3 interfaceC10590uz3) {
        ((AbstractC11276wz3) interfaceC10590uz3).c.b(this);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.h.e();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.a;
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        this.a.p(Boolean.FALSE);
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.h;
        C8557p33 c8557p33 = this.g;
        if (selectionPopupControllerImpl != null) {
            selectionPopupControllerImpl.s.n(c8557p33);
        }
        if (tab.b() == null) {
            return;
        }
        if (this.i != null) {
            tab.w(this);
        }
        tab.v(this);
        this.i = tab;
        SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(tab.b());
        this.h = k;
        k.s.m(c8557p33);
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        C8385oa2 c8385oa2 = this.h.s;
        C8557p33 c8557p33 = this.g;
        c8385oa2.n(c8557p33);
        SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(tab.b());
        this.h = k;
        k.s.m(c8557p33);
    }
}
