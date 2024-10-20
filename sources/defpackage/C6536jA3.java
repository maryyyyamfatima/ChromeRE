package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jA3 */
/* loaded from: classes.dex */
public final class C6536jA3 extends AbstractC0185Bl {
    public final C8942qA3 h;
    public IA3 i;
    public final long j;
    public final /* synthetic */ C9284rA3 k;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C9284rA3 c9284rA3 = this.k;
        if (!c9284rA3.m && !h()) {
            try {
                return QA3.d(c9284rA3.g(), this.h.a);
            } catch (Exception e) {
                AbstractC4851eH1.f("tabmodel", "Unable to read state: " + e, new Object[0]);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        IA3 ia3 = (IA3) obj;
        C8942qA3 c8942qA3 = this.h;
        TraceEvent.e(c8942qA3.a, "LoadTabState");
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        objArr[0] = ia3 == null ? "Null" : "Exists";
        EI2.n(SystemClock.elapsedRealtime() - this.j, String.format(locale, "Tabs.SavedTabLoadTime.TabState.%s", objArr));
        this.i = ia3;
        TraceEvent.e(c8942qA3.a, "LoadTabTask");
        C9284rA3 c9284rA3 = this.k;
        if (c9284rA3.m || h()) {
            return;
        }
        C9284rA3.a(c9284rA3, c8942qA3, this.i, null);
    }

    public C6536jA3(C9284rA3 c9284rA3, C8942qA3 c8942qA3) {
        this.k = c9284rA3;
        this.h = c8942qA3;
        TraceEvent.j(c8942qA3.a, "LoadTabTask");
        TraceEvent.j(c8942qA3.a, "LoadTabState");
        this.j = SystemClock.elapsedRealtime();
    }
}
