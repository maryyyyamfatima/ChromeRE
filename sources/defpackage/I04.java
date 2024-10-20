package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.List;
import java.util.Locale;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class I04 implements InterfaceC8876pz3 {
    public final /* synthetic */ InterfaceC0079Ap3 a;
    public final /* synthetic */ Context g;
    public final /* synthetic */ J04 h;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void D(Tab tab, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void R(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void X(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void a0(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    public I04(J04 j04, CQ cq, Context context) {
        this.h = j04;
        this.a = cq;
        this.g = context;
    }

    public final boolean a(boolean z) {
        InterfaceC0079Ap3 interfaceC0079Ap3;
        InterfaceC1422Ky1 interfaceC1422Ky1;
        boolean a = AbstractC5177fD3.a();
        J04 j04 = this.h;
        if (a && R20.a() == 1 && (interfaceC1422Ky1 = j04.k) != null && !((C9897sy1) interfaceC1422Ky1).G(2)) {
            return false;
        }
        if (z && (interfaceC0079Ap3 = this.a) != null && ((Boolean) interfaceC0079Ap3.get()).booleanValue()) {
            return true;
        }
        if (AbstractC5177fD3.d(this.g)) {
            return false;
        }
        return C10021tL.f().c() || C1096Il0.a(j04.i);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        if (a(true)) {
            return;
        }
        int id = tab.getId();
        String title = tab.getTitle();
        J04 j04 = this.h;
        ViewOnClickListenerC1069If3 z = j04.h.z();
        C12188zf3 a = C12188zf3.a(title, j04, 0, 11);
        Context context = j04.i;
        a.c = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b70);
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
        Integer valueOf = Integer.valueOf(id);
        a.d = string;
        a.e = valueOf;
        a.f = j04.c(title, false);
        z.c(a);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        if (a(false)) {
            return;
        }
        J04 j04 = this.h;
        j04.h.z().b(j04, Integer.valueOf(tab.getId()));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        if (a(false)) {
            return;
        }
        J04 j04 = this.h;
        j04.h.z().b(j04, Integer.valueOf(tab.getId()));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void A(List list) {
        if (a(false)) {
            return;
        }
        J04 j04 = this.h;
        j04.h.z().b(j04, list);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void O(List list, boolean z) {
        if (a(true)) {
            return;
        }
        if (list.size() != 1) {
            J04 j04 = this.h;
            j04.getClass();
            String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(list.size()));
            ViewOnClickListenerC1069If3 z2 = j04.h.z();
            C12188zf3 a = C12188zf3.a(format, j04, 0, z ? 12 : 30);
            a.j = z ? 8000 : 3000;
            Context context = j04.i;
            a.c = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6f);
            a.d = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
            a.e = list;
            a.f = j04.c(format, true);
            z2.c(a);
            return;
        }
        I((Tab) list.get(0));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void u(boolean z) {
        if (a(false)) {
            return;
        }
        J04 j04 = this.h;
        j04.h.z().a(j04);
    }
}
