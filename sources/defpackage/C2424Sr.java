package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.autofill.settings.VirtualCardEnrollmentFields;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sr */
/* loaded from: classes.dex */
public final class C2424Sr {
    public final Context a;
    public final ZX1 b;
    public final VirtualCardEnrollmentFields c;
    public final String d;
    public final String e;
    public final InterfaceC2294Rr f;
    public final Callback g;
    public PropertyModel h;

    public C2424Sr(Context context, ZX1 zx1, VirtualCardEnrollmentFields virtualCardEnrollmentFields, String str, String str2, InterfaceC2294Rr interfaceC2294Rr, Callback callback) {
        this.a = context;
        this.b = zx1;
        this.c = virtualCardEnrollmentFields;
        this.d = str;
        this.e = str2;
        this.f = interfaceC2294Rr;
        this.g = callback;
    }

    public final void a() {
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        PD2 pd2 = AbstractC4249cY1.h;
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02e9, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14025d);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = GP2.a;
        Drawable drawable = resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0901a3, theme);
        SpannableString spannableString = new SpannableString(AbstractC4809e90.a("   ", string));
        float textSize = textView.getTextSize() / drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * textSize), (int) (textSize * drawable.getIntrinsicHeight()));
        spannableString.setSpan(new ImageSpan(drawable, 2), 0, 1, 17);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        TextView textView2 = (TextView) inflate.findViewById(R.id.virtual_card_education);
        textView2.setText(AbstractC1774Nr.d(context, R.string.0_resource_name_obfuscated_res_0x7f14025c, new Callback() { // from class: Or
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2424Sr.this.f.a(2, (String) obj);
            }
        }));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) inflate.findViewById(R.id.google_legal_message);
        VirtualCardEnrollmentFields virtualCardEnrollmentFields = this.c;
        textView3.setText(AbstractC1774Nr.c(context, virtualCardEnrollmentFields.a, false, new Callback() { // from class: Pr
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2424Sr.this.f.a(0, (String) obj);
            }
        }));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView4 = (TextView) inflate.findViewById(R.id.issuer_legal_message);
        textView4.setText(AbstractC1774Nr.c(context, virtualCardEnrollmentFields.b, false, new Callback() { // from class: Qr
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2424Sr.this.f.a(1, (String) obj);
            }
        }));
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) inflate.findViewById(R.id.credit_card_identifier)).setText(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14025b, virtualCardEnrollmentFields.d));
        ((ImageView) inflate.findViewById(R.id.credit_card_issuer_icon)).setImageBitmap(virtualCardEnrollmentFields.c);
        GD2 gd2 = new GD2();
        gd2.a = inflate;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC4249cY1.j;
        GD2 gd22 = new GD2();
        gd22.a = this.d;
        e.put(pd22, gd22);
        ID2 id2 = AbstractC4249cY1.v;
        DD2 dd2 = new DD2();
        dd2.a = 1;
        e.put(id2, dd2);
        PD2 pd23 = AbstractC4249cY1.n;
        GD2 gd23 = new GD2();
        gd23.a = this.e;
        e.put(pd23, gd23);
        JD2 jd2 = AbstractC4249cY1.a;
        ZX1 zx1 = this.b;
        C2998Xb3 c2998Xb3 = new C2998Xb3(zx1, this.g);
        GD2 gd24 = new GD2();
        gd24.a = c2998Xb3;
        e.put(jd2, gd24);
        PropertyModel propertyModel = new PropertyModel(e);
        this.h = propertyModel;
        zx1.l(propertyModel, 1, false);
    }
}
