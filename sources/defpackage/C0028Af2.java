package defpackage;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Af2 */
/* loaded from: classes.dex */
public final class C0028Af2 extends AbstractC10894vs3 {
    public final /* synthetic */ C0158Bf2 g;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C0158Bf2 c0158Bf2 = this.g;
        c0158Bf2.p.K0(motionEvent.getX() * c0158Bf2.a, motionEvent.getY() * c0158Bf2.a);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028Af2(C0158Bf2 c0158Bf2, Context context) {
        super(context, c0158Bf2.p);
        this.g = c0158Bf2;
    }
}
