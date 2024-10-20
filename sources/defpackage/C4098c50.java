package defpackage;

import J.N;
import org.chromium.chrome.browser.history.HistoryDeletionInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4098c50 implements P81 {
    public final InterfaceC0079Ap3 a;

    public C4098c50(C9974tB2 c9974tB2) {
        this.a = c9974tB2;
    }

    @Override // defpackage.P81
    public final void a(HistoryDeletionInfo historyDeletionInfo) {
        C7823mv2 c7823mv2 = (C7823mv2) this.a.get();
        if (c7823mv2 == null) {
            return;
        }
        if (!N.MDNd$JT3(historyDeletionInfo.a)) {
            long j = historyDeletionInfo.a;
            if (!N.MBUJ8Aeh(j)) {
                String[] MLyEE9$M = N.MLyEE9$M(j);
                if (MLyEE9$M.length > 0) {
                    try {
                        c7823mv2.b(MLyEE9$M);
                        return;
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Deleted URLs length: " + MLyEE9$M.length, e);
                    }
                }
                return;
            }
        }
        c7823mv2.a();
    }
}
