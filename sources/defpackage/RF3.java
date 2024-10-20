package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RF3 {
    public static void a(Status status, Object obj, C6905kF3 c6905kF3) {
        if (status.r1()) {
            c6905kF3.b(obj);
        } else {
            c6905kF3.a(AbstractC10800vd.a(status));
        }
    }

    public static boolean b(Status status, Object obj, C6905kF3 c6905kF3) {
        if (status.r1()) {
            return c6905kF3.d(obj);
        }
        return c6905kF3.c(AbstractC10800vd.a(status));
    }
}
