package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B82 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public final void a(String str, String str2) {
        if (str.equals("type")) {
            this.b.add(str2);
        } else {
            this.a.put(str, str2);
        }
    }

    public final String b(String str) {
        return (String) this.a.get(str);
    }
}
