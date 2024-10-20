package org.chromium.chrome.browser.password_manager.settings;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import defpackage.C10748vT0;
import defpackage.EI2;
import defpackage.YH2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordReauthenticationFragment extends c {
    public h b0;

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        if (i == 2) {
            if (i2 == -1) {
                EI2.h(0, 3, "PasswordManager.ReauthToAccessPasswordInSettings");
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = this.l.getInt("scope");
                YH2.a = Long.valueOf(currentTimeMillis);
                YH2.b = i3;
            } else {
                EI2.h(1, 3, "PasswordManager.ReauthToAccessPasswordInSettings");
                YH2.a = null;
                YH2.b = 0;
            }
            h hVar = this.b0;
            hVar.getClass();
            hVar.u(new C10748vT0(hVar, -1, 0), false);
        }
    }

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        this.b0 = this.x;
        if (bundle == null) {
            Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) getActivity().getSystemService("keyguard")).createConfirmDeviceCredentialIntent(null, O(this.l.getInt("description", 0)));
            if (createConfirmDeviceCredentialIntent != null) {
                startActivityForResult(createConfirmDeviceCredentialIntent, 2);
            } else {
                this.b0.O();
            }
        }
    }

    @Override // androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        bundle.putBoolean("has_been_suspended", true);
    }
}
