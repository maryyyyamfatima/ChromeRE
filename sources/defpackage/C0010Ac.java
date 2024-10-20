package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0010Ac extends AbstractC4607db {
    public final /* synthetic */ C0140Bc b;

    @Override // defpackage.AbstractC4607db
    public final void b(Drawable drawable) {
        C0140Bc c0140Bc = this.b;
        Handler handler = c0140Bc.a;
        Animatable animatable = c0140Bc.b;
        Objects.requireNonNull(animatable);
        handler.post(new RunnableC8518ow3(animatable));
    }

    public C0010Ac(C0140Bc c0140Bc) {
        this.b = c0140Bc;
    }
}
