package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5923hP1 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ C6267iP1 a;

    public C5923hP1(C6267iP1 c6267iP1) {
        this.a = c6267iP1;
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        MediaRouter2.RoutingController systemController;
        List selectedRoutes;
        String id;
        DQ1 dq1;
        this.a.p.remove(routingController);
        systemController = this.a.n.getSystemController();
        if (routingController2 != systemController) {
            selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            id = ((MediaRoute2Info) selectedRoutes.get(0)).getId();
            this.a.p.put(routingController2, new C4548dP1(this.a, routingController2, id));
            C11420xQ1 c11420xQ1 = this.a.o.a;
            Iterator it = c11420xQ1.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dq1 = null;
                    break;
                }
                dq1 = (DQ1) it.next();
                if (dq1.b() == c11420xQ1.f && TextUtils.equals(id, dq1.b)) {
                    break;
                }
            }
            if (dq1 == null) {
                Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
            } else {
                c11420xQ1.l(dq1, 3);
            }
            this.a.k(routingController2);
            return;
        }
        C11420xQ1 c11420xQ12 = this.a.o.a;
        DQ1 c = c11420xQ12.c();
        if (c11420xQ12.f() != c) {
            c11420xQ12.l(c, 3);
        }
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        DQ1 c;
        AbstractC4896eQ1 abstractC4896eQ1 = (AbstractC4896eQ1) this.a.p.remove(routingController);
        if (abstractC4896eQ1 == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
        } else {
            C11420xQ1 c11420xQ1 = this.a.o.a;
            if (abstractC4896eQ1 != c11420xQ1.u || c11420xQ1.f() == (c = c11420xQ1.c())) {
                return;
            }
            c11420xQ1.l(c, 2);
        }
    }
}
