package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NK2 extends O0 {
    public final OK2 d;
    public final WeakHashMap e = new WeakHashMap();

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AbstractC12077zK2 abstractC12077zK2;
        OK2 ok2 = this.d;
        boolean Q = ok2.d.Q();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (!Q && (abstractC12077zK2 = ok2.d.s) != null) {
            abstractC12077zK2.Z(view, accessibilityNodeInfoCompat);
            O0 o0 = (O0) this.e.get(view);
            if (o0 != null) {
                o0.d(view, accessibilityNodeInfoCompat);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        OK2 ok2 = this.d;
        if (!ok2.d.Q()) {
            RecyclerView recyclerView = ok2.d;
            if (recyclerView.s != null) {
                O0 o0 = (O0) this.e.get(view);
                if (o0 != null) {
                    if (o0.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                b bVar = recyclerView.s.b.h;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    public NK2(OK2 ok2) {
        this.d = ok2;
    }

    @Override // defpackage.O0
    public final void h(View view, int i) {
        O0 o0 = (O0) this.e.get(view);
        if (o0 != null) {
            o0.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.O0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        O0 o0 = (O0) this.e.get(view);
        if (o0 != null) {
            o0.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }

    @Override // defpackage.O0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        O0 o0 = (O0) this.e.get(view);
        if (o0 != null) {
            return o0.a(view, accessibilityEvent);
        }
        return super.a(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        O0 o0 = (O0) this.e.get(view);
        if (o0 != null) {
            o0.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        O0 o0 = (O0) this.e.get(view);
        if (o0 != null) {
            o0.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.O0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        O0 o0 = (O0) this.e.get(viewGroup);
        if (o0 != null) {
            return o0.f(viewGroup, view, accessibilityEvent);
        }
        return super.f(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final C8541p1 b(View view) {
        O0 o0 = (O0) this.e.get(view);
        if (o0 != null) {
            return o0.b(view);
        }
        return super.b(view);
    }
}
