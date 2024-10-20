package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.PatternSyntaxException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class L72 {
    public static K72 a(String str) {
        Set k;
        K72 k72;
        String[] split;
        if (str == null || (k = O83.a.k("send_tab_to_self.notification.active", null)) == null) {
            return null;
        }
        Iterator it = k.iterator();
        while (it.hasNext()) {
            try {
                split = ((String) it.next()).split("_");
            } catch (NumberFormatException | PatternSyntaxException unused) {
            }
            if (split.length == 3) {
                k72 = new K72(Integer.parseInt(split[0]), Integer.parseInt(split[1]), split[2]);
                if (k72 == null) {
                }
            } else {
                k72 = null;
                if (k72 == null && str.equals(k72.b)) {
                    return k72;
                }
            }
        }
        return null;
    }
}
