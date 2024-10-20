package defpackage;

import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10297u8 {
    public static final JD2 a;
    public static final JD2 b;
    public static final HD2 c;
    public static final FD2[] d;

    static {
        JD2 jd2 = new JD2("credential");
        a = jd2;
        JD2 jd22 = new JD2("on_click_listener");
        b = jd22;
        HD2 hd2 = new HD2("is_password_field");
        c = hd2;
        d = new FD2[]{jd2, jd22, hd2};
    }

    public static PropertyModel a(C2210Ra0 c2210Ra0, Callback callback, boolean z) {
        HashMap e = PropertyModel.e(d);
        JD2 jd2 = a;
        GD2 gd2 = new GD2();
        gd2.a = c2210Ra0;
        e.put(jd2, gd2);
        JD2 jd22 = b;
        GD2 gd22 = new GD2();
        gd22.a = callback;
        e.put(jd22, gd22);
        HD2 hd2 = c;
        AD2 ad2 = new AD2();
        ad2.a = z;
        e.put(hd2, ad2);
        return new PropertyModel(e);
    }
}
