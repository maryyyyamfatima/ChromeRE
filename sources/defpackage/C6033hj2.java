package defpackage;

import android.content.Intent;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hj2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6033hj2 implements InterfaceC4352cp4 {
    public final /* synthetic */ Callback a;

    public C6033hj2(Callback callback) {
        this.a = callback;
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        Callback callback = this.a;
        if (i == -1) {
            callback.onResult(Boolean.TRUE);
        } else {
            callback.onResult(Boolean.FALSE);
        }
    }
}
