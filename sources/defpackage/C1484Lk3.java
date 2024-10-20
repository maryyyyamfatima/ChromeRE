package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484Lk3 implements FX2 {
    public final Bitmap a;

    @Override // defpackage.FX2
    public final boolean a() {
        return true;
    }

    public C1484Lk3(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.FX2
    public final void c(Runnable runnable) {
        PostTask.c(AbstractC5103f04.a, runnable);
    }

    @Override // defpackage.FX2
    public final Bitmap b() {
        return this.a;
    }
}
