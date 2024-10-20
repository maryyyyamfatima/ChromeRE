package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GI3 extends O0 {
    public final TextInputLayout d;

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C10475ug c10475ug;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.i;
        CharSequence charSequence = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence charSequence2 = textInputLayout.F ? textInputLayout.G : null;
        C5700gl1 c5700gl1 = textInputLayout.o;
        CharSequence charSequence3 = c5700gl1.k ? c5700gl1.j : null;
        CharSequence charSequence4 = textInputLayout.x ? textInputLayout.w : null;
        int i = textInputLayout.q;
        if (textInputLayout.p && textInputLayout.r && (c10475ug = textInputLayout.t) != null) {
            charSequence = c10475ug.getContentDescription();
        }
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        boolean z3 = !TextUtils.isEmpty(charSequence2);
        boolean z4 = !textInputLayout.v0;
        boolean z5 = !TextUtils.isEmpty(charSequence3);
        if (!z5 && TextUtils.isEmpty(charSequence)) {
            z = false;
        }
        String charSequence5 = z3 ? charSequence2.toString() : "";
        C4315cj3 c4315cj3 = textInputLayout.g;
        C10475ug c10475ug2 = c4315cj3.g;
        int visibility = c10475ug2.getVisibility();
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        if (visibility == 0) {
            accessibilityNodeInfo.setLabelFor(c10475ug2);
            accessibilityNodeInfo.setTraversalAfter(c10475ug2);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c4315cj3.i);
        }
        if (z2) {
            accessibilityNodeInfoCompat.r(text);
        } else if (!TextUtils.isEmpty(charSequence5)) {
            accessibilityNodeInfoCompat.r(charSequence5);
            if (z4 && charSequence4 != null) {
                accessibilityNodeInfoCompat.r(charSequence5 + ", " + String.valueOf(charSequence4));
            }
        } else if (charSequence4 != null) {
            accessibilityNodeInfoCompat.r(charSequence4);
        }
        if (!TextUtils.isEmpty(charSequence5)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                accessibilityNodeInfoCompat.p(charSequence5);
            } else {
                if (z2) {
                    charSequence5 = AbstractC8192o0.a(String.valueOf(text), ", ", charSequence5);
                }
                accessibilityNodeInfoCompat.r(charSequence5);
            }
            boolean z6 = !z2;
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(z6);
            } else {
                accessibilityNodeInfoCompat.k(4, z6);
            }
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(i);
        if (z) {
            if (!z5) {
                charSequence3 = charSequence;
            }
            accessibilityNodeInfo.setError(charSequence3);
        }
        C10475ug c10475ug3 = c5700gl1.r;
        if (c10475ug3 != null) {
            accessibilityNodeInfo.setLabelFor(c10475ug3);
        }
        textInputLayout.h.b().n(accessibilityNodeInfoCompat);
    }

    public GI3(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.O0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.h.b().o(accessibilityEvent);
    }
}
