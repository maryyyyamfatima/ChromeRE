package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8116nn extends AbstractC4607db {
    public final Handler b = new Handler(Looper.getMainLooper());

    @Override // defpackage.AbstractC4607db
    public final void b(final Drawable drawable) {
        if (drawable instanceof Animatable) {
            this.b.post(new Runnable() { // from class: mn
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Drawable drawable2 = drawable;
                    if (drawable2.isVisible()) {
                        ((Animatable) drawable2).start();
                    }
                }
            });
        }
    }
}
