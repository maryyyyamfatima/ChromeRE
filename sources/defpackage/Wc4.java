package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Wc4 {
    public static boolean a = true;

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            if (a) {
                try {
                    viewGroup.suppressLayout(z);
                    return;
                } catch (NoSuchMethodError unused) {
                    a = false;
                    return;
                }
            }
            return;
        }
        viewGroup.suppressLayout(z);
    }
}
