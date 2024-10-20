package defpackage;

import android.widget.CompoundButton;
import org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4516dJ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ChromeBaseCheckBoxPreference a;

    public C4516dJ(ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference) {
        this.a = chromeBaseCheckBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference = this.a;
        if (!chromeBaseCheckBoxPreference.f(valueOf)) {
            compoundButton.setChecked(!z);
        } else {
            chromeBaseCheckBoxPreference.W(z);
        }
    }
}
