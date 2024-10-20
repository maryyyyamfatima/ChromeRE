package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c00 */
/* loaded from: classes.dex */
public final class RunnableC4068c00 implements Runnable {
    public final /* synthetic */ AbstractActivityC6817k00 a;

    public RunnableC4068c00(VS0 vs0) {
        this.a = vs0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
