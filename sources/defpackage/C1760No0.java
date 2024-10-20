package defpackage;

import android.content.res.Resources;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: No0 */
/* loaded from: classes.dex */
public class C1760No0 implements VD2, InterfaceC6377ij3 {
    public final Resources a;
    public final InterfaceC3241Yy1 g;
    public final C6314iY3 h;
    public final C1630Mo0 i = new C1630Mo0(this);

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
    }

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        FD2 fd2 = (FD2) obj;
        ND2 nd2 = C6314iY3.c;
        if (fd2 != nd2) {
            return;
        }
        int h = this.h.h(nd2);
        if (h == 0) {
            ((ViewOnClickListenerC1069If3) this.g.get()).a(this.i);
        } else {
            if (h != 1) {
                return;
            }
            b();
        }
    }

    public C1760No0(Resources resources, InterfaceC3241Yy1 interfaceC3241Yy1, C6314iY3 c6314iY3, I5 i5) {
        this.a = resources;
        this.g = interfaceC3241Yy1;
        this.h = c6314iY3;
        c6314iY3.a(this);
        i5.b(this);
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        b();
    }

    public C12188zf3 a(C1630Mo0 c1630Mo0) {
        Resources resources = this.a;
        String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6b);
        String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140717);
        C12188zf3 a = C12188zf3.a(string, this.i, 2, 28);
        a.d = string2;
        a.e = null;
        a.i = false;
        return a;
    }

    public final void b() {
        C12188zf3 a;
        ND2 nd2 = C6314iY3.c;
        C6314iY3 c6314iY3 = this.h;
        if (c6314iY3.h(nd2) == 1 && (a = a(this.i)) != null) {
            ((ViewOnClickListenerC1069If3) this.g.get()).c(a);
            ((AbstractC1501Lo0) c6314iY3.i(C6314iY3.f)).d();
        }
    }
}
