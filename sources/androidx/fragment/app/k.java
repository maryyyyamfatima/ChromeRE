package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC2503Tg3;
import defpackage.AbstractC2633Ug3;
import defpackage.AbstractC7328lV2;
import defpackage.C11434xT0;
import defpackage.C11491xd4;
import defpackage.C11562xp3;
import defpackage.C1593Mg3;
import defpackage.C1983Pg3;
import defpackage.C3536aT0;
import defpackage.C4707dr4;
import defpackage.C5598gT0;
import defpackage.C8348oT0;
import defpackage.Ec4;
import defpackage.EnumC11340xA1;
import defpackage.EnumC11683yA1;
import defpackage.G02;
import defpackage.InterfaceC11777yT0;
import defpackage.JS0;
import defpackage.KS0;
import defpackage.LA1;
import defpackage.MS0;
import defpackage.MT0;
import defpackage.NT0;
import defpackage.PT0;
import defpackage.QE1;
import defpackage.QT0;
import defpackage.RT0;
import defpackage.X5;
import defpackage.Y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class k {
    public final C5598gT0 a;
    public final NT0 b;
    public final c c;
    public boolean d = false;
    public int e = -1;

    public k(C5598gT0 c5598gT0, NT0 nt0, c cVar) {
        this.a = c5598gT0;
        this.b = nt0;
        this.c = cVar;
    }

    public k(C5598gT0 c5598gT0, NT0 nt0, ClassLoader classLoader, C8348oT0 c8348oT0, Bundle bundle) {
        this.a = c5598gT0;
        this.b = nt0;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        c a = c8348oT0.a(fragmentState.a);
        a.k = fragmentState.g;
        a.s = fragmentState.h;
        a.u = true;
        a.B = fragmentState.i;
        a.C = fragmentState.j;
        a.D = fragmentState.k;
        a.G = fragmentState.l;
        a.r = fragmentState.m;
        a.F = fragmentState.n;
        a.E = fragmentState.o;
        a.T = EnumC11683yA1.values()[fragmentState.p];
        a.n = fragmentState.q;
        a.o = fragmentState.r;
        a.N = fragmentState.s;
        this.c = a;
        a.g = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.E0(bundle2);
    }

    public k(C5598gT0 c5598gT0, NT0 nt0, c cVar, Bundle bundle) {
        this.a = c5598gT0;
        this.b = nt0;
        this.c = cVar;
        cVar.h = null;
        cVar.i = null;
        cVar.w = 0;
        cVar.t = false;
        cVar.q = false;
        c cVar2 = cVar.m;
        cVar.n = cVar2 != null ? cVar2.k : null;
        cVar.m = null;
        cVar.g = bundle;
        cVar.l = bundle.getBundle("arguments");
    }

    public final int d() {
        C1983Pg3 c1983Pg3;
        c cVar = this.c;
        if (cVar.x == null) {
            return cVar.a;
        }
        int i = this.e;
        int ordinal = cVar.T.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (cVar.s) {
            if (cVar.t) {
                i = Math.max(this.e, 2);
                View view = cVar.L;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, cVar.a) : Math.min(i, 1);
            }
        }
        if (!cVar.q) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = cVar.K;
        if (viewGroup != null) {
            AbstractC2633Ug3 f = AbstractC2633Ug3.f(viewGroup, cVar.M().F());
            f.getClass();
            C1983Pg3 d = f.d(cVar);
            r6 = d != null ? d.b : 0;
            Iterator it = f.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1983Pg3 = null;
                    break;
                }
                c1983Pg3 = (C1983Pg3) it.next();
                if (c1983Pg3.c.equals(cVar) && !c1983Pg3.f) {
                    break;
                }
            }
            if (c1983Pg3 != null && (r6 == 0 || r6 == 1)) {
                r6 = c1983Pg3.b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (cVar.r) {
            if (cVar.Y()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        return (!cVar.M || cVar.a >= 5) ? i : Math.min(i, 4);
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        NT0 nt0 = this.b;
        c cVar = this.c;
        if (this.d) {
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int d = d();
                int i = cVar.a;
                if (d == i) {
                    if (!z && i == -1 && cVar.r && !cVar.Y()) {
                        C11434xT0 c11434xT0 = nt0.d;
                        c11434xT0.getClass();
                        c11434xT0.b(cVar.k);
                        nt0.h(this);
                        cVar.U();
                    }
                    if (cVar.P) {
                        if (cVar.L != null && (viewGroup = cVar.K) != null) {
                            AbstractC2633Ug3 f = AbstractC2633Ug3.f(viewGroup, cVar.M().F());
                            if (!cVar.E) {
                                f.a(2, 1, this);
                            } else {
                                f.a(3, 1, this);
                            }
                        }
                        h hVar = cVar.x;
                        if (hVar != null && cVar.q && h.G(cVar)) {
                            hVar.E = true;
                        }
                        cVar.P = false;
                        cVar.z.l();
                    }
                    return;
                }
                if (d > i) {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            a();
                            break;
                        case 4:
                            if (cVar.L != null && (viewGroup3 = cVar.K) != null) {
                                AbstractC2633Ug3.f(viewGroup3, cVar.M().F()).a(AbstractC2503Tg3.b(cVar.L.getVisibility()), 2, this);
                            }
                            cVar.a = 4;
                            break;
                        case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                            q();
                            break;
                        case 6:
                            cVar.a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            cVar.a = 1;
                            break;
                        case 2:
                            cVar.t = false;
                            cVar.a = 2;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            if (cVar.L != null && cVar.h == null) {
                                p();
                            }
                            if (cVar.L != null && (viewGroup2 = cVar.K) != null) {
                                AbstractC2633Ug3.f(viewGroup2, cVar.M().F()).a(1, 3, this);
                            }
                            cVar.a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                            cVar.a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void j() {
        c cVar = this.c;
        if (cVar.s && cVar.t && !cVar.v) {
            Bundle bundle = cVar.g;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            cVar.x0(cVar.y0(bundle2), null, bundle2);
            View view = cVar.L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                cVar.L.setTag(R.id.fragment_container_view_tag, cVar);
                if (cVar.E) {
                    cVar.L.setVisibility(8);
                }
                Bundle bundle3 = cVar.g;
                cVar.v0(cVar.L, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                cVar.z.r(2);
                this.a.m(cVar, cVar.L, false);
                cVar.a = 2;
            }
        }
    }

    public final void m(ClassLoader classLoader) {
        c cVar = this.c;
        Bundle bundle = cVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (cVar.g.getBundle("savedInstanceState") == null) {
            cVar.g.putBundle("savedInstanceState", new Bundle());
        }
        cVar.h = cVar.g.getSparseParcelableArray("viewState");
        cVar.i = cVar.g.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) cVar.g.getParcelable("state");
        if (fragmentState != null) {
            cVar.n = fragmentState.q;
            cVar.o = fragmentState.r;
            Boolean bool = cVar.j;
            if (bool != null) {
                cVar.N = bool.booleanValue();
                cVar.j = null;
            } else {
                cVar.N = fragmentState.s;
            }
        }
        if (cVar.N) {
            return;
        }
        cVar.M = true;
    }

    public final void c() {
        c cVar = this.c;
        c cVar2 = cVar.m;
        k kVar = null;
        NT0 nt0 = this.b;
        if (cVar2 != null) {
            k kVar2 = (k) nt0.b.get(cVar2.k);
            if (kVar2 == null) {
                throw new IllegalStateException("Fragment " + cVar + " declared target fragment " + cVar.m + " that does not belong to this FragmentManager!");
            }
            cVar.n = cVar.m.k;
            cVar.m = null;
            kVar = kVar2;
        } else {
            String str = cVar.n;
            if (str != null && (kVar = (k) nt0.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(cVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(Y5.a(sb, cVar.n, " that does not belong to this FragmentManager!"));
            }
        }
        if (kVar != null) {
            kVar.k();
        }
        h hVar = cVar.x;
        cVar.y = hVar.u;
        cVar.A = hVar.w;
        C5598gT0 c5598gT0 = this.a;
        c5598gT0.g(false);
        ArrayList arrayList = cVar.Y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar3 = ((JS0) it.next()).a;
            cVar3.X.a();
            AbstractC7328lV2.a(cVar3);
        }
        arrayList.clear();
        cVar.z.b(cVar.y, cVar.G(), cVar);
        cVar.a = 0;
        cVar.f11484J = false;
        cVar.f0(cVar.y.g);
        if (!cVar.f11484J) {
            throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onAttach()"));
        }
        Iterator it2 = cVar.x.n.iterator();
        while (it2.hasNext()) {
            ((InterfaceC11777yT0) it2.next()).a(cVar);
        }
        h hVar2 = cVar.z;
        hVar2.F = false;
        hVar2.G = false;
        hVar2.M.m = false;
        hVar2.r(0);
        c5598gT0.b(false);
    }

    public final void e() {
        Bundle bundle;
        c cVar = this.c;
        Bundle bundle2 = cVar.g;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (!cVar.R) {
            C5598gT0 c5598gT0 = this.a;
            c5598gT0.h(false);
            cVar.z.L();
            cVar.a = 1;
            cVar.f11484J = false;
            cVar.U.a(new MS0(cVar));
            Bundle bundle4 = cVar.g;
            cVar.X.b(bundle4 != null ? bundle4.getBundle("registryState") : null);
            cVar.g0(bundle3);
            cVar.R = true;
            if (!cVar.f11484J) {
                throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onCreate()"));
            }
            cVar.U.e(EnumC11340xA1.ON_CREATE);
            c5598gT0.c(false);
            return;
        }
        cVar.a = 1;
        Bundle bundle5 = cVar.g;
        if (bundle5 == null || (bundle = bundle5.getBundle("childFragmentManager")) == null) {
            return;
        }
        cVar.z.S(bundle);
        h hVar = cVar.z;
        hVar.F = false;
        hVar.G = false;
        hVar.M.m = false;
        hVar.r(1);
    }

    public final void f() {
        String str;
        c cVar = this.c;
        if (cVar.s) {
            return;
        }
        Bundle bundle = cVar.g;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater y0 = cVar.y0(bundle2);
        ViewGroup viewGroup = cVar.K;
        if (viewGroup == null) {
            int i = cVar.C;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(KS0.a("Cannot create fragment ", cVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) cVar.x.v.b(i);
                if (viewGroup == null) {
                    if (!cVar.u) {
                        try {
                            str = cVar.N().getResourceName(cVar.C);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(cVar.C) + " (" + str + ") for fragment " + cVar);
                    }
                } else if (!(viewGroup instanceof C3536aT0)) {
                    QT0 qt0 = RT0.a;
                    C4707dr4 c4707dr4 = new C4707dr4(cVar, viewGroup);
                    QT0 a = RT0.a(cVar);
                    if (a.a.contains(PT0.DETECT_WRONG_FRAGMENT_CONTAINER) && RT0.d(a, cVar.getClass(), C4707dr4.class)) {
                        RT0.b(a, c4707dr4);
                    }
                }
            }
        }
        cVar.K = viewGroup;
        cVar.x0(y0, viewGroup, bundle2);
        View view = cVar.L;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            cVar.L.setTag(R.id.fragment_container_view_tag, cVar);
            if (viewGroup != null) {
                b();
            }
            if (cVar.E) {
                cVar.L.setVisibility(8);
            }
            View view2 = cVar.L;
            WeakHashMap weakHashMap = Ec4.a;
            if (!view2.isAttachedToWindow()) {
                View view3 = cVar.L;
                view3.addOnAttachStateChangeListener(new MT0(view3));
            } else {
                cVar.L.requestApplyInsets();
            }
            Bundle bundle3 = cVar.g;
            cVar.v0(cVar.L, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            cVar.z.r(2);
            this.a.m(cVar, cVar.L, false);
            int visibility = cVar.L.getVisibility();
            cVar.I().l = cVar.L.getAlpha();
            if (cVar.K != null && visibility == 0) {
                View findFocus = cVar.L.findFocus();
                if (findFocus != null) {
                    cVar.I().m = findFocus;
                }
                cVar.L.setAlpha(0.0f);
            }
        }
        cVar.a = 2;
    }

    public final void a() {
        c cVar = this.c;
        Bundle bundle = cVar.g;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        cVar.z.L();
        cVar.a = 3;
        cVar.f11484J = false;
        cVar.c0();
        if (!cVar.f11484J) {
            throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onActivityCreated()"));
        }
        if (cVar.L != null) {
            Bundle bundle2 = cVar.g;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = cVar.h;
            if (sparseArray != null) {
                cVar.L.restoreHierarchyState(sparseArray);
                cVar.h = null;
            }
            if (cVar.L != null) {
                cVar.V.i.b(cVar.i);
                cVar.i = null;
            }
            cVar.f11484J = false;
            cVar.w0(bundle3);
            if (!cVar.f11484J) {
                throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onViewStateRestored()"));
            }
            if (cVar.L != null) {
                cVar.V.a(EnumC11340xA1.ON_CREATE);
            }
        }
        cVar.g = null;
        h hVar = cVar.z;
        hVar.F = false;
        hVar.G = false;
        hVar.M.m = false;
        hVar.r(4);
        this.a.a(false);
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        c cVar = this.c;
        if (cVar.a == -1 && (bundle = cVar.g) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(cVar));
        if (cVar.a > -1) {
            Bundle bundle3 = new Bundle();
            cVar.s0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(false);
            Bundle bundle4 = new Bundle();
            cVar.X.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle T = cVar.z.T();
            if (!T.isEmpty()) {
                bundle2.putBundle("childFragmentManager", T);
            }
            if (cVar.L != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = cVar.h;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = cVar.i;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = cVar.l;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        c cVar = this.c;
        if (cVar.L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        cVar.L.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            cVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        cVar.V.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        cVar.i = bundle;
    }

    public final void h() {
        View view;
        c cVar = this.c;
        ViewGroup viewGroup = cVar.K;
        if (viewGroup != null && (view = cVar.L) != null) {
            viewGroup.removeView(view);
        }
        cVar.z.r(1);
        if (cVar.L != null && cVar.V.Z().b.a(EnumC11683yA1.CREATED)) {
            cVar.V.a(EnumC11340xA1.ON_DESTROY);
        }
        cVar.a = 1;
        cVar.f11484J = false;
        cVar.k0();
        if (cVar.f11484J) {
            C1593Mg3 c1593Mg3 = ((QE1) new C11491xd4(cVar.w(), QE1.i).a(QE1.class)).h;
            if (c1593Mg3.i() > 0) {
                X5.a(c1593Mg3.j(0));
                throw null;
            }
            cVar.v = false;
            this.a.n(false);
            cVar.K = null;
            cVar.L = null;
            cVar.V = null;
            G02 g02 = cVar.W;
            g02.getClass();
            G02.a("setValue");
            g02.g++;
            g02.e = null;
            g02.c(null);
            cVar.t = false;
            return;
        }
        throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onDestroyView()"));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.g():void");
    }

    public final void b() {
        View view;
        View view2;
        NT0 nt0 = this.b;
        nt0.getClass();
        c cVar = this.c;
        ViewGroup viewGroup = cVar.K;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = nt0.a;
            int indexOf = arrayList.indexOf(cVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        c cVar2 = (c) arrayList.get(indexOf);
                        if (cVar2.K == viewGroup && (view = cVar2.L) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    c cVar3 = (c) arrayList.get(i2);
                    if (cVar3.K == viewGroup && (view2 = cVar3.L) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        cVar.K.addView(cVar.L, i);
    }

    public final void q() {
        c cVar = this.c;
        cVar.z.L();
        cVar.z.w(true);
        cVar.a = 5;
        cVar.f11484J = false;
        cVar.t0();
        if (!cVar.f11484J) {
            throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onStart()"));
        }
        LA1 la1 = cVar.U;
        EnumC11340xA1 enumC11340xA1 = EnumC11340xA1.ON_START;
        la1.e(enumC11340xA1);
        if (cVar.L != null) {
            cVar.V.a(enumC11340xA1);
        }
        h hVar = cVar.z;
        hVar.F = false;
        hVar.G = false;
        hVar.M.m = false;
        hVar.r(5);
        this.a.k(false);
    }

    public final void l() {
        c cVar = this.c;
        cVar.z.r(5);
        View view = cVar.L;
        EnumC11340xA1 enumC11340xA1 = EnumC11340xA1.ON_PAUSE;
        if (view != null) {
            cVar.V.a(enumC11340xA1);
        }
        cVar.U.e(enumC11340xA1);
        cVar.a = 6;
        cVar.f11484J = false;
        cVar.p0();
        if (cVar.f11484J) {
            this.a.f(false);
            return;
        }
        throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onPause()"));
    }

    public final void r() {
        c cVar = this.c;
        h hVar = cVar.z;
        hVar.G = true;
        hVar.M.m = true;
        hVar.r(4);
        View view = cVar.L;
        EnumC11340xA1 enumC11340xA1 = EnumC11340xA1.ON_STOP;
        if (view != null) {
            cVar.V.a(enumC11340xA1);
        }
        cVar.U.e(enumC11340xA1);
        cVar.a = 4;
        cVar.f11484J = false;
        cVar.u0();
        if (cVar.f11484J) {
            this.a.l(false);
            return;
        }
        throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onStop()"));
    }

    public final void i() {
        c cVar = this.c;
        cVar.a = -1;
        boolean z = false;
        cVar.f11484J = false;
        cVar.l0();
        cVar.Q = null;
        if (!cVar.f11484J) {
            throw new C11562xp3(KS0.a("Fragment ", cVar, " did not call through to super.onDetach()"));
        }
        h hVar = cVar.z;
        if (!hVar.H) {
            hVar.i();
            cVar.z = new h();
        }
        this.a.e(false);
        cVar.a = -1;
        cVar.y = null;
        cVar.A = null;
        cVar.x = null;
        boolean z2 = true;
        if (cVar.r && !cVar.Y()) {
            z = true;
        }
        if (!z) {
            C11434xT0 c11434xT0 = this.b.d;
            if (c11434xT0.h.containsKey(cVar.k) && c11434xT0.k) {
                z2 = c11434xT0.l;
            }
            if (!z2) {
                return;
            }
        }
        cVar.U();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r7 = this;
            androidx.fragment.app.c r0 = r7.c
            NS0 r1 = r0.O
            r2 = 0
            if (r1 != 0) goto L9
            r1 = r2
            goto Lb
        L9:
            android.view.View r1 = r1.m
        Lb:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2b
            android.view.View r5 = r0.L
            if (r1 != r5) goto L14
            goto L1e
        L14:
            android.view.ViewParent r5 = r1.getParent()
        L18:
            if (r5 == 0) goto L25
            android.view.View r6 = r0.L
            if (r5 != r6) goto L20
        L1e:
            r5 = r4
            goto L26
        L20:
            android.view.ViewParent r5 = r5.getParent()
            goto L18
        L25:
            r5 = r3
        L26:
            if (r5 == 0) goto L2b
            r1.requestFocus()
        L2b:
            NS0 r1 = r0.I()
            r1.m = r2
            androidx.fragment.app.h r1 = r0.z
            r1.L()
            androidx.fragment.app.h r1 = r0.z
            r1.w(r4)
            r1 = 7
            r0.a = r1
            r0.f11484J = r3
            r0.r0()
            boolean r4 = r0.f11484J
            if (r4 == 0) goto L70
            LA1 r4 = r0.U
            xA1 r5 = defpackage.EnumC11340xA1.ON_RESUME
            r4.e(r5)
            android.view.View r4 = r0.L
            if (r4 == 0) goto L57
            lU0 r4 = r0.V
            r4.a(r5)
        L57:
            androidx.fragment.app.h r4 = r0.z
            r4.F = r3
            r4.G = r3
            xT0 r5 = r4.M
            r5.m = r3
            r4.r(r1)
            gT0 r1 = r7.a
            r1.i(r3)
            r0.g = r2
            r0.h = r2
            r0.i = r2
            return
        L70:
            xp3 r1 = new xp3
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r0 = defpackage.KS0.a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.n():void");
    }
}
