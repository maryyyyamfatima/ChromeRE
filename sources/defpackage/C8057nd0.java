package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8057nd0 implements GC {
    public final Activity a;
    public final WindowAndroid g;
    public final FC h;
    public final InterfaceC7697ma2 i;
    public final PC j;
    public final C4620dd0 k;
    public final C2485Td0 l;
    public final C0624Eu3 m;
    public ViewGroup n;
    public PendingIntent o;
    public int[] p;
    public final ViewOnClickListenerC6339id0 q = new ViewOnClickListenerC6339id0(this);

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    public C8057nd0(Activity activity, WindowAndroid windowAndroid, PC pc, FC fc, InterfaceC7697ma2 interfaceC7697ma2, C2485Td0 c2485Td0, C0624Eu3 c0624Eu3, C4620dd0 c4620dd0, C10458ud0 c10458ud0) {
        this.a = activity;
        this.g = windowAndroid;
        this.j = pc;
        this.h = fc;
        this.i = interfaceC7697ma2;
        this.l = c2485Td0;
        this.m = c0624Eu3;
        this.k = c4620dd0;
        ((CC) fc).d(this);
        Callback callback = new Callback() { // from class: fd0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8057nd0 c8057nd0 = C8057nd0.this;
                c8057nd0.getClass();
                C0678Ff2 c0678Ff2 = ((C9897sy1) obj).z;
                c0678Ff2.b.a(new C7025kd0(c8057nd0));
            }
        };
        if (c10458ud0.m) {
            callback.onResult(((CompositorViewHolder) c10458ud0.i.get()).k);
        } else {
            c10458ud0.a.add(callback);
        }
        Callback callback2 = new Callback() { // from class: gd0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8057nd0 c8057nd0 = C8057nd0.this;
                if (c8057nd0.n == null) {
                    return;
                }
                Integer num = (Integer) ((C8385oa2) c8057nd0.i).g;
                boolean z = true;
                if (!(num != null && num.intValue() > 0)) {
                    Integer num2 = (Integer) c8057nd0.g.n.g;
                    if (!(num2 != null && num2.intValue() > 0)) {
                        z = false;
                    }
                }
                FC fc2 = c8057nd0.h;
                if (z) {
                    c8057nd0.c().setVisibility(8);
                    ((CC) fc2).k(0, 0);
                } else {
                    c8057nd0.c().setVisibility(0);
                    ((CC) fc2).k(c8057nd0.a(), 0);
                }
            }
        };
        windowAndroid.n.m(callback2);
        ((C8385oa2) interfaceC7697ma2).m(callback2);
    }

    public final ViewGroup c() {
        if (this.n == null) {
            this.n = (ViewGroup) ((ViewStub) this.a.findViewById(R.id.bottombar_stub)).inflate();
        }
        return this.n;
    }

    public static void g(View view) {
        view.setTag(R.id.view_id_tag_key, Integer.valueOf(view.getId()));
        view.setId(-1);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                g(viewGroup.getChildAt(i));
            }
        }
    }

    public final boolean f(RemoteViews remoteViews) {
        View view;
        ViewGroup c = c();
        boolean h = this.l.h();
        View view2 = null;
        if (h == this.m.b) {
            try {
                view2 = remoteViews.apply(V60.a, c);
            } catch (RuntimeException e) {
                AbstractC4851eH1.a("RemoteViewsInflater", "Failed to inflate the RemoteViews", e);
            }
        } else {
            try {
                Context context = V60.a;
                String str = remoteViews.getPackage();
                if (!context.getPackageName().equals(str)) {
                    context = AbstractC5475g52.a(0, context.createPackageContext(str, 4), h);
                }
                Context context2 = V60.a;
                view = LayoutInflater.from(context2).cloneInContext(new MM2(context2, context)).inflate(remoteViews.getLayoutId(), c, false);
                remoteViews.reapply(context2, view);
            } catch (PackageManager.NameNotFoundException | RuntimeException e2) {
                AbstractC4851eH1.a("RemoteViewsInflater", "Failed to inflate the RemoteViews", e2);
                view = null;
            }
            if (view == null) {
                try {
                    view2 = remoteViews.apply(V60.a, c);
                } catch (RuntimeException e3) {
                    AbstractC4851eH1.a("RemoteViewsInflater", "Failed to inflate the RemoteViews", e3);
                }
            } else {
                view2 = view;
            }
        }
        if (view2 == null) {
            return false;
        }
        int[] iArr = this.p;
        if (iArr != null && this.o != null) {
            for (int i : iArr) {
                if (i < 0) {
                    return false;
                }
                View findViewById = view2.findViewById(i);
                if (findViewById != null) {
                    findViewById.setOnClickListener(this.q);
                }
            }
        }
        if (UN.g.a()) {
            g(view2);
        }
        c().addView(view2, 1);
        view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7713md0(this, view2));
        return true;
    }

    public static void d(PendingIntent pendingIntent, Intent intent, Activity activity, C4620dd0 c4620dd0) {
        Intent intent2 = intent == null ? new Intent() : new Intent(intent);
        Tab tab = c4620dd0.b;
        if (tab != null) {
            intent2.setData(Uri.parse(tab.getUrl().i()));
        }
        try {
            pendingIntent.send(activity, 0, intent2, null, null);
        } catch (PendingIntent.CanceledException unused) {
            AbstractC4851eH1.a("CustomTab", "CanceledException when sending pending intent.", new Object[0]);
        }
    }

    @Override // defpackage.GC
    public final void k(int i) {
        if ((this.n == null && this.a.findViewById(R.id.bottombar_stub) == null) ? false : true) {
            c().setTranslationY(((CC) this.h).w * i);
        }
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        int i4;
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setTranslationY(i3);
        }
        if (a() != 0) {
            i = i3;
        }
        int a = a();
        FC fc = this.h;
        if (a == 0) {
            i4 = ((CC) fc).m;
        } else {
            i4 = ((CC) fc).o;
        }
        if (Math.abs(i) == i4 || i == 0) {
            CustomTabsConnection g = CustomTabsConnection.g();
            CustomTabsSessionToken u = this.j.u();
            boolean z2 = i != 0;
            g.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("hidden", z2);
            if (g.s(u, "onBottomBarScrollStateChanged", bundle) && g.d) {
                g.m(Boolean.valueOf(z2), "extraCallback(onBottomBarScrollStateChanged)");
            }
        }
    }

    public final int a() {
        ViewGroup viewGroup;
        PC pc = this.j;
        if (!((pc.k().isEmpty() && pc.e() == null) ? false : true) || (viewGroup = this.n) == null || viewGroup.getChildCount() < 2) {
            return 0;
        }
        return this.n.getChildAt(1).getHeight();
    }
}
