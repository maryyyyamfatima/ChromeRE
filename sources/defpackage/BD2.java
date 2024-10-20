package defpackage;

import android.content.res.Resources;
import java.util.Map;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BD2 {
    public final Map a;

    public BD2(FD2... fd2Arr) {
        this.a = PropertyModel.e(fd2Arr);
    }

    public final void f(MD2 md2, float f) {
        CD2 cd2 = new CD2();
        cd2.a = f;
        this.a.put(md2, cd2);
    }

    public final void c(ID2 id2, int i) {
        DD2 dd2 = new DD2();
        dd2.a = i;
        this.a.put(id2, dd2);
    }

    public final void b(HD2 hd2, boolean z) {
        AD2 ad2 = new AD2();
        ad2.a = z;
        this.a.put(hd2, ad2);
    }

    public final void e(JD2 jd2, Object obj) {
        GD2 gd2 = new GD2();
        gd2.a = obj;
        this.a.put(jd2, gd2);
    }

    public final void d(JD2 jd2, Resources resources, int i) {
        if (i != 0) {
            e(jd2, resources.getString(i));
        }
    }

    public final PropertyModel a() {
        return new PropertyModel(this.a);
    }
}
