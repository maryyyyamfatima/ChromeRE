package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pa3 */
/* loaded from: classes2.dex */
public final class C8729pa3 {
    public final CheckBox a;
    public final int b;
    public final InterfaceC8386oa3 c;
    public final PropertyModel d;
    public final ZX1 e;

    public static void a(Context context, ZX1 zx1, InterfaceC8386oa3 interfaceC8386oa3, int i, int i2) {
        new C8729pa3(context, zx1, interfaceC8386oa3, i, i2);
    }

    public C8729pa3(Context context, ZX1 zx1, InterfaceC8386oa3 interfaceC8386oa3, int i, int i2) {
        int i3;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        String h = C1202Jg1.c(d).h();
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0281, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(android.R.id.title);
        if (!US.a(C1202Jg1.a(), 1)) {
            i3 = R.string.0_resource_name_obfuscated_res_0x7f140a7e;
        } else if (h != null) {
            i3 = R.string.0_resource_name_obfuscated_res_0x7f140a7c;
        } else if (i == 0) {
            i3 = R.string.0_resource_name_obfuscated_res_0x7f140b63;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Unexpected value for actionType: ", i));
            }
            i3 = R.string.0_resource_name_obfuscated_res_0x7f140b62;
        }
        textView.setText(i3);
        ((TextView) inflate.findViewById(android.R.id.message)).setText(!US.a(C1202Jg1.a(), 1) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f140a7d) : h != null ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f140a7b, h) : context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b61));
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.remove_local_data);
        this.a = checkBox;
        checkBox.setVisibility(h == null && AbstractC8650pL.a("history.deleting_enabled") && US.a(C1202Jg1.a(), 1) ? 0 : 8);
        this.b = i2;
        this.c = interfaceC8386oa3;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd2 = AbstractC4249cY1.j;
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1403d2);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC4249cY1.n;
        String string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        GD2 gd22 = new GD2();
        gd22.a = string2;
        e.put(pd22, gd22);
        PD2 pd23 = AbstractC4249cY1.h;
        GD2 gd23 = new GD2();
        gd23.a = inflate;
        e.put(pd23, gd23);
        JD2 jd2 = AbstractC4249cY1.a;
        C8042na3 c8042na3 = new C8042na3(this);
        GD2 gd24 = new GD2();
        gd24.a = c8042na3;
        PropertyModel a2 = AbstractC1996Pj1.a(e, jd2, gd24, e);
        this.d = a2;
        this.e = zx1;
        N.MX17n_KK(5, i2);
        zx1.l(a2, 1, false);
    }
}
