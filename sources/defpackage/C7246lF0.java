package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lF0 */
/* loaded from: classes.dex */
public final class C7246lF0 extends C8541p1 {
    public final /* synthetic */ AbstractC7590mF0 g;

    @Override // defpackage.C8541p1
    public final boolean h(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC7590mF0 abstractC7590mF0 = this.g;
        View view = abstractC7590mF0.i;
        if (i == -1) {
            WeakHashMap weakHashMap = Ec4.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        boolean z = true;
        if (i2 == 1) {
            return abstractC7590mF0.u(i);
        }
        if (i2 == 2) {
            return abstractC7590mF0.j(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = abstractC7590mF0.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = abstractC7590mF0.k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    abstractC7590mF0.k = Integer.MIN_VALUE;
                    abstractC7590mF0.i.invalidate();
                    abstractC7590mF0.v(i3, 65536);
                }
                abstractC7590mF0.k = i;
                view.invalidate();
                abstractC7590mF0.v(i, 32768);
            }
            z = false;
        } else {
            if (i2 != 128) {
                return abstractC7590mF0.r(i, i2);
            }
            if (abstractC7590mF0.k == i) {
                abstractC7590mF0.k = Integer.MIN_VALUE;
                view.invalidate();
                abstractC7590mF0.v(i, 65536);
            }
            z = false;
        }
        return z;
    }

    public C7246lF0(AbstractC7590mF0 abstractC7590mF0) {
        this.g = abstractC7590mF0;
    }

    @Override // defpackage.C8541p1
    public final AccessibilityNodeInfoCompat d(int i) {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.g.q(i).a));
    }

    @Override // defpackage.C8541p1
    public final AccessibilityNodeInfoCompat f(int i) {
        AbstractC7590mF0 abstractC7590mF0 = this.g;
        int i2 = i == 2 ? abstractC7590mF0.k : abstractC7590mF0.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return d(i2);
    }
}
