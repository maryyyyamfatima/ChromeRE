package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ls4 {
    public static Ks4 b(Ss4 ss4, Activity activity, C6673jb4 c6673jb4, boolean z, C3697av0 c3697av0, ViewGroup viewGroup) {
        a(1, ss4);
        a(2, activity);
        a(3, c6673jb4);
        a(6, viewGroup);
        return new Ks4(ss4, activity, c6673jb4, z, c3697av0, viewGroup);
    }

    public static void a(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(AbstractC9076qb1.a("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
        }
    }
}
