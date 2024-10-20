package org.chromium.components.browser_ui.contacts_picker;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC6099hu2;
import defpackage.C7526m33;
import defpackage.RS3;
import defpackage.SS3;
import defpackage.ViewOnClickListenerC10219tu2;
import java.util.HashSet;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.content.browser.ContactsDialogHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TopView extends RelativeLayout implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public final Context a;
    public View g;
    public CheckBox h;
    public TextView i;
    public SS3 j;
    public ChipView k;
    public ChipView l;
    public ChipView m;
    public ChipView n;
    public ChipView o;
    public RS3 p;
    public boolean q;

    public TopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = findViewById(R.id.content);
        if (N.Mk6X8tWe("ContactsPickerSelectAll")) {
            this.g.setVisibility(0);
        }
        this.h = (CheckBox) findViewById(R.id.checkbox);
        this.i = (TextView) findViewById(R.id.checkbox_details);
        ((TextView) findViewById(R.id.checkbox_title)).setText(R.string.f71120_resource_name_obfuscated_res_0x7f140390);
        ChipView chipView = (ChipView) findViewById(R.id.names_filter);
        this.k = chipView;
        chipView.g.setText(R.string.f89190_resource_name_obfuscated_res_0x7f140b3b);
        this.k.setSelected(true);
        this.k.setOnClickListener(this);
        this.k.b(R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5, false);
        ChipView chipView2 = (ChipView) findViewById(R.id.address_filter);
        this.l = chipView2;
        chipView2.g.setText(R.string.f89160_resource_name_obfuscated_res_0x7f140b38);
        this.l.setSelected(true);
        this.l.setOnClickListener(this);
        this.l.b(R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5, false);
        ChipView chipView3 = (ChipView) findViewById(R.id.email_filter);
        this.m = chipView3;
        chipView3.g.setText(R.string.f89170_resource_name_obfuscated_res_0x7f140b39);
        this.m.setSelected(true);
        this.m.setOnClickListener(this);
        this.m.b(R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5, false);
        ChipView chipView4 = (ChipView) findViewById(R.id.tel_filter);
        this.n = chipView4;
        chipView4.g.setText(R.string.f89200_resource_name_obfuscated_res_0x7f140b3c);
        this.n.setSelected(true);
        this.n.setOnClickListener(this);
        this.n.b(R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5, false);
        ChipView chipView5 = (ChipView) findViewById(R.id.icon_filter);
        this.o = chipView5;
        chipView5.g.setText(R.string.f89180_resource_name_obfuscated_res_0x7f140b3a);
        this.o.setSelected(true);
        this.o.setOnClickListener(this);
        this.o.b(R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5, false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.names_filter) {
            a(0);
            return;
        }
        if (id == R.id.address_filter) {
            a(3);
            return;
        }
        if (id == R.id.email_filter) {
            a(1);
        } else if (id == R.id.tel_filter) {
            a(2);
        } else if (id == R.id.icon_filter) {
            a(4);
        }
    }

    public final void a(int i) {
        ChipView chipView;
        int i2;
        if (i == 0) {
            chipView = this.k;
            i2 = R.drawable.f51730_resource_name_obfuscated_res_0x7f0903da;
        } else if (i == 1) {
            chipView = this.m;
            i2 = R.drawable.f46270_resource_name_obfuscated_res_0x7f090173;
        } else if (i == 2) {
            chipView = this.n;
            i2 = R.drawable.f53780_resource_name_obfuscated_res_0x7f0904be;
        } else if (i == 3) {
            chipView = this.l;
            i2 = R.drawable.f44580_resource_name_obfuscated_res_0x7f090098;
        } else {
            if (i != 4) {
                return;
            }
            chipView = this.o;
            i2 = R.drawable.f46340_resource_name_obfuscated_res_0x7f09017a;
        }
        chipView.setSelected(!chipView.isSelected());
        if (chipView.isSelected()) {
            i2 = R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5;
        }
        chipView.b(i2, true);
        AbstractC6099hu2 abstractC6099hu2 = (AbstractC6099hu2) this.p;
        abstractC6099hu2.getClass();
        if (i == 0) {
            AbstractC6099hu2.s = !AbstractC6099hu2.s;
        } else if (i == 1) {
            AbstractC6099hu2.t = !AbstractC6099hu2.t;
        } else if (i == 2) {
            AbstractC6099hu2.u = !AbstractC6099hu2.u;
        } else if (i == 3) {
            AbstractC6099hu2.r = !AbstractC6099hu2.r;
        } else if (i == 4) {
            AbstractC6099hu2.v = !AbstractC6099hu2.v;
        }
        abstractC6099hu2.t();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.q) {
            return;
        }
        SS3 ss3 = this.j;
        boolean isChecked = this.h.isChecked();
        ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2 = (ViewOnClickListenerC10219tu2) ss3;
        C7526m33 c7526m33 = viewOnClickListenerC10219tu2.n;
        if (!isChecked) {
            c7526m33.c = new HashSet();
            c7526m33.f();
            viewOnClickListenerC10219tu2.q = null;
            ((ContactsDialogHost) viewOnClickListenerC10219tu2.i).a(3, null, 0, 0);
            return;
        }
        viewOnClickListenerC10219tu2.q = c7526m33.c;
        c7526m33.c = new HashSet(viewOnClickListenerC10219tu2.l.n);
        c7526m33.f();
        ((ContactsDialogHost) viewOnClickListenerC10219tu2.i).a(2, null, 0, 0);
    }
}
