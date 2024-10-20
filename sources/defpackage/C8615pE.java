package defpackage;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8615pE {
    public Boolean a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(C8615pE c8615pE, Q74 q74) {
        c8615pE.getClass();
        TraceEvent.b("writeSafeValues", null);
        SharedPreferences.Editor edit = V60.a.getSharedPreferences("org.chromium.chrome.browser.flags.SafeModeValues", 0).edit();
        edit.clear();
        synchronized (q74.a) {
            for (Map.Entry entry : q74.a.entrySet()) {
                edit.putBoolean((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }
        synchronized (q74.c) {
            for (Map.Entry entry2 : q74.c.entrySet()) {
                edit.putInt((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue());
            }
        }
        synchronized (q74.d) {
            for (Map.Entry entry3 : q74.d.entrySet()) {
                edit.putLong((String) entry3.getKey(), Double.doubleToRawLongBits(((Double) entry3.getValue()).doubleValue()));
            }
        }
        synchronized (q74.b) {
            for (Map.Entry entry4 : q74.b.entrySet()) {
                edit.putString((String) entry4.getKey(), (String) entry4.getValue());
            }
        }
        edit.putString("Chrome.Flags.SafeValuesVersion", "105.0.5195.136");
        edit.apply();
        TraceEvent.c("writeSafeValues");
    }

    public static boolean d() {
        Q83 q83 = O83.a;
        int f = q83.f(0, "Chrome.Flags.SafeModeRunsLeft");
        if (f > 0) {
            q83.q(f - 1, "Chrome.Flags.SafeModeRunsLeft");
            AbstractC4851eH1.a("Flags", "Enter Safe Mode for CachedFlags, %d runs left.", Integer.valueOf(f));
            return true;
        }
        int f2 = q83.f(0, "Chrome.Flags.CrashStreakBeforeCache");
        EI2.h(f2, 50, "Variations.SafeModeCachedFlags.Streak.Crashes");
        if (f2 < 2) {
            return false;
        }
        q83.q(1, "Chrome.Flags.SafeModeRunsLeft");
        AbstractC4851eH1.a("Flags", "Enter Safe Mode for CachedFlags, crash streak is %d.", Integer.valueOf(f2));
        return true;
    }

    public final void c() {
        int i;
        synchronized (this.b) {
            if (this.b.get() != 0) {
                return;
            }
            if (d()) {
                String string = V60.a.getSharedPreferences("org.chromium.chrome.browser.flags.SafeModeValues", 0).getString("Chrome.Flags.SafeValuesVersion", "");
                if (string.isEmpty()) {
                    i = 4;
                } else {
                    i = !string.equals("105.0.5195.136") ? 3 : 2;
                }
                this.b.set(i);
                EI2.h(i, 5, "Variations.SafeModeCachedFlags.Engaged");
            } else {
                this.b.set(1);
                EI2.h(1, 5, "Variations.SafeModeCachedFlags.Engaged");
            }
        }
    }

    public final void b() {
        if (this.a == null) {
            this.a = Boolean.valueOf(O83.a.e("Chrome.Flags.SafeModeEnabled", false));
        }
        this.a.booleanValue();
    }
}
