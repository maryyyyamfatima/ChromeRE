package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10690vH2 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ReactionLayout a;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ReactionLayout reactionLayout = this.a;
        ((ZV2) reactionLayout.m).c(reactionLayout, !reactionLayout.n);
        return true;
    }

    public C10690vH2(ReactionLayout reactionLayout) {
        this.a = reactionLayout;
    }
}
