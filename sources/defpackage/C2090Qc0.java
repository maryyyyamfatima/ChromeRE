package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.chrome.R;
import java.io.File;
import java.util.Iterator;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2090Qc0 implements InterfaceC6377ij3 {
    public final C3130Yc0 a;
    public final C4620dd0 g;
    public final PC h;
    public final InterfaceC3241Yy1 i;
    public final C6637jV j;
    public final C7629mN k;
    public final Activity l;
    public final InterfaceC3241Yy1 m;
    public final C9123qj0 n;
    public C9707sQ3 o;
    public C0100Au p;
    public boolean q;
    public boolean r;
    public int s;
    public final C1960Pc0 t;

    public final void b(long j, LoadUrlParams loadUrlParams) {
        Tab tab = this.g.b;
        if (tab == null || tab.isDestroyed()) {
            return;
        }
        PC pc = this.h;
        int i = 1;
        if (pc.F() == null) {
            C2875Wd0 c2875Wd0 = (C2875Wd0) this.i.get();
            c2875Wd0.l = j;
            if (tab.e()) {
                c2875Wd0.m = -1L;
                c2875Wd0.o = 2;
            } else {
                c2875Wd0.o = 1;
            }
        }
        Intent p = pc.p();
        String h = C1761No1.h(p);
        if (h != null) {
            int p2 = AbstractC2281Ro1.p(1, p, "android.support.browser.extra.referrer_policy");
            if (p2 >= 0 && p2 < 8) {
                i = p2;
            }
            loadUrlParams.e = new C3498aL2(h, i);
        }
        String f = C1761No1.f(p);
        if (f != null) {
            loadUrlParams.g = f;
        }
        loadUrlParams.d = C1761No1.l(pc.p(), (pc.J() || pc.L()) ? 134217734 : 134217728);
        tab.d(loadUrlParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [Nc0] */
    public final boolean d() {
        C4620dd0 c4620dd0 = this.g;
        Tab tab = c4620dd0.b;
        if (tab == null) {
            return false;
        }
        GURL url = tab.getUrl();
        if (AbstractC2290Rq0.c(url)) {
            url = AbstractC2290Rq0.a(url);
        }
        String i = url.i();
        boolean isEmpty = TextUtils.isEmpty(i);
        PC pc = this.h;
        if (isEmpty) {
            i = pc.D();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(i));
        intent.setFlags(268435456);
        intent.putExtra("com.android.chrome.from_open_in_browser", true);
        this.n.getClass();
        ResolveInfo d = AbstractC3017Xf2.d();
        String str = d != null ? d.activityInfo.packageName : null;
        Activity activity = this.l;
        if (str != null) {
            intent.setPackage(str);
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                intent.setPackage(null);
            }
        }
        boolean z = pc.G() || (pc instanceof C7062kj1);
        boolean z2 = (pc.J() || pc.L()) ? false : true;
        boolean j = z | C5877hG0.j(intent, true);
        Bundle bundle = ActivityOptions.makeCustomAnimation(activity, R.anim.f10_resource_name_obfuscated_res_0x7f020000, R.anim.f20_resource_name_obfuscated_res_0x7f020001).toBundle();
        if (z2 && j) {
            c4620dd0.a.d(this.t);
            ?? r0 = new Runnable() { // from class: Nc0
                @Override // java.lang.Runnable
                public final void run() {
                    C2090Qc0.this.a(1);
                }
            };
            C3130Yc0 c3130Yc0 = this.a;
            C4620dd0 c4620dd02 = c3130Yc0.s;
            Tab tab2 = c4620dd02.b;
            if (tab2 != null) {
                if (c3130Yc0.n.c().g().getCount() <= 1 && c4620dd02.b != null) {
                    c4620dd02.b = null;
                    c4620dd02.c = 0;
                    Iterator it = c4620dd02.a.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            break;
                        }
                        ((AbstractC4276cd0) c11814ya2.next()).a();
                    }
                }
                c3130Yc0.t.getClass();
                C10720vN2.a(tab2).b(intent, r0);
                c3130Yc0.g.startActivity(intent, bundle);
            }
        } else {
            if (!(pc.C() == 2)) {
                activity.startActivity(intent, bundle);
            } else {
                C1761No1.y(null, intent, ChromeLauncherActivity.class.getName());
            }
        }
        return true;
    }

    public C2090Qc0(C3130Yc0 c3130Yc0, C4620dd0 c4620dd0, PC pc, InterfaceC3241Yy1 interfaceC3241Yy1, C6637jV c6637jV, C7629mN c7629mN, Activity activity, I5 i5, InterfaceC3241Yy1 interfaceC3241Yy12, C9123qj0 c9123qj0) {
        C1960Pc0 c1960Pc0 = new C1960Pc0(this);
        this.t = c1960Pc0;
        this.a = c3130Yc0;
        this.g = c4620dd0;
        this.h = pc;
        this.i = interfaceC3241Yy1;
        this.j = c6637jV;
        this.k = c7629mN;
        this.l = activity;
        this.m = interfaceC3241Yy12;
        this.n = c9123qj0;
        i5.b(this);
        c4620dd0.a.a(c1960Pc0);
    }

    public final void a(int i) {
        C1663Mu3 c1663Mu3;
        if (this.q) {
            return;
        }
        int i2 = 1;
        this.q = true;
        this.s = i;
        if (i != 1) {
            PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: Oc0
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsConnection.b();
                }
            }, 500L);
        }
        C0100Au c0100Au = this.p;
        if (c0100Au != null) {
            AbstractActivityC1529Lu abstractActivityC1529Lu = c0100Au.a;
            if (i == 0) {
                abstractActivityC1529Lu.getClass();
                C1441Lc0 c1441Lc0 = c0100Au.b;
                Tab tab = c1441Lc0.h.b;
                String str = null;
                if (tab != null && (c1663Mu3 = (C1663Mu3) tab.F().b(C1663Mu3.class)) != null) {
                    str = c1663Mu3.g;
                }
                if (str != null) {
                    if (str.equals(c1441Lc0.a.e(c1441Lc0.g.u()))) {
                        i2 = c1441Lc0.i ? 3 : 2;
                    } else if (!c1441Lc0.i) {
                        i2 = 0;
                    }
                    NW0 nw0 = NW0.e;
                    if ("com.google.android.googlequicksearchbox".equals(str)) {
                        EI2.h(i2, 4, "CustomTabs.ConnectionStatusOnReturn.GSA");
                    } else {
                        EI2.h(i2, 4, "CustomTabs.ConnectionStatusOnReturn.NonGSA");
                    }
                }
            }
            abstractActivityC1529Lu.T1();
        }
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        this.q = false;
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        boolean z = this.q;
        C3130Yc0 c3130Yc0 = this.a;
        if (z) {
            c3130Yc0.n.c().d(true);
            final C5313fe0 c5313fe0 = c3130Yc0.m;
            c5313fe0.d.b(new Runnable() { // from class: be0
                @Override // java.lang.Runnable
                public final void run() {
                    C5313fe0 c5313fe02 = C5313fe0.this;
                    File file = new File(c5313fe02.n(), c5313fe02.d());
                    if (!file.exists() || file.delete()) {
                        return;
                    }
                    AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file), new Object[0]);
                }
            });
        } else {
            C3933bd0 c3933bd0 = c3130Yc0.n;
            if (c3933bd0.k == null) {
                c3933bd0.k = new C5319ff0();
            }
            c3933bd0.k.f();
        }
    }
}
