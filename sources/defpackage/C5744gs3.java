package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gs3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5744gs3 extends BA0 implements J44, InterfaceC9985tD3 {
    public final Tab a;
    public final InterfaceC0079Ap3 g;
    public View h;
    public String i;

    @Override // defpackage.InterfaceC9985tD3
    public final int N() {
        return 0;
    }

    @Override // defpackage.InterfaceC9985tD3
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC9985tD3
    public final /* synthetic */ void v() {
    }

    public static C5744gs3 W0(Tab tab, InterfaceC0079Ap3 interfaceC0079Ap3) {
        C5744gs3 c5744gs3 = (C5744gs3) tab.F().b(C5744gs3.class);
        return c5744gs3 == null ? (C5744gs3) tab.F().d(C5744gs3.class, new C5744gs3(tab, interfaceC0079Ap3)) : c5744gs3;
    }

    public C5744gs3(Tab tab, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = tab;
        this.g = interfaceC0079Ap3;
    }

    public final void V0() {
        Tab tab = this.a;
        View inflate = LayoutInflater.from(tab.getContext()).inflate(R.layout.f61270_resource_name_obfuscated_res_0x7f0e02a3, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.h = inflate;
        tab.q().a(this);
        X0();
    }

    public final void X0() {
        Tab tab = this.a;
        ((TextView) this.h.findViewById(R.id.suspended_tab_explanation)).setText(tab.getContext().getString(R.string.f89890_resource_name_obfuscated_res_0x7f140b85, this.i));
        this.h.findViewById(R.id.suspended_tab_settings_button).setOnClickListener(new ViewOnClickListenerC5400fs3(this, tab.getContext()));
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            this.a.q().c(this);
            this.h = null;
        } else {
            V0();
        }
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this);
    }

    @Override // defpackage.InterfaceC9985tD3
    public final View a() {
        return this.h;
    }
}
