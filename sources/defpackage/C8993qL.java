package defpackage;

import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8993qL {
    public final boolean a() {
        return AbstractC8650pL.a("dom_distiller.reader_for_accessibility");
    }

    public final void b(boolean z) {
        EI2.b("DomDistiller.ReaderModeAccessibilitySettingSelected", Boolean.valueOf(z).booleanValue());
        R44.a(Profile.d()).e("dom_distiller.reader_for_accessibility", Boolean.valueOf(z).booleanValue());
    }
}
