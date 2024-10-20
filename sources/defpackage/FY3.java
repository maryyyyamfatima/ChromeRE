package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FY3 extends AbstractC0185Bl {
    public final /* synthetic */ GY3 h;

    public FY3(GY3 gy3) {
        this.h = gy3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        GY3 gy3 = this.h;
        gy3.b = (List) obj;
        gy3.c = true;
        N.MpJkwIUo(gy3.f);
        BY3 by3 = gy3.e;
        if (by3 != null) {
            by3.a.speak(by3.b, by3.c, by3.d, by3.e, by3.f, by3.g, by3.h);
        }
        TraceEvent.e(gy3.hashCode(), "TtsEngine:initialize_default");
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        TraceEvent i = TraceEvent.i("TtsEngine:initialize_default.async_task", null);
        try {
            Locale[] availableLocales = Locale.getAvailableLocales();
            ArrayList arrayList = new ArrayList();
            for (Locale locale : availableLocales) {
                if (locale.getVariant().isEmpty()) {
                    try {
                        if (this.h.a.isLanguageAvailable(locale) > 0) {
                            String displayLanguage = locale.getDisplayLanguage();
                            if (!locale.getCountry().isEmpty()) {
                                displayLanguage = displayLanguage + " " + locale.getDisplayCountry();
                            }
                            arrayList.add(new HY3(displayLanguage, locale.toString()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (i != null) {
                i.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }
}
