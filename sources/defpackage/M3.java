package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M3 implements PB {
    public final View a;
    public final InterfaceC0079Ap3 g;
    public Runnable h;
    public final C8385oa2 i = new C8385oa2();

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final boolean d() {
        return true;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.f67040_resource_name_obfuscated_res_0x7f1401b2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.f67020_resource_name_obfuscated_res_0x7f1401b0;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.f66960_resource_name_obfuscated_res_0x7f1401aa;
    }

    @Override // defpackage.PB
    public final boolean r() {
        return false;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.f67030_resource_name_obfuscated_res_0x7f1401b1;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public M3(LinearLayout linearLayout, O3 o3) {
        this.a = linearLayout;
        this.g = o3;
    }

    @Override // defpackage.PB
    public final View c() {
        return this.a;
    }

    @Override // defpackage.PB
    public final int b() {
        return ((Integer) this.g.get()).intValue();
    }

    @Override // defpackage.PB
    public final boolean h() {
        Runnable runnable = this.h;
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    @Override // defpackage.PB
    public final C8385oa2 o() {
        return this.i;
    }

    @Override // defpackage.PB
    public final void onBackPressed() {
        h();
    }
}
