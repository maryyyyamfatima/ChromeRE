package defpackage;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class UE {
    public static final TE a;
    public static Calendar b;

    public static void b() {
    }

    static {
        TE te = new TE();
        te.c(AbstractC0185Bl.e);
        a = te;
    }

    public static Calendar a() {
        if (b == null) {
            try {
                b = (Calendar) a.g(250L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                b = Calendar.getInstance();
            }
        }
        Calendar calendar = (Calendar) b.clone();
        calendar.clear();
        return calendar;
    }
}
