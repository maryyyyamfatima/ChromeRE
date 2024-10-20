package defpackage;

import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I84 implements CK2 {
    public boolean a = false;
    public boolean g = false;

    @Override // defpackage.CK2
    public final /* bridge */ /* synthetic */ void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.CK2
    public final /* bridge */ /* synthetic */ void e(boolean z) {
    }

    @Override // defpackage.CK2
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        AbstractC12077zK2 abstractC12077zK2;
        if (!this.a) {
            this.a = true;
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                }
                if ((parent instanceof RecyclerView) && (abstractC12077zK2 = ((RecyclerView) parent).s) != null && abstractC12077zK2.f()) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            this.g = z;
        }
        if (this.g && motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
