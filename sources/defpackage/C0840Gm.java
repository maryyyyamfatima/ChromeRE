package defpackage;

import android.content.Intent;
import android.util.Pair;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0840Gm implements InterfaceC4352cp4 {
    public final Callback a;

    public C0840Gm(Callback callback) {
        this.a = callback;
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        this.a.onResult(new Pair(Integer.valueOf(i), intent));
    }
}
