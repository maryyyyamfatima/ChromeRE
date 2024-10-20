package defpackage;

import android.util.Property;
import org.chromium.components.browser_ui.widget.NumberRollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p82, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8586p82 extends Property {
    public C8586p82() {
        super(Float.class, "");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((NumberRollView) obj).h);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        C8586p82 c8586p82 = NumberRollView.l;
        ((NumberRollView) obj).b(floatValue);
    }
}
