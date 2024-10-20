package defpackage;

import J.N;
import android.view.View;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zB3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C12033zB3 {
    public View a;

    public static C7272lK1 a(int i) {
        if (i == 1) {
            return C4738dx.d(R.string.f70750_resource_name_obfuscated_res_0x7f140369, R.id.close_tab, R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5);
        }
        if (i == 2) {
            return C4738dx.d(R.string.f77230_resource_name_obfuscated_res_0x7f140633, R.id.new_tab_menu_id, R.drawable.f51760_resource_name_obfuscated_res_0x7f0903de);
        }
        if (i != 3) {
            return new C7272lK1(0, new PropertyModel(new FD2[0]));
        }
        return C4738dx.e(R.string.f77220_resource_name_obfuscated_res_0x7f140632, R.id.new_incognito_tab_menu_id, R.drawable.f50780_resource_name_obfuscated_res_0x7f090352, N.M$3vpOHw());
    }

    public C7616mK1 b() {
        C7616mK1 c7616mK1 = new C7616mK1();
        c7616mK1.s(a(1));
        c7616mK1.s(a(0));
        c7616mK1.s(a(2));
        c7616mK1.s(a(3));
        return c7616mK1;
    }
}
