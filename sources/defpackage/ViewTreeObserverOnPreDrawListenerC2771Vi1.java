package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vi1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC2771Vi1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public InterfaceC2641Ui1 g;

    public ViewTreeObserverOnPreDrawListenerC2771Vi1(View view) {
        this.a = view;
    }

    public final void a(C12175zd2 c12175zd2) {
        InterfaceC2641Ui1 interfaceC2641Ui1 = this.g;
        View view = this.a;
        if (interfaceC2641Ui1 != null) {
            view.removeOnAttachStateChangeListener(this);
            WeakHashMap weakHashMap = Ec4.a;
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
            }
        }
        this.g = c12175zd2;
        if (c12175zd2 != null) {
            view.addOnAttachStateChangeListener(this);
            WeakHashMap weakHashMap2 = Ec4.a;
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnPreDrawListener(this);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a;
        ViewParent parent = view.getParent();
        if (parent == null) {
            return true;
        }
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        int height = (view.getHeight() * 2) / 3;
        if (!parent.getChildVisibleRect(view, rect, null) || rect.height() < height) {
            return true;
        }
        this.g.a();
        return true;
    }
}
