package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4607db {
    public C4263cb a;

    public abstract void b(Drawable drawable);

    public void c(Drawable drawable) {
    }

    public final Animatable2.AnimationCallback a() {
        if (this.a == null) {
            this.a = new C4263cb(this);
        }
        return this.a;
    }
}
