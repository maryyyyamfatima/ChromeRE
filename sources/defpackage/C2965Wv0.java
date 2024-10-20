package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2965Wv0 extends AbstractDialogInterfaceOnClickListenerC10927vy2 {
    public CharSequence A0;
    public final RunnableC2835Vv0 B0 = new RunnableC2835Vv0(this);
    public long C0 = -1;
    public EditText z0;

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            this.A0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        } else {
            AbstractC2705Uv0.a(R0());
            throw null;
        }
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A0);
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void S0(View view) {
        super.S0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.z0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.z0.setText(this.A0);
        EditText editText2 = this.z0;
        editText2.setSelection(editText2.getText().length());
        AbstractC2705Uv0.a(R0());
        throw null;
    }

    public final void W0() {
        long j = this.C0;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.z0;
            if (editText == null || !editText.isFocused()) {
                this.C0 = -1L;
                return;
            }
            if (((InputMethodManager) this.z0.getContext().getSystemService("input_method")).showSoftInput(this.z0, 0)) {
                this.C0 = -1L;
                return;
            }
            EditText editText2 = this.z0;
            RunnableC2835Vv0 runnableC2835Vv0 = this.B0;
            editText2.removeCallbacks(runnableC2835Vv0);
            this.z0.postDelayed(runnableC2835Vv0, 50L);
        }
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void V0() {
        this.C0 = SystemClock.currentThreadTimeMillis();
        W0();
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void T0(boolean z) {
        if (z) {
            this.z0.getText().toString();
            AbstractC2705Uv0.a(R0());
            throw null;
        }
    }
}
