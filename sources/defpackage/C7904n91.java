package defpackage;

import J.N;
import android.content.SharedPreferences;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.historyreport.HistoryReportJniBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n91 */
/* loaded from: classes.dex */
public final class C7904n91 extends AbstractC0185Bl {
    public final /* synthetic */ InterfaceC5446g03 h;
    public final /* synthetic */ C9106qg1 i;
    public final /* synthetic */ SharedPreferences j;

    public C7904n91(InterfaceC5446g03 interfaceC5446g03, C9106qg1 c9106qg1, SharedPreferences sharedPreferences) {
        this.h = interfaceC5446g03;
        this.i = c9106qg1;
        this.j = sharedPreferences;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Boolean bool = (Boolean) obj;
        synchronized (AbstractC8248o91.b) {
            if (!bool.booleanValue()) {
                AbstractC4851eH1.a("cr.Icing", "Unable to migrate history to icing.", new Object[0]);
            } else {
                this.i.i.set(true);
                this.j.edit().putBoolean("com.google.android.apps.chrome.icing.HistoryUsageMigrator.HISTORY_MIGRATION_REQUESTED", false).apply();
            }
            AbstractC8248o91.a = false;
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean MgsI50d_;
        HistoryReportJniBridge historyReportJniBridge = (HistoryReportJniBridge) this.h;
        historyReportJniBridge.getClass();
        Object obj = ThreadUtils.a;
        if (!historyReportJniBridge.a()) {
            MgsI50d_ = false;
            AbstractC4851eH1.f("historyreport", "addHistoricVisitsToUsageReportsBuffer when JNI bridge not initialized", new Object[0]);
        } else {
            MgsI50d_ = N.MgsI50d_(historyReportJniBridge.a, historyReportJniBridge);
        }
        return Boolean.valueOf(MgsI50d_);
    }
}
