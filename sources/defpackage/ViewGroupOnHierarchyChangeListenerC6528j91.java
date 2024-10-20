package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC6528j91 extends FrameLayout implements ViewGroup.OnHierarchyChangeListener {
    public final B12 a;
    public final InterfaceC0079Ap3 g;
    public final Callback h;
    public X93 i;
    public C3119Ya j;
    public RunnableC5842h91 k;
    public RunnableC6186i91 l;

    public ViewGroupOnHierarchyChangeListenerC6528j91(Context context, Z81 z81, C1198Jf2 c1198Jf2, C3436a91 c3436a91) {
        super(context);
        this.g = z81;
        this.a = c1198Jf2;
        this.h = c3436a91;
        setOnHierarchyChangeListener(this);
        setVisibility(4);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (getChildCount() == 0) {
            setVisibility(4);
        }
    }

    public final B12 a() {
        if (((Boolean) this.g.get()).booleanValue()) {
            if (this.j == null) {
                this.j = new C3119Ya(this);
            }
            return this.j;
        }
        return this.a;
    }
}
