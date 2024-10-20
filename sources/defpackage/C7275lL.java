package defpackage;

import java.util.Locale;
import org.chromium.components.browser_ui.site_settings.ChosenObjectSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7275lL implements S03 {
    public final /* synthetic */ ChosenObjectSettings a;

    @Override // defpackage.S03
    public final void a() {
    }

    public C7275lL(ChosenObjectSettings chosenObjectSettings) {
        this.a = chosenObjectSettings;
    }

    @Override // defpackage.S03
    public final void onQueryTextChange(String str) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ChosenObjectSettings chosenObjectSettings = this.a;
        if (lowerCase.equals(chosenObjectSettings.o0)) {
            return;
        }
        chosenObjectSettings.o0 = lowerCase;
        chosenObjectSettings.R0();
    }
}
