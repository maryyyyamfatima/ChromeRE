package defpackage;

import J.N;
import android.os.SystemClock;
import java.util.HashMap;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.feedback.ConnectivityChecker;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7185l40 {
    public final C5123f40 b;
    public final HashMap a = new HashMap();
    public final long c = SystemClock.elapsedRealtime();

    public static String a(int i) {
        if (i == 0) {
            return "HTTP connection check (Chrome network stack)";
        }
        if (i == 1) {
            return "HTTPS connection check (Chrome network stack)";
        }
        if (i == 2) {
            return "HTTP connection check (Android network stack)";
        }
        if (i == 3) {
            return "HTTPS connection check (Android network stack)";
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown connection type: ", i));
    }

    public static String c(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 1) {
            return "CONNECTED";
        }
        if (i == 2) {
            return "NOT_CONNECTED";
        }
        if (i == 3) {
            return "TIMEOUT";
        }
        if (i == 4) {
            return "ERROR";
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown result value: ", i));
    }

    public C7185l40(Profile profile, C5123f40 c5123f40) {
        this.b = c5123f40;
        for (int i = 0; i < 4; i++) {
            C6841k40 c6841k40 = new C6841k40(this, i);
            if (i == 0) {
                Object obj = ThreadUtils.a;
                N.MvuVYy8Q(profile, "http://clients4.google.com/generate_204", 5000, c6841k40);
            } else if (i == 1) {
                Object obj2 = ThreadUtils.a;
                N.MvuVYy8Q(profile, "https://clients4.google.com/generate_204", 5000, c6841k40);
            } else if (i == 2) {
                ConnectivityChecker.a(false, c6841k40);
            } else if (i == 3) {
                ConnectivityChecker.a(true, c6841k40);
            } else {
                AbstractC4851eH1.a("feedback", AbstractC9076qb1.a("Failed to recognize type ", i), new Object[0]);
            }
        }
    }

    public final C6155i40 b() {
        Object obj = ThreadUtils.a;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 4; i++) {
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(Integer.valueOf(i))) {
                hashMap.put(Integer.valueOf(i), (Integer) hashMap2.get(Integer.valueOf(i)));
            } else {
                hashMap.put(Integer.valueOf(i), 0);
            }
        }
        return new C6155i40(hashMap, SystemClock.elapsedRealtime() - this.c, NetworkChangeNotifier.f.getCurrentConnectionType());
    }
}
