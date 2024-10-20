package defpackage;

import android.app.Activity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: No2 */
/* loaded from: classes.dex */
public final class C1762No2 implements InterfaceC11179wj {
    public final /* synthetic */ ViewOnLayoutChangeListenerC1892Oo2 a;

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 6) {
            ViewOnLayoutChangeListenerC1892Oo2 viewOnLayoutChangeListenerC1892Oo2 = this.a;
            viewOnLayoutChangeListenerC1892Oo2.p = 2;
            viewOnLayoutChangeListenerC1892Oo2.l.post(viewOnLayoutChangeListenerC1892Oo2.h);
        }
    }

    public C1762No2(ViewOnLayoutChangeListenerC1892Oo2 viewOnLayoutChangeListenerC1892Oo2) {
        this.a = viewOnLayoutChangeListenerC1892Oo2;
    }
}
