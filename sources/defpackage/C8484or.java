package defpackage;

import J.N;
import androidx.preference.Preference;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: or */
/* loaded from: classes.dex */
public final class C8484or implements InterfaceC4184cL1 {
    @Override // defpackage.InterfaceC4184cL1
    public final /* synthetic */ boolean a(Preference preference) {
        return false;
    }

    @Override // defpackage.InterfaceC4184cL1
    public final /* synthetic */ boolean c() {
        return AbstractC9008qO.a();
    }

    @Override // defpackage.InterfaceC4184cL1
    public final boolean b(Preference preference) {
        return N.MCL0OG9d() && !PersonalDataManager.h();
    }

    @Override // defpackage.InterfaceC4184cL1
    public final boolean d(Preference preference) {
        return N.MCL0OG9d();
    }
}
