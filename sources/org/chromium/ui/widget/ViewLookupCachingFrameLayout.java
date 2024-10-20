package org.chromium.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ViewGroupOnHierarchyChangeListenerC9433rd4;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ViewLookupCachingFrameLayout extends OptimizedFrameLayout {
    public final SparseArray g;

    public ViewLookupCachingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new SparseArray();
        setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC9433rd4(this));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        super.setOnHierarchyChangeListener(onHierarchyChangeListener);
    }

    public static void e(View view, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setOnHierarchyChangeListener(onHierarchyChangeListener);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), onHierarchyChangeListener);
            }
        }
    }

    public final View c(int i) {
        SparseArray sparseArray = this.g;
        WeakReference weakReference = (WeakReference) sparseArray.get(i);
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            view = findViewById(i);
        }
        if (view != null) {
            sparseArray.put(i, new WeakReference(view));
        }
        return view;
    }
}
