package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import org.chromium.chrome.browser.omnibox.status.StatusView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2918Wl3 extends TransitionDrawable {
    public final /* synthetic */ StatusView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2918Wl3(StatusView statusView, Drawable[] drawableArr) {
        super(drawableArr);
        this.a = statusView;
    }

    @Override // android.graphics.drawable.TransitionDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int i = StatusView.B;
        StatusView statusView = this.a;
        statusView.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!statusView.p || uptimeMillis - statusView.y < statusView.x) {
            return;
        }
        statusView.y = 0L;
        statusView.x = 0;
        statusView.p = false;
        statusView.a();
    }
}
