package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pQ2 */
/* loaded from: classes.dex */
public final class C8678pQ2 {
    public final AbstractC9896sy0 a;

    public final void a(C7849n00 c7849n00, MessageLite messageLite, C7782mo3 c7782mo3) {
        C9021qQ2 c9021qQ2 = (C9021qQ2) messageLite;
        Context context = c7849n00.a;
        int i = c9021qQ2.k;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            boolean resolveAttribute = context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true);
            EnumC11438xU enumC11438xU = EnumC11438xU.u;
            AbstractC9896sy0 abstractC9896sy0 = this.a;
            if (!resolveAttribute) {
                abstractC9896sy0.a(enumC11438xU, String.format(Locale.US, "Ripple color (attribute = %s) not defined in the theme", "android.R.attr.colorControlHighlight"));
            } else {
                try {
                    int i2 = typedValue.resourceId;
                    Object obj = Y50.a;
                    i = context.getColor(i2);
                } catch (Resources.NotFoundException e) {
                    abstractC9896sy0.b(enumC11438xU, String.format(Locale.US, "Ripple Color (attribute = %s) is associated with undefined (colorId = %s)", "android.R.attr.colorControlHighlight", Integer.toHexString(typedValue.resourceId)), e);
                }
            }
            i = 0;
        }
        if (i == 0) {
            return;
        }
        boolean z = c9021qQ2.m;
        Drawable drawable = c7782mo3.e;
        DisplayMetrics displayMetrics = c7849n00.f().getDisplayMetrics();
        C1000Hs c1000Hs = null;
        if (z) {
            if (drawable == null) {
                c1000Hs = new C1000Hs();
                c1000Hs.e = -1;
                c1000Hs.f = c7782mo3.a;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), drawable, c1000Hs);
            int i3 = c9021qQ2.l;
            if (i3 != 0) {
                rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, i3, displayMetrics)));
            }
            c7782mo3.e = rippleDrawable;
            return;
        }
        RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(i), null, null);
        int i4 = c9021qQ2.l;
        if (i4 != 0) {
            rippleDrawable2.setRadius(Math.round(TypedValue.applyDimension(1, i4, displayMetrics)));
        }
        if (drawable == null) {
            c7782mo3.e = rippleDrawable2;
        } else {
            c7782mo3.e = new LayerDrawable(new Drawable[]{drawable, rippleDrawable2});
        }
    }

    public C8678pQ2(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
    }
}
