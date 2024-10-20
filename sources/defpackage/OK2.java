package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OK2 extends O0 {
    public final RecyclerView d;
    public final NK2 e;

    public OK2(RecyclerView recyclerView) {
        this.d = recyclerView;
        O0 j = j();
        if (j != null && (j instanceof NK2)) {
            this.e = (NK2) j;
        } else {
            this.e = new NK2(this);
        }
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        AbstractC12077zK2 abstractC12077zK2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.Q() || (abstractC12077zK2 = recyclerView.s) == null) {
            return false;
        }
        RecyclerView recyclerView2 = abstractC12077zK2.b;
        return abstractC12077zK2.l0(recyclerView2.h, recyclerView2.n0, i, bundle);
    }

    @Override // defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        AbstractC12077zK2 abstractC12077zK2;
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.Q() || (abstractC12077zK2 = ((RecyclerView) view).s) == null) {
            return;
        }
        abstractC12077zK2.X(accessibilityEvent);
    }

    public O0 j() {
        return this.e;
    }

    @Override // defpackage.O0
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AbstractC12077zK2 abstractC12077zK2;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Q() || (abstractC12077zK2 = recyclerView.s) == null) {
            return;
        }
        RecyclerView recyclerView2 = abstractC12077zK2.b;
        abstractC12077zK2.Y(recyclerView2.h, recyclerView2.n0, accessibilityNodeInfoCompat);
    }
}
