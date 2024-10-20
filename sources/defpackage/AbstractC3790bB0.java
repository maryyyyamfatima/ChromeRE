package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3790bB0 {
    public final TextInputLayout a;
    public final ZA0 b;
    public final Context c;
    public final CheckableImageButton d;

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public C10560uu0 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof C0101Au0;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public void r() {
    }

    public void s() {
    }

    public AbstractC3790bB0(ZA0 za0) {
        this.a = za0.a;
        this.b = za0;
        this.c = za0.getContext();
        this.d = za0.k;
    }

    public final void q() {
        this.b.e(false);
    }
}
