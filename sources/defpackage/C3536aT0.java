package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import androidx.fragment.app.k;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aT0 */
/* loaded from: classes.dex */
public final class C3536aT0 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0087Ar1.e(windowInsets, "insets");
        return windowInsets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3536aT0(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        View view;
        AbstractC0087Ar1.e(context, "context");
        AbstractC0087Ar1.e(attributeSet, "attrs");
        AbstractC0087Ar1.e(hVar, "fm");
        this.a = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.U, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        c A = hVar.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC4199cO1.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C8348oT0 E = hVar.E();
            context.getClassLoader();
            c a = E.a(classAttribute);
            AbstractC0087Ar1.d(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.n0(context, attributeSet, null);
            C10547us c10547us = new C10547us(hVar);
            c10547us.p = true;
            a.K = this;
            c10547us.g(getId(), a, string, 1);
            if (c10547us.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c10547us.h = false;
            c10547us.q.x(c10547us, true);
        }
        Iterator it = hVar.c.d().iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            c cVar = kVar.c;
            if (cVar.C == getId() && (view = cVar.L) != null && view.getParent() == null) {
                cVar.K = this;
                kVar.b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C5389fq4 h;
        AbstractC0087Ar1.e(windowInsets, "insets");
        C5389fq4 g = C5389fq4.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener == null) {
            h = Ec4.h(this, g);
        } else {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0087Ar1.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            h = C5389fq4.g(null, onApplyWindowInsets);
        }
        AbstractC0087Ar1.d(h, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!h.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                Ec4.b(getChildAt(i), h);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0087Ar1.e(onApplyWindowInsetsListener, "listener");
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0087Ar1.e(canvas, "canvas");
        if (this.i) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0087Ar1.e(canvas, "canvas");
        AbstractC0087Ar1.e(view, "child");
        if (this.i) {
            ArrayList arrayList = this.a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0087Ar1.e(view, "view");
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0087Ar1.e(view, "view");
        this.g.remove(view);
        if (this.a.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC0087Ar1.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0087Ar1.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0087Ar1.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0087Ar1.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0087Ar1.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                AbstractC0087Ar1.d(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void a(View view) {
        if (this.g.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC0087Ar1.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof c ? (c) tag : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
        }
        super.addView(view, i, layoutParams);
    }
}
