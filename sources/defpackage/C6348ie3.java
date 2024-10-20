package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ie3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6348ie3 {
    public static void a(Profile profile, C6408io4 c6408io4) {
        Iterator it = c6408io4.h.values().iterator();
        while (it.hasNext()) {
            c6408io4.k(profile, ((L50) it.next()).a, 0);
        }
        Iterator it2 = c6408io4.i.values().iterator();
        while (it2.hasNext()) {
            c6408io4.k(profile, ((C1128Ir2) it2.next()).i, 0);
        }
        Iterator it3 = new ArrayList(c6408io4.l).iterator();
        while (it3.hasNext()) {
            ((C5901hL) it3.next()).a(profile);
        }
    }
}
