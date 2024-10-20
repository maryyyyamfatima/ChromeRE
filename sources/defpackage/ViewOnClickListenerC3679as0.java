package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: as0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3679as0 extends C7453lr0 implements View.OnClickListener {
    public ViewOnClickListenerC3679as0(Context context, InterfaceC7109kr0 interfaceC7109kr0) {
        super(context, interfaceC7109kr0);
    }

    @Override // defpackage.C7453lr0, android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.f57140_resource_name_obfuscated_res_0x7f0e00da, (ViewGroup) null);
        }
        view.setTag(Integer.valueOf(i));
        view.setOnClickListener(this);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.radio_button);
        radioButton.setChecked(this.a == i);
        radioButton.setTag(Integer.valueOf(i));
        radioButton.setOnClickListener(this);
        if (getCount() <= 1) {
            radioButton.setVisibility(8);
        }
        view.setEnabled(isEnabled(i));
        C0461Do0 c0461Do0 = (C0461Do0) getItem(i);
        if (c0461Do0 == null) {
            return view;
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(c0461Do0.a);
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        if (!isEnabled(i)) {
            radioButton.setEnabled(false);
            textView.setEnabled(false);
            textView2.setEnabled(false);
            if (this.l.isEmpty()) {
                textView2.setText(getContext().getText(R.string.f72520_resource_name_obfuscated_res_0x7f140422));
            } else {
                textView2.setVisibility(8);
            }
        } else {
            String c = AbstractC6091ht0.c(getContext(), AbstractC11893yn3.a, c0461Do0.c);
            textView2.setText(c);
            StringBuilder sb = new StringBuilder();
            sb.append(c0461Do0.a);
            sb.append(" ");
            sb.append(c);
            radioButton.setContentDescription(sb);
        }
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        C0461Do0 c0461Do0 = (C0461Do0) getItem(intValue);
        if (c0461Do0 == null) {
            return;
        }
        N.MQzHQbrF(c0461Do0.b);
        this.a = intValue;
        InterfaceC7109kr0 interfaceC7109kr0 = this.i;
        if (interfaceC7109kr0 != null) {
            interfaceC7109kr0.a();
        }
        EI2.h(c0461Do0.e, 3, "MobileDownload.Location.Setting.DirectoryType");
        notifyDataSetChanged();
    }
}
