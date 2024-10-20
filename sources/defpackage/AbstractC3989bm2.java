package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bm2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3989bm2 {
    public static int b(Exception exc) {
        if (exc instanceof C3995bn2) {
            return ((C3995bn2) exc).a;
        }
        return exc instanceof C10114td ? 7 : 0;
    }

    public static int a(Exception exc) {
        if (exc instanceof C10114td) {
            return ((C10114td) exc).a.g;
        }
        return 0;
    }

    public static void c(AO2 ao2) {
        if (AbstractC0193Bm2.l()) {
            Status status = ao2.a;
            if (status.g == 11005) {
                return;
            }
            try {
                status.i.send();
            } catch (PendingIntent.CanceledException e) {
                AbstractC4851eH1.a("PwdManagerBackend", "Can not launch error resolution intent", e);
            }
        }
    }
}
