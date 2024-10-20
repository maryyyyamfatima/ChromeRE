package org.chromium.chrome.browser.password_entry_edit;

import android.content.Context;
import defpackage.AbstractC1996Pj1;
import defpackage.AbstractC7013kb0;
import defpackage.C2860Wa0;
import defpackage.C6669jb0;
import defpackage.GD2;
import defpackage.JD2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CredentialEditBridge {
    public static CredentialEditBridge c;
    public long a;
    public C2860Wa0 b;

    public static CredentialEditBridge maybeCreate() {
        if (c != null) {
            return null;
        }
        CredentialEditBridge credentialEditBridge = new CredentialEditBridge();
        c = credentialEditBridge;
        return credentialEditBridge;
    }

    public void initAndLaunchUi(long j, Context context, SettingsLauncher settingsLauncher, boolean z, boolean z2) {
        this.a = j;
        if (z) {
            settingsLauncher.c(context, BlockedCredentialFragmentView.class);
        } else if (z2) {
            settingsLauncher.c(context, FederatedCredentialFragmentView.class);
        } else {
            settingsLauncher.c(context, CredentialEditFragmentView.class);
        }
    }

    public void setCredential(String str, String str2, String str3, String str4, boolean z) {
        C2860Wa0 c2860Wa0 = this.b;
        c2860Wa0.getClass();
        HashMap e = PropertyModel.e(AbstractC7013kb0.j);
        JD2 jd2 = AbstractC7013kb0.b;
        GD2 gd2 = new GD2();
        gd2.a = str;
        e.put(jd2, gd2);
        JD2 jd22 = AbstractC7013kb0.h;
        GD2 gd22 = new GD2();
        gd22.a = str4;
        PropertyModel a = AbstractC1996Pj1.a(e, jd22, gd22, e);
        c2860Wa0.f = a;
        C6669jb0 c6669jb0 = c2860Wa0.c;
        c6669jb0.f = a;
        c6669jb0.g = str2;
        c6669jb0.h = str3;
        c6669jb0.i = z;
        a.o(AbstractC7013kb0.c, str2);
        c6669jb0.f.k(AbstractC7013kb0.e, false);
        c6669jb0.f.o(AbstractC7013kb0.f, str3);
    }

    public void setExistingUsernames(String[] strArr) {
        C6669jb0 c6669jb0 = this.b.c;
        c6669jb0.getClass();
        c6669jb0.j = new HashSet(Arrays.asList(strArr));
    }

    public void destroy() {
        C2860Wa0 c2860Wa0 = this.b;
        if (c2860Wa0 != null) {
            c2860Wa0.c.f.k(AbstractC7013kb0.i, true);
        }
        this.a = 0L;
        c = null;
    }
}
