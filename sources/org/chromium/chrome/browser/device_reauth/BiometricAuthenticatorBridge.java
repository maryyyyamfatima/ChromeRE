package org.chromium.chrome.browser.device_reauth;

import J.N;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$Builder;
import android.os.Build;
import android.os.CancellationSignal;
import com.android.chrome.R;
import defpackage.AbstractC3713ay;
import defpackage.C5087ey;
import defpackage.V60;
import java.util.concurrent.Executor;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BiometricAuthenticatorBridge {
    public CancellationSignal a;
    public final Context b;
    public long c;
    public final BiometricPrompt d;

    public BiometricAuthenticatorBridge(long j) {
        Context context = V60.a;
        this.b = context;
        this.c = j;
        if (Build.VERSION.SDK_INT >= 29) {
            BiometricPrompt$Builder title = new BiometricPrompt$Builder(context).setTitle(context.getResources().getString(R.string.f80580_resource_name_obfuscated_res_0x7f1407c5));
            title.setDeviceCredentialAllowed(true);
            title.setConfirmationRequired(false);
            this.d = title.build();
        }
    }

    public static BiometricAuthenticatorBridge create(long j) {
        return new BiometricAuthenticatorBridge(j);
    }

    public int canAuthenticateWithBiometric() {
        int canAuthenticate;
        if (Build.VERSION.SDK_INT < 29) {
            return 7;
        }
        Context context = this.b;
        canAuthenticate = ((BiometricManager) context.getSystemService(BiometricManager.class)).canAuthenticate();
        if (canAuthenticate == 0) {
            return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure() ? 1 : 2;
        }
        if (canAuthenticate == 1) {
            return 4;
        }
        if (canAuthenticate == 11) {
            return 5;
        }
        if (canAuthenticate != 12) {
            return canAuthenticate != 15 ? 0 : 6;
        }
        return 3;
    }

    public boolean canAuthenticateWithBiometricOrScreenLock() {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return canAuthenticateWithBiometric() == 1 || ((KeyguardManager) this.b.getSystemService("keyguard")).isKeyguardSecure();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cy] */
    public void authenticate() {
        BiometricPrompt biometricPrompt = this.d;
        if (biometricPrompt == null) {
            return;
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        this.a = cancellationSignal;
        AbstractC3713ay.a(biometricPrompt, cancellationSignal, new Executor() { // from class: cy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                PostTask.c(AbstractC5103f04.a, runnable);
            }
        }, new C5087ey(this));
    }

    public final void a(int i) {
        this.a = null;
        long j = this.c;
        if (j != 0) {
            N.Mod9aj8k(j, i);
        }
    }

    public void destroy() {
        this.c = 0L;
        cancel();
    }

    public void cancel() {
        CancellationSignal cancellationSignal = this.a;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
    }
}
