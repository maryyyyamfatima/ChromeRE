package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnDragListenerC9257r60 implements View.OnDragListener {
    public final /* synthetic */ DialogC9943t60 a;

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        DialogC9943t60 dialogC9943t60 = this.a;
        View view2 = dialogC9943t60.v;
        if (view2 == null || !view2.isAttachedToWindow()) {
            return false;
        }
        return dialogC9943t60.v.dispatchDragEvent(dragEvent);
    }

    public ViewOnDragListenerC9257r60(DialogC9943t60 dialogC9943t60) {
        this.a = dialogC9943t60;
    }
}
