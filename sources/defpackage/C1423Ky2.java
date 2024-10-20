package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.preference.e;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ky2 */
/* loaded from: classes.dex */
public final class C1423Ky2 extends O0 {
    public final /* synthetic */ C1552Ly2 d;

    public C1423Ky2(C1552Ly2 c1552Ly2) {
        this.d = c1552Ly2;
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C1552Ly2 c1552Ly2 = this.d;
        c1552Ly2.g.d(view, accessibilityNodeInfoCompat);
        RecyclerView recyclerView = c1552Ly2.f;
        recyclerView.getClass();
        int J2 = RecyclerView.J(view);
        AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
        if (abstractC8305oK2 instanceof e) {
            ((e) abstractC8305oK2).O(J2);
        }
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        return this.d.g.g(view, i, bundle);
    }
}
