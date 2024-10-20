package defpackage;

import J.N;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RH2 {
    public static final int a = (int) TimeUnit.HOURS.toSeconds(1);

    public static boolean a() {
        if (!AbstractC8293oI0.a()) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("ReadLater") && N.M37SqSAy("ReadLater", "read_later_min_version", 0) <= 0;
    }

    public static boolean c() {
        if (a()) {
            C7928nE c7928nE = UN.a;
            if (N.M6bsIDpc("ReadLater", "use_root_bookmark_as_default", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        if (!a()) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        return N.M6bsIDpc("ReadLater", "allow_bookmark_type_swapping", false);
    }
}
