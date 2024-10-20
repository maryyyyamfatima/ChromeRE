package defpackage;

import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class UI {
    public static final VI a;

    static {
        if (Build.VERSION.SDK_INT < 26) {
            a = new VI(false, null, null, -1);
        } else {
            a = new VI(true, O83.a, new TI(new C7549m72(V60.a), V60.a.getResources()), 3);
        }
    }
}
