package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class De4 {
    public static final Re4 a;
    public static final Be4 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Se4();
        } else {
            a = new Re4();
        }
        b = new Be4();
        new Ce4();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }
}
