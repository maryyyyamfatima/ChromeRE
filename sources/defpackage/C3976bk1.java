package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bk1 */
/* loaded from: classes.dex */
public final class C3976bk1 implements SC1 {
    public final Context a;
    public final Runnable g;
    public final SettingsLauncher h;
    public final C4738dx i;

    public C3976bk1(Context context, RunnableC12210zj1 runnableC12210zj1, SettingsLauncher settingsLauncher) {
        this.a = context;
        this.g = runnableC12210zj1;
        this.h = settingsLauncher;
        C7616mK1 c7616mK1 = new C7616mK1();
        c7616mK1.s(a(1));
        c7616mK1.s(a(2));
        C4738dx c4738dx = new C4738dx(context, c7616mK1, this);
        Object obj = Y50.a;
        ColorStateList valueOf = ColorStateList.valueOf(context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070794));
        WeakHashMap weakHashMap = Ec4.a;
        c4738dx.h.setBackgroundTintList(valueOf);
        this.i = c4738dx;
    }

    @Override // defpackage.SC1
    public final void b(PropertyModel propertyModel) {
        int h = propertyModel.h(AbstractC4144cD1.a);
        if (h == R.string.0_resource_name_obfuscated_res_0x7f14061d) {
            this.g.run();
        } else if (h == R.string.0_resource_name_obfuscated_res_0x7f140642) {
            this.h.d(this.a);
        }
    }

    public static C7272lK1 a(int i) {
        if (i == 1) {
            return c(R.string.0_resource_name_obfuscated_res_0x7f14061d, R.drawable.0_resource_name_obfuscated_res_0x7f0900c5);
        }
        if (i != 2) {
            return null;
        }
        return c(R.string.0_resource_name_obfuscated_res_0x7f140642, R.drawable.0_resource_name_obfuscated_res_0x7f090487);
    }

    public static C7272lK1 c(int i, int i2) {
        BD2 bd2 = new BD2(AbstractC4144cD1.j);
        bd2.c(AbstractC4144cD1.a, i);
        bd2.c(AbstractC4144cD1.e, 0);
        bd2.c(AbstractC4144cD1.c, i2);
        bd2.b(AbstractC4144cD1.f, true);
        bd2.c(AbstractC4144cD1.g, R.color.0_resource_name_obfuscated_res_0x7f070129);
        bd2.c(AbstractC4144cD1.h, R.style.f102610_resource_name_obfuscated_res_0x7f150442);
        bd2.b(AbstractC4144cD1.i, true);
        return new C7272lK1(1, bd2.a());
    }
}
