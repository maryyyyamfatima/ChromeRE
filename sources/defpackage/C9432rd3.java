package defpackage;

import android.os.SystemClock;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rd3 */
/* loaded from: classes2.dex */
public final class C9432rd3 implements InterfaceC8876pz3 {
    public final /* synthetic */ C10461ud3 a;

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
        C10461ud3 c10461ud3 = this.a;
        c10461ud3.l.p(Boolean.valueOf(c10461ud3.b()));
        if (((AbstractC11276wz3) c10461ud3.g).o()) {
            return;
        }
        c10461ud3.o = false;
        c10461ud3.c(tab);
        if (i == 0 || i == 5 || c10461ud3.n) {
            c10461ud3.n = false;
            return;
        }
        c10461ud3.m.e(tab.getId(), SystemClock.uptimeMillis());
    }

    public C9432rd3(C10461ud3 c10461ud3) {
        this.a = c10461ud3;
    }
}
