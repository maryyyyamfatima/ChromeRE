package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9685sM1 {
    public static int d(View view, int i) {
        Context context = view.getContext();
        TypedValue b = AbstractC6594jM1.b(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = b.resourceId;
        if (i2 != 0) {
            Object obj = Y50.a;
            return context.getColor(i2);
        }
        return b.data;
    }

    public static int c(int i, Context context, String str) {
        TypedValue b = AbstractC6594jM1.b(i, context, str);
        int i2 = b.resourceId;
        if (i2 != 0) {
            Object obj = Y50.a;
            return context.getColor(i2);
        }
        return b.data;
    }

    public static int b(int i, int i2, Context context) {
        TypedValue a = AbstractC6594jM1.a(context, i);
        if (a == null) {
            return i2;
        }
        int i3 = a.resourceId;
        if (i3 != 0) {
            Object obj = Y50.a;
            return context.getColor(i3);
        }
        return a.data;
    }

    public static int e(float f, int i, int i2) {
        return AbstractC4242cX.f(AbstractC4242cX.g(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int a(int i, int i2) {
        return AbstractC4242cX.g(i, (Color.alpha(i) * i2) / 255);
    }
}
