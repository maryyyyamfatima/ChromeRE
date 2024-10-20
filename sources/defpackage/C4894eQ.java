package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.infobar.SurveyInfoBarDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eQ */
/* loaded from: classes.dex */
public final class C4894eQ implements SurveyInfoBarDelegate {
    public final /* synthetic */ C5582gQ a;

    @Override // org.chromium.chrome.browser.infobar.SurveyInfoBarDelegate
    public final void a() {
        C5582gQ c5582gQ = this.a;
        c5582gQ.g.removeCallbacksAndMessages(null);
        c5582gQ.h = null;
    }

    @Override // org.chromium.chrome.browser.infobar.SurveyInfoBarDelegate
    public final void b(boolean z) {
        C5582gQ c5582gQ = this.a;
        if (c5582gQ.h == null) {
            return;
        }
        if (!z) {
            c5582gQ.g.removeCallbacksAndMessages(null);
        } else {
            c5582gQ.g.postDelayed(new Runnable() { // from class: dQ
                @Override // java.lang.Runnable
                public final void run() {
                    C4894eQ.this.a.f();
                }
            }, 5000L);
        }
    }

    @Override // org.chromium.chrome.browser.infobar.SurveyInfoBarDelegate
    public final void e() {
        C5582gQ c5582gQ = this.a;
        c5582gQ.g(1);
        C12260zr3.b().d(c5582gQ.n, c5582gQ.j, c5582gQ.m);
    }

    @Override // org.chromium.chrome.browser.infobar.SurveyInfoBarDelegate
    public final String c() {
        return V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140339);
    }

    public C4894eQ(C5582gQ c5582gQ) {
        this.a = c5582gQ;
    }

    @Override // org.chromium.chrome.browser.infobar.SurveyInfoBarDelegate
    public final void d(boolean z, boolean z2) {
        C5582gQ c5582gQ = this.a;
        if (z) {
            c5582gQ.getClass();
            C5582gQ.d(1);
            c5582gQ.f();
        } else if (z2) {
            c5582gQ.getClass();
            C5582gQ.d(2);
        } else {
            c5582gQ.getClass();
            C5582gQ.d(3);
        }
    }
}
