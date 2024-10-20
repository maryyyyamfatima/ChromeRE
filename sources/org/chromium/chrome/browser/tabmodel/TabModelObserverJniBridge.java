package org.chromium.chrome.browser.tabmodel;

import J.N;
import defpackage.InterfaceC8876pz3;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabModelObserverJniBridge implements InterfaceC8876pz3 {
    public long a;
    public TabModel g;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void V(boolean z) {
    }

    public TabModelObserverJniBridge(long j, TabModel tabModel) {
        this.a = j;
        this.g = tabModel;
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        N.M15BMjns(this.a, this, tab, i, i2);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        N.MSSvav7n(this.a, this, tab, z);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        N.MD9N_bFw(this.a, this, tab.getId(), tab.isIncognito());
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void A(List list) {
        N.MJppr5RA(this.a, this, (Tab[]) list.toArray(new Tab[0]));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void X(int i, Tab tab) {
        N.MMKCgOHG(this.a, this, tab, i);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        N.M7iC4IGa(this.a, this, tab, i);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Y(int i, int i2, Tab tab) {
        N.MMKEWgan(this.a, this, tab, i, i2);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        N.MJ8c7fEV(this.a, this, tab);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        N.MkEswtJX(this.a, this, tab);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        N.MRzpb9vm(this.a, this, tab);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void O(List list, boolean z) {
        N.M8YIOTao(this.a, this, (Tab[]) list.toArray(new Tab[0]));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void u(boolean z) {
        N.M2XM7FhU(this.a, this);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        N.M9V3veZz(this.a, this, tab);
    }

    public static TabModelObserverJniBridge create(long j, TabModel tabModel) {
        TabModelObserverJniBridge tabModelObserverJniBridge = new TabModelObserverJniBridge(j, tabModel);
        tabModel.g(tabModelObserverJniBridge);
        return tabModelObserverJniBridge;
    }

    public final void detachFromTabModel() {
        this.g.i(this);
        this.a = 0L;
        this.g = null;
    }
}
