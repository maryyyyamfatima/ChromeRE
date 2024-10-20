package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3085Xt0 {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Insets opticalInsets;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        boolean z = drawable instanceof Qq4;
        Object obj = drawable;
        if (z) {
            ((Rq4) ((Qq4) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z2 = AbstractC2695Ut0.a;
        } else if (AbstractC2695Ut0.a) {
            try {
                Object invoke = AbstractC2695Ut0.b.invoke(obj, new Object[0]);
                if (invoke != null) {
                    return new Rect(AbstractC2695Ut0.c.getInt(invoke), AbstractC2695Ut0.d.getInt(invoke), AbstractC2695Ut0.e.getInt(invoke), AbstractC2695Ut0.f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return c;
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
