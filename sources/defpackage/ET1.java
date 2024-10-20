package defpackage;

import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ET1 implements PB {
    public final View a;
    public final View g;
    public final InterfaceC0079Ap3 h;
    public final Runnable i;
    public final C8385oa2 j;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f140656;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f140653;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final float p() {
        return 0.6f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f140654;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f140655;
    }

    @Override // defpackage.PB
    public final float t() {
        return 0.9f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public ET1(View view, C6930kK3 c6930kK3, FT1 ft1, GT1 gt1) {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.j = c8385oa2;
        this.a = view;
        this.g = c6930kK3;
        this.h = ft1;
        this.i = gt1;
        c8385oa2.p(Boolean.TRUE);
    }

    @Override // defpackage.PB
    public final View c() {
        return this.g;
    }

    @Override // defpackage.PB
    public final View e() {
        return this.a;
    }

    @Override // defpackage.PB
    public final int b() {
        return ((Integer) this.h.get()).intValue();
    }

    @Override // defpackage.PB
    public final boolean h() {
        this.i.run();
        return true;
    }

    @Override // defpackage.PB
    public final C8385oa2 o() {
        return this.j;
    }

    @Override // defpackage.PB
    public final void onBackPressed() {
        this.i.run();
    }
}
