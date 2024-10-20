package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yu3 */
/* loaded from: classes.dex */
public abstract class AbstractC11935yu3 extends AbstractC0364Cu3 implements VQ1, XQ1 {
    public static final ArrayList x;
    public static final ArrayList y;
    public final InterfaceC0234Bu3 n;
    public final Object o;
    public final Object p;
    public final YQ1 q;
    public final MediaRouter.RouteCategory r;
    public int s;
    public boolean t;
    public boolean u;
    public final ArrayList v;
    public final ArrayList w;

    public abstract MediaRouter.RouteInfo m();

    public abstract void t(Object obj);

    public abstract void u();

    @Override // defpackage.AbstractC5584gQ1
    public final void f(WP1 wp1) {
        boolean z;
        int i = 0;
        if (wp1 != null) {
            wp1.a();
            ArrayList c = wp1.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            z = wp1.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.s == i && this.t == z) {
            return;
        }
        this.s = i;
        this.t = z;
        v();
    }

    public static C11592xu3 n(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof C11592xu3) {
            return (C11592xu3) tag;
        }
        return null;
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        x = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        y = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public AbstractC11935yu3(Context context, C11420xQ1 c11420xQ1) {
        super(context);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.n = c11420xQ1;
        Object systemService = context.getSystemService("media_router");
        this.o = systemService;
        this.p = new C3527aR1((AbstractC12278zu3) this);
        this.q = new YQ1(this);
        this.r = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140688), false);
        v();
    }

    @Override // defpackage.AbstractC5584gQ1
    public final AbstractC4896eQ1 d(String str) {
        int k = k(str);
        if (k >= 0) {
            return new C10906vu3(((C11249wu3) this.v.get(k)).a);
        }
        return null;
    }

    public final void v() {
        u();
        MediaRouter mediaRouter = (MediaRouter) this.o;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z |= i(it.next());
        }
        if (z) {
            s();
        }
    }

    public final boolean i(Object obj) {
        String format;
        String format2;
        if (n(obj) != null || j(obj) >= 0) {
            return false;
        }
        boolean z = m() == obj;
        Context context = this.a;
        if (z) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
            objArr[0] = Integer.valueOf((name != null ? name.toString() : "").hashCode());
            format = String.format(locale, "ROUTE_%08x", objArr);
        }
        if (k(format) >= 0) {
            int i = 2;
            while (true) {
                format2 = String.format(Locale.US, "%s_%d", format, Integer.valueOf(i));
                if (k(format2) < 0) {
                    break;
                }
                i++;
            }
            format = format2;
        }
        C11249wu3 c11249wu3 = new C11249wu3(obj, format);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
        SP1 sp1 = new SP1(format, name2 != null ? name2.toString() : "");
        o(c11249wu3, sp1);
        c11249wu3.c = sp1.b();
        this.v.add(c11249wu3);
        return true;
    }

    @Override // defpackage.XQ1
    public final void b(int i, Object obj) {
        C11592xu3 n = n(obj);
        if (n != null) {
            n.a.j(i);
        }
    }

    @Override // defpackage.XQ1
    public final void a(int i, Object obj) {
        C11592xu3 n = n(obj);
        if (n != null) {
            n.a.k(i);
        }
    }

    public final void p(DQ1 dq1) {
        AbstractC5584gQ1 b = dq1.b();
        Object obj = this.o;
        if (b != this) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.r);
            C11592xu3 c11592xu3 = new C11592xu3(dq1, createUserRoute);
            createUserRoute.setTag(c11592xu3);
            createUserRoute.setVolumeCallback(this.q);
            w(c11592xu3);
            this.w.add(c11592xu3);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int j = j(((MediaRouter) obj).getSelectedRoute(8388611));
        if (j < 0 || !((C11249wu3) this.v.get(j)).b.equals(dq1.b)) {
            return;
        }
        dq1.l();
    }

    public final void q(DQ1 dq1) {
        int l;
        if (dq1.b() == this || (l = l(dq1)) < 0) {
            return;
        }
        C11592xu3 c11592xu3 = (C11592xu3) this.w.remove(l);
        ((MediaRouter.RouteInfo) c11592xu3.b).setTag(null);
        Object obj = c11592xu3.b;
        ((MediaRouter.UserRouteInfo) obj).setVolumeCallback(null);
        try {
            ((MediaRouter) this.o).removeUserRoute((MediaRouter.UserRouteInfo) obj);
        } catch (IllegalArgumentException e) {
            Log.w("MediaRouterJellybean", "Failed to remove user route", e);
        }
    }

    public final void r(DQ1 dq1) {
        if (dq1.g()) {
            if (dq1.b() != this) {
                int l = l(dq1);
                if (l >= 0) {
                    t(((C11592xu3) this.w.get(l)).b);
                    return;
                }
                return;
            }
            int k = k(dq1.b);
            if (k >= 0) {
                t(((C11249wu3) this.v.get(k)).a);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            TP1 tp1 = ((C11249wu3) arrayList.get(i)).c;
            if (tp1 == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            } else if (arrayList2.contains(tp1)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList2.add(tp1);
        }
        g(new C5928hQ1(arrayList2, false));
    }

    public final int j(Object obj) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C11249wu3) arrayList.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C11249wu3) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(DQ1 dq1) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C11592xu3) arrayList.get(i)).a == dq1) {
                return i;
            }
        }
        return -1;
    }

    public void o(C11249wu3 c11249wu3, SP1 sp1) {
        int supportedTypes = ((MediaRouter.RouteInfo) c11249wu3.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            sp1.a(x);
        }
        if ((supportedTypes & 2) != 0) {
            sp1.a(y);
        }
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) c11249wu3.a;
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = sp1.a;
        bundle.putInt("playbackType", playbackType);
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    }

    public void w(C11592xu3 c11592xu3) {
        Object obj = c11592xu3.b;
        DQ1 dq1 = c11592xu3.a;
        ((MediaRouter.UserRouteInfo) obj).setName(dq1.d);
        int i = dq1.k;
        MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) c11592xu3.b;
        userRouteInfo.setPlaybackType(i);
        userRouteInfo.setPlaybackStream(dq1.l);
        userRouteInfo.setVolume(dq1.o);
        userRouteInfo.setVolumeMax(dq1.p);
        userRouteInfo.setVolumeHandling(dq1.c());
    }
}
