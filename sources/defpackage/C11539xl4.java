package defpackage;

import android.app.Activity;
import android.os.Bundle;
import org.chromium.chrome.browser.night_mode.settings.ThemeSettingsFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xl4 */
/* loaded from: classes.dex */
public final class C11539xl4 implements InterfaceC3906bY1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C12008z71 g;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ Profile i;
    public final /* synthetic */ String j;
    public final /* synthetic */ SettingsLauncher k;
    public final /* synthetic */ ZX1 l;
    public final /* synthetic */ KU3 m;

    public C11539xl4(boolean z, C12008z71 c12008z71, Activity activity, Profile profile, String str, I53 i53, ZX1 zx1, KU3 ku3) {
        this.a = z;
        this.g = c12008z71;
        this.h = activity;
        this.i = profile;
        this.j = str;
        this.k = i53;
        this.l = zx1;
        this.m = ku3;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 2) {
            return;
        }
        if (i == 0) {
            boolean z = this.a;
            Activity activity = this.h;
            if (z) {
                this.g.f(activity, this.i, this.j, null);
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("theme_settings_entry", 2);
                this.k.b(activity, ThemeSettingsFragment.class, bundle);
            }
        }
        this.l.c(i == 0 ? 1 : 2, propertyModel);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.m.dismissed("IPH_AutoDarkOptOut");
    }
}
