package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I0 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        final J0 j0 = (J0) obj;
        C2924Wn c2924Wn = (C2924Wn) abstractC9053qX;
        final View view = c2924Wn.a;
        if (view == null) {
            view = c2924Wn.b;
        }
        if (view != null) {
            if (!((j0.j & 1) != 0) || j0.k.isEmpty()) {
                return C5971hZ.a;
            }
            return new C6657jZ(new H4() { // from class: H0
                @Override // defpackage.H4
                public final void run() {
                    view.announceForAccessibility(j0.k);
                }
            });
        }
        return new C6315iZ(new IllegalStateException("Unable to locate the component's view."));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return J0.n;
    }
}
