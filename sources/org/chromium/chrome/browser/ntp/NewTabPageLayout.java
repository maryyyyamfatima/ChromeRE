package org.chromium.chrome.browser.ntp;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.chrome.R;
import defpackage.AbstractC10107tb4;
import defpackage.AbstractC1427Kz1;
import defpackage.BZ2;
import defpackage.C0257Bz1;
import defpackage.C10613v32;
import defpackage.C10694vI1;
import defpackage.C10780vZ2;
import defpackage.C11037wI1;
import defpackage.C11119wY3;
import defpackage.C12180ze1;
import defpackage.C1761No1;
import defpackage.C2336Rz1;
import defpackage.C4496dF;
import defpackage.C4941eZ1;
import defpackage.C7928nE;
import defpackage.C9022qQ3;
import defpackage.C9656sG2;
import defpackage.C9927t32;
import defpackage.EI2;
import defpackage.JM1;
import defpackage.Li4;
import defpackage.M32;
import defpackage.MJ0;
import defpackage.N32;
import defpackage.Q44;
import defpackage.QZ3;
import defpackage.R32;
import defpackage.SK0;
import defpackage.UK0;
import defpackage.UN;
import defpackage.Vf4;
import defpackage.Y32;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.logo.LogoBridge;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NewTabPageLayout extends LinearLayout implements Li4 {
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public WindowAndroid G;
    public int H;
    public UK0 I;

    /* renamed from: J */
    public R32 f11525J;
    public final int a;
    public final Context g;
    public View h;
    public LogoView i;
    public C10780vZ2 j;
    public C9656sG2 k;
    public ImageView l;
    public ViewGroup m;
    public C4941eZ1 n;
    public View o;
    public C9022qQ3 p;
    public N32 q;
    public Activity r;
    public C11037wI1 s;
    public QZ3 t;
    public C4496dF u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public NewTabPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new C4496dF();
        this.x = true;
        this.g = context;
        this.a = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807d4);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(R.id.ntp_middle_spacer);
        this.i = (LogoView) findViewById(R.id.search_provider_logo);
        new Y32((ViewStub) findViewById(R.id.video_iph_stub), Profile.d());
        int indexOfChild = indexOfChild(this.h) + 1;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01a9, (ViewGroup) this, false);
        this.m = viewGroup;
        viewGroup.setVisibility(0);
        addView(this.m, indexOfChild);
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (N.MwBQ$0Eq() == 1) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.explore_sites_stub);
            viewStub.setLayoutResource(R.layout.0_resource_name_obfuscated_res_0x7f0e00fe);
            this.o = viewStub.inflate();
        }
    }

    public final void n() {
        C9022qQ3 c9022qQ3;
        if (this.C) {
            return;
        }
        C10613v32 c10613v32 = ((C9927t32) this.q).f;
        boolean z = false;
        if (!c10613v32.E && c10613v32.z != null) {
            Tab tab = (Tab) c10613v32.g.get();
            Object x = tab != null ? tab.x() : null;
            if ((x instanceof C10613v32 ? (C10613v32) x : null) == c10613v32) {
                z = true;
            }
        }
        if (z && (c9022qQ3 = this.p) != null) {
            c9022qQ3.a.onResult(Float.valueOf(e()));
        }
    }

    public final float e() {
        if (!((SK0) this.I).k()) {
            return 0.0f;
        }
        if (g()) {
            return 1.0f;
        }
        int top = this.j.b.getTop();
        if (top == 0) {
            return 0.0f;
        }
        int paddingTop = this.j.b.getPaddingTop() + top;
        int i = ((SK0) this.I).i();
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080618);
        return JM1.b((((i - paddingTop) + getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b5)) + dimensionPixelSize) / dimensionPixelSize, 0.0f, 1.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int visibility = this.m.getVisibility();
        int i3 = this.a;
        if (visibility != 8) {
            if (!f()) {
                int measuredWidth = this.m.getMeasuredWidth() - i3;
                ViewGroup viewGroup = this.j.b;
                i(viewGroup, measuredWidth, viewGroup.getMeasuredHeight());
                LogoView logoView = this.i;
                i(logoView, measuredWidth, logoView.getMeasuredHeight());
                View view = this.o;
                if (view != null) {
                    i(view, this.m.getMeasuredWidth(), this.o.getMeasuredHeight());
                    return;
                }
                return;
            }
            int measuredWidth2 = getMeasuredWidth() - i3;
            ViewGroup viewGroup2 = this.j.b;
            i(viewGroup2, measuredWidth2, viewGroup2.getMeasuredHeight());
            LogoView logoView2 = this.i;
            i(logoView2, measuredWidth2, logoView2.getMeasuredHeight());
            return;
        }
        View view2 = this.o;
        if (view2 != null) {
            int measuredWidth3 = view2.getMeasuredWidth() - i3;
            ViewGroup viewGroup3 = this.j.b;
            i(viewGroup3, measuredWidth3, viewGroup3.getMeasuredHeight());
            LogoView logoView3 = this.i;
            i(logoView3, measuredWidth3, logoView3.getMeasuredHeight());
        }
    }

    public final void h() {
        if (this.x) {
            LogoView logoView = this.i;
            if (!logoView.a()) {
                logoView.a = null;
                logoView.invalidate();
                logoView.q.e();
            }
            if (MJ0.b() && this.y) {
                return;
            }
            C11037wI1 c11037wI1 = this.s;
            M32 m32 = new M32(this);
            c11037wI1.getClass();
            C10694vI1 c10694vI1 = new C10694vI1(c11037wI1, System.currentTimeMillis(), m32);
            LogoBridge logoBridge = c11037wI1.c;
            N.MzrOFrdr(logoBridge.a, logoBridge, c10694vI1);
        }
    }

    public final void l(boolean z, boolean z2) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        if (z == this.x && z2 == this.y && this.A) {
            return;
        }
        this.x = z;
        this.y = z2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        boolean f = f();
        int i = R.dimen.0_resource_name_obfuscated_res_0x7f0807dc;
        if (f) {
            setClipToPadding(false);
            int i2 = -this.r.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080612);
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i2;
            Resources resources = getResources();
            if (!this.x) {
                i = R.dimen.0_resource_name_obfuscated_res_0x7f0807db;
            }
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(i);
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807d2);
        } else {
            this.m.getLayoutParams().width = -2;
            if (this.x) {
                if (MJ0.c()) {
                    i = R.dimen.0_resource_name_obfuscated_res_0x7f0807de;
                } else if (MJ0.d()) {
                    i = R.dimen.0_resource_name_obfuscated_res_0x7f0807df;
                } else if (MJ0.b()) {
                    i = R.dimen.0_resource_name_obfuscated_res_0x7f0807dd;
                }
                dimensionPixelOffset = getResources().getDimensionPixelOffset(i);
            } else {
                dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807db);
            }
            marginLayoutParams.topMargin = dimensionPixelOffset;
            boolean z3 = this.x;
            int i3 = R.dimen.0_resource_name_obfuscated_res_0x7f0807d5;
            if (z3) {
                if (MJ0.c()) {
                    i3 = R.dimen.0_resource_name_obfuscated_res_0x7f0807d7;
                } else if (MJ0.d()) {
                    i3 = R.dimen.0_resource_name_obfuscated_res_0x7f0807d8;
                } else if (MJ0.b()) {
                    i3 = R.dimen.0_resource_name_obfuscated_res_0x7f0807d6;
                }
                dimensionPixelOffset2 = getResources().getDimensionPixelOffset(i3);
            } else {
                dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807d5);
            }
            marginLayoutParams.bottomMargin = dimensionPixelOffset2;
        }
        this.i.setVisibility(this.x ? 0 : 8);
        this.j.a.k(BZ2.c, this.x);
        k();
        this.E = true;
    }

    public final void k() {
        if (this.C) {
            return;
        }
        float f = this.x ? this.B : 0.0f;
        int paddingTop = getPaddingTop() + ((SK0) this.I).i();
        setTranslationY((paddingTop - Math.max(paddingTop, (this.j.b.getBottom() - this.j.b.getPaddingBottom()) - this.H)) * f);
        C9656sG2 c9656sG2 = this.k;
        if (c9656sG2 == null || c9656sG2.h == f) {
            return;
        }
        c9656sG2.h = f;
        if (f == 0.0f) {
            c9656sG2.b();
        }
    }

    public final boolean g() {
        return !((SK0) this.I).j(0) || ((SK0) this.I).i() > this.j.b.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.w) {
            return;
        }
        this.w = true;
        j();
        R32 r32 = this.f11525J;
        if (((Long) r32.b.get()).longValue() == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - C1761No1.k((Intent) r32.d.get());
            if (r32.c) {
                EI2.k(elapsedRealtime, "NewTabPage.SearchAvailableLoadTime2.WarmStart");
            } else {
                EI2.k(elapsedRealtime, "NewTabPage.SearchAvailableLoadTime2.ColdStart");
            }
        }
        TraceEvent.f("NewTabPageSearchAvailable)");
    }

    public final void m() {
        C10780vZ2 c10780vZ2 = this.j;
        Vf4 vf4 = ((C9927t32) this.q).f.A;
        c10780vZ2.a.k(BZ2.d, vf4 != null && vf4.b());
        C10780vZ2 c10780vZ22 = this.j;
        boolean z = c10780vZ22.d;
        boolean b = DeviceFormFactor.b(c10780vZ22.e);
        c10780vZ22.c.getClass();
        C0257Bz1 c0257Bz1 = C0257Bz1.b;
        Uri uri = Uri.EMPTY;
        C2336Rz1 c2336Rz1 = new C2336Rz1();
        c2336Rz1.h = 4;
        c2336Rz1.a = uri;
        c2336Rz1.b = null;
        c2336Rz1.c = null;
        c2336Rz1.d = null;
        c2336Rz1.e = null;
        c2336Rz1.f = null;
        c2336Rz1.g = z;
        c2336Rz1.i = b;
        boolean a = c0257Bz1.a(c2336Rz1);
        AbstractC1427Kz1.c(4, a);
        this.j.a.k(BZ2.h, a);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.t.c();
        if (i == 0) {
            m();
            if (e() > 0.0f) {
                return;
            }
            C11119wY3 c11119wY3 = AbstractC10107tb4.a;
            Q44 q44 = new Q44(this.r, new Handler());
            if (c11119wY3.a == 4) {
                q44.a(d(this.r.getResources(), R.string.0_resource_name_obfuscated_res_0x7f140ba2, R.string.0_resource_name_obfuscated_res_0x7f140ba2, this.j.b, false).a());
                c11119wY3.a = 0;
            }
            if (c11119wY3.a == 5) {
                q44.a(d(this.r.getResources(), R.string.0_resource_name_obfuscated_res_0x7f140ba3, R.string.0_resource_name_obfuscated_res_0x7f140ba3, this.j.b.findViewById(R.id.voice_search_button), true).a());
                c11119wY3.a = 0;
            }
        }
    }

    public final void j() {
        if (this.w && this.v) {
            C10613v32 c10613v32 = ((C9927t32) this.q).f;
            if (!c10613v32.E) {
                EI2.n((System.nanoTime() - c10613v32.B) / 1000000, "Tab.NewTabOnload");
                c10613v32.D = true;
                EI2.h(0, 2, "Android.NTP.Impression");
                if (!c10613v32.a.isHidden()) {
                    C10613v32.i(c10613v32);
                }
            }
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:            if ((r1.i() || J.N.MmSLoR8I(r1)) != false) goto L256;     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(org.chromium.chrome.browser.ntp.NewTabPageLayout r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.ntp.NewTabPageLayout.c(org.chromium.chrome.browser.ntp.NewTabPageLayout):void");
    }

    @Override // defpackage.Li4
    public final void b() {
        this.j.a.k(BZ2.c, false);
    }

    @Override // defpackage.Li4
    public final void a() {
        this.j.a.k(BZ2.c, true);
    }

    public static C12180ze1 d(Resources resources, int i, int i2, final View view, boolean z) {
        C12180ze1 c12180ze1 = new C12180ze1(resources, "IPH_FeatureNotificationGuideVoiceSearchHelpBubble", i, i2);
        c12180ze1.h = view;
        c12180ze1.l = new Rect(0, 0, 0, -resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f08082c));
        if (z) {
            c12180ze1.i = new Runnable() { // from class: y32
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = NewTabPageLayout.K;
                    AbstractC3593ad4.b(view, new Yc4(1));
                }
            };
            c12180ze1.k = new Runnable() { // from class: C32
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = NewTabPageLayout.K;
                    Handler handler = new Handler();
                    final View view2 = view;
                    handler.postDelayed(new Runnable() { // from class: K32
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = NewTabPageLayout.K;
                            AbstractC3593ad4.a(view2);
                        }
                    }, 200L);
                }
            };
        }
        return c12180ze1;
    }

    public final boolean f() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("ShowScrollableMVTOnNTPAndroid") && !DeviceFormFactor.a(this.g);
    }

    public static void i(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }
}
