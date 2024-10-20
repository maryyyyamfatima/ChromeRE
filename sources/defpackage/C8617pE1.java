package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pE1 */
/* loaded from: classes.dex */
public final class C8617pE1 extends RecyclerView implements InterfaceC5136f61 {
    public C5894hJ2 P0;

    public C8617pE1(Context context) {
        super(context, null, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C5894hJ2 c5894hJ2 = this.P0;
        if (c5894hJ2 != null) {
            c5894hJ2.a.Z();
        }
    }
}
