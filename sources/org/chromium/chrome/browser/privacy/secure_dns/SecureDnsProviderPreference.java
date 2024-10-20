package org.chromium.chrome.browser.privacy.secure_dns;

import J.N;
import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.C1812Ny2;
import defpackage.H13;
import defpackage.I13;
import defpackage.J13;
import java.util.ArrayList;
import java.util.Collections;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SecureDnsProviderPreference extends Preference implements RadioGroup.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, TextWatcher {
    public final String T;
    public final String U;
    public final String V;
    public final ArrayList W;
    public RadioButtonWithDescriptionLayout X;
    public RadioButtonWithDescription Y;
    public RadioButtonWithDescription Z;
    public Spinner a0;
    public TextView b0;
    public EditText c0;
    public TextInputLayout d0;
    public J13 e0;
    public final a f0;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.chromium.chrome.browser.privacy.secure_dns.a] */
    public SecureDnsProviderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = new Runnable() { // from class: org.chromium.chrome.browser.privacy.secure_dns.a
            @Override // java.lang.Runnable
            public final void run() {
                final SecureDnsProviderPreference secureDnsProviderPreference = SecureDnsProviderPreference.this;
                final String str = secureDnsProviderPreference.e0.b;
                if (str.isEmpty()) {
                    return;
                }
                J13 j13 = secureDnsProviderPreference.e0;
                if (j13.c && j13.a) {
                    new Thread(new Runnable() { // from class: org.chromium.chrome.browser.privacy.secure_dns.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            final SecureDnsProviderPreference secureDnsProviderPreference2 = SecureDnsProviderPreference.this;
                            secureDnsProviderPreference2.getClass();
                            final String str2 = str;
                            if (N.MvzcX2os(str2)) {
                                return;
                            }
                            secureDnsProviderPreference2.c0.post(new Runnable() { // from class: org.chromium.chrome.browser.privacy.secure_dns.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SecureDnsProviderPreference secureDnsProviderPreference3 = SecureDnsProviderPreference.this;
                                    if (secureDnsProviderPreference3.e0.b.contentEquals(str2)) {
                                        secureDnsProviderPreference3.d0.l(secureDnsProviderPreference3.V);
                                    }
                                }
                            });
                        }
                    }).start();
                }
            }
        };
        this.K = R.layout.f60590_resource_name_obfuscated_res_0x7f0e025d;
        this.T = context.getString(R.string.f86370_resource_name_obfuscated_res_0x7f140a16);
        this.U = context.getString(R.string.f86300_resource_name_obfuscated_res_0x7f140a0f);
        this.V = context.getString(R.string.f86290_resource_name_obfuscated_res_0x7f140a0e);
        ArrayList a = I13.a();
        ArrayList arrayList = new ArrayList(a.size() + 1);
        arrayList.add(new H13(context.getString(R.string.f86210_resource_name_obfuscated_res_0x7f140a06), "", ""));
        Collections.shuffle(a);
        arrayList.addAll(a);
        this.W = arrayList;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = (RadioButtonWithDescriptionLayout) c1812Ny2.v(R.id.mode_group);
        this.X = radioButtonWithDescriptionLayout;
        radioButtonWithDescriptionLayout.g = this;
        this.Y = (RadioButtonWithDescription) c1812Ny2.v(R.id.automatic);
        this.Z = (RadioButtonWithDescription) c1812Ny2.v(R.id.secure);
        View v = c1812Ny2.v(R.id.selection_container);
        Spinner spinner = (Spinner) v.findViewById(R.id.dropdown_spinner);
        this.a0 = spinner;
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(v.getContext(), R.layout.f60600_resource_name_obfuscated_res_0x7f0e025e, this.W);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.a0.setAdapter((SpinnerAdapter) arrayAdapter);
        TextView textView = (TextView) v.findViewById(R.id.privacy_policy);
        this.b0 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        EditText editText = (EditText) v.findViewById(R.id.custom_server);
        this.c0 = editText;
        editText.addTextChangedListener(this);
        this.c0.setRawInputType(16);
        this.d0 = (TextInputLayout) v.findViewById(R.id.custom_server_layout);
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout2 = this.X;
        RadioButtonWithDescription radioButtonWithDescription = this.Z;
        radioButtonWithDescriptionLayout2.getClass();
        if (v.getParent() != null) {
            ((ViewGroup) v.getParent()).removeView(v);
        }
        radioButtonWithDescriptionLayout2.addView(v, radioButtonWithDescriptionLayout2.indexOfChild(radioButtonWithDescription) + 1);
        X();
    }

    public final int W() {
        for (int i = 1; i < this.a0.getCount(); i++) {
            if (((H13) this.a0.getItemAtPosition(i)).b.equals(this.e0.b)) {
                return i;
            }
        }
        return 0;
    }

    public final void X() {
        if (this.X == null) {
            return;
        }
        boolean e = this.Z.e();
        boolean z = this.e0.a;
        if (e != z) {
            this.Z.f(z);
        }
        boolean z2 = !this.e0.a;
        if (this.Y.e() != z2) {
            this.Y.f(z2);
        }
        int W = W();
        if (this.a0.getSelectedItemPosition() != W) {
            this.a0.setSelection(W);
        }
        if (this.e0.a) {
            this.a0.setVisibility(0);
            if (W > 0) {
                this.b0.setText(Html.fromHtml(this.T.replace("$1", ((H13) this.a0.getSelectedItem()).c)));
                this.b0.setVisibility(0);
                this.d0.setVisibility(8);
            } else {
                if (!this.c0.getText().toString().equals(this.e0.b)) {
                    this.c0.setText(this.e0.b);
                    EditText editText = this.c0;
                    a aVar = this.f0;
                    editText.removeCallbacks(aVar);
                    if (this.e0.a) {
                        this.c0.requestFocus();
                        this.c0.postDelayed(aVar, 1000L);
                    }
                }
                J13 j13 = this.e0;
                this.d0.l((j13.c || "https://".startsWith(j13.b)) ? false : true ? this.U : null);
                this.d0.setVisibility(0);
                this.b0.setVisibility(8);
            }
        } else {
            this.a0.setVisibility(8);
            this.b0.setVisibility(8);
            this.d0.setVisibility(8);
        }
        N.M6OgZ3EY(this.e0.c);
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        boolean z = i == R.id.secure;
        J13 j13 = this.e0;
        if (j13.a != z) {
            J13 j132 = new J13(j13.b, z, j13.c);
            if (f(j132)) {
                if (j132.equals(this.e0)) {
                    return;
                }
                this.e0 = j132;
                X();
                return;
            }
            X();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int W = W();
        if (W == i) {
            return;
        }
        H13 h13 = (H13) adapterView.getItemAtPosition(W);
        H13 h132 = (H13) adapterView.getItemAtPosition(i);
        J13 j13 = this.e0;
        J13 j132 = new J13(h132.b, j13.a, j13.c);
        if (f(j132)) {
            if (!j132.equals(this.e0)) {
                this.e0 = j132;
                X();
            }
        } else {
            X();
        }
        N.MHfKmORH(h13.b, h132.b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        J13 j13 = this.e0;
        J13 j132 = new J13(editable.toString(), j13.a, j13.c);
        if (f(j132)) {
            if (!j132.equals(this.e0)) {
                this.e0 = j132;
                X();
            }
        } else {
            X();
        }
        EditText editText = this.c0;
        a aVar = this.f0;
        editText.removeCallbacks(aVar);
        this.c0.postDelayed(aVar, 1000L);
    }
}
