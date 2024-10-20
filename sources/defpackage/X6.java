package defpackage;

import J.N;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class X6 implements TextWatcher {
    public final /* synthetic */ Button a;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ Z6 h;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public X6(Z6 z6, Button button, EditText editText) {
        this.h = z6;
        this.a = button;
        this.g = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        boolean z = false;
        boolean z2 = trim.length() > 0 && (trim.contains(":") || trim.contains(" ") || trim.startsWith(".") || !N.Mo$6Pn$c(trim));
        Z6 z6 = this.h;
        if (z2 && i3 != 0 && Settings.System.getInt(z6.a.getContentResolver(), "haptic_feedback_enabled", 1) == 1) {
            ((Vibrator) z6.a.getSystemService("vibrator")).vibrate(50L);
        }
        if (!z2 && trim.length() > 0) {
            z = true;
        }
        this.a.setEnabled(z);
        this.g.setTextColor(z2 ? z6.X : z6.Y);
    }
}
