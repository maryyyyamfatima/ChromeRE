package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o30 */
/* loaded from: classes2.dex */
public final class C8211o30 {
    public final InterfaceC7867n30 a;
    public final PropertyModel b;
    public final ZX1 c;

    public C8211o30(Context context, ZX1 zx1, InterfaceC7867n30 interfaceC7867n30, String str) {
        this.a = interfaceC7867n30;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        PD2 pd2 = AbstractC4249cY1.c;
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140a46);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC4249cY1.f;
        String string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140a47, str);
        GD2 gd22 = new GD2();
        gd22.a = string2;
        e.put(pd22, gd22);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd23 = AbstractC4249cY1.j;
        String string3 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14083f);
        GD2 gd23 = new GD2();
        gd23.a = string3;
        e.put(pd23, gd23);
        PD2 pd24 = AbstractC4249cY1.n;
        String string4 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        GD2 gd24 = new GD2();
        gd24.a = string4;
        e.put(pd24, gd24);
        JD2 jd2 = AbstractC4249cY1.a;
        C7523m30 c7523m30 = new C7523m30(this);
        GD2 gd25 = new GD2();
        gd25.a = c7523m30;
        e.put(jd2, gd25);
        PropertyModel propertyModel = new PropertyModel(e);
        this.b = propertyModel;
        this.c = zx1;
        zx1.l(propertyModel, 1, false);
    }
}
