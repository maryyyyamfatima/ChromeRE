package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gz3 */
/* loaded from: classes.dex */
public abstract class AbstractC0909Gz3 implements InterfaceC8876pz3 {
    public final InterfaceC10590uz3 a;
    public InterfaceC0259Bz3 g;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void D(Tab tab, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void I(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void R(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void X(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void Z(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void a0(int i, int i2, Tab tab) {
    }

    public void b() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void o(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void y(Tab tab) {
    }

    public AbstractC0909Gz3(InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = interfaceC10590uz3;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        if (abstractC11276wz3.a.isEmpty()) {
            C0779Fz3 c0779Fz3 = new C0779Fz3(this);
            this.g = c0779Fz3;
            abstractC11276wz3.c(c0779Fz3);
            return;
        }
        c();
    }

    public final void c() {
        ArrayList arrayList = ((AbstractC11276wz3) this.a).a;
        for (int i = 0; i < arrayList.size(); i++) {
            ((TabModel) arrayList.get(i)).g(this);
        }
        b();
    }

    public final void a() {
        InterfaceC0259Bz3 interfaceC0259Bz3 = this.g;
        InterfaceC10590uz3 interfaceC10590uz3 = this.a;
        if (interfaceC0259Bz3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).s(interfaceC0259Bz3);
            this.g = null;
        }
        ArrayList arrayList = ((AbstractC11276wz3) interfaceC10590uz3).a;
        for (int i = 0; i < arrayList.size(); i++) {
            ((TabModel) arrayList.get(i)).i(this);
        }
    }
}
