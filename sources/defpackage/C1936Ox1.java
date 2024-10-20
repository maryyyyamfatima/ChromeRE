package defpackage;

import android.app.Activity;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ox1 */
/* loaded from: classes2.dex */
public final class C1936Ox1 extends AbstractC5426fx {
    public C1676Mx1 l;
    public final String m;

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "apps";
    }

    public C1936Ox1(Activity activity, C7857n12 c7857n12, C7169l12 c7169l12, I53 i53, ArrayList arrayList) {
        super(c7857n12);
        this.m = c7857n12.a().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405ae);
        C1676Mx1 c1676Mx1 = new C1676Mx1(activity, c7169l12, i53, arrayList, false);
        this.l = c1676Mx1;
        d(c1676Mx1.b);
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.m;
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void destroy() {
        this.l.a();
        this.l = null;
        super.destroy();
    }
}
