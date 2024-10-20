package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U71 {
    public final int a;
    public final String b;
    public final List c;

    public U71(Tab tab) {
        this.a = -1;
        this.b = null;
        this.c = Collections.singletonList(tab);
    }

    public U71(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean a() {
        return this.c.size() == 1 && this.a == -1;
    }
}
