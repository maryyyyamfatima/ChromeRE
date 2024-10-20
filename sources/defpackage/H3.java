package defpackage;

import com.google.android.gms.auth.AccountChangeEvent;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class H3 {
    public static String a(String str) {
        try {
            for (AccountChangeEvent accountChangeEvent : AbstractC7174l21.m(V60.a, str)) {
                if (accountChangeEvent.i == 4) {
                    return accountChangeEvent.k;
                }
            }
            return null;
        } catch (C6486j21 | IOException e) {
            AbstractC4851eH1.f("AccountRenameChecker", "Failed to get change events", e);
            return null;
        }
    }
}
