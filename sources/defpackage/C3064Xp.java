package defpackage;

import J.N;
import android.content.SharedPreferences;
import org.chromium.chrome.browser.history.HistoryDeletionInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3064Xp implements P81 {
    @Override // defpackage.P81
    public final void a(HistoryDeletionInfo historyDeletionInfo) {
        if (N.MDNd$JT3(historyDeletionInfo.a)) {
            SharedPreferences.Editor edit = T60.a.edit();
            edit.remove("Chrome.AutofillAssistant.LiteScriptFirstTimeUser");
            edit.apply();
        }
    }
}
