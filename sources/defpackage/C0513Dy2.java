package defpackage;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.d;
import androidx.preference.e;
import org.chromium.chrome.browser.language.settings.LanguageSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dy2 */
/* loaded from: classes.dex */
public final class C0513Dy2 implements InterfaceC9555ry2 {
    public final /* synthetic */ d a;
    public final /* synthetic */ e g;

    public C0513Dy2(e eVar, d dVar) {
        this.g = eVar;
        this.a = dVar;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        d dVar = this.a;
        dVar.d0(Integer.MAX_VALUE);
        e eVar = this.g;
        Handler handler = eVar.m;
        RunnableC0383Cy2 runnableC0383Cy2 = eVar.n;
        handler.removeCallbacks(runnableC0383Cy2);
        handler.post(runnableC0383Cy2);
        if (dVar.a0 == null) {
            return true;
        }
        int i = LanguageSettings.m0;
        C9549rx1.h(4);
        return true;
    }
}
