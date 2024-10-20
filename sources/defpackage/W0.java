package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C10560uu0 a;

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0101Au0 c0101Au0 = this.a.a;
        AutoCompleteTextView autoCompleteTextView = c0101Au0.e;
        if (autoCompleteTextView != null) {
            if (autoCompleteTextView.getInputType() != 0) {
                return;
            }
            int i = z ? 2 : 1;
            WeakHashMap weakHashMap = Ec4.a;
            c0101Au0.d.setImportantForAccessibility(i);
        }
    }

    public W0(C10560uu0 c10560uu0) {
        this.a = c10560uu0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W0) {
            return this.a.equals(((W0) obj).a);
        }
        return false;
    }
}
