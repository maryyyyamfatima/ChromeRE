package org.chromium.chrome.browser.sync.ui;

import J.N;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC10761vV3;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9108qg3;
import defpackage.AbstractC9307rF1;
import defpackage.C5490g8;
import defpackage.C6725jk2;
import defpackage.C8101nk2;
import defpackage.C8445ok2;
import defpackage.C8765pg3;
import defpackage.DialogC5834h8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.DialogInterfaceOnClickListenerC7069kk2;
import defpackage.DialogInterfaceOnShowListenerC7757mk2;
import defpackage.InterfaceC10417uV2;
import defpackage.InterfaceC8788pk2;
import defpackage.LayoutInflaterFactory2C0545Ef;
import java.text.DateFormat;
import java.util.Date;
import org.chromium.chrome.browser.sync.SyncServiceImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PassphraseDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 implements DialogInterface.OnClickListener {
    public EditText r0;
    public TextView s0;
    public Drawable t0;
    public Drawable u0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        SpannableString spannableString;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.f61290_resource_name_obfuscated_res_0x7f0e02a5, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.prompt_text);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        String str = Q(R.string.f88160_resource_name_obfuscated_res_0x7f140acf, b.c().getEmail()) + "\n\n";
        long MiYQ8NoG = N.MiYQ8NoG(((SyncServiceImpl) b).c);
        Date date = MiYQ8NoG != 0 ? new Date(MiYQ8NoG) : null;
        if (date != null) {
            String O = O(R.string.f74290_resource_name_obfuscated_res_0x7f1404e5);
            String format = DateFormat.getDateInstance(2).format(date);
            int f = b.f();
            if (f == 2 || f == 3) {
                StringBuilder a = AbstractC10761vV3.a(str);
                a.append(Q(R.string.f88260_resource_name_obfuscated_res_0x7f140ad9, format));
                spannableString = AbstractC9108qg3.a(a.toString(), new C8765pg3(new C8101nk2(this, O), "<learnmore>", "</learnmore>"));
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                TextView textView2 = (TextView) inflate.findViewById(R.id.reset_text);
                textView2.setText(AbstractC9108qg3.a(O(R.string.f88490_resource_name_obfuscated_res_0x7f140af0), new C8765pg3(new C8445ok2(getActivity()), "<resetlink>", "</resetlink>")));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setVisibility(0);
                this.s0 = (TextView) inflate.findViewById(R.id.verifying);
                EditText editText = (EditText) inflate.findViewById(R.id.passphrase);
                this.r0 = editText;
                editText.setOnEditorActionListener(new C6725jk2(this));
                Drawable background = this.r0.getBackground();
                this.t0 = background;
                Drawable newDrawable = background.getConstantState().newDrawable();
                this.u0 = newDrawable;
                newDrawable.mutate().setColorFilter(K().getColor(R.color.f22510_resource_name_obfuscated_res_0x7f0705b0), PorterDuff.Mode.SRC_IN);
                C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
                c5490g8.a.q = inflate;
                c5490g8.f(R.string.f87660_resource_name_obfuscated_res_0x7f140a9c, new DialogInterfaceOnClickListenerC7069kk2());
                c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, this);
                c5490g8.i(R.string.f86790_resource_name_obfuscated_res_0x7f140a43);
                DialogC5834h8 a2 = c5490g8.a();
                ((LayoutInflaterFactory2C0545Ef) a2.c()).y = false;
                a2.setOnShowListener(new DialogInterfaceOnShowListenerC7757mk2(this, a2));
                return a2;
            }
            AbstractC4851eH1.f("Sync_UI", AbstractC9307rF1.a("Found incorrect passphrase type ", f, ". Falling back to default string."), new Object[0]);
        }
        StringBuilder a3 = AbstractC10761vV3.a(str);
        a3.append(O(R.string.f88250_resource_name_obfuscated_res_0x7f140ad8));
        spannableString = new SpannableString(a3.toString());
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView22 = (TextView) inflate.findViewById(R.id.reset_text);
        textView22.setText(AbstractC9108qg3.a(O(R.string.f88490_resource_name_obfuscated_res_0x7f140af0), new C8765pg3(new C8445ok2(getActivity()), "<resetlink>", "</resetlink>")));
        textView22.setMovementMethod(LinkMovementMethod.getInstance());
        textView22.setVisibility(0);
        this.s0 = (TextView) inflate.findViewById(R.id.verifying);
        EditText editText2 = (EditText) inflate.findViewById(R.id.passphrase);
        this.r0 = editText2;
        editText2.setOnEditorActionListener(new C6725jk2(this));
        Drawable background2 = this.r0.getBackground();
        this.t0 = background2;
        Drawable newDrawable2 = background2.getConstantState().newDrawable();
        this.u0 = newDrawable2;
        newDrawable2.mutate().setColorFilter(K().getColor(R.color.f22510_resource_name_obfuscated_res_0x7f0705b0), PorterDuff.Mode.SRC_IN);
        C5490g8 c5490g82 = new C5490g8(getActivity(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g82.a.q = inflate;
        c5490g82.f(R.string.f87660_resource_name_obfuscated_res_0x7f140a9c, new DialogInterfaceOnClickListenerC7069kk2());
        c5490g82.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, this);
        c5490g82.i(R.string.f86790_resource_name_obfuscated_res_0x7f140a43);
        DialogC5834h8 a22 = c5490g82.a();
        ((LayoutInflaterFactory2C0545Ef) a22.c()).y = false;
        a22.setOnShowListener(new DialogInterfaceOnShowListenerC7757mk2(this, a22));
        return a22;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC8788pk2 interfaceC8788pk2;
        if (i == -2) {
            this.s0.getText().toString().equals(N().getString(R.string.f88480_resource_name_obfuscated_res_0x7f140aef));
            InterfaceC10417uV2 R = R(true);
            if (R instanceof InterfaceC8788pk2) {
                interfaceC8788pk2 = (InterfaceC8788pk2) R;
            } else {
                interfaceC8788pk2 = (InterfaceC8788pk2) getActivity();
            }
            interfaceC8788pk2.F();
        }
    }

    public static void R0(PassphraseDialogFragment passphraseDialogFragment) {
        InterfaceC8788pk2 interfaceC8788pk2;
        passphraseDialogFragment.r0.setBackground(passphraseDialogFragment.t0);
        passphraseDialogFragment.s0.setText(R.string.f88770_resource_name_obfuscated_res_0x7f140b0c);
        String obj = passphraseDialogFragment.r0.getText().toString();
        InterfaceC10417uV2 R = passphraseDialogFragment.R(true);
        if (R instanceof InterfaceC8788pk2) {
            interfaceC8788pk2 = (InterfaceC8788pk2) R;
        } else {
            interfaceC8788pk2 = (InterfaceC8788pk2) passphraseDialogFragment.getActivity();
        }
        if (interfaceC8788pk2.t(obj)) {
            return;
        }
        passphraseDialogFragment.s0.setText(R.string.f88480_resource_name_obfuscated_res_0x7f140aef);
        passphraseDialogFragment.s0.setTextColor(passphraseDialogFragment.K().getColor(R.color.f22510_resource_name_obfuscated_res_0x7f0705b0));
        passphraseDialogFragment.r0.setBackground(passphraseDialogFragment.u0);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.r0.setBackground(this.t0);
        this.f11484J = true;
    }
}
