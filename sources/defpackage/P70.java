package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P70 implements Q70 {
    public final Context a;
    public final WindowAndroid g;
    public final QB h;
    public final InterfaceC0079Ap3 i;
    public final int j;
    public final float k;
    public final R70 l = new R70();
    public final C2021Po1 m;
    public C6179i80 n;
    public FrameLayout o;
    public C6930kK3 p;
    public WebContents q;
    public Q50 r;
    public O70 s;
    public InterfaceC9949t70 t;
    public boolean u;

    @Override // defpackage.Q70
    public final void A() {
    }

    @Override // defpackage.Q70
    public final void B() {
    }

    @Override // defpackage.Q70
    public final void D(String str) {
    }

    @Override // defpackage.Q70
    public final void G(boolean z) {
    }

    @Override // defpackage.Q70
    public final void H(String str) {
    }

    @Override // defpackage.Q70
    public final boolean I() {
        return false;
    }

    @Override // defpackage.Q70
    public final void L() {
    }

    @Override // defpackage.Q70
    public final void N() {
    }

    @Override // defpackage.Q70
    public final void R() {
    }

    @Override // defpackage.Q70
    public final void Y(String str, String str2, String str3, String str4, int i, int i2, ArrayList arrayList, boolean z, int i3, ArrayList arrayList2, boolean z2, int i4) {
    }

    @Override // defpackage.Q70
    public final boolean a0() {
        return true;
    }

    @Override // defpackage.Q70
    public final C5829h70 b0() {
        return null;
    }

    @Override // defpackage.Q70
    public final ViewGroup d() {
        return null;
    }

    @Override // defpackage.Q70
    public final void d0() {
    }

    @Override // defpackage.Q70
    public final void destroy() {
    }

    @Override // defpackage.Q70
    public final void e() {
    }

    @Override // defpackage.Q70
    public final void e0(int i) {
    }

    @Override // defpackage.Q70
    public final void f() {
    }

    @Override // defpackage.Q70
    public final void g(long j, String str) {
    }

    @Override // defpackage.Q70
    public final boolean i() {
        return false;
    }

    @Override // defpackage.Q70
    public final void i0(String str, String str2) {
    }

    @Override // defpackage.Q70
    public final void j0(int i, boolean z) {
    }

    @Override // defpackage.Q70
    public final void k0(float f) {
    }

    @Override // defpackage.Q70
    public final void o0(boolean z) {
    }

    @Override // defpackage.Q70
    public final void q0() {
    }

    @Override // defpackage.Q70
    public final void t0() {
    }

    @Override // defpackage.Q70
    public final int v() {
        return 0;
    }

    @Override // defpackage.Q70
    public final void y(boolean z) {
    }

    public P70(Activity activity, WindowAndroid windowAndroid, m mVar, C10292u70 c10292u70, C2021Po1 c2021Po1) {
        this.a = activity;
        this.g = windowAndroid;
        this.h = mVar;
        this.i = c10292u70;
        Resources resources = activity.getResources();
        this.j = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08072d);
        this.k = GP2.a(R.dimen.0_resource_name_obfuscated_res_0x7f080151, resources);
        this.m = c2021Po1;
    }

    @Override // defpackage.Q70
    public final void r0(ContextualSearchManager contextualSearchManager) {
        this.t = contextualSearchManager;
    }

    @Override // defpackage.Q70
    public final R70 n() {
        return this.l;
    }

    @Override // defpackage.Q70
    public final void U(int i) {
        WebContents webContents = this.q;
        QB qb = this.h;
        if (webContents == null) {
            WebContents a = Al4.a(Profile.d(), false);
            this.q = a;
            Context context = this.a;
            Q50 q50 = new Q50(context, a);
            this.r = q50;
            this.q.I(new ViewAndroidDelegate(q50), this.r, this.g, new C6047hl4());
            N.Mt4iWzCb(this.q, false);
            if (this.r.getParent() != null) {
                ((ViewGroup) this.r.getParent()).removeView(this.r);
            }
            float intValue = ((Integer) this.i.get()).intValue();
            float f = this.k;
            C6930kK3 c6930kK3 = new C6930kK3(context, new C6586jK3(), this.m);
            this.p = c6930kK3;
            int i2 = this.j;
            c6930kK3.setLayoutParams(new FrameLayout.LayoutParams(-1, ((int) (intValue * f)) - i2));
            this.p.a(this.q, this.r, null);
            FrameLayout frameLayout = new FrameLayout(context);
            this.o = frameLayout;
            C6930kK3 c6930kK32 = this.p;
            c6930kK32.getClass();
            frameLayout.addView(c6930kK32);
            this.o.setPadding(0, i2, 0, 0);
            this.n = new C6179i80(this.o, f);
            O70 o70 = new O70(this);
            this.s = o70;
            ((m) qb).a(o70);
        }
        this.u = true;
        ((m) qb).p(this.n, true);
    }

    @Override // defpackage.Q70
    public final void f0(String str) {
        this.q.i().d(new LoadUrlParams(str, 0));
    }

    @Override // defpackage.Q70
    public final boolean c() {
        return this.u;
    }

    @Override // defpackage.Q70
    public final boolean t() {
        return ((m) this.h).i() == 1;
    }

    @Override // defpackage.Q70
    public final WebContents b() {
        return this.q;
    }

    @Override // defpackage.Q70
    public final boolean x() {
        return ((m) this.h).n();
    }

    @Override // defpackage.Q70
    public final boolean a() {
        return ((m) this.h).g() > 0;
    }
}
