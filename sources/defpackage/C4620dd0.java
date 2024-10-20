package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4620dd0 {
    public Tab b;
    public String d;
    public final C12157za2 a = new C12157za2();
    public int c = 0;

    public final void a(int i, Tab tab) {
        this.b = tab;
        this.c = i;
        if (i != 4) {
            this.d = null;
        }
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC4276cd0) c11814ya2.next()).b(tab);
            }
        }
    }
}
