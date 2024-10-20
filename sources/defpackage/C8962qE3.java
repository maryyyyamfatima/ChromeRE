package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qE3 */
/* loaded from: classes.dex */
public final class C8962qE3 implements MX2 {
    public final /* synthetic */ C10333uE3 a;

    @Override // defpackage.MX2
    public final void a(float f) {
        C2913Wk3 c2913Wk3 = this.a.p0;
        c2913Wk3.x = f;
        c2913Wk3.j();
    }

    @Override // defpackage.MX2
    public final void b(float f) {
        int a;
        int f2;
        TD3 td3 = this.a.F0.a;
        if (td3 == null) {
            return;
        }
        td3.v = f;
        boolean z = td3.s;
        Context context = td3.h;
        Window window = td3.a;
        if (!z) {
            a = AbstractC10957w33.a(window.getContext());
        } else {
            a = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f0708ab);
        }
        int i = td3.j;
        window.setNavigationBarColor(AbstractC3899bX.a(a, i & (-16777216), td3.v * ((i >>> 24) / 255.0f), true));
        if (Build.VERSION.SDK_INT >= 28) {
            if (!td3.s) {
                f2 = AbstractC10957w33.f(window.getContext());
            } else {
                f2 = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070084);
            }
            window.setNavigationBarDividerColor(AbstractC3899bX.a(f2, i & (-16777216), td3.v * ((i >>> 24) / 255.0f), true));
        }
        boolean a2 = JM1.a(1.0f, f);
        ViewGroup viewGroup = td3.g;
        if (a2) {
            AbstractC8540p04.j(viewGroup, false);
        } else if (JM1.a(0.0f, f)) {
            AbstractC8540p04.j(viewGroup, true);
        }
    }

    public C8962qE3(C10333uE3 c10333uE3) {
        this.a = c10333uE3;
    }
}
