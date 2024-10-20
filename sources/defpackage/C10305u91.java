package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u91 */
/* loaded from: classes2.dex */
public final class C10305u91 {
    public final Context a;
    public final View b;
    public final InterfaceC7913nB c;
    public final Q44 d;
    public final InterfaceC7913nB e;
    public final C10452uc0 f;
    public final InterfaceC0408Dd2 g;
    public final InterfaceC0408Dd2 h;
    public final InterfaceC0079Ap3 i;

    public C10305u91(a aVar, View view, Q44 q44, C11417xP3 c11417xP3, InterfaceC0408Dd2 interfaceC0408Dd2, InterfaceC0408Dd2 interfaceC0408Dd22, IP3 ip3, QP3 qp3, C6166i6 c6166i6) {
        this.a = aVar;
        this.b = view;
        this.d = q44;
        this.e = c11417xP3;
        this.g = interfaceC0408Dd2;
        this.h = interfaceC0408Dd22;
        this.i = ip3;
        this.c = qp3;
        this.f = new C10452uc0(c6166i6, new C9962t91(this), null);
    }

    public final void a(GURL gurl) {
        C6269iP3 c6269iP3;
        View view = this.b;
        if (view == null || !view.isShown() || this.e.a() || T34.k(gurl) || ((Boolean) this.i.get()).booleanValue()) {
            return;
        }
        InterfaceC0408Dd2 interfaceC0408Dd2 = this.h;
        if (interfaceC0408Dd2.get() == null || ((Boolean) interfaceC0408Dd2.get()).booleanValue() || (c6269iP3 = (C6269iP3) this.g.get()) == null || AbstractC10007tI0.a("IPH_NewTabPageHomeButton", "isMainIntentFromLauncher", c6269iP3.a) || AbstractC10007tI0.a("IPH_NewTabPageHomeButton", "intentWithEffect", c6269iP3.b)) {
            return;
        }
        boolean a = this.c.a();
        C12180ze1 c12180ze1 = new C12180ze1(this.a.getResources(), "IPH_NewTabPageHomeButton", a ? R.string.0_resource_name_obfuscated_res_0x7f14055f : R.string.0_resource_name_obfuscated_res_0x7f140561, a ? R.string.0_resource_name_obfuscated_res_0x7f14055e : R.string.0_resource_name_obfuscated_res_0x7f140560);
        c12180ze1.h = view;
        c12180ze1.o = new Yc4(1);
        this.d.a(c12180ze1.a());
    }
}
