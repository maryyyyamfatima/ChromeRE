package org.chromium.chrome.browser.history;

import J.N;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.P81;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryDeletionBridge {
    public static HistoryDeletionBridge b;
    public final C12157za2 a = new C12157za2();

    public HistoryDeletionBridge() {
        N.M41yd4uo(this);
    }

    public void onURLsDeleted(HistoryDeletionInfo historyDeletionInfo) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((P81) c11814ya2.next()).a(historyDeletionInfo);
            }
        }
    }
}
