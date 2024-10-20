package defpackage;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gq */
/* loaded from: classes.dex */
public final class C0860Gq extends AbstractC11227wr implements TextWatcher {
    public final InterfaceC0730Fq l;
    public final EditText m;
    public final EditText n;
    public final TextView o;
    public boolean p;
    public boolean q;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C0860Gq(Activity activity, InterfaceC0730Fq interfaceC0730Fq, String str, int i, String str2, String str3, String str4, boolean z) {
        super(activity, interfaceC0730Fq, R.layout.0_resource_name_obfuscated_res_0x7f0e0052, str, i, str3, str4, z);
        this.l = interfaceC0730Fq;
        this.o = (TextView) this.j.findViewById(R.id.error_message);
        ((TextView) this.j.findViewById(R.id.cc_details_masked)).setText(str2);
        this.j.findViewById(R.id.message_divider).setVisibility(8);
        this.j.findViewById(R.id.google_pay_logo).setVisibility(8);
        EditText editText = (EditText) this.j.findViewById(R.id.cc_month_edit);
        this.m = editText;
        editText.addTextChangedListener(this);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Dq
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C0860Gq c0860Gq = C0860Gq.this;
                c0860Gq.p = z2 | c0860Gq.p;
            }
        });
        EditText editText2 = (EditText) this.j.findViewById(R.id.cc_year_edit);
        this.n = editText2;
        editText2.addTextChangedListener(this);
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Eq
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C0860Gq c0860Gq = C0860Gq.this;
                c0860Gq.q = z2 | c0860Gq.q;
            }
        });
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i != 0) {
            if (i == 1) {
                this.h.c(2, propertyModel);
            }
        } else {
            this.l.a(this.m.getText().toString().trim(), this.n.getText().toString().trim());
            this.h.c(1, propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        InterfaceC0730Fq interfaceC0730Fq = this.l;
        if (i == 2) {
            interfaceC0730Fq.e();
        }
        interfaceC0730Fq.c();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = this.p;
        boolean z2 = this.q;
        EditText editText = this.m;
        EditText editText2 = this.n;
        int a = AbstractC1774Nr.a(editText, editText2, z, z2);
        this.g.k(AbstractC4249cY1.m, a != 7);
        AbstractC1774Nr.f(a, this.i, this.o);
        AbstractC1774Nr.g(a, this.i, editText, editText2, null);
        if (editText.isFocused() && editText.getText().length() == 2 && a != 1) {
            editText2.requestFocus();
            this.q = true;
        }
    }
}
