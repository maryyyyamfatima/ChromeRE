package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.RectF;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.regex.Pattern;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N70 extends AbstractC9101qf2 implements Q70 {
    public C5829h70 A0;
    public C4116c80 B0;
    public I70 C0;
    public C3503aM2 D0;
    public J70 E0;
    public C3503aM2 F0;
    public K70 G0;
    public final R70 k0;
    public final CompositorViewHolder l0;
    public final WindowAndroid m0;
    public final C9707sQ3 n0;
    public final int o0;
    public final InterfaceC0079Ap3 p0;
    public final float q0;
    public boolean r0;
    public InterfaceC9949t70 s0;
    public boolean t0;
    public final ContextualSearchSceneLayer u0;
    public OX2 v0;
    public PropertyModel w0;
    public boolean x0;
    public boolean y0;
    public float z0;

    @Override // defpackage.Q70
    public final void e0(int i) {
        v0(i, 3);
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        int i2;
        C7851n02 c7851n02 = C7851n02.i;
        Activity activity2 = this.Y;
        c7851n02.getClass();
        boolean q = C7851n02.q(activity2);
        int i3 = 1;
        if ((!(q || C7851n02.p(this.Y)) || (i != 4 && i != 3)) && (i == 3 || i == 5 || i == 6)) {
            j0(0, false);
        }
        if (i == 4) {
            ContextualSearchManager contextualSearchManager = (ContextualSearchManager) this.s0;
            contextualSearchManager.getClass();
            if (AbstractC7547m70.a()) {
                contextualSearchManager.t.getClass();
                Pattern pattern = AbstractC8584p80.a;
                if (S70.a().c("search.contextual_search_enabled").isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = S70.b() ? 2 : 1;
                }
                EI2.h(i2, 3, "Search.ContextualSearchPreferenceState");
                boolean Mfmn09fr = N.Mfmn09fr(Profile.d());
                boolean c = S70.c();
                if (!Mfmn09fr) {
                    i3 = c ? 2 : 0;
                } else if (c) {
                    i3 = 3;
                }
                EI2.h(i3, 4, "Search.RelatedSearches.AllUserPermissions");
            }
        }
    }

    public N70(Activity activity, C9897sy1 c9897sy1, C0678Ff2 c0678Ff2, WindowAndroid windowAndroid, CompositorViewHolder compositorViewHolder, float f, C9707sQ3 c9707sQ3, int i, InterfaceC0079Ap3 interfaceC0079Ap3) {
        super(activity, c9897sy1, c0678Ff2, f, interfaceC0079Ap3);
        this.z0 = -1.0f;
        this.u0 = new ContextualSearchSceneLayer(this.n.getResources().getDisplayMetrics().density);
        this.k0 = new R70();
        this.l0 = compositorViewHolder;
        this.m0 = windowAndroid;
        this.n0 = c9707sQ3;
        this.o0 = i;
        this.p0 = interfaceC0079Ap3;
        this.q0 = this.n.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080150) * this.a;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC4240cW2 j(RectF rectF, ResourceManager resourceManager, float f) {
        boolean z;
        C5829h70 b0 = b0();
        C4116c80 T0 = T0();
        C3503aM2 U0 = U0();
        C3503aM2 V0 = V0();
        C8921q70 c8921q70 = b0().g;
        ContextualSearchSceneLayer contextualSearchSceneLayer = this.u0;
        contextualSearchSceneLayer.getClass();
        if (resourceManager == null || !a()) {
            return contextualSearchSceneLayer;
        }
        if (!contextualSearchSceneLayer.h) {
            N.MFh7xXWg(contextualSearchSceneLayer.g, contextualSearchSceneLayer, resourceManager);
            contextualSearchSceneLayer.h = true;
        }
        contextualSearchSceneLayer.j = c8921q70;
        int i = this.h;
        int i2 = b0.b.g;
        int i3 = b0.c.g;
        C6515j70 c6515j70 = b0.d;
        int i4 = c6515j70.g;
        int i5 = this.o0 == 0 ? R.drawable.0_resource_name_obfuscated_res_0x7f0903f4 : -1;
        int i6 = T0.g;
        boolean z2 = T0.u;
        float f2 = T0.w;
        float f3 = T0.v;
        int i7 = T0.t;
        ZL2 zl2 = V0.h;
        int i8 = zl2 != null ? zl2.g : 0;
        boolean z3 = V0.l;
        float f4 = (!z3 || zl2 == null) ? 0.0f : V0.m;
        ZL2 zl22 = U0.h;
        int i9 = zl22 != null ? zl22.g : 0;
        boolean z4 = U0.l;
        C3503aM2 U02 = U0();
        float dimension = (!U02.l || U02.h == null) ? 0.0f : U02.a.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0806f5);
        float f5 = ((this.A0 != null ? b0().r : 0.0f) * contextualSearchSceneLayer.i) - dimension;
        float f6 = c8921q70.h;
        if (c8921q70.g == 0) {
            z = z2;
            c8921q70.g = c8921q70.a.n.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08014b);
        } else {
            z = z2;
        }
        int i10 = c8921q70.g;
        boolean z5 = c8921q70.d;
        int i11 = c8921q70.c;
        boolean z6 = c8921q70.f;
        String str = c8921q70.e;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        float f7 = this.v;
        float f8 = this.w;
        float f9 = this.t;
        float f10 = this.x;
        float R0 = R0();
        float f11 = b0.h;
        float f12 = b0.i;
        float f13 = !c6515j70.F ? 0.0f : c6515j70.D;
        boolean z7 = c6515j70.C;
        boolean z8 = this.D;
        int i12 = this.i;
        int i13 = this.j;
        int i14 = this.k;
        int i15 = this.l;
        float f14 = this.F;
        boolean z9 = this.L;
        float f15 = this.K;
        float f16 = this.N;
        boolean z10 = b0.t;
        float f17 = b0.u;
        float f18 = b0.v;
        WebContents b = b();
        int f19 = AbstractC10957w33.f(this.n);
        float f20 = contextualSearchSceneLayer.i;
        N.MP4UE9Nn(contextualSearchSceneLayer.g, contextualSearchSceneLayer, R.drawable.0_resource_name_obfuscated_res_0x7f0904ce, i, i2, i3, i4, R.drawable.0_resource_name_obfuscated_res_0x7f090397, R.drawable.0_resource_name_obfuscated_res_0x7f09024f, i11, R.drawable.0_resource_name_obfuscated_res_0x7f090168, i5, -1, R.drawable.0_resource_name_obfuscated_res_0x7f09041d, i14, R.drawable.0_resource_name_obfuscated_res_0x7f09041e, i15, i6, f20, this.q * f20, this.r * f20, this.f11546J, this.I * f20, b, z, f2, f3, i7, i8, z3, f4, i9, z4, f5, dimension, f7 * f20, f8 * f20, f9 * f20, f10 * f20, this.A * f20, this.B * f20, R0 * f20, f11, b0.k, f12, b0.l, f13, z7, z8, this.E * f20, z5, z6, str2, f6, i10, i12, i13, f14, z9, this.M * f20, f15, f16, z10, f17, f18, Profile.d(), R.drawable.0_resource_name_obfuscated_res_0x7f0904cd, f19);
        return contextualSearchSceneLayer;
    }

    @Override // defpackage.Q70
    public final void d0() {
        R70 r70 = this.k0;
        r70.a = true;
        r70.h = true;
        r70.m = System.nanoTime();
    }

    @Override // defpackage.Q70
    public final void r0(ContextualSearchManager contextualSearchManager) {
        if (this.s0 != contextualSearchManager) {
            this.s0 = contextualSearchManager;
            Activity activity = contextualSearchManager.g;
            this.Y = activity;
            if (activity != null) {
                ApplicationStatus.e(this, activity);
                return;
            }
            throw new RuntimeException("Activity provided to OverlayPanel cannot be null!");
        }
    }

    @Override // defpackage.Q70
    public final void G(boolean z) {
        if (a()) {
            final C4116c80 T0 = T0();
            if (T0.u && T0.q.a()) {
                I70 i70 = T0.r;
                if (z) {
                    i70.getClass();
                } else {
                    i70.getClass();
                }
                T0.m();
                i70.getClass();
                C4424d20 c = C4424d20.c(T0.q.z0(), 1.0f, 0.0f, 218L, null);
                c.a(new InterfaceC4080c20() { // from class: Z70
                    @Override // defpackage.InterfaceC4080c20
                    public final void a(C4424d20 c4424d20) {
                        C4116c80 c4116c80 = C4116c80.this;
                        c4116c80.getClass();
                        c4116c80.n(c4424d20.b());
                    }
                });
                c.addListener(new C3429a80(T0));
                c.start();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    @Override // defpackage.AbstractC9101qf2, defpackage.AbstractC10472uf2, defpackage.Q70
    public final void j0(int i, boolean z) {
        C3503aM2 U0;
        if (this.h0) {
            if (z) {
                if (this.Q.intValue() != 1) {
                    v0(i, 1);
                }
            } else {
                C4424d20 c4424d20 = this.S;
                if (c4424d20 != null) {
                    c4424d20.cancel();
                }
                G0(C0(1));
                X0(1, i);
                E0();
            }
        }
        this.t0 = false;
        if (i == 11) {
            if (this.x0) {
                U0 = V0();
            } else {
                U0 = U0();
            }
            boolean z2 = U0.d && U0.u >= U0.j;
            Pattern pattern = AbstractC8584p80.a;
            if (z2) {
                FI2.a("RelatedSearches.TabPromotion");
            } else {
                FI2.a("ContextualSearch.TabPromotion");
            }
            this.x0 = false;
        }
    }

    @Override // defpackage.AbstractC9101qf2, defpackage.InterfaceC3897bW2
    public final boolean onBackPressed() {
        if (!a()) {
            return false;
        }
        ((ContextualSearchManager) this.s0).i(2);
        return true;
    }

    @Override // defpackage.AbstractC9101qf2
    public final void P0(int i) {
        this.h0 = true;
        H0();
        v0(i, 2);
        int i2 = this.o;
        if (i2 == 1 || i2 == 2) {
            this.t0 = false;
        }
        if ((i2 == 0 || i2 == 1) && i == 3) {
            this.k0.getClass();
            System.nanoTime();
        }
    }

    public final boolean W0() {
        ((ContextualSearchManager) this.s0).getClass();
        if (!SysUtils.isLowEndDevice()) {
            return false;
        }
        ContextualSearchManager contextualSearchManager = (ContextualSearchManager) this.s0;
        C4803e80 c4803e80 = contextualSearchManager.L;
        if (c4803e80 == null || c4803e80.c() == null) {
            return true;
        }
        LoadUrlParams loadUrlParams = new LoadUrlParams(contextualSearchManager.L.c(), 0);
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) contextualSearchManager.p;
        abstractC11276wz3.r(loadUrlParams, 0, abstractC11276wz3.h(), abstractC11276wz3.o());
        return true;
    }

    @Override // defpackage.AbstractC9101qf2
    public final float I0() {
        float R0 = R0() + this.w;
        C3503aM2 V0 = V0();
        float f = (!V0.l || V0.h == null) ? 0.0f : V0.m;
        float f2 = this.a;
        return (T0().w * f2) + (f * f2) + R0;
    }

    public final float S0() {
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        float f = this.A;
        if (isLayoutRtl) {
            return this.v + f;
        }
        float f2 = (this.v + this.t) - f;
        if (this.G == 0.0f) {
            this.G = AbstractC9771sd.c(this.n.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f0900c5, 0).getIntrinsicWidth() * this.a;
        }
        return f2 - this.G;
    }

    @Override // defpackage.AbstractC10472uf2
    public final void w0(Integer num, int i, long j) {
        int i2;
        FO2 fo2;
        if (num.intValue() == this.o) {
            if (this.A0 != null) {
                C4424d20 c4424d20 = b0().q;
                if (c4424d20 != null && c4424d20.isRunning()) {
                    return;
                }
            }
        }
        if (num.intValue() == 2 && ((i2 = this.o) == 3 || i2 == 4)) {
            ContextualSearchManager contextualSearchManager = (ContextualSearchManager) this.s0;
            if (contextualSearchManager.O && (fo2 = contextualSearchManager.P) != null) {
                contextualSearchManager.e(fo2, fo2.a, false);
            }
            U0().b();
            V0().b();
        }
        this.Q = num;
        this.R = i;
        float C0 = C0(num);
        if (j <= 0) {
            return;
        }
        C4424d20 c4424d202 = this.S;
        if (c4424d202 != null) {
            c4424d202.cancel();
        }
        C4424d20 c = C4424d20.c(z0(), this.x, C0, j, null);
        this.S = c;
        c.a(new InterfaceC4080c20() { // from class: rf2
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d203) {
                AbstractC10472uf2 abstractC10472uf2 = AbstractC10472uf2.this;
                abstractC10472uf2.getClass();
                abstractC10472uf2.G0(c4424d203.b());
            }
        });
        this.S.addListener(new C10129tf2(this));
        this.S.start();
    }

    @Override // defpackage.Q70
    public final void y(boolean z) {
        if (z) {
            C4116c80 T0 = T0();
            if (!T0.u) {
                T0.e(false);
                T0.u = true;
                T0.w = T0.x;
            }
        } else {
            T0().l();
        }
        this.k0.b = z;
    }

    @Override // defpackage.Q70
    public final void q0() {
        U0().e();
        V0().e();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Override // defpackage.Q70
    public final void N() {
        C3503aM2 U0;
        this.r0 = true;
        v0(10, 4);
        if (this.x0) {
            U0 = V0();
        } else {
            U0 = U0();
        }
        boolean z = U0.d && U0.u >= U0.j;
        Pattern pattern = AbstractC8584p80.a;
        if (z) {
            FI2.a("RelatedSearches.SerpResultClicked");
        } else {
            FI2.a("ContextualSearch.SerpResultClicked");
        }
        this.x0 = false;
    }

    @Override // defpackage.Q70
    public final void e() {
        OverlayPanelContent overlayPanelContent = this.e0;
        if (overlayPanelContent != null) {
            if (overlayPanelContent.e != null) {
                overlayPanelContent.b();
            }
            long j = overlayPanelContent.g;
            if (j != 0) {
                N.MUq5ITc4(j, overlayPanelContent);
            }
            this.e0 = null;
        }
    }

    @Override // defpackage.Q70
    public final void U(int i) {
        C0678Ff2 c0678Ff2;
        AbstractC9101qf2 abstractC9101qf2;
        if (a() && this.o == 2) {
            P0(i);
        }
        if (this.h0 || (c0678Ff2 = this.X) == null || this == (abstractC9101qf2 = c0678Ff2.c) || abstractC9101qf2 != null) {
            return;
        }
        c0678Ff2.c = this;
        c0678Ff2.a(this, i);
    }

    @Override // defpackage.Q70
    public final boolean i() {
        return this.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [aM2, c80] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Throwable, qf2] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [Ff2] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X0(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N70.X0(int, int):void");
    }

    @Override // defpackage.Q70
    public final void D(String str) {
        b0().a(str);
    }

    @Override // defpackage.Q70
    public final void t0() {
        C6515j70 c6515j70 = b0().d;
        if (c6515j70.C && !TextUtils.isEmpty(c6515j70.z.getText())) {
            return;
        }
        b0().a(this.n.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403bf));
    }

    @Override // defpackage.Q70
    public final void A() {
        C6515j70 c6515j70 = b0().d;
        c6515j70.C = false;
        c6515j70.D = 0.0f;
        c6515j70.A = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:            if ((r10.q == 3) != false) goto L578;     */
    @Override // defpackage.Q70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, java.util.ArrayList r23, boolean r24, int r25, java.util.ArrayList r26, boolean r27, int r28) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N70.Y(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.ArrayList, boolean, int, java.util.ArrayList, boolean, int):void");
    }

    @Override // defpackage.AbstractC10472uf2
    public final void F0(float f) {
        G0(JM1.b(f, C0(4), C0(2)));
    }

    @Override // defpackage.Q70
    public final R70 n() {
        return this.k0;
    }

    @Override // defpackage.Q70
    public final void B() {
        this.k0.getClass();
    }

    @Override // defpackage.Q70
    public final void k0(float f) {
        this.z0 = f;
    }

    @Override // defpackage.Q70
    public final C5829h70 b0() {
        if (this.A0 == null) {
            this.A0 = new C5829h70(this, this.n, this.O, this.P);
        }
        return this.A0;
    }

    public final float R0() {
        return (this.A0 != null ? b0().r : 0.0f) + this.C;
    }

    @Override // defpackage.Q70
    public final void H(String str) {
        b0().g.b(true);
        b0().b(str, null);
        this.k0.getClass();
        System.nanoTime();
        E0();
    }

    @Override // defpackage.Q70
    public final void i0(String str, String str2) {
        b0().g.b(true);
        C5829h70 b0 = b0();
        C4424d20 c4424d20 = b0.o;
        if (c4424d20 != null) {
            c4424d20.cancel();
        }
        b0.e.n();
        C7203l70 c7203l70 = b0.b;
        c7203l70.d();
        c7203l70.y.setText(AbstractC0288Cf2.k(str));
        c7203l70.z.setText(AbstractC0288Cf2.k(str2));
        c7203l70.l(true);
        b0.j = true;
        b0.h = 1.0f;
        b0.i = 0.0f;
        this.k0.getClass();
        System.nanoTime();
        E0();
    }

    public final C4116c80 T0() {
        if (this.B0 == null) {
            if (this.C0 == null) {
                this.C0 = new I70(this);
            }
            this.B0 = new C4116c80(this, this.C0, this.n, this.O, this.P);
        }
        return this.B0;
    }

    public final C3503aM2 V0() {
        if (this.D0 == null) {
            if (this.E0 == null) {
                this.E0 = new J70(this);
            }
            this.D0 = new C3503aM2(this, this.E0, false, this.n, this.O, this.P);
        }
        return this.D0;
    }

    public final C3503aM2 U0() {
        if (this.F0 == null) {
            if (this.G0 == null) {
                this.G0 = new K70(this);
            }
            this.F0 = new C3503aM2(this, this.G0, true, this.n, this.O, this.P);
        }
        return this.F0;
    }
}
