package defpackage;

import android.util.Property;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QD2 extends Property {
    public final MD2 a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((PropertyModel) obj).g(this.a));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((PropertyModel) obj).l(this.a, ((Float) obj2).floatValue());
    }

    public QD2(MD2 md2) {
        super(Float.class, md2.toString());
        this.a = md2;
    }
}
