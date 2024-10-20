package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v30 */
/* loaded from: classes2.dex */
public final class C10611v30 {
    public final C8897q30 a;
    public final PropertyModel b;
    public final ZX1 c;

    public C10611v30(Context context, ZX1 zx1, C8897q30 c8897q30) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e027f, (ViewGroup) null);
        this.a = c8897q30;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd2 = AbstractC4249cY1.n;
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = inflate;
        e.put(pd22, gd22);
        JD2 jd2 = AbstractC4249cY1.a;
        C10268u30 c10268u30 = new C10268u30(this);
        GD2 gd23 = new GD2();
        gd23.a = c10268u30;
        PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd23, e);
        this.b = a;
        this.c = zx1;
        zx1.l(a, 1, false);
    }
}
