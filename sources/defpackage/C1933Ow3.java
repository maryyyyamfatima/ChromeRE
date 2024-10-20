package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tasks.tab_management.TabGroupUiToolbarView;
import org.chromium.chrome.browser.tasks.tab_management.TabListRecyclerView;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ow3 */
/* loaded from: classes.dex */
public final class C1933Ow3 implements InterfaceC4399cx3, InterfaceC1543Lw3, InterfaceC3657ao2 {
    public c A;
    public C4742dx3 B;
    public final Activity a;
    public final Context g;
    public final PropertyModel h;
    public final C10501uk1 i;
    public final TabGroupUiToolbarView j;
    public final ViewGroup k;
    public final OX2 l;
    public final InterfaceC7697ma2 m;
    public final QB n;
    public final I5 o;
    public final InterfaceC0079Ap3 p;
    public final ViewGroup q;
    public final InterfaceC10590uz3 r;
    public final InterfaceC0408Dd2 s;
    public final ViewOnClickListenerC1069If3 t;
    public final InterfaceC0079Ap3 u;
    public final InterfaceC10912vv3 v;
    public final InterfaceC0079Ap3 w;
    public final TabContentManager x;
    public UD2 y;
    public C0759Fv3 z;

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    public C1933Ow3(a aVar, ViewGroup viewGroup, C10501uk1 c10501uk1, OX2 ox2, InterfaceC7697ma2 interfaceC7697ma2, QB qb, I5 i5, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager, CompositorViewHolder compositorViewHolder, C5243fR c5243fR, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0408Dd2 interfaceC0408Dd2, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        TraceEvent i = TraceEvent.i("TabGroupUiCoordinator.constructor", null);
        try {
            this.a = aVar;
            Context context = viewGroup.getContext();
            this.g = context;
            this.i = c10501uk1;
            this.l = ox2;
            this.m = interfaceC7697ma2;
            this.h = new PropertyModel(AbstractC5086ex3.i);
            TabGroupUiToolbarView tabGroupUiToolbarView = (TabGroupUiToolbarView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0071, viewGroup, false);
            this.j = tabGroupUiToolbarView;
            this.k = tabGroupUiToolbarView.k;
            this.n = qb;
            this.o = i5;
            i5.b(this);
            this.p = interfaceC0079Ap3;
            this.r = interfaceC10590uz3;
            this.s = interfaceC0408Dd2;
            this.q = compositorViewHolder;
            this.t = viewOnClickListenerC1069If3;
            this.u = interfaceC0079Ap32;
            this.v = interfaceC10912vv3;
            this.w = c5243fR;
            this.x = tabContentManager;
            viewGroup.addView(tabGroupUiToolbarView);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void d(List list) {
        if (list != null && list.size() > 1) {
            QB qb = this.n;
            if (((m) qb).i() == 0) {
                TabListRecyclerView tabListRecyclerView = this.A.g;
                if (!CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGroupsContinuationAndroid:enable_launch_bug_fix"), false)) {
                    qb = null;
                }
                AbstractC7492lx3.b("IPH_TabGroupsTapToSeeAnotherTab", tabListRecyclerView, qb);
            }
        }
        c cVar = this.A;
        cVar.getClass();
        cVar.k(IE2.d(list), false, false);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.B.h();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.B.r();
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        if (((Boolean) this.p.get()).booleanValue()) {
            b();
            a();
        }
    }

    public final void b() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.r;
        if (interfaceC10590uz3 == null) {
            return;
        }
        C7502lz3 c7502lz3 = ((AbstractC11276wz3) interfaceC10590uz3).c;
        if (!AbstractC5177fD3.c() || (c7502lz3.e(false) instanceof C1024Hw3)) {
            C1024Hw3 c1024Hw3 = (C1024Hw3) c7502lz3.e(false);
            C1024Hw3 c1024Hw32 = (C1024Hw3) c7502lz3.e(true);
            EI2.e(c1024Hw3.o + c1024Hw32.o, "TabGroups.UserGroupCount");
            if (AbstractC5177fD3.d(this.g)) {
                int i = 0;
                for (int i2 = 0; i2 < c1024Hw3.o; i2++) {
                    if (AbstractC1414Kw3.a(C1695Nb0.m(c1024Hw3.getTabAt(i2)).r) != null) {
                        i++;
                    }
                }
                for (int i3 = 0; i3 < c1024Hw32.o; i3++) {
                    if (AbstractC1414Kw3.a(C1695Nb0.m(c1024Hw32.getTabAt(i3)).r) != null) {
                        i++;
                    }
                }
                EI2.e(i, "TabGroups.UserNamedGroupCount");
            }
        }
    }

    public final void a() {
        Tab h;
        boolean c = AbstractC5177fD3.c();
        InterfaceC10590uz3 interfaceC10590uz3 = this.r;
        if (!c || (((AbstractC11276wz3) interfaceC10590uz3).c.e(false) instanceof C1024Hw3)) {
            InterfaceC1422Ky1 interfaceC1422Ky1 = (InterfaceC1422Ky1) this.s.get();
            if ((interfaceC1422Ky1 == null || !((C9897sy1) interfaceC1422Ky1).G(2)) && (h = ((AbstractC11276wz3) interfaceC10590uz3).h()) != null) {
                ((C1024Hw3) ((AbstractC11276wz3) interfaceC10590uz3).c.d()).e0(h);
            }
        }
    }
}
