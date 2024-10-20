package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11227wr implements InterfaceC3906bY1 {
    public final InterfaceC10884vr a;
    public final PropertyModel g;
    public ZX1 h;
    public Context i;
    public final View j;
    public SpannableStringBuilder k;

    public AbstractC11227wr(Activity activity, InterfaceC10884vr interfaceC10884vr, int i, String str, int i2, String str2, String str3, boolean z) {
        this.a = interfaceC10884vr;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f56010_resource_name_obfuscated_res_0x7f0e0057, (ViewGroup) null);
        this.j = inflate;
        if (i != 0) {
            ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.autofill_save_card_content_stub);
            viewStub.setLayoutResource(i);
            viewStub.inflate();
        }
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("MessagesForAndroidSaveCard") && N.M6bsIDpc("MessagesForAndroidSaveCard", "save_card_dialog_v2_enabled", false)) {
            TextView textView = (TextView) inflate.findViewById(R.id.description);
            textView.setVisibility(0);
            if (!TextUtils.isEmpty(str2)) {
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new C10198tr(this), 0, str2.length(), 17);
                textView.setText(TextUtils.expandTemplate(activity.getString(R.string.f68390_resource_name_obfuscated_res_0x7f14023f), spannableString));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                textView.setText(R.string.f68380_resource_name_obfuscated_res_0x7f14023e);
            }
        }
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, this);
        bd2.e(AbstractC4249cY1.c, str);
        bd2.e(AbstractC4249cY1.h, inflate);
        bd2.e(AbstractC4249cY1.j, str3);
        bd2.d(AbstractC4249cY1.n, activity.getResources(), R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
        bd2.b(AbstractC4249cY1.r, false);
        bd2.b(AbstractC4249cY1.m, true);
        bd2.c(AbstractC4249cY1.v, z ? 1 : 0);
        if (i2 != 0) {
            PD2 pd2 = AbstractC4249cY1.e;
            if (i2 != 0) {
                bd2.e(pd2, AbstractC2884Wf.a(activity, i2));
            }
        }
        this.g = bd2.a();
        this.i = activity;
    }

    public final void d(Activity activity, ZX1 zx1) {
        if (activity == null || zx1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.k;
        PropertyModel propertyModel = this.g;
        if (spannableStringBuilder != null) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("MessagesForAndroidSaveCard") && N.M6bsIDpc("MessagesForAndroidSaveCard", "save_card_dialog_v2_enabled", false)) {
                propertyModel.o(AbstractC4249cY1.q, this.k);
            } else {
                TextView textView = (TextView) this.j.findViewById(R.id.legal_message);
                textView.setText(this.k);
                textView.setVisibility(0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.i = activity;
        this.h = zx1;
        zx1.l(propertyModel, 1, false);
    }

    public final void b(C10245tz1 c10245tz1) {
        SpannableStringBuilder spannableStringBuilder = this.k;
        if (spannableStringBuilder == null) {
            this.k = new SpannableStringBuilder();
        } else {
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        int length = this.k.length();
        this.k.append((CharSequence) c10245tz1.a);
        for (C9902sz1 c9902sz1 : c10245tz1.b) {
            this.k.setSpan(new C10541ur(this, c9902sz1.c), c9902sz1.a + length, c9902sz1.b + length, 17);
        }
    }
}
