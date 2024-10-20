package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EI3 implements Runnable {
    public final /* synthetic */ TextInputLayout a;

    public EI3(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i.requestLayout();
    }
}
