package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.Callback;
import org.chromium.components.content_creation.reactions.ReactionMetadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9661sH2 extends RunnableC4383cv {
    public final ReactionMetadata f0;
    public boolean g0;
    public Callback h0;
    public boolean i0;
    public boolean j0;

    public C9661sH2(ReactionMetadata reactionMetadata, C5070ev c5070ev, Bitmap.Config config) {
        super(c5070ev, config);
        this.f0 = reactionMetadata;
        this.j0 = false;
        this.i0 = true;
    }

    @Override // defpackage.RunnableC4383cv
    public final void c() {
        Callback callback;
        this.i0 = false;
        if (this.j0) {
            this.j0 = false;
            run();
        } else {
            if (!this.g0 || (callback = this.h0) == null) {
                return;
            }
            this.h0 = null;
            callback.onResult(null);
        }
    }

    @Override // defpackage.RunnableC4383cv, android.graphics.drawable.Animatable
    public final void start() {
        if (this.g0) {
            return;
        }
        super.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.g0) {
            return;
        }
        super.invalidateSelf();
    }

    @Override // defpackage.RunnableC4383cv, java.lang.Runnable
    public final void run() {
        this.i0 = true;
        super.run();
    }
}
