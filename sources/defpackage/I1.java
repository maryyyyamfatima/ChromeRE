package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I1 extends O0 {
    public final /* synthetic */ EditText d;
    public final /* synthetic */ TextView e;

    public I1(EditText editText, TextView textView) {
        this.d = editText;
        this.e = textView;
    }

    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        EditText editText = this.d;
        String obj = editText.getText() != null ? editText.getText().toString() : "";
        String charSequence = editText.getHint() != null ? editText.getHint().toString() : "";
        TextView textView = this.e;
        CharSequence a = AbstractC8192o0.a(charSequence, " ", textView.getText() != null ? textView.getText().toString() : "");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            accessibilityNodeInfoCompat.p(a);
            boolean isEmpty = obj.isEmpty();
            if (i >= 26) {
                accessibilityNodeInfoCompat.a.setShowingHintText(isEmpty);
            } else {
                accessibilityNodeInfoCompat.k(4, isEmpty);
            }
        }
        if (obj.isEmpty()) {
            accessibilityNodeInfoCompat.r(a);
        } else {
            accessibilityNodeInfoCompat.r(obj);
        }
    }
}
