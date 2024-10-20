package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11192wl0 implements InterfaceC1283Jw2 {
    public Tab a;
    public YD3 b;
    public final C10849vl0 c;

    @Override // defpackage.InterfaceC1283Jw2
    public final void b() {
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void d() {
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void g() {
    }

    public C11192wl0(Tab tab) {
        this.a = tab;
        this.b = YD3.b(tab);
        C10849vl0 c10849vl0 = new C10849vl0(this);
        this.c = c10849vl0;
        this.a.v(c10849vl0);
    }

    public final void i() {
        if (this.a == null) {
            return;
        }
        this.b.e(false);
        this.a.w(this.c);
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void e(int i) {
        ZN3.b(R.string.f79940_resource_name_obfuscated_res_0x7f140784, 1, this.a.getContext()).d();
        i();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void h() {
        ZN3.b(R.string.f79950_resource_name_obfuscated_res_0x7f140785, 1, this.a.getContext()).d();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void c() {
        i();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void f(GURL gurl) {
        if (this.a == null || !gurl.b || gurl.k()) {
            return;
        }
        this.a.d(new LoadUrlParams(gurl.i(), 0));
        i();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final boolean isAccessibilityEnabled() {
        return C10021tL.f().c();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void a() {
        if (isAccessibilityEnabled()) {
            ZN3.b(R.string.f79930_resource_name_obfuscated_res_0x7f140783, 1, this.a.getContext()).d();
        }
    }
}
