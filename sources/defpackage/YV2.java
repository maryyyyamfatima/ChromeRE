package defpackage;

import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import java.util.Iterator;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YV2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float g;
    public final /* synthetic */ ZV2 h;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ZV2 zv2 = this.h;
        zv2.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        float x = zv2.i.getX();
        float width = zv2.i.getWidth();
        float width2 = zv2.b().getWidth();
        float f = ((width - width2) / 2.0f) + x;
        float f2 = width2 / this.a;
        Iterator it = zv2.c.iterator();
        while (it.hasNext()) {
            ReactionLayout reactionLayout = (ReactionLayout) it.next();
            reactionLayout.setX(((reactionLayout.getX() - this.g) * f2) + f);
            reactionLayout.setY(reactionLayout.getY() * f2);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) reactionLayout.getLayoutParams();
            layoutParams.width = (int) (layoutParams.width * f2);
            layoutParams.height = (int) (layoutParams.height * f2);
            reactionLayout.setLayoutParams(layoutParams);
        }
        zv2.h.invalidate();
    }

    public YV2(ZV2 zv2, float f, float f2) {
        this.h = zv2;
        this.a = f;
        this.g = f2;
    }
}
