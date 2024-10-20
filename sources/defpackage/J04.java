package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J04 implements InterfaceC0679Ff3 {
    public final InterfaceC10590uz3 a;
    public final I04 g;
    public final InterfaceC0809Gf3 h;
    public final Context i;
    public C4496dF j;
    public InterfaceC1422Ky1 k;

    public J04(Context context, AbstractC11276wz3 abstractC11276wz3, EQ eq, C0538Ed2 c0538Ed2, CQ cq) {
        C4496dF c4496dF = new C4496dF();
        this.j = c4496dF;
        this.h = eq;
        this.a = abstractC11276wz3;
        this.i = context;
        c0538Ed2.j(c4496dF.b(new Callback() { // from class: H04
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                J04.this.k = (InterfaceC1422Ky1) obj;
            }
        }));
        this.g = new I04(this, cq, context);
    }

    public final String c(String str, boolean z) {
        Context context = this.i;
        if (z) {
            return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140199, str);
        }
        return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140198, str);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        boolean z = obj instanceof Integer;
        InterfaceC10590uz3 interfaceC10590uz3 = this.a;
        if (z) {
            int intValue = ((Integer) obj).intValue();
            TabModel k = ((AbstractC11276wz3) interfaceC10590uz3).k(intValue);
            if (k != null) {
                k.m(intValue);
                return;
            }
            return;
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            int id = ((Tab) it.next()).getId();
            TabModel k2 = ((AbstractC11276wz3) interfaceC10590uz3).k(id);
            if (k2 != null) {
                k2.m(id);
            }
        }
        TabModel g = ((AbstractC11276wz3) interfaceC10590uz3).g();
        if (g != null) {
            g.x();
        }
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        boolean z = obj instanceof Integer;
        InterfaceC10590uz3 interfaceC10590uz3 = this.a;
        if (z) {
            int intValue = ((Integer) obj).intValue();
            TabModel k = ((AbstractC11276wz3) interfaceC10590uz3).k(intValue);
            if (k != null) {
                k.C(intValue);
                return;
            }
            return;
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            int id = ((Tab) it.next()).getId();
            TabModel k2 = ((AbstractC11276wz3) interfaceC10590uz3).k(id);
            if (k2 != null) {
                k2.C(id);
            }
        }
    }
}
