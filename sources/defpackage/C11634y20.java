package defpackage;

import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y20 */
/* loaded from: classes.dex */
public final class C11634y20 extends BA0 {
    public final /* synthetic */ CompositorViewHolder a;

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        this.a.C.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11291x20(this));
    }

    @Override // defpackage.BA0
    public final void n0(boolean z) {
        CompositorViewHolder compositorViewHolder = this.a;
        compositorViewHolder.L = z;
        if (z) {
            return;
        }
        compositorViewHolder.z();
    }

    public C11634y20(CompositorViewHolder compositorViewHolder) {
        this.a = compositorViewHolder;
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        CompositorViewHolder compositorViewHolder = this.a;
        InterfaceC10590uz3 interfaceC10590uz3 = compositorViewHolder.s;
        if (interfaceC10590uz3 == null) {
            return;
        }
        compositorViewHolder.x(((AbstractC11276wz3) interfaceC10590uz3).h());
    }
}
