package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ce4 extends Property {
    public Ce4() {
        super(Rect.class, "clipBounds");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        WeakHashMap weakHashMap = Ec4.a;
        return ((View) obj).getClipBounds();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        WeakHashMap weakHashMap = Ec4.a;
        ((View) obj).setClipBounds((Rect) obj2);
    }
}
