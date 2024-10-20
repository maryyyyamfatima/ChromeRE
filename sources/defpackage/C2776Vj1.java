package defpackage;

import android.view.View;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vj1 */
/* loaded from: classes.dex */
public final class C2776Vj1 {
    public final ZX1 a;
    public final PropertyModel b;

    public C2776Vj1(ZX1 zx1, View view) {
        C2646Uj1 c2646Uj1 = new C2646Uj1();
        this.a = zx1;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = c2646Uj1;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = view;
        e.put(pd2, gd22);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        HD2 hd2 = AbstractC4249cY1.w;
        AD2 ad22 = new AD2();
        ad22.a = true;
        e.put(hd2, ad22);
        LD2 ld22 = AbstractC4249cY1.z;
        AD2 ad23 = new AD2();
        ad23.a = true;
        e.put(ld22, ad23);
        this.b = new PropertyModel(e);
    }
}
