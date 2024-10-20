package defpackage;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7190l5 extends Property {
    public C7190l5() {
        super(Integer.class, "controlTopMargin");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((ViewGroup.MarginLayoutParams) ((C11840ye4) obj).b.getLayoutParams()).topMargin);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        View view = ((C11840ye4) obj).b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = intValue;
        view.setLayoutParams(marginLayoutParams);
    }
}
