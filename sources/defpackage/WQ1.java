package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WQ1 extends MediaRouter.Callback {
    public final VQ1 a;

    public WQ1(VQ1 vq1) {
        this.a = vq1;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        DQ1 a;
        AbstractC11935yu3 abstractC11935yu3 = (AbstractC11935yu3) this.a;
        if (routeInfo != ((MediaRouter) abstractC11935yu3.o).getSelectedRoute(8388611)) {
            return;
        }
        C11592xu3 n = AbstractC11935yu3.n(routeInfo);
        if (n != null) {
            n.a.l();
            return;
        }
        int j = abstractC11935yu3.j(routeInfo);
        if (j >= 0) {
            String str = ((C11249wu3) abstractC11935yu3.v.get(j)).b;
            C11420xQ1 c11420xQ1 = (C11420xQ1) abstractC11935yu3.n;
            c11420xQ1.n.removeMessages(262);
            CQ1 d = c11420xQ1.d(c11420xQ1.c);
            if (d == null || (a = d.a(str)) == null) {
                return;
            }
            a.l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        AbstractC11935yu3 abstractC11935yu3 = (AbstractC11935yu3) this.a;
        if (abstractC11935yu3.i(routeInfo)) {
            abstractC11935yu3.s();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        AbstractC11935yu3 abstractC11935yu3 = (AbstractC11935yu3) this.a;
        abstractC11935yu3.getClass();
        if (AbstractC11935yu3.n(routeInfo) != null || (j = abstractC11935yu3.j(routeInfo)) < 0) {
            return;
        }
        abstractC11935yu3.v.remove(j);
        abstractC11935yu3.s();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        AbstractC11935yu3 abstractC11935yu3 = (AbstractC11935yu3) this.a;
        abstractC11935yu3.getClass();
        if (AbstractC11935yu3.n(routeInfo) != null || (j = abstractC11935yu3.j(routeInfo)) < 0) {
            return;
        }
        C11249wu3 c11249wu3 = (C11249wu3) abstractC11935yu3.v.get(j);
        String str = c11249wu3.b;
        CharSequence name = ((MediaRouter.RouteInfo) c11249wu3.a).getName(abstractC11935yu3.a);
        SP1 sp1 = new SP1(str, name != null ? name.toString() : "");
        abstractC11935yu3.o(c11249wu3, sp1);
        c11249wu3.c = sp1.b();
        abstractC11935yu3.s();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        AbstractC11935yu3 abstractC11935yu3 = (AbstractC11935yu3) this.a;
        abstractC11935yu3.getClass();
        if (AbstractC11935yu3.n(routeInfo) != null || (j = abstractC11935yu3.j(routeInfo)) < 0) {
            return;
        }
        C11249wu3 c11249wu3 = (C11249wu3) abstractC11935yu3.v.get(j);
        int volume = routeInfo.getVolume();
        if (volume != c11249wu3.c.a.getInt("volume")) {
            TP1 tp1 = c11249wu3.c;
            if (tp1 == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(tp1.a);
            ArrayList<String> arrayList = !tp1.b().isEmpty() ? new ArrayList<>(tp1.b()) : null;
            tp1.a();
            ArrayList<? extends Parcelable> arrayList2 = tp1.c.isEmpty() ? null : new ArrayList<>(tp1.c);
            bundle.putInt("volume", volume);
            if (arrayList2 != null) {
                bundle.putParcelableArrayList("controlFilters", arrayList2);
            }
            if (arrayList != null) {
                bundle.putStringArrayList("groupMemberIds", arrayList);
            }
            c11249wu3.c = new TP1(bundle);
            abstractC11935yu3.s();
        }
    }
}
