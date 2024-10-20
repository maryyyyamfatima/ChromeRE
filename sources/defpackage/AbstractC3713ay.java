package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ay */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3713ay {
    public static /* bridge */ /* synthetic */ void a(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, ExecutorC4400cy executorC4400cy, C5087ey c5087ey) {
        biometricPrompt.authenticate(cancellationSignal, executorC4400cy, c5087ey);
    }
}
