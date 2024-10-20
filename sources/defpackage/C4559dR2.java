package defpackage;

import J.N;
import android.animation.Animator;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.SeekBar;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.crash.ChromePureJavaExceptionReporter;
import org.chromium.chrome.browser.history_clusters.f;
import org.chromium.chrome.browser.omnibox.geo.GeolocationHeader;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.toolbar.top.e;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.bottomsheet.k;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.widget.CoordinatorLayoutForPointer;
import org.chromium.components.messages.MessageContainer;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dR2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4559dR2 implements InterfaceC0186Bl0, InterfaceC6044hl1, V02, InterfaceC9035qT1, InterfaceC12202zi {
    public VQ2 A;
    public final C0538Ed2 A0;
    public C4137cC B;
    public final InterfaceC0079Ap3 B0;
    public m C;
    public final C9861ss C0;
    public ViewOnClickListenerC1069If3 D;
    public C1987Ph2 D0;
    public OX2 E;
    public C4685do0 F;
    public List G;
    public C4454d70 H;
    public C0942Hg1 I;

    /* renamed from: J, reason: collision with root package name */
    public final KO3 f11504J;
    public final C8385oa2 K;
    public final C8385oa2 L;
    public final InterfaceC7697ma2 M;
    public final InterfaceC7697ma2 N;
    public final InterfaceC7697ma2 O;
    public final C0538Ed2 P;
    public TQ2 Q;
    public final InterfaceC0079Ap3 R;
    public final C4496dF S;
    public final CC T;
    public InterfaceC7697ma2 U;
    public final InterfaceC0408Dd2 V;
    public final InterfaceC0408Dd2 W;
    public C5265fV1 X;
    public C4234cV1 Y;
    public HO Z;
    public final C2078Pz3 a;
    public final InterfaceC0408Dd2 a0;
    public final C0538Ed2 b0;
    public final InterfaceC0079Ap3 c0;
    public NQ2 d0;
    public UM1 e0;
    public C4937eY2 f0;
    public final InterfaceC6092ht1 g;
    public final I5 g0;
    public a h;
    public final C8385oa2 h0;
    public C0430Di i;
    public final InterfaceC7697ma2 i0;
    public final InterfaceC9377rT1 j;
    public final InterfaceC12202zi j0;
    public final C10285u6 k;
    public final InterfaceC7913nB k0;
    public final C6166i6 l;
    public final InterfaceC7913nB l0;
    public final InterfaceC7697ma2 m;
    public final InterfaceC0079Ap3 m0;
    public C3511aO0 n;
    public final ZU0 n0;
    public C4215cR2 o;
    public final InterfaceC0079Ap3 o0;
    public C0678Ff2 p;
    public final C2913Wk3 p0;
    public YQ2 q;
    public final InterfaceC0079Ap3 q0;
    public final InterfaceC0408Dd2 r;
    public final int r0;
    public InterfaceC1422Ky1 s;
    public final InterfaceC0079Ap3 s0;
    public C3872bR2 t;
    public final InterfaceC0079Ap3 t0;
    public final C0538Ed2 u;
    public final InterfaceC0560Ei u0;
    public QS3 v;
    public final InterfaceC0079Ap3 v0;
    public final Callback w;
    public final C2021Po1 w0;
    public C9707sQ3 x;
    public final InterfaceC0408Dd2 x0;
    public ZD3 y;
    public final C4959ec2 y0;
    public UQ2 z;
    public final boolean z0;

    public boolean d() {
        return false;
    }

    public C2516Tj1 j() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public void o(float f) {
        C2913Wk3 c2913Wk3 = this.p0;
        c2913Wk3.x = f;
        c2913Wk3.j();
    }

    public C4559dR2(a aVar, XQ xq, L14 l14, C6166i6 c6166i6, C0519Dz3 c0519Dz3, C8385oa2 c8385oa2, C8385oa2 c8385oa22, C8385oa2 c8385oa23, L14 l142, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C0538Ed2 c0538Ed23, C0538Ed2 c0538Ed24, InterfaceC0079Ap3 interfaceC0079Ap3, CC cc, C10285u6 c10285u6, InterfaceC6092ht1 interfaceC6092ht1, I5 i5, C8385oa2 c8385oa24, InterfaceC9377rT1 interfaceC9377rT1, InterfaceC0079Ap3 interfaceC0079Ap32, C8385oa2 c8385oa25, InterfaceC12202zi interfaceC12202zi, InterfaceC7913nB interfaceC7913nB, InterfaceC7913nB interfaceC7913nB2, L14 l143, XU0 xu0, C8385oa2 c8385oa26, C8385oa2 c8385oa27, InterfaceC0079Ap3 interfaceC0079Ap33, int i, InterfaceC0079Ap3 interfaceC0079Ap34, InterfaceC0079Ap3 interfaceC0079Ap35, InterfaceC0560Ei interfaceC0560Ei, InterfaceC2783Vk3 interfaceC2783Vk3, C2021Po1 c2021Po1, C0538Ed2 c0538Ed25, InterfaceC0079Ap3 interfaceC0079Ap36, boolean z, C9861ss c9861ss) {
        C2078Pz3 c2078Pz3 = new C2078Pz3();
        this.a = c2078Pz3;
        this.u = new C0538Ed2();
        C8385oa2 c8385oa28 = new C8385oa2();
        this.K = c8385oa28;
        this.L = new C8385oa2();
        this.b0 = new C0538Ed2();
        C0538Ed2 c0538Ed26 = new C0538Ed2();
        this.A0 = c0538Ed26;
        this.g = interfaceC6092ht1;
        C4496dF c4496dF = new C4496dF();
        this.S = c4496dF;
        this.h = aVar;
        this.k = c10285u6;
        c2078Pz3.q(c10285u6.t);
        this.w = xq;
        this.T = cc;
        this.i0 = c8385oa25;
        this.g0 = i5;
        i5.b(this);
        this.j0 = interfaceC12202zi;
        this.k0 = interfaceC7913nB;
        this.l0 = interfaceC7913nB2;
        this.m0 = l143;
        this.n0 = xu0;
        this.o0 = c8385oa26;
        this.v0 = c8385oa27;
        this.q0 = interfaceC0079Ap33;
        this.r0 = i;
        this.s0 = interfaceC0079Ap34;
        this.t0 = interfaceC0079Ap35;
        this.u0 = interfaceC0560Ei;
        this.w0 = c2021Po1;
        this.x0 = c0538Ed25;
        this.z0 = z;
        this.C0 = c9861ss;
        this.j = interfaceC9377rT1;
        ((ChromeActivity) interfaceC9377rT1).L0.add(this);
        this.l = c6166i6;
        this.y0 = new C4959ec2(this.h, c0538Ed26, c8385oa25);
        C8385oa2 c8385oa29 = new C8385oa2();
        this.h0 = c8385oa29;
        c8385oa24.m(new Callback() { // from class: OQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9897sy1 c9897sy1 = (C9897sy1) obj;
                C4559dR2 c4559dR2 = C4559dR2.this;
                c4559dR2.m(c9897sy1);
                c4559dR2.h0.p(c9897sy1);
            }
        });
        this.m = l14;
        c2078Pz3.p(new C1948Oz3());
        new U1(i5, c6166i6, (C1948Oz3) c2078Pz3.g);
        if (Build.VERSION.SDK_INT >= 28) {
            new C0995Hr(aVar, i5, c6166i6);
        }
        this.M = c0519Dz3;
        this.N = c8385oa2;
        this.O = c8385oa22;
        this.P = new C0538Ed2();
        this.R = c8385oa23;
        this.f11504J = new KO3();
        this.U = l142;
        c8385oa28.p(Boolean.FALSE);
        this.r = c0538Ed24;
        c0538Ed24.j(c4496dF.b(new Callback() { // from class: PQ2
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4559dR2.this.n((InterfaceC1422Ky1) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }));
        this.V = c0538Ed2;
        this.W = c0538Ed22;
        this.a0 = c0538Ed23;
        this.c0 = interfaceC0079Ap3;
        this.v = new QS3(this.h, c6166i6, interfaceC0079Ap32, DeviceFormFactor.a(aVar), q(), p());
        this.p0 = new C2913Wk3(this.h.getWindow(), DeviceFormFactor.a(this.h), this.h, interfaceC2783Vk3, c8385oa29, i5, c6166i6, this.v);
        this.B0 = interfaceC0079Ap36;
        this.D0 = new C1987Ph2(new QQ2(this));
    }

    @Override // defpackage.InterfaceC0186Bl0
    public void onDestroy() {
        SparseArray sparseArray;
        Animator animator;
        AppBarLayout appBarLayout;
        ArrayList arrayList;
        Object obj;
        this.S.a();
        ((ChromeActivity) this.j).L0.remove(this);
        this.a.s();
        this.g0.c(this);
        C5265fV1 c5265fV1 = this.X;
        if (c5265fV1 != null) {
            CV1 cv1 = c5265fV1.a;
            HashMap hashMap = cv1.c;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                cv1.a((BV1) it.next(), 7);
            }
            hashMap.clear();
            AbstractC5609gV1.a.b(this.X);
            this.X = null;
        }
        HO ho = this.Z;
        if (ho != null) {
            ho.n.c(ho.t);
            ho.n = null;
            ho.o.a();
            ho.h.g(ho.j);
            ho.a(null);
            ZX1 zx1 = ho.m;
            if (zx1 != null) {
                zx1.h(ho.s);
            }
            ho.m = null;
            ho.l = null;
            ho.a = null;
            ho.g = null;
            int i = ho.i;
            if (i != -1) {
                ho.h.g.u(i);
            }
            ho.h = null;
            ho.p = -1;
            ho.q.removeCallbacksAndMessages(null);
            ho.q = null;
            this.Z = null;
        }
        C4234cV1 c4234cV1 = this.Y;
        if (c4234cV1 != null) {
            c4234cV1.g.g(c4234cV1);
            c4234cV1.a = null;
            c4234cV1.g = null;
            this.Y = null;
        }
        C0678Ff2 c0678Ff2 = this.p;
        if (c0678Ff2 != null) {
            c0678Ff2.b.d(this.q);
        }
        InterfaceC1422Ky1 interfaceC1422Ky1 = this.s;
        if (interfaceC1422Ky1 != null) {
            ((C9897sy1) interfaceC1422Ky1).L(this.t);
            this.s = null;
        }
        C9707sQ3 c9707sQ3 = this.x;
        if (c9707sQ3 != null) {
            if (this.d0 != null && c9707sQ3.D.b() != null) {
                this.x.D.b().f.d(this.d0);
            }
            C9707sQ3 c9707sQ32 = this.x;
            c9707sQ32.L0 = true;
            VrModuleProvider.g(c9707sQ32.J0);
            boolean z = c9707sQ32.s0;
            XP3 xp3 = c9707sQ32.H;
            if (z) {
                c9707sQ32.E.f.d(xp3);
            }
            if (c9707sQ32.w != null) {
                c9707sQ32.w = null;
            }
            InterfaceC10590uz3 interfaceC10590uz3 = c9707sQ32.u;
            if (interfaceC10590uz3 != null) {
                ((AbstractC11276wz3) interfaceC10590uz3).s(c9707sQ32.v);
            }
            InterfaceC7697ma2 interfaceC7697ma2 = c9707sQ32.A;
            if (interfaceC7697ma2 != null) {
                BookmarkBridge bookmarkBridge = (BookmarkBridge) ((C8385oa2) interfaceC7697ma2).g;
                if (bookmarkBridge != null) {
                    bookmarkBridge.o(c9707sQ32.G);
                }
                ((C8385oa2) c9707sQ32.A).n(c9707sQ32.B);
                c9707sQ32.A = null;
            }
            if (c9707sQ32.C != null) {
                IG3.a().h(c9707sQ32.C);
                c9707sQ32.C = null;
            }
            InterfaceC1422Ky1 interfaceC1422Ky12 = c9707sQ32.K;
            if (interfaceC1422Ky12 != null) {
                ((C9897sy1) interfaceC1422Ky12).L(c9707sQ32.L);
                c9707sQ32.K = null;
            }
            if (c9707sQ32.M != null) {
                c9707sQ32.M = null;
            }
            C9897sy1 c9897sy1 = c9707sQ32.F;
            if (c9897sy1 != null) {
                c9897sy1.z.b.d(c9707sQ32.G0);
                c9707sQ32.F = null;
            }
            C10648v91.c().b.d(c9707sQ32.c0);
            Object obj2 = c9707sQ32.t.g;
            if (obj2 != null) {
                JB jb = (JB) obj2;
                InterfaceC1543Lw3 interfaceC1543Lw3 = jb.g;
                if (interfaceC1543Lw3 != null) {
                    C1933Ow3 c1933Ow3 = (C1933Ow3) interfaceC1543Lw3;
                    if (c1933Ow3.a != null) {
                        c1933Ow3.A.onDestroy();
                        C0759Fv3 c0759Fv3 = c1933Ow3.z;
                        if (c0759Fv3 != null) {
                            c0759Fv3.a();
                        }
                        c1933Ow3.y.b();
                        C4742dx3 c4742dx3 = c1933Ow3.B;
                        InterfaceC10590uz3 interfaceC10590uz32 = c4742dx3.j;
                        if (interfaceC10590uz32 != null) {
                            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz32;
                            C7502lz3 c7502lz3 = abstractC11276wz3.c;
                            c7502lz3.f(c4742dx3.h);
                            abstractC11276wz3.s(c4742dx3.p);
                            C3712ax3 c3712ax3 = c4742dx3.x;
                            if (c3712ax3 != null) {
                                ((C1024Hw3) c7502lz3.e(false)).f0(c3712ax3);
                                ((C1024Hw3) c7502lz3.e(true)).f0(c3712ax3);
                            }
                        }
                        C4056bx3 c4056bx3 = c4742dx3.y;
                        if (c4056bx3 != null) {
                            c4742dx3.q.c(c4056bx3);
                        }
                        AbstractC1429Kz3 abstractC1429Kz3 = c4742dx3.z;
                        if (abstractC1429Kz3 != null) {
                            abstractC1429Kz3.destroy();
                        }
                        InterfaceC1422Ky1 interfaceC1422Ky13 = c4742dx3.w;
                        if (interfaceC1422Ky13 != null) {
                            ((C9897sy1) interfaceC1422Ky13).L(c4742dx3.v);
                        }
                        C4496dF c4496dF = c4742dx3.u;
                        if (c4496dF != null) {
                            c4496dF.a();
                            c4742dx3.u = null;
                        }
                        C2193Qw3 c2193Qw3 = c4742dx3.A;
                        if (c2193Qw3 != null) {
                            ((C8385oa2) c4742dx3.t).n(c2193Qw3);
                        }
                        c4742dx3.m.a.d(c4742dx3.o);
                        I5 i5 = c1933Ow3.o;
                        if (i5 != null) {
                            i5.c(c1933Ow3);
                        }
                    }
                }
                LB lb = jb.a;
                lb.i.a();
                ((CC) lb.h).g(lb);
                lb.k.r().h(lb);
                InterfaceC1422Ky1 interfaceC1422Ky14 = lb.p;
                if (interfaceC1422Ky14 != null) {
                    ((C9897sy1) interfaceC1422Ky14).L(lb);
                    lb.p = null;
                }
                c9707sQ32.t = null;
            }
            SF1 sf1 = c9707sQ32.D;
            if (sf1 != null) {
                sf1.destroy();
                c9707sQ32.D = null;
            }
            C6621jR3 c6621jR3 = c9707sQ32.Z;
            c6621jR3.getClass();
            if (C9861ss.b()) {
                C6279iR3 c6279iR3 = c6621jR3.p;
                if (c6279iR3 != null && (obj = ((C8385oa2) c6621jR3.l).g) != null) {
                    ((AbstractC11276wz3) ((InterfaceC10590uz3) obj)).c.f(c6279iR3);
                }
                ((C8385oa2) c6621jR3.i).n(c6621jR3.o);
            }
            e eVar = c9707sQ32.k;
            eVar.a.g.d(c9707sQ32.d0);
            eVar.a();
            C10501uk1 c10501uk1 = c9707sQ32.a;
            InterfaceC10590uz3 interfaceC10590uz33 = c10501uk1.c;
            if (interfaceC10590uz33 != null) {
                ((AbstractC11276wz3) interfaceC10590uz33).s(c10501uk1.b);
                c10501uk1.c = null;
            }
            c10501uk1.a.clear();
            C10226tv3 c10226tv3 = c9707sQ32.g;
            C9198qv3 c9198qv3 = c10226tv3.d;
            if (c9198qv3 != null) {
                ((AbstractC11276wz3) c10226tv3.b).c.f(c9198qv3);
            }
            if (c10226tv3.e != null) {
                ((C1024Hw3) ((AbstractC11276wz3) c10226tv3.b).c.d()).f0(c10226tv3.e);
            }
            InterfaceC10590uz3 interfaceC10590uz34 = c10226tv3.b;
            if (interfaceC10590uz34 != null) {
                ((AbstractC11276wz3) interfaceC10590uz34).s(c10226tv3.c);
                c10226tv3.b = null;
            }
            c10226tv3.a.clear();
            LocationBarModel locationBarModel = c9707sQ32.z;
            C11055wM c11055wM = locationBarModel.g;
            if (c11055wM != null) {
                c11055wM.a();
                locationBarModel.g = null;
            }
            long j = locationBarModel.r;
            if (j != 0) {
                N.MltVHpYK(j, locationBarModel);
                locationBarModel.r = 0L;
            }
            c9707sQ32.Q.removeCallbacksAndMessages(null);
            ((CC) c9707sQ32.V).g(c9707sQ32.m);
            ((XU0) c9707sQ32.W).k(c9707sQ32.n);
            QS3 qs3 = c9707sQ32.h;
            if (qs3 != null) {
                qs3.i.d(c9707sQ32);
            }
            C6373ij c6373ij = c9707sQ32.i;
            if (c6373ij != null) {
                c6373ij.j.d(c9707sQ32);
                c9707sQ32.i.d();
                c9707sQ32.i = null;
            }
            C6616jQ3 c6616jQ3 = c9707sQ32.x;
            if (c6616jQ3 != null) {
                c6616jQ3.destroy();
                c9707sQ32.x = null;
            }
            GE1 ge1 = c9707sQ32.Y;
            if (ge1 != null) {
                ge1.a.b.a();
            }
            C3511aO0 c3511aO0 = c9707sQ32.E;
            if (c3511aO0 != null) {
                c3511aO0.f.d(xp3);
                c9707sQ32.E = null;
            }
            if (c9707sQ32.a0 != null) {
                if (c9707sQ32.u0 != null) {
                    C4771e24.a().a.d(c9707sQ32.u0);
                    c9707sQ32.u0 = null;
                }
                c9707sQ32.a0.a();
                c9707sQ32.a0 = null;
            }
            if (c9707sQ32.b0 != null) {
                if (c9707sQ32.v0 != null) {
                    C4771e24.a().a.d(c9707sQ32.v0);
                    c9707sQ32.v0 = null;
                }
                c9707sQ32.b0.a();
                c9707sQ32.b0 = null;
            }
            C10305u91 c10305u91 = c9707sQ32.m0;
            if (c10305u91 != null) {
                c10305u91.f.a();
                c9707sQ32.m0 = null;
            }
            C5232fO3 c5232fO3 = c9707sQ32.n0;
            if (c5232fO3 != null) {
                c5232fO3.a.a();
                c5232fO3.i.a();
                InterfaceC1422Ky1 interfaceC1422Ky15 = c5232fO3.j;
                if (interfaceC1422Ky15 != null) {
                    ((C9897sy1) interfaceC1422Ky15).L(c5232fO3.k);
                    c5232fO3.j = null;
                    c5232fO3.k = null;
                }
                c9707sQ32.n0 = null;
            }
            C4496dF c4496dF2 = c9707sQ32.N;
            if (c4496dF2 != null) {
                c4496dF2.a();
                c9707sQ32.N = null;
            }
            InterfaceC7408lj3 interfaceC7408lj3 = c9707sQ32.B0;
            if (interfaceC7408lj3 != null) {
                ((C10154tj3) interfaceC7408lj3).c.l.d(c9707sQ32.C0);
                InterfaceC7408lj3 interfaceC7408lj32 = c9707sQ32.B0;
                PP3 pp3 = c9707sQ32.D0;
                C4505dG3 c4505dG3 = ((C10154tj3) interfaceC7408lj32).y;
                if (c4505dG3 != null && (appBarLayout = c4505dG3.b.F) != null && (arrayList = appBarLayout.m) != null && pp3 != null) {
                    arrayList.remove(pp3);
                }
                c9707sQ32.B0 = null;
                c9707sQ32.C0 = null;
                c9707sQ32.D0 = null;
            }
            c9707sQ32.R.unregisterComponentCallbacks(c9707sQ32.X);
            c9707sQ32.X = null;
            C10021tL f = C10021tL.f();
            if (f.c == null) {
                f.c = new C12157za2();
            }
            f.c.d(c9707sQ32);
            this.x = null;
        }
        C4454d70 c4454d70 = this.H;
        if (c4454d70 != null) {
            C10452uc0 c10452uc0 = c4454d70.d;
            if (c10452uc0 != null) {
                c10452uc0.a();
            }
            this.H = null;
        }
        C0430Di c0430Di = this.i;
        if (c0430Di != null) {
            c0430Di.d.h.remove(this);
            this.i.d.h.remove(this.j0);
            C0430Di c0430Di2 = this.i;
            C1340Ki c1340Ki = c0430Di2.d;
            if (c1340Ki != null) {
                c1340Ki.a();
                c1340Ki.o.c(c1340Ki);
            }
            C3159Yi c3159Yi = (C3159Yi) c0430Di2.c;
            C4496dF c4496dF3 = c3159Yi.i;
            if (c4496dF3 != null) {
                c4496dF3.a();
                c3159Yi.i = null;
            }
            InterfaceC0408Dd2 interfaceC0408Dd2 = c3159Yi.q;
            if (interfaceC0408Dd2 != null) {
                if (interfaceC0408Dd2.get() != null) {
                    ((C10154tj3) ((InterfaceC7408lj3) c3159Yi.q.get())).c.l.d(c3159Yi.r);
                }
                c3159Yi.q = null;
                c3159Yi.r = null;
            }
        }
        QS3 qs32 = this.v;
        if (qs32 != null) {
            qs32.e();
            this.v = null;
        }
        C3511aO0 c3511aO02 = this.n;
        if (c3511aO02 != null) {
            c3511aO02.f.d(this.o);
        }
        VQ2 vq2 = this.A;
        if (vq2 != null) {
            VrModuleProvider.g(vq2);
        }
        if (this.z != null) {
            C8385oa2 c8385oa2 = (C8385oa2) this.i0;
            c8385oa2.getClass();
            if (AbstractC12248zp3.a(c8385oa2)) {
                ((ZX1) c8385oa2.g).h(this.z);
            }
        }
        C4137cC c4137cC = this.B;
        if (c4137cC != null) {
            c4137cC.onDestroy();
        }
        m mVar = this.C;
        if (mVar != null) {
            TQ2 tq2 = this.Q;
            if (tq2 != null) {
                mVar.o(tq2);
            }
            UB.a.b(this.C);
            this.C.d();
        }
        List list = this.G;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC9295rD) it2.next()).destroy();
            }
            this.G = null;
        }
        OX2 ox2 = this.E;
        if (ox2 != null && (animator = ox2.b.e) != null) {
            animator.end();
        }
        this.E = null;
        if (this.U != null) {
            this.U = null;
        }
        UM1 um1 = this.e0;
        if (um1 != null) {
            int i2 = 0;
            while (true) {
                sparseArray = um1.h;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((Tab) sparseArray.valueAt(i2)).w(um1.a);
                i2++;
            }
            sparseArray.clear();
            um1.g.setVisibility(8);
            um1.i = null;
            um1.g = null;
            UM1.j.b(um1);
            this.e0 = null;
        }
        C8385oa2 c8385oa22 = this.L;
        c8385oa22.getClass();
        if (AbstractC12248zp3.a(c8385oa22)) {
            C4573dU1 c4573dU1 = (C4573dU1) c8385oa22.g;
            c4573dU1.a.a.a();
            c4573dU1.g.getClass();
            C6634jU1.b.clear();
            c8385oa22.p(null);
        }
        C4937eY2 c4937eY2 = this.f0;
        if (c4937eY2 != null) {
            InterfaceC7697ma2 interfaceC7697ma22 = c4937eY2.a;
            if (interfaceC7697ma22 != null) {
                ((C8385oa2) interfaceC7697ma22).n(c4937eY2);
            }
            Tab tab = c4937eY2.h;
            if (tab != null) {
                tab.w(c4937eY2);
            }
            View view = c4937eY2.i;
            if (view != null) {
                c4937eY2.g.getClass();
                view.setScrollCaptureHint(0);
                AbstractC5625gY2.a(view, null);
            }
            this.f0 = null;
        }
        if (this.D0 != null) {
            this.D0 = null;
        }
        this.h = null;
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void H() {
        CoordinatorLayoutForPointer coordinatorLayoutForPointer = (CoordinatorLayoutForPointer) ((ViewGroup) this.h.findViewById(R.id.coordinator));
        if (ViewTreeObserverOnDrawListenerC5921hP.g == null) {
            ViewTreeObserverOnDrawListenerC5921hP.g = new ViewTreeObserverOnDrawListenerC5921hP();
        }
        final ViewTreeObserverOnDrawListenerC5921hP viewTreeObserverOnDrawListenerC5921hP = ViewTreeObserverOnDrawListenerC5921hP.g;
        viewTreeObserverOnDrawListenerC5921hP.getClass();
        coordinatorLayoutForPointer.C = new Runnable() { // from class: gP
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnDrawListenerC5921hP.this.getClass();
                TraceEvent.f("ChromePowerModeVoter.onCoordinatorTouchEvent");
                if (b.n.f()) {
                    N.MH11BIXX();
                }
            }
        };
        this.E = b();
        if (this.l0.a()) {
            C3511aO0 c3511aO0 = new C3511aO0((ViewStub) this.h.findViewById(DeviceFormFactor.a(this.h) ? R.id.find_toolbar_tablet_stub : R.id.find_toolbar_stub), (InterfaceC10590uz3) ((C8385oa2) this.U).g, this.k, this.f11504J, this.C0);
            this.n = c3511aO0;
            C4215cR2 c4215cR2 = new C4215cR2(this);
            this.o = c4215cR2;
            c3511aO0.f.a(c4215cR2);
        }
        k();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [RQ2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [SQ2] */
    public void U() {
        if (C3166Yj1.b()) {
            this.u.a(new C1347Kj1((InterfaceC10590uz3) ((C8385oa2) this.U).g, this.g0, this.r, this.M, j()));
        }
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("MessagesForAndroidInfrastructure");
        final C10285u6 c10285u6 = this.k;
        if (M09VlOh_) {
            N.Mt41a1ha();
            MessageContainer messageContainer = (MessageContainer) this.h.findViewById(R.id.message_container);
            final C4234cV1 c4234cV1 = new C4234cV1(messageContainer, this.T);
            this.Y = c4234cV1;
            ?? r5 = new InterfaceC0079Ap3() { // from class: RQ2
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    C4234cV1 c4234cV12 = C4234cV1.this;
                    return Integer.valueOf(c4234cV12.a() + c4234cV12.a.getResources().getDimensionPixelOffset(R.dimen.f35850_resource_name_obfuscated_res_0x7f0804ee) + c4234cV12.a.a.getHeight());
                }
            };
            C12094zO c12094zO = new C12094zO();
            Objects.requireNonNull(c10285u6);
            C5265fV1 c5265fV1 = new C5265fV1(messageContainer, r5, c12094zO, new Callback() { // from class: SQ2
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C10285u6.this.C((Animator) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, this.k);
            this.X = c5265fV1;
            HO ho = new HO(this.T, this.Y, this.l, this.r, this.i0, this.g0, c5265fV1);
            this.Z = ho;
            C5265fV1 c5265fV12 = this.X;
            c5265fV12.a.b.c = ho;
            K14 k14 = AbstractC5609gV1.a;
            AbstractC5609gV1.a.a(c5265fV12, c10285u6.t);
        }
        if (N.M09VlOh_("CommerceMerchantViewer") && (this instanceof C10333uE3)) {
            a aVar = this.h;
            this.L.p(new C4573dU1(aVar, this.k, this.C, aVar.getWindow().getDecorView(), AbstractC5609gV1.a(c10285u6), this.l, this.M, new WT1(), this.w0));
        }
        if (Build.VERSION.SDK_INT >= 31 && !DeviceFormFactor.b(c10285u6)) {
            this.f0 = new C4937eY2(this.l);
        }
        if (V83.a()) {
            ((C8385oa2) this.N).m(new Callback() { // from class: yQ2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    BookmarkBridge bookmarkBridge = (BookmarkBridge) obj;
                    new C8372oY();
                    C3063Xo3 c3063Xo3 = C8372oY.a().a;
                    if (c3063Xo3 == null || bookmarkBridge == null) {
                        return;
                    }
                    RunnableC1807Nx2 runnableC1807Nx2 = new RunnableC1807Nx2(bookmarkBridge, c3063Xo3);
                    if (bookmarkBridge.d) {
                        runnableC1807Nx2.run();
                    } else {
                        bookmarkBridge.b(new C2587Tx2(runnableC1807Nx2, bookmarkBridge));
                    }
                }
            });
        }
        new C11832yd2(this.M, new Callback() { // from class: zQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Profile profile = (Profile) obj;
                C4559dR2 c4559dR2 = C4559dR2.this;
                c4559dR2.getClass();
                C7928nE c7928nE2 = UN.a;
                if (N.M09VlOh_("Journeys")) {
                    c4559dR2.A0.a(new f(profile, c4559dR2.h, IG3.a(), new XQ2(c4559dR2), C10021tL.f()));
                }
            }
        });
    }

    @Override // defpackage.InterfaceC9035qT1
    public final boolean a(int i, boolean z) {
        C0430Di c0430Di;
        if (i == R.id.show_menu && (c0430Di = this.i) != null) {
            C1340Ki c1340Ki = c0430Di.d;
            if (c1340Ki != null && c1340Ki.j()) {
                c1340Ki.k(ViewConfiguration.get(c0430Di.a).hasPermanentMenuKey() ? null : ((C9707sQ3) c0430Di.b).e(), false);
            }
            return true;
        }
        C6166i6 c6166i6 = this.l;
        if (i == R.id.find_in_page_id) {
            C3511aO0 c3511aO0 = this.n;
            if (c3511aO0 == null) {
                return false;
            }
            c3511aO0.b();
            Tab tab = (Tab) c6166i6.g;
            if (z) {
                FI2.a("MobileMenuFindInPage");
                N.M$ejnyHh(tab.b(), "MobileMenu.FindInPage", "HasOccurred");
            } else {
                FI2.a("MobileShortcutFindInPage");
            }
            return true;
        }
        if (i == R.id.share_menu_id || i == R.id.direct_share_menu_id) {
            boolean z2 = i == R.id.direct_share_menu_id;
            ((AbstractC11276wz3) ((InterfaceC10590uz3) ((C8385oa2) this.U).g)).o();
            J63 j63 = (J63) ((C8385oa2) this.m).g;
            Tab tab2 = (Tab) c6166i6.g;
            if (j63 != null && tab2 != null) {
                if (z2) {
                    FI2.a("MobileMenuDirectShare");
                    N.M$ejnyHh(tab2.b(), "MobileMenu.DirectShare", "HasOccurred");
                } else {
                    FI2.a("MobileMenuShare");
                    N.M$ejnyHh(tab2.b(), "MobileMenu.Share", "HasOccurred");
                }
                j63.b(0, tab2, z2);
            }
            return true;
        }
        if (i == R.id.paint_preview_show_id) {
            Tab tab3 = (Tab) c6166i6.g;
            if (tab3 != null) {
                final C11192wl0 c11192wl0 = new C11192wl0(tab3);
                N.MJ3oAy5s();
                YD3 yd3 = c11192wl0.b;
                yd3.i.b(new Callback() { // from class: tl0
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        final Boolean bool = (Boolean) obj;
                        final C11192wl0 c11192wl02 = C11192wl0.this;
                        c11192wl02.getClass();
                        PostTask.d(AbstractC5103f04.c, new Runnable() { // from class: ul0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C11192wl0 c11192wl03 = C11192wl0.this;
                                c11192wl03.getClass();
                                boolean booleanValue = bool.booleanValue();
                                boolean d = booleanValue ? c11192wl03.b.d(c11192wl03) : false;
                                ZN3.b(d ? R.string.f79920_resource_name_obfuscated_res_0x7f140782 : R.string.f79910_resource_name_obfuscated_res_0x7f140781, 1, c11192wl03.a.getContext()).d();
                                if (booleanValue && d) {
                                    return;
                                }
                                N.M9gwtxem();
                                c11192wl03.a.w(c11192wl03.c);
                                c11192wl03.a = null;
                                c11192wl03.b = null;
                            }
                        });
                    }
                }, yd3.a);
            }
            return true;
        }
        if (i != R.id.get_image_descriptions_id) {
            if (i == R.id.page_zoom_id) {
                final C1987Ph2 c1987Ph2 = this.D0;
                WebContents b = ((Tab) c6166i6.g).b();
                View view = c1987Ph2.d;
                if (view == null) {
                    View inflate = ((ViewStub) c1987Ph2.a.a.h.findViewById(R.id.page_zoom_container)).inflate();
                    c1987Ph2.d = inflate;
                    UD2.a(c1987Ph2.b, inflate, new TD2() { // from class: Nh2
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj, Object obj2) {
                            final PropertyModel propertyModel = (PropertyModel) wd2;
                            View view2 = (View) obj;
                            FD2 fd2 = (FD2) obj2;
                            ND2 nd2 = AbstractC2897Wh2.g;
                            if (nd2 == fd2) {
                                ((SeekBar) view2.findViewById(R.id.page_zoom_slider)).setProgress(propertyModel.h(nd2));
                                return;
                            }
                            ND2 nd22 = AbstractC2897Wh2.f;
                            if (nd22 == fd2) {
                                ((SeekBar) view2.findViewById(R.id.page_zoom_slider)).setMax(propertyModel.h(nd22));
                                return;
                            }
                            if (AbstractC2897Wh2.a == fd2) {
                                view2.findViewById(R.id.page_zoom_decrease_zoom_button).setOnClickListener(new View.OnClickListener() { // from class: Yh2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        ((Callback) PropertyModel.this.i(AbstractC2897Wh2.a)).onResult(null);
                                    }
                                });
                                return;
                            }
                            if (AbstractC2897Wh2.b == fd2) {
                                view2.findViewById(R.id.page_zoom_increase_zoom_button).setOnClickListener(new View.OnClickListener() { // from class: Zh2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        ((Callback) PropertyModel.this.i(AbstractC2897Wh2.b)).onResult(null);
                                    }
                                });
                                return;
                            }
                            LD2 ld2 = AbstractC2897Wh2.d;
                            if (ld2 == fd2) {
                                view2.findViewById(R.id.page_zoom_decrease_zoom_button).setEnabled(propertyModel.j(ld2));
                                return;
                            }
                            LD2 ld22 = AbstractC2897Wh2.e;
                            if (ld22 == fd2) {
                                view2.findViewById(R.id.page_zoom_increase_zoom_button).setEnabled(propertyModel.j(ld22));
                            } else if (AbstractC2897Wh2.c == fd2) {
                                ((SeekBar) view2.findViewById(R.id.page_zoom_slider)).setOnSeekBarChangeListener(new C3621ai2(propertyModel));
                            }
                        }
                    });
                } else {
                    view.setVisibility(0);
                }
                C2507Th2 c2507Th2 = c1987Ph2.c;
                c2507Th2.b = b;
                double M70wUYPG = N.M70wUYPG(b);
                double[] dArr = AbstractC3027Xh2.a;
                double round = Math.round(M70wUYPG * 100.0d) / 100.0d;
                c2507Th2.a.m(AbstractC2897Wh2.g, AbstractC3027Xh2.b(round));
                c2507Th2.a(round);
                c1987Ph2.d.postDelayed(new Runnable() { // from class: Oh2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1987Ph2.this.d.setVisibility(8);
                    }
                }, 50000L);
            }
            return false;
        }
        C2241Rg1 a = C2241Rg1.a();
        a aVar = this.h;
        ZX1 zx1 = (ZX1) ((C8385oa2) this.i0).g;
        WebContents b2 = ((Tab) c6166i6.g).b();
        a.getClass();
        Profile d = Profile.d();
        boolean a2 = R44.a(d).a("settings.a11y.enable_accessibility_image_labels_android");
        C2111Qg1 c2111Qg1 = a.a;
        if (!a2) {
            Q83 q83 = O83.a;
            if (q83.e("Chrome.ImageDescriptions.DontAskAgain", false)) {
                c2111Qg1.a(b2, true);
                ZN3.b(R.string.f74810_resource_name_obfuscated_res_0x7f14051c, 1, aVar).d();
            } else {
                zx1.l(new C2631Ug1(aVar, zx1, a.a, q83.f(0, "Chrome.ImageDescriptions.JustOnceCount") >= 3, b2).h, 1, false);
            }
        } else if (!R44.a(d).a("settings.a11y.enable_accessibility_image_labels_only_on_wifi") || C1226Jl0.b(aVar) == 2) {
            c2111Qg1.a.getClass();
            R44.a(d).e("settings.a11y.enable_accessibility_image_labels_android", false);
            ZN3.b(R.string.f74820_resource_name_obfuscated_res_0x7f14051d, 1, aVar).d();
        } else {
            c2111Qg1.a(b2, false);
            ZN3.b(R.string.f74810_resource_name_obfuscated_res_0x7f14051c, 1, aVar).d();
        }
        return true;
    }

    @Override // defpackage.InterfaceC12202zi
    public final boolean X() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.R;
        if (interfaceC0079Ap3.get() != null) {
            Q70 q70 = ((ContextualSearchManager) interfaceC0079Ap3.get()).v;
            if (q70 != null && q70.x()) {
                return false;
            }
        }
        C3511aO0 c3511aO0 = this.n;
        if (c3511aO0 != null) {
            org.chromium.chrome.browser.findinpage.a aVar = c3511aO0.a;
            if ((aVar != null && aVar.getVisibility() == 0) && !DeviceFormFactor.a(this.h)) {
                return false;
            }
        }
        return true;
    }

    public void m(C9897sy1 c9897sy1) {
        C0678Ff2 c0678Ff2 = this.p;
        if (c0678Ff2 != null) {
            c0678Ff2.b.d(this.q);
        }
        C0678Ff2 c0678Ff22 = c9897sy1.z;
        this.p = c0678Ff22;
        if (this.q == null) {
            this.q = new YQ2(this);
        }
        c0678Ff22.b.a(this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [IQ2] */
    /* JADX WARN: Type inference failed for: r13v3, types: [MQ2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, NQ2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [LQ2] */
    public void k() {
        TraceEvent traceEvent;
        ToolbarControlContainer toolbarControlContainer;
        ?? r12;
        final Zf4 zf4;
        InterfaceC7697ma2 interfaceC7697ma2 = this.i0;
        C6166i6 c6166i6 = this.l;
        InterfaceC7697ma2 interfaceC7697ma22 = this.M;
        TraceEvent i = TraceEvent.i("RootUiCoordinator.initializeToolbar", null);
        try {
            toolbarControlContainer = (ToolbarControlContainer) this.h.findViewById(R.id.control_container);
            r12 = new Callback() { // from class: IQ2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C4559dR2 c4559dR2 = C4559dR2.this;
                    Callback callback = c4559dR2.w;
                    if (callback != null) {
                        callback.onResult(bool);
                    }
                    HO ho = c4559dR2.Z;
                    if (ho != null) {
                        ho.d(bool.booleanValue());
                    }
                    c4559dR2.K.p(bool);
                }
            };
            ?? r5 = new InterfaceC0079Ap3() { // from class: LQ2
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    Profile profile = (Profile) ((C8385oa2) C4559dR2.this.M).g;
                    if (profile == null) {
                        return null;
                    }
                    return LU3.a(profile);
                }
            };
            this.I = new C0942Hg1(this.h, this.g0, interfaceC7697ma22);
            C1428Kz2 c1428Kz2 = new C1428Kz2(this.h, c6166i6, this.O);
            a aVar = this.h;
            C63 c63 = new C63(aVar, AbstractC2884Wf.a(aVar, R.drawable.f50440_resource_name_obfuscated_res_0x7f09032d), this.l, this.m, r5, new C7212l83(), this.g0, (ZX1) ((C8385oa2) interfaceC7697ma2).g, new Runnable() { // from class: MQ2
                @Override // java.lang.Runnable
                public final void run() {
                    C4559dR2.this.x.k(12, false);
                }
            });
            ZQ2 zq2 = new ZQ2(this);
            a aVar2 = this.h;
            zf4 = new Zf4(aVar2, AbstractC2884Wf.a(aVar2, R.drawable.f45080_resource_name_obfuscated_res_0x7f0900cb), this.l, r5, this.g0, (ZX1) ((C8385oa2) interfaceC7697ma2).g, zq2);
            a aVar3 = this.h;
            C0023Ae2 c0023Ae2 = new C0023Ae2(aVar3, AbstractC2884Wf.a(aVar3, R.drawable.f51760_resource_name_obfuscated_res_0x7f0903de), this.g0, this.m0, this.U, r5);
            L6 l6 = new L6(this.h, new I53(), this.g0, new G6(), this.k, O83.a);
            HashMap hashMap = l6.h;
            hashMap.put(2, c0023Ae2);
            hashMap.put(3, c63);
            hashMap.put(4, zf4);
            hashMap.put(6, c1428Kz2);
            this.H = new C4454d70(interfaceC7697ma22, c6166i6, l6);
            this.G = Arrays.asList(this.I, l6);
            traceEvent = i;
        } catch (Throwable th) {
            th = th;
            traceEvent = i;
        }
        try {
            this.x = new C9707sQ3(this.h, this.T, this.n0, toolbarControlContainer, (CompositorViewHolder) this.o0.get(), r12, this.v, (C1948Oz3) this.a.g, this.m, this.I, this.G, this.l, this.E, this.f11504J, this.n, this.M, this.N, this.r, this.P, this instanceof C10333uE3, this.U, this.V, this.K, this.a0, this.b0, this.k, this.s0, this.i0, this.p0, this.u0, this.g0, this.c0, this.C, this.t0, (TabContentManager) this.v0.get(), (InterfaceC10912vv3) this.m0.get(), (ViewOnClickListenerC1069If3) this.q0.get(), this.g, this.L, this.x0, this.y0, this.B0, this.z0, this.C0);
            if (!this.k0.a()) {
                e eVar = this.x.k;
                LS1 ls1 = eVar.e;
                MenuButton menuButton = ls1.e;
                if (menuButton != null) {
                    AbstractC8540p04.i(menuButton);
                    ls1.a();
                }
                eVar.a.u();
            }
            Vf4 b = this.x.D.b();
            if (b != null) {
                ?? r2 = new Qf4() { // from class: NQ2
                    @Override // defpackage.Qf4
                    public final void u() {
                        Zf4 zf42 = Zf4.this;
                        boolean b2 = zf42.b((Tab) zf42.a.get());
                        zf42.l.a = b2;
                        zf42.a(b2);
                    }
                };
                this.d0 = r2;
                b.f.a(r2);
            }
            if (traceEvent != null) {
                traceEvent.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (traceEvent != null) {
                try {
                    traceEvent.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public OX2 b() {
        ViewGroup viewGroup = (ViewGroup) this.h.findViewById(R.id.coordinator);
        return new OX2(this.h, new C3528aR2(this), viewGroup, viewGroup.getContext().getColor(R.color.f25550_resource_name_obfuscated_res_0x7f07080a));
    }

    public void n(InterfaceC1422Ky1 interfaceC1422Ky1) {
        this.s = interfaceC1422Ky1;
        C3872bR2 c3872bR2 = new C3872bR2(this);
        this.t = c3872bR2;
        ((C9897sy1) interfaceC1422Ky1).e(c3872bR2);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [xQ2] */
    /* JADX WARN: Type inference failed for: r6v0, types: [KQ2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [HQ2] */
    public void W() {
        if (this.k0.a()) {
            a aVar = this.h;
            C0430Di c0430Di = new C0430Di(aVar, this.g0, this.x, this.u0, aVar.getWindow().getDecorView(), this.h.getWindow().getDecorView().findViewById(R.id.menu_anchor_stub), new InterfaceC0079Ap3() { // from class: HQ2
                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return C4559dR2.this.h();
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }
            });
            this.i = c0430Di;
            ViewOnKeyListenerC11859yi.w = new Callback() { // from class: JQ2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ChromePureJavaExceptionReporter.d((Throwable) obj);
                }
            };
            ArrayList arrayList = c0430Di.d.h;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            ArrayList arrayList2 = this.i.d.h;
            InterfaceC12202zi interfaceC12202zi = this.j0;
            if (!arrayList2.contains(interfaceC12202zi)) {
                arrayList2.add(interfaceC12202zi);
            }
            this.P.a(this.i);
        }
        final a aVar2 = this.h;
        int i = this.r0;
        InterfaceC9377rT1 interfaceC9377rT1 = this.j;
        Objects.requireNonNull(aVar2);
        C4685do0 c4685do0 = new C4685do0(aVar2, i, interfaceC9377rT1, new Runnable() { // from class: KQ2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.onBackPressed();
            }
        }, (InterfaceC10590uz3) ((C8385oa2) this.U).g, this.n, this.C, this.T, (CompositorViewHolder) this.o0.get(), this.l);
        this.F = c4685do0;
        this.g0.b(c4685do0);
        m mVar = this.C;
        if (mVar != null) {
            TQ2 tq2 = new TQ2(this);
            this.Q = tq2;
            mVar.a(tq2);
        }
        if (this.i != null) {
            C8385oa2 c8385oa2 = (C8385oa2) this.i0;
            c8385oa2.getClass();
            if (AbstractC12248zp3.a(c8385oa2)) {
                UQ2 uq2 = new UQ2(this);
                this.z = uq2;
                ((ZX1) c8385oa2.g).a(uq2);
            }
        }
        new C11736yL(this.l, new Callback() { // from class: xQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                String str = (String) obj;
                C4559dR2 c4559dR2 = C4559dR2.this;
                if (((C8385oa2) c4559dR2.U).g == null) {
                    return;
                }
                C6502j5 c6502j5 = AbstractC6846k5.a;
                String x = SelectionPopupControllerImpl.x(1000, str);
                if (TextUtils.isEmpty(x)) {
                    return;
                }
                Tab tab = (Tab) c4559dR2.l.g;
                LU3.a(Profile.b(tab.b())).notifyEvent("web_search_performed");
                InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) ((C8385oa2) c4559dR2.U).g;
                String d = IG3.a().d(x, null);
                Profile b = Profile.b(tab.b());
                String d2 = b != null ? GeolocationHeader.d(d, b, tab) : null;
                LoadUrlParams loadUrlParams = new LoadUrlParams(d, 0);
                loadUrlParams.g = d2;
                loadUrlParams.d = 5;
                ((AbstractC11276wz3) interfaceC10590uz3).r(loadUrlParams, 4, tab, tab.isIncognito());
            }
        }, this.m, d());
        VQ2 vq2 = new VQ2(this);
        this.A = vq2;
        VrModuleProvider.f(vq2);
        this.e0 = new UM1(this.k, this.h.findViewById(R.id.capture_overlay));
        ViewGroup viewGroup = (ViewGroup) this.h.findViewById(R.id.sheet_container);
        if (viewGroup.isLaidOut()) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.addOnLayoutChangeListener(new WQ2(viewGroup));
        }
    }

    public Rect h() {
        Rect rect = new Rect();
        this.h.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public void l() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.R;
        if (interfaceC0079Ap3.get() != null) {
            ((ContextualSearchManager) interfaceC0079Ap3.get()).i(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [FQ2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [BQ2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [GQ2] */
    public void i() {
        k kVar;
        Callback callback = new Callback() { // from class: AQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4559dR2 c4559dR2 = C4559dR2.this;
                c4559dR2.D = new ViewOnClickListenerC1069If3(c4559dR2.h, (ViewGroup) ((View) obj).findViewById(R.id.bottom_sheet_snackbar_container), c4559dR2.k);
            }
        };
        ?? r11 = new InterfaceC0079Ap3() { // from class: BQ2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return ((CompositorViewHolder) C4559dR2.this.o0.get()).k.z;
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: CQ2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C4559dR2.this.E;
            }
        };
        Window window = this.h.getWindow();
        C10285u6 c10285u6 = this.k;
        this.C = new m(interfaceC0079Ap3, callback, window, (H5) c10285u6.g, new InterfaceC0079Ap3() { // from class: DQ2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return (ViewGroup) C4559dR2.this.h.findViewById(R.id.sheet_container);
            }
        }, new InterfaceC0079Ap3() { // from class: EQ2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Integer.valueOf(C4559dR2.this.h.findViewById(R.id.coordinator).getHeight());
            }
        });
        org.chromium.components.browser_ui.bottomsheet.f.a(new Callback() { // from class: FQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ChromePureJavaExceptionReporter.d((Throwable) obj);
            }
        });
        m mVar = this.C;
        K14 k14 = UB.a;
        UB.a.a(mVar, c10285u6.t);
        this.B = new C4137cC(this.C, this.l, this.T, this.i0, new InterfaceC0079Ap3() { // from class: GQ2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C4559dR2.this.D;
            }
        }, (C1948Oz3) this.a.g, this.K, r11, this.V);
        if (!C9861ss.b() || (kVar = this.C.s) == null) {
            return;
        }
        this.C0.a(kVar, 8);
    }
}
