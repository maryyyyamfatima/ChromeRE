package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import androidx.fragment.app.k;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eT0 */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C4910eT0 implements LayoutInflater.Factory2 {
    public final h a;

    public LayoutInflaterFactory2C4910eT0(h hVar) {
        this.a = hVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        k e;
        boolean equals = C3536aT0.class.getName().equals(str);
        h hVar = this.a;
        if (equals) {
            return new C3536aT0(context, attributeSet, hVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.T);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z = c.class.isAssignableFrom(C8348oT0.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                c A = resourceId != -1 ? hVar.A(resourceId) : null;
                if (A == null && string != null) {
                    A = hVar.B(string);
                }
                if (A == null && id != -1) {
                    A = hVar.A(id);
                }
                if (A == null) {
                    C8348oT0 E = hVar.E();
                    context.getClassLoader();
                    A = E.a(attributeValue);
                    A.s = true;
                    A.B = resourceId != 0 ? resourceId : id;
                    A.C = id;
                    A.D = string;
                    A.t = true;
                    A.x = hVar;
                    US0 us0 = hVar.u;
                    A.y = us0;
                    A.n0(us0.g, attributeSet, A.g);
                    e = hVar.a(A);
                } else {
                    if (A.t) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A.t = true;
                    A.x = hVar;
                    US0 us02 = hVar.u;
                    A.y = us02;
                    A.n0(us02.g, attributeSet, A.g);
                    e = hVar.e(A);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                QT0 qt0 = RT0.a;
                ST0 st0 = new ST0(A, viewGroup);
                QT0 a = RT0.a(A);
                if (a.a.contains(PT0.DETECT_FRAGMENT_TAG_USAGE) && RT0.d(a, A.getClass(), ST0.class)) {
                    RT0.b(a, st0);
                }
                A.K = viewGroup;
                e.k();
                e.j();
                View view2 = A.L;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC4199cO1.a("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A.L.getTag() == null) {
                    A.L.setTag(string);
                }
                A.L.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4567dT0(this, e));
                return A.L;
            }
        }
        return null;
    }
}
