package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Au3 */
/* loaded from: classes.dex */
public class C0104Au3 extends AbstractC12278zu3 {
    @Override // defpackage.AbstractC11935yu3
    public final void t(Object obj) {
        ((MediaRouter) this.o).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    public C0104Au3(Context context, C11420xQ1 c11420xQ1) {
        super(context, c11420xQ1);
    }

    @Override // defpackage.AbstractC12278zu3, defpackage.AbstractC11935yu3
    public void o(C11249wu3 c11249wu3, SP1 sp1) {
        super.o(c11249wu3, sp1);
        CharSequence description = ((MediaRouter.RouteInfo) c11249wu3.a).getDescription();
        if (description != null) {
            sp1.a.putString("status", description.toString());
        }
    }

    @Override // defpackage.AbstractC11935yu3
    public final MediaRouter.RouteInfo m() {
        return ((MediaRouter) this.o).getDefaultRoute();
    }

    @Override // defpackage.AbstractC11935yu3
    public final void w(C11592xu3 c11592xu3) {
        super.w(c11592xu3);
        ((MediaRouter.UserRouteInfo) c11592xu3.b).setDescription(c11592xu3.a.e);
    }

    @Override // defpackage.AbstractC11935yu3
    public final void u() {
        boolean z = this.u;
        Object obj = this.p;
        Object obj2 = this.o;
        if (z) {
            ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
        }
        this.u = true;
        ((MediaRouter) obj2).addCallback(this.s, (MediaRouter.Callback) obj, (this.t ? 1 : 0) | 2);
    }

    @Override // defpackage.AbstractC12278zu3
    public final boolean x(C11249wu3 c11249wu3) {
        return ((MediaRouter.RouteInfo) c11249wu3.a).isConnecting();
    }
}
