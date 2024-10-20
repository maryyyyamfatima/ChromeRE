package defpackage;

import J.N;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.feed.FeedPlaceholderLayout;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge;
import org.chromium.chrome.browser.tasks.tab_management.n;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.chrome.features.tasks.TasksView;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.segmentation_platform.SegmentSelectionResult;
import org.chromium.components.segmentation_platform.SegmentationPlatformServiceImpl;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tj3 */
/* loaded from: classes2.dex */
public final class C10154tj3 implements InterfaceC7408lj3 {
    public final n A;
    public DF0 B;
    public PropertyModel C;
    public ViewOnClickListenerC0699Fj3 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public LJ0 H;
    public final C12157za2 I = new C12157za2();

    /* renamed from: J */
    public final long f11544J = SystemClock.elapsedRealtimeNanos();
    public C9468rj3 K;
    public ZK0 L;
    public final Activity a;
    public final OX2 b;
    public final ViewOnClickListenerC0699Fj3 c;
    public final boolean d;
    public final QB e;
    public final InterfaceC0079Ap3 f;
    public final WindowAndroid g;
    public ViewGroup h;
    public final InterfaceC0079Ap3 i;
    public final InterfaceC10590uz3 j;
    public final CC k;
    public final ViewOnClickListenerC1069If3 l;
    public final InterfaceC0079Ap3 m;
    public final InterfaceC0079Ap3 n;
    public final TabContentManager o;
    public final ZX1 p;
    public final InterfaceC7968nM q;
    public final I5 r;
    public final InterfaceC10912vv3 s;
    public final InterfaceC9377rT1 t;
    public final C7507m02 u;
    public final InterfaceC0079Ap3 v;
    public final C0538Ed2 w;
    public final C4270cc0 x;
    public C4505dG3 y;
    public C4505dG3 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [Ed2] */
    /* JADX WARN: Type inference failed for: r3v18, types: [nj3] */
    public C10154tj3(Activity activity, OX2 ox2, m mVar, C0538Ed2 c0538Ed2, C8385oa2 c8385oa2, boolean z, C10285u6 c10285u6, ViewGroup viewGroup, C5243fR c5243fR, AbstractC11276wz3 abstractC11276wz3, CC cc, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, K63 k63, C7649mR c7649mR, TabContentManager tabContentManager, ZX1 zx1, InterfaceC7968nM interfaceC7968nM, I5 i5, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC9377rT1 interfaceC9377rT1, C7507m02 c7507m02, C6434it1 c6434it1, C7993nR c7993nR, C4270cc0 c4270cc0, C9861ss c9861ss) {
        boolean z2;
        Activity activity2;
        C10154tj3 c10154tj3;
        InterfaceC8947qB3 h;
        this.a = activity;
        this.b = ox2;
        boolean d = AbstractC5241fQ2.d(activity);
        this.d = d;
        this.e = mVar;
        this.f = c8385oa2;
        this.g = c10285u6;
        this.h = viewGroup;
        this.i = c5243fR;
        this.j = abstractC11276wz3;
        this.k = cc;
        this.l = viewOnClickListenerC1069If3;
        this.m = k63;
        this.n = c7649mR;
        this.o = tabContentManager;
        this.p = zx1;
        this.q = interfaceC7968nM;
        this.r = i5;
        this.s = interfaceC10912vv3;
        this.t = interfaceC9377rT1;
        this.u = c7507m02;
        this.v = c7993nR;
        this.x = c4270cc0;
        C0538Ed2 c0538Ed22 = new C0538Ed2();
        this.w = c0538Ed22;
        C10218tu1 c10218tu1 = AbstractC6265iP.d;
        boolean z3 = CachedFeatureFlags.b(c10218tu1.b("StartSurfaceAndroid:exclude_mv_tiles"), false) || !d;
        boolean z4 = CachedFeatureFlags.b(c10218tu1.b("StartSurfaceAndroid:exclude_query_tiles"), true) || !d;
        if (!d) {
            AbstractC3722az3.a().getClass();
            z2 = d;
            n a = C3243Yy3.a(activity, i5, abstractC11276wz3, tabContentManager, cc, interfaceC10912vv3, interfaceC9377rT1, viewGroup, k63, c7507m02, ox2, viewGroup, c5243fR, viewOnClickListenerC1069If3, zx1);
            this.A = a;
            c0538Ed22.a(a.f11530J);
            c10154tj3 = this;
        } else {
            z2 = d;
            ZK0 l = ZK0.l(activity);
            this.L = l;
            if (l == null) {
                activity2 = activity;
            } else {
                this.h.addView(l);
                activity2 = activity;
                FrameLayout frameLayout = new FrameLayout(activity2);
                this.L.addView(frameLayout);
                this.h = frameLayout;
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6910kG3.A));
            arrayList.addAll(Arrays.asList(AbstractC0829Gj3.i));
            this.C = new PropertyModel(arrayList);
            boolean z5 = CachedFeatureFlags.b(c10218tu1.b("StartSurfaceAndroid:show_last_active_tab_only"), false) ? 2 : z2;
            c10154tj3 = this;
            C4505dG3 b = b(activity, ox2, this.C, z5 ? 1 : 0, c8385oa2, !z3, !z4, c10285u6, i5, abstractC11276wz3, viewOnClickListenerC1069If3, c5243fR, tabContentManager, zx1, cc, interfaceC10912vv3, interfaceC9377rT1, k63, c7507m02, this.h);
            c10154tj3.y = b;
            b.b.setId(R.id.primary_tasks_surface_view);
            int d2 = c10154tj3.d(R.dimen.0_resource_name_obfuscated_res_0x7f0803cb);
            int d3 = (c10154tj3.d(R.dimen.0_resource_name_obfuscated_res_0x7f080746) + c10154tj3.d(R.dimen.0_resource_name_obfuscated_res_0x7f080154)) - d2;
            int d4 = c10154tj3.d(R.dimen.0_resource_name_obfuscated_res_0x7f080617);
            C9468rj3 c9468rj3 = new InterfaceC3009Xe() { // from class: rj3
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ int g;
                public final /* synthetic */ int h;
                public final /* synthetic */ int i;

                public /* synthetic */ C9468rj3(int d32, int i, int d42, int i2, int i3, int i4, int i6, int i7) {
                    r2 = d32;
                    r3 = i;
                    r4 = d42;
                    r5 = i2;
                    r6 = i3;
                    r7 = i4;
                    r8 = i6;
                    r9 = i7;
                }

                @Override // defpackage.InterfaceC2489Te
                public final void a(int i) {
                    C10154tj3 c10154tj32 = C10154tj3.this;
                    Iterator it = c10154tj32.I.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            break;
                        } else {
                            ((InterfaceC6999kY2) c11814ya2.next()).c(i);
                        }
                    }
                    int i2 = (-i) - r2;
                    int i3 = r3;
                    int c = JM1.c(i2, 0, i3);
                    float f = c / i3;
                    C4505dG3 c4505dG3 = c10154tj32.y;
                    int i4 = r4 - c;
                    float f2 = 1.0f - f;
                    int i6 = (int) (r5 * f2);
                    QZ2.a().getClass();
                    float f3 = r6 * f;
                    int i7 = (int) (((r8 - r6) * f) + r7);
                    int i8 = (int) (r9 * f2);
                    TasksView tasksView = c4505dG3.b;
                    if (tasksView.G.b.getVisibility() != 0) {
                        return;
                    }
                    tasksView.G.c.g.m(BZ2.o, i4);
                    tasksView.G.c.g.m(BZ2.p, c);
                    tasksView.G.c.g.m(BZ2.q, i6);
                    tasksView.G.c.g.l(BZ2.r, f3);
                    tasksView.G.c.g.m(BZ2.s, i7);
                    tasksView.G.c.g.m(BZ2.t, i7);
                    tasksView.G.c.g.m(BZ2.u, i8);
                }
            };
            c10154tj3.K = c9468rj3;
            c10154tj3.a(c9468rj3);
            UD2.a(c10154tj3.C, new C7254lG3(c10154tj3.y.b, c10154tj3.h), new TD2() { // from class: qj3
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    C7254lG3 c7254lG3 = (C7254lG3) obj;
                    FD2 fd2 = (FD2) obj2;
                    LD2 ld2 = AbstractC0829Gj3.e;
                    ND2 nd2 = AbstractC0829Gj3.g;
                    ND2 nd22 = AbstractC0829Gj3.a;
                    if (ld2 != fd2) {
                        if (nd22 == fd2) {
                            int h2 = propertyModel.h(nd22);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c7254lG3.b.getLayoutParams();
                            if (marginLayoutParams != null) {
                                marginLayoutParams.bottomMargin = h2;
                                c7254lG3.b.setLayoutParams(marginLayoutParams);
                                return;
                            }
                            return;
                        }
                        if (nd2 == fd2) {
                            int h3 = propertyModel.h(nd2);
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c7254lG3.b.getLayoutParams();
                            if (marginLayoutParams2 == null) {
                                return;
                            }
                            marginLayoutParams2.topMargin = h3;
                            c7254lG3.b.setLayoutParams(marginLayoutParams2);
                            return;
                        }
                        return;
                    }
                    boolean j = propertyModel.j(ld2);
                    if (j && c7254lG3.b.getParent() == null) {
                        ViewGroup viewGroup2 = c7254lG3.a;
                        int i = viewGroup2.getChildCount() > 0 ? 1 : 0;
                        View view = c7254lG3.b;
                        viewGroup2.addView(view, i);
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (marginLayoutParams3 != null) {
                            marginLayoutParams3.bottomMargin = propertyModel.h(nd22);
                        }
                        int h4 = propertyModel.h(nd2);
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (marginLayoutParams4 != null) {
                            marginLayoutParams4.topMargin = h4;
                            view.setLayoutParams(marginLayoutParams4);
                        }
                    }
                    View view2 = c7254lG3.b;
                    if (!j) {
                        view2.setVisibility(8);
                        return;
                    }
                    view2.setAlpha(0.0f);
                    view2.setVisibility(0);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setDuration(50L);
                    ofFloat.start();
                }
            });
        }
        n nVar = c10154tj3.A;
        if (nVar != null) {
            h = nVar.k;
        } else {
            InterfaceC10318uB3 interfaceC10318uB3 = c10154tj3.y.a;
            h = interfaceC10318uB3 != null ? interfaceC10318uB3.h() : null;
        }
        InterfaceC8947qB3 interfaceC8947qB3 = h;
        PropertyModel propertyModel = c10154tj3.C;
        C7752mj3 c7752mj3 = z2 ? new C7752mj3(c10154tj3) : null;
        C7752mj3 c7752mj32 = new C7752mj3(c10154tj3);
        final C4505dG3 c4505dG3 = c10154tj3.y;
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = new ViewOnClickListenerC0699Fj3(interfaceC8947qB3, viewGroup, abstractC11276wz3, propertyModel, c7752mj3, z2, activity, cc, c7752mj32, z3, z4, c0538Ed2, z, c6434it1, c4505dG3 != null ? new Runnable() { // from class: nj3
            @Override // java.lang.Runnable
            public final void run() {
                C4941eZ1 c4941eZ1;
                C4505dG3 c4505dG32 = (C4505dG3) c4505dG3;
                c4505dG32.getClass();
                if (!b.n.f() || c4505dG32.k || (c4941eZ1 = c4505dG32.h) == null) {
                    return;
                }
                Profile d5 = Profile.d();
                InterfaceC0079Ap3 interfaceC0079Ap3 = c4505dG32.g;
                Activity activity3 = c4505dG32.f;
                C4254cZ1 c4254cZ1 = new C4254cZ1(activity3, d5, interfaceC0079Ap3);
                c4505dG32.i = new C4161cG3(c4505dG32, c4254cZ1, d5);
                C3848bM3 c3848bM3 = new C3848bM3(activity3, d5, c4254cZ1, c4505dG32.e);
                c4505dG32.j = c3848bM3;
                c4941eZ1.b(c4505dG32.i, c3848bM3, new InterfaceC4226cT3() { // from class: XF3
                    @Override // defpackage.InterfaceC4226cT3
                    public final void a(boolean z6) {
                    }
                });
                c4505dG32.k = true;
            }
        } : null, c9861ss);
        c10154tj3.c = viewOnClickListenerC0699Fj3;
        if (viewOnClickListenerC0699Fj3.f11442J == null) {
            viewOnClickListenerC0699Fj3.f11442J = Boolean.valueOf(O83.a.e("Chrome.Feed.ArticlesListVisible", true));
        }
        if (viewOnClickListenerC0699Fj3.k && UN.E.a() && O83.a.e("Chrome.Feed.ArticlesListVisible", true) && !viewOnClickListenerC0699Fj3.m && !viewOnClickListenerC0699Fj3.K) {
            ViewGroup viewGroup2 = (ViewGroup) c10154tj3.y.b.findViewById(R.id.tasks_surface_body);
            LJ0 lj0 = new LJ0(activity, viewGroup2);
            c10154tj3.H = lj0;
            FeedPlaceholderLayout feedPlaceholderLayout = (FeedPlaceholderLayout) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e010d, (ViewGroup) null, false);
            lj0.b = feedPlaceholderLayout;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080740);
            LinearLayout linearLayout = (LinearLayout) feedPlaceholderLayout.findViewById(R.id.feed_placeholder_header);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            linearLayout.setLayoutParams(layoutParams);
            viewGroup2.addView(lj0.b);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lj0.b.getLayoutParams();
            int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080135);
            marginLayoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            lj0.b.requestLayout();
            viewOnClickListenerC0699Fj3.K = true;
        }
        c0538Ed2.a(c10154tj3);
    }

    public final void f() {
        if (this.E) {
            C4505dG3 c4505dG3 = this.y;
            if (c4505dG3 != null) {
                c4505dG3.c();
            }
            C4505dG3 c4505dG32 = this.z;
            if (c4505dG32 != null) {
                c4505dG32.c();
            }
        }
        LJ0 lj0 = this.H;
        if (lj0 != null) {
            FeedPlaceholderLayout feedPlaceholderLayout = lj0.b;
            if (feedPlaceholderLayout != null) {
                lj0.a.removeView(feedPlaceholderLayout);
                lj0.b = null;
            }
            this.H = null;
        }
    }

    public final void a(InterfaceC3009Xe interfaceC3009Xe) {
        AppBarLayout appBarLayout;
        C4505dG3 c4505dG3 = this.y;
        if (c4505dG3 == null || (appBarLayout = c4505dG3.b.F) == null) {
            return;
        }
        if (appBarLayout.m == null) {
            appBarLayout.m = new ArrayList();
        }
        if (appBarLayout.m.contains(interfaceC3009Xe)) {
            return;
        }
        appBarLayout.m.add(interfaceC3009Xe);
    }

    public final InterfaceC9632sB3 c() {
        if (this.d) {
            if (this.z == null) {
                InterfaceC8947qB3 e = e();
                final ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.c;
                viewOnClickListenerC0699Fj3.q = e;
                e.T().m(new Callback() { // from class: yj3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        ViewOnClickListenerC0699Fj3.this.n();
                    }
                });
            }
            InterfaceC10318uB3 interfaceC10318uB3 = this.z.a;
            if (interfaceC10318uB3 != null) {
                return interfaceC10318uB3.q();
            }
            return null;
        }
        n nVar = this.A;
        nVar.getClass();
        return nVar;
    }

    public final void h(boolean z) {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.c;
        PropertyModel propertyModel = viewOnClickListenerC0699Fj3.i;
        if (propertyModel != null) {
            FI2.a("StartSurface.Shown");
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) viewOnClickListenerC0699Fj3.h;
            boolean o = abstractC11276wz3.o();
            viewOnClickListenerC0699Fj3.s = o;
            propertyModel.k(AbstractC6910kG3.b, o);
            if (viewOnClickListenerC0699Fj3.w == 0) {
                viewOnClickListenerC0699Fj3.w = 4;
            }
            viewOnClickListenerC0699Fj3.A(viewOnClickListenerC0699Fj3.f(), viewOnClickListenerC0699Fj3.y);
            if (propertyModel.j(AbstractC0829Gj3.c) && propertyModel.i(AbstractC0829Gj3.f) == null) {
                C10154tj3 c10154tj3 = viewOnClickListenerC0699Fj3.E.a;
                if (!(((AbstractActivityC7416ll) c10154tj3.q).m() || ApplicationStatus.c(c10154tj3.a) == 6) && viewOnClickListenerC0699Fj3.p != null) {
                    viewOnClickListenerC0699Fj3.g();
                }
            }
            abstractC11276wz3.c(viewOnClickListenerC0699Fj3.B);
            C0439Dj3 c0439Dj3 = viewOnClickListenerC0699Fj3.D;
            if (c0439Dj3 != null) {
                ((CC) viewOnClickListenerC0699Fj3.C).d(c0439Dj3);
            }
            propertyModel.k(AbstractC0829Gj3.e, true);
            InterfaceC5991hc2 interfaceC5991hc2 = viewOnClickListenerC0699Fj3.t;
            if (interfaceC5991hc2 != null) {
                ((g) interfaceC5991hc2).d(viewOnClickListenerC0699Fj3.v);
            }
        }
        viewOnClickListenerC0699Fj3.g.m0(z);
    }

    public static C4505dG3 b(Activity activity, OX2 ox2, PropertyModel propertyModel, int i, InterfaceC0079Ap3 interfaceC0079Ap3, boolean z, boolean z2, WindowAndroid windowAndroid, I5 i5, InterfaceC10590uz3 interfaceC10590uz3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, InterfaceC0079Ap3 interfaceC0079Ap32, TabContentManager tabContentManager, ZX1 zx1, JC jc, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC9377rT1 interfaceC9377rT1, InterfaceC0079Ap3 interfaceC0079Ap33, C7507m02 c7507m02, ViewGroup viewGroup) {
        return new C4505dG3(activity, ox2, propertyModel, i, interfaceC0079Ap3, z, z2, windowAndroid, i5, interfaceC10590uz3, viewOnClickListenerC1069If3, interfaceC0079Ap32, tabContentManager, zx1, jc, interfaceC10912vv3, interfaceC9377rT1, interfaceC0079Ap33, c7507m02, viewGroup);
    }

    public final InterfaceC8947qB3 e() {
        PropertyModel propertyModel = new PropertyModel(AbstractC6910kG3.A);
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.c;
        viewOnClickListenerC0699Fj3.r = propertyModel;
        propertyModel.k(AbstractC6910kG3.b, viewOnClickListenerC0699Fj3.s);
        viewOnClickListenerC0699Fj3.r.k(AbstractC7347lZ1.a, false);
        viewOnClickListenerC0699Fj3.r.k(AbstractC6910kG3.t, false);
        viewOnClickListenerC0699Fj3.r.k(AbstractC6910kG3.i, false);
        viewOnClickListenerC0699Fj3.r.k(AbstractC6910kG3.e, false);
        C4505dG3 b = b(this.a, this.b, propertyModel, 0, this.f, false, false, this.g, this.r, this.j, this.l, this.i, this.o, this.p, this.k, this.s, this.t, this.m, this.u, this.h);
        this.z = b;
        if (this.E) {
            b.b((InterfaceC5991hc2) this.n.get(), null);
            ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = this.z.c.g;
            if (!viewOnClickListenerC6375ij1.h) {
                viewOnClickListenerC6375ij1.a = new CookieControlsServiceBridge(viewOnClickListenerC6375ij1);
                viewOnClickListenerC6375ij1.h = true;
            }
        } else {
            this.G = true;
        }
        this.z.b.setId(R.id.secondary_tasks_surface_view);
        UD2.a(this.C, new C7254lG3(this.z.b, this.h), new TD2() { // from class: pj3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                C7254lG3 c7254lG3 = (C7254lG3) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = AbstractC0829Gj3.d;
                ND2 nd2 = AbstractC0829Gj3.g;
                if (ld2 != fd2) {
                    if (nd2 == fd2) {
                        int h = propertyModel2.h(nd2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c7254lG3.b.getLayoutParams();
                        if (marginLayoutParams == null) {
                            return;
                        }
                        marginLayoutParams.topMargin = h;
                        c7254lG3.b.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    if (AbstractC0829Gj3.e == fd2 && propertyModel2.j(ld2)) {
                        c7254lG3.b.bringToFront();
                        return;
                    }
                    return;
                }
                boolean j = propertyModel2.j(ld2);
                if (j && c7254lG3.b.getParent() == null) {
                    ViewGroup viewGroup = c7254lG3.a;
                    View view = c7254lG3.b;
                    viewGroup.addView(view);
                    int h2 = propertyModel2.h(nd2);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.topMargin = h2;
                        view.setLayoutParams(marginLayoutParams2);
                    }
                }
                c7254lG3.b.getBackground().setAlpha(0);
                int i = j ? 0 : 8;
                View view2 = c7254lG3.b;
                view2.setVisibility(i);
                if (propertyModel2.j(ld2)) {
                    view2.bringToFront();
                }
            }
        });
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj32 = this.D;
        if (viewOnClickListenerC0699Fj32 != null) {
            InterfaceC10318uB3 interfaceC10318uB3 = this.z.a;
            if (interfaceC10318uB3 != null) {
                interfaceC10318uB3.n(viewOnClickListenerC0699Fj32);
            }
            this.D = null;
        }
        C0538Ed2 c0538Ed2 = this.w;
        c0538Ed2.getClass();
        if (!AbstractC12248zp3.a(c0538Ed2)) {
            InterfaceC10318uB3 interfaceC10318uB32 = this.z.a;
            c0538Ed2.a(interfaceC10318uB32 != null ? interfaceC10318uB32.k() : null);
        }
        InterfaceC10318uB3 interfaceC10318uB33 = this.z.a;
        if (interfaceC10318uB33 != null) {
            return interfaceC10318uB33.h();
        }
        return null;
    }

    public final void g(long j, boolean z) {
        BF0 bf0;
        boolean z2;
        if (z) {
            ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.c;
            viewOnClickListenerC0699Fj3.g.Q(j);
            PropertyModel propertyModel = viewOnClickListenerC0699Fj3.i;
            if (propertyModel != null && (bf0 = (BF0) propertyModel.i(AbstractC0829Gj3.f)) != null) {
                bf0.g = j;
                boolean z3 = bf0.d;
                if (j != 0) {
                    long j2 = bf0.e;
                    if (j2 != 0) {
                        StartSurfaceConfiguration.b(j2 - j, "FeedContentFirstLoadedTime", z3);
                        z2 = true;
                        if (!z2 && bf0.b.f.D) {
                            bf0.f = true;
                        }
                        StartSurfaceConfiguration.b(bf0.h - j, "FeedStreamCreatedTime", z3);
                    }
                }
                z2 = false;
                if (!z2) {
                    bf0.f = true;
                }
                StartSurfaceConfiguration.b(bf0.h - j, "FeedStreamCreatedTime", z3);
            }
            Boolean bool = viewOnClickListenerC0699Fj3.I;
            if (bool != null) {
                EI2.b("Startup.Android.CachedFeedVisibilityConsistency", bool.equals(viewOnClickListenerC0699Fj3.f11442J));
            }
            LJ0 lj0 = this.H;
            if (lj0 != null) {
                StartSurfaceConfiguration.b(lj0.b.h - j, "FeedsLoadingPlaceholderShown", true);
            }
        }
        C10218tu1 c10218tu1 = AbstractC6265iP.d;
        if (CachedFeatureFlags.b(c10218tu1.b("StartSurfaceAndroid:check_sync_before_show_start_at_startup"), false)) {
            C1202Jg1 a = C1202Jg1.a();
            Profile d = Profile.d();
            a.getClass();
            O83.a.p("Chrome.StartSurface.PrimaryAccountSync", C1202Jg1.c(d).p().c(1));
        }
        if (AbstractC5241fQ2.d(this.a)) {
            AbstractC4851eH1.d("StartSurface", "Recorded %s = %b", "Startup.Android.StartSurfaceShownAtStartup", Boolean.valueOf(z));
            EI2.b("Startup.Android.StartSurfaceShownAtStartup", z);
        }
        if (TextUtils.isEmpty(CachedFeatureFlags.c(c10218tu1.b("StartSurfaceAndroid:behavioural_targeting"), ""))) {
            return;
        }
        SegmentationPlatformServiceImpl segmentationPlatformServiceImpl = (SegmentationPlatformServiceImpl) N.MGkN3uZ4(Profile.d());
        N.Mv7niEOS(segmentationPlatformServiceImpl.a, segmentationPlatformServiceImpl, "chrome_start_android", new Callback() { // from class: ZP2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i;
                SegmentSelectionResult segmentSelectionResult = (SegmentSelectionResult) obj;
                if (segmentSelectionResult.a) {
                    i = segmentSelectionResult.b == 12 ? 2 : 1;
                } else {
                    i = 0;
                }
                O83.a.q(i, "Chrome.StartSurface.ShowSegmentationResult");
            }
        });
    }

    public final int d(int i) {
        return this.a.getResources().getDimensionPixelSize(i);
    }
}
