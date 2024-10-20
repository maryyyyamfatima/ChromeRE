package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aR1 */
/* loaded from: classes.dex */
public final class C3527aR1 extends WQ1 {
    public C3527aR1(ZQ1 zq1) {
        super(zq1);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        Display display;
        AbstractC12278zu3 abstractC12278zu3 = (AbstractC12278zu3) ((ZQ1) this.a);
        int j = abstractC12278zu3.j(routeInfo);
        if (j >= 0) {
            C11249wu3 c11249wu3 = (C11249wu3) abstractC12278zu3.v.get(j);
            try {
                display = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                display = null;
            }
            int displayId = display != null ? display.getDisplayId() : -1;
            if (displayId != c11249wu3.c.a.getInt("presentationDisplayId", -1)) {
                TP1 tp1 = c11249wu3.c;
                if (tp1 == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(tp1.a);
                ArrayList<String> arrayList = !tp1.b().isEmpty() ? new ArrayList<>(tp1.b()) : null;
                tp1.a();
                ArrayList<? extends Parcelable> arrayList2 = tp1.c.isEmpty() ? null : new ArrayList<>(tp1.c);
                bundle.putInt("presentationDisplayId", displayId);
                if (arrayList2 != null) {
                    bundle.putParcelableArrayList("controlFilters", arrayList2);
                }
                if (arrayList != null) {
                    bundle.putStringArrayList("groupMemberIds", arrayList);
                }
                c11249wu3.c = new TP1(bundle);
                abstractC12278zu3.s();
            }
        }
    }
}
