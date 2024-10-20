package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tasks.tab_management.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mv3 */
/* loaded from: classes.dex */
public final class C1668Mv3 implements InterfaceC8876pz3 {
    public final /* synthetic */ ViewOnClickListenerC1069If3 a;
    public final /* synthetic */ C2318Rv3 g;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
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
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        C2318Rv3 c2318Rv3 = this.g;
        if (c2318Rv3.g.j(AbstractC9204qw3.h)) {
            C12188zf3 a = C12188zf3.a(tab.getTitle(), c2318Rv3, 0, 11);
            Context context = c2318Rv3.a;
            a.c = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b70);
            String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
            Integer valueOf = Integer.valueOf(tab.getId());
            a.d = string;
            a.e = valueOf;
            this.a.c(a);
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        C2318Rv3 c2318Rv3 = this.g;
        if (((AbstractC11276wz3) c2318Rv3.h).i) {
            c2318Rv3.e(false);
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        YC3 yc3;
        C2318Rv3 c2318Rv3 = this.g;
        c2318Rv3.i();
        if (c2318Rv3.g.j(AbstractC9204qw3.h) && (yc3 = c2318Rv3.m) != null) {
            ((n) yc3).u(((AbstractC11276wz3) c2318Rv3.h).c.d(), false, false);
        }
        this.a.b(c2318Rv3, Integer.valueOf(tab.getId()));
    }

    public C1668Mv3(C2318Rv3 c2318Rv3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        this.g = c2318Rv3;
        this.a = viewOnClickListenerC1069If3;
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        if (i == 3) {
            this.g.e(false);
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        YC3 yc3;
        int id = tab.getId();
        C2318Rv3 c2318Rv3 = this.g;
        List c = c2318Rv3.c(id);
        if (c.size() == 0) {
            c2318Rv3.e(false);
            return;
        }
        if (tab.getId() == c2318Rv3.v) {
            c2318Rv3.v = ((Tab) c.get(0)).getId();
        }
        c2318Rv3.i();
        if (!c2318Rv3.g.j(AbstractC9204qw3.h) || (yc3 = c2318Rv3.m) == null) {
            return;
        }
        ((n) yc3).u(((AbstractC11276wz3) c2318Rv3.h).c.d(), false, false);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        this.a.b(this.g, Integer.valueOf(tab.getId()));
    }
}
