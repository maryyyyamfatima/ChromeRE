package org.chromium.components.browser_ui.contacts_picker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.A40;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC6099hu2;
import defpackage.GD2;
import defpackage.J40;
import defpackage.JD2;
import defpackage.PD2;
import defpackage.S23;
import defpackage.ViewOnClickListenerC10219tu2;
import defpackage.ZX1;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContactView extends S23 {
    public final Context F;
    public ViewOnClickListenerC10219tu2 G;
    public A40 H;
    public TextView I;

    /* renamed from: J */
    public TextView f11536J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public ImageView P;
    public ZX1 Q;
    public PropertyModel R;

    @Override // defpackage.U23
    public final void j() {
    }

    public ContactView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = context;
        this.k = false;
    }

    @Override // defpackage.S23, defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.I = (TextView) findViewById(R.id.title);
        this.f11536J = (TextView) findViewById(R.id.address);
        this.K = (TextView) findViewById(R.id.address_overflow_count);
        this.L = (TextView) findViewById(R.id.email);
        this.M = (TextView) findViewById(R.id.email_overflow_count);
        this.N = (TextView) findViewById(R.id.telephone_number);
        this.O = (TextView) findViewById(R.id.telephone_number_overflow_count);
        this.P = (ImageView) findViewById(R.id.star);
        this.K.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.O.setOnClickListener(this);
    }

    @Override // defpackage.U23, android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.address_overflow_count || id == R.id.email_overflow_count || id == R.id.telephone_number_overflow_count) {
            onLongClick(this);
        } else {
            super.onClick(view);
        }
    }

    @Override // defpackage.U23, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.Q = this.G.h.s();
        J40 j40 = new J40(this);
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = j40;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.c;
        String str = this.H.g;
        GD2 gd22 = new GD2();
        gd22.a = str;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.f;
        String b = this.H.b(AbstractC6099hu2.r, AbstractC6099hu2.t, AbstractC6099hu2.u);
        GD2 gd23 = new GD2();
        gd23.a = b;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.j;
        String string = this.F.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140362);
        GD2 gd24 = new GD2();
        gd24.a = string;
        e.put(pd23, gd24);
        PropertyModel propertyModel = new PropertyModel(e);
        this.R = propertyModel;
        propertyModel.o(AbstractC4249cY1.e, this.y);
        this.Q.l(this.R, 1, false);
        return true;
    }

    @Override // defpackage.U23, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        A40 a40 = this.H;
        if (a40 == null || arrayList.contains(a40) == super.isChecked()) {
            return;
        }
        super.toggle();
    }

    public static void u(TextView textView, String str) {
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        textView.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.A40 r18, android.graphics.Bitmap r19) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.contacts_picker.ContactView.t(A40, android.graphics.Bitmap):void");
    }
}
