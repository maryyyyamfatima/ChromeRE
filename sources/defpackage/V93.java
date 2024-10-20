package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import org.chromium.chrome.browser.gesturenav.NavigationBubble;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V93 extends Animation {
    public final /* synthetic */ X93 a;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        X93 x93 = this.a;
        int i = x93.r + ((int) ((x93.s - r0) * f));
        NavigationBubble navigationBubble = x93.p;
        int left = i - navigationBubble.getLeft();
        x93.n += left;
        Math.min(1.0f, x93.a() / x93.g);
        navigationBubble.offsetLeftAndRight(left);
        x93.m = navigationBubble.getLeft();
    }

    public V93(X93 x93) {
        this.a = x93;
    }
}
