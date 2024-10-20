package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.infobars.InfoBarMessageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7074kl1 {
    public final ViewOnClickListenerC7418ll1 a;
    public CharSequence b;
    public SpannableString c;

    public C7074kl1(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        this.a = viewOnClickListenerC7418ll1;
    }

    public final void b(String str, Callback callback) {
        Context context = this.a.getContext();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C11997z52(context, callback), 0, str.length(), 17);
        this.c = spannableString;
    }

    public final void a() {
        ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1 = this.a;
        int dimensionPixelOffset = viewOnClickListenerC7418ll1.getResources().getDimensionPixelOffset(R.dimen.f34160_resource_name_obfuscated_res_0x7f080378);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.b);
        if (this.c != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.c);
        }
        InfoBarMessageView infoBarMessageView = new InfoBarMessageView(viewOnClickListenerC7418ll1.getContext());
        infoBarMessageView.setTextAppearance(infoBarMessageView.getContext(), R.style.f102720_resource_name_obfuscated_res_0x7f15044d);
        infoBarMessageView.setText(spannableStringBuilder);
        infoBarMessageView.setGravity(16);
        infoBarMessageView.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        if (this.c != null) {
            infoBarMessageView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        viewOnClickListenerC7418ll1.a(infoBarMessageView);
    }
}
