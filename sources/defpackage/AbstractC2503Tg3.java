package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2503Tg3 {
    public static /* synthetic */ String d(int i) {
        return i == 1 ? "REMOVED" : i == 2 ? "VISIBLE" : i == 3 ? "GONE" : i == 4 ? "INVISIBLE" : "null";
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown visibility ", i));
    }

    public static final void a(int i, View view) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i2 == 1) {
            view.setVisibility(0);
        } else if (i2 == 2) {
            view.setVisibility(8);
        } else {
            if (i2 != 3) {
                return;
            }
            view.setVisibility(4);
        }
    }
}
