package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rd4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewGroupOnHierarchyChangeListenerC9433rd4 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ ViewLookupCachingFrameLayout a;

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.a.g.remove(view2.getId());
        ViewLookupCachingFrameLayout.e(view2, this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.a.g.remove(view2.getId());
        ViewLookupCachingFrameLayout.e(view2, null);
    }

    public ViewGroupOnHierarchyChangeListenerC9433rd4(ViewLookupCachingFrameLayout viewLookupCachingFrameLayout) {
        this.a = viewLookupCachingFrameLayout;
    }
}
