package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6267iP1 extends AbstractC5584gQ1 {
    public final MediaRouter2 n;
    public final C10391uQ1 o;
    public final ArrayMap p;
    public final C5235fP1 q;
    public final C5923hP1 r;
    public final XO1 s;
    public final WO1 t;
    public ArrayList u;
    public final ArrayMap v;

    /* JADX WARN: Type inference failed for: r3v2, types: [WO1] */
    public C6267iP1(Context context, C10391uQ1 c10391uQ1) {
        super(context, null);
        MediaRouter2 mediaRouter2;
        this.p = new ArrayMap();
        this.q = new C5235fP1(this);
        this.r = new C5923hP1(this);
        this.s = new XO1(this);
        this.u = new ArrayList();
        this.v = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.n = mediaRouter2;
        this.o = c10391uQ1;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.t = new Executor() { // from class: WO1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC4896eQ1 d(String str) {
        return new C4891eP1((String) this.v.get(str), null);
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC4896eQ1 e(String str, String str2) {
        String id;
        String str3 = (String) this.v.get(str);
        for (C4548dP1 c4548dP1 : this.p.values()) {
            TP1 tp1 = c4548dP1.o;
            if (tp1 != null) {
                id = tp1.d();
            } else {
                id = c4548dP1.g.getId();
            }
            if (TextUtils.equals(str2, id)) {
                return new C4891eP1(str3, c4548dP1);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C4891eP1(str3, null);
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC3866bQ1 c(String str) {
        Iterator it = this.p.entrySet().iterator();
        while (it.hasNext()) {
            C4548dP1 c4548dP1 = (C4548dP1) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c4548dP1.f)) {
                return c4548dP1;
            }
        }
        return null;
    }

    public final void j() {
        List<MediaRoute2Info> routes;
        Bundle extras;
        String id;
        boolean isSystemRoute;
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        routes = this.n.getRoutes();
        for (MediaRoute2Info mediaRoute2Info : routes) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info)) {
                isSystemRoute = mediaRoute2Info.isSystemRoute();
                if (!isSystemRoute) {
                    arraySet.add(mediaRoute2Info);
                    arrayList.add(mediaRoute2Info);
                }
            }
        }
        if (arrayList.equals(this.u)) {
            return;
        }
        this.u = arrayList;
        ArrayMap arrayMap = this.v;
        arrayMap.clear();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info2 = (MediaRoute2Info) it.next();
            extras = mediaRoute2Info2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2Info2);
            } else {
                id = mediaRoute2Info2.getId();
                arrayMap.put(id, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.u.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2Info3 = (MediaRoute2Info) it2.next();
            TP1 c = LQ1.c(mediaRoute2Info3);
            if (mediaRoute2Info3 != null) {
                arrayList2.add(c);
            }
        }
        ArrayList arrayList3 = null;
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                TP1 tp1 = (TP1) it3.next();
                if (tp1 == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                } else if (arrayList3.contains(tp1)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(tp1);
            }
        }
        g(new C5928hQ1(arrayList3, true));
    }

    public final MediaRoute2Info i(String str) {
        String id;
        if (str == null) {
            return null;
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            id = mediaRoute2Info.getId();
            if (TextUtils.equals(id, str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    public final void k(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        Bundle controlHints;
        List selectableRoutes;
        List deselectableRoutes;
        String id;
        int volume;
        int volumeMax;
        int volumeHandling;
        C4548dP1 c4548dP1 = (C4548dP1) this.p.get(routingController);
        if (c4548dP1 == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList a = LQ1.a(selectedRoutes);
        TP1 c = LQ1.c((MediaRoute2Info) selectedRoutes.get(0));
        controlHints = routingController.getControlHints();
        String string = this.a.getString(R.string.f77990_resource_name_obfuscated_res_0x7f140684);
        TP1 tp1 = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    tp1 = new TP1(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (tp1 == null) {
            id = routingController.getId();
            SP1 sp1 = new SP1(id, string);
            Bundle bundle2 = sp1.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
            volume = routingController.getVolume();
            bundle2.putInt("volume", volume);
            volumeMax = routingController.getVolumeMax();
            bundle2.putInt("volumeMax", volumeMax);
            volumeHandling = routingController.getVolumeHandling();
            bundle2.putInt("volumeHandling", volumeHandling);
            c.a();
            sp1.a(c.c);
            if (!a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                    if (sp1.b == null) {
                        sp1.b = new ArrayList();
                    }
                    if (!sp1.b.contains(str)) {
                        sp1.b.add(str);
                    }
                }
            }
            tp1 = sp1.b();
        }
        selectableRoutes = routingController.getSelectableRoutes();
        ArrayList a2 = LQ1.a(selectableRoutes);
        deselectableRoutes = routingController.getDeselectableRoutes();
        ArrayList a3 = LQ1.a(deselectableRoutes);
        C5928hQ1 c5928hQ1 = this.l;
        if (c5928hQ1 == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<TP1> list = c5928hQ1.a;
        if (!list.isEmpty()) {
            for (TP1 tp12 : list) {
                String d = tp12.d();
                arrayList.add(new C3522aQ1(tp12, a.contains(d) ? 3 : 1, a3.contains(d), a2.contains(d), true));
            }
        }
        c4548dP1.o = tp1;
        c4548dP1.j(tp1, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    @Override // defpackage.AbstractC5584gQ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.WP1 r8) {
        /*
            r7 = this;
            xQ1 r0 = defpackage.MQ1.c
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            xQ1 r0 = defpackage.MQ1.c()
            int r0 = r0.A
        Ld:
            XO1 r2 = r7.s
            hP1 r3 = r7.r
            fP1 r4 = r7.q
            android.media.MediaRouter2 r5 = r7.n
            if (r0 <= 0) goto L72
            xQ1 r0 = defpackage.MQ1.c()
            if (r0 == 0) goto L29
            fR1 r0 = r0.q
            if (r0 != 0) goto L23
            r0 = r1
            goto L25
        L23:
            boolean r0 = r0.c
        L25:
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r8 != 0) goto L33
            WP1 r8 = new WP1
            jQ1 r6 = defpackage.C6614jQ1.c
            r8.<init>(r6, r1)
        L33:
            r8.a()
            jQ1 r1 = r8.b
            java.util.ArrayList r1 = r1.c()
            java.lang.String r6 = "android.media.intent.category.LIVE_AUDIO"
            if (r0 == 0) goto L4a
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L4d
            r1.add(r6)
            goto L4d
        L4a:
            r1.remove(r6)
        L4d:
            iQ1 r0 = new iQ1
            r0.<init>()
            r0.a(r1)
            jQ1 r0 = r0.b()
            WP1 r1 = new WP1
            boolean r8 = r8.b()
            r1.<init>(r0, r8)
            android.media.RouteDiscoveryPreference r8 = defpackage.LQ1.b(r1)
            WO1 r0 = r7.t
            defpackage.PO1.a(r5, r0, r4, r8)
            defpackage.QO1.a(r5, r0, r3)
            defpackage.RO1.a(r5, r0, r2)
            goto L7b
        L72:
            defpackage.SO1.a(r5, r4)
            defpackage.TO1.a(r5, r3)
            defpackage.UO1.a(r5, r2)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6267iP1.f(WP1):void");
    }
}
