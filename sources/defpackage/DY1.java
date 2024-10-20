package defpackage;

import android.content.Context;
import com.android.chrome.R;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DY1 {
    public final BY1 a;
    public final int b;
    public final CY1 c;
    public ZN3 d;

    public DY1(BY1 by1, int i, CY1 cy1) {
        this.a = by1;
        this.b = i;
        this.c = cy1;
    }

    public final void b() {
        Context context = this.a.getContext();
        if (context == null) {
            return;
        }
        ZN3 c = ZN3.c(context, context.getString(R.string.f77720_resource_name_obfuscated_res_0x7f140666, context.getString(this.b)), 0);
        this.d = c;
        c.d();
    }

    public final void c() {
        ZN3 zn3 = this.d;
        if (zn3 != null) {
            zn3.a();
            this.d = null;
        }
        Context context = this.a.getContext();
        if (context == null) {
            return;
        }
        ZN3.b(R.string.f77730_resource_name_obfuscated_res_0x7f140667, 0, context).d();
    }

    public final void a() {
        ZN3 zn3 = this.d;
        if (zn3 != null) {
            zn3.a();
            this.d = null;
        }
        BY1 by1 = this.a;
        Context context = by1.getContext();
        WindowAndroid m = by1.m();
        if (context == null || m == null) {
            CY1 cy1 = this.c;
            if (cy1 != null) {
                cy1.a(false);
                return;
            }
            return;
        }
        C12188zf3 a = C12188zf3.a(String.format(context.getString(R.string.f77710_resource_name_obfuscated_res_0x7f140665), context.getResources().getString(this.b)), new AY1(this), 0, 46);
        a.d = context.getString(R.string.f89530_resource_name_obfuscated_res_0x7f140b5f);
        a.e = null;
        a.i = false;
        a.j = 8000;
        AbstractC1329Kf3.a(m).c(a);
    }
}
