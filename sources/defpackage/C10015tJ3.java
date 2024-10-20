package defpackage;

import J.N;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.android.chrome.R;
import org.chromium.content.browser.input.SuggestionInfo;
import org.chromium.content.browser.input.TextSuggestionHost;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tJ3 */
/* loaded from: classes2.dex */
public final class C10015tJ3 extends AbstractViewOnClickListenerC10533up3 {
    public SuggestionInfo[] w;
    public final TextAppearanceSpan x;
    public final TextAppearanceSpan y;

    public C10015tJ3(Context context, TextSuggestionHost textSuggestionHost, WindowAndroid windowAndroid, View view) {
        super(context, textSuggestionHost, windowAndroid, view);
        this.x = new TextAppearanceSpan(context, R.style.f102470_resource_name_obfuscated_res_0x7f150434);
        this.y = new TextAppearanceSpan(context, R.style.f102470_resource_name_obfuscated_res_0x7f150434);
    }

    @Override // defpackage.AbstractViewOnClickListenerC10533up3
    public final int d() {
        return this.w.length;
    }

    @Override // defpackage.AbstractViewOnClickListenerC10533up3
    public final Object b(int i) {
        return this.w[i];
    }

    @Override // defpackage.AbstractViewOnClickListenerC10533up3
    public final SpannableString c(int i) {
        SuggestionInfo suggestionInfo = this.w[i];
        StringBuilder sb = new StringBuilder();
        sb.append(suggestionInfo.c);
        String str = suggestionInfo.d;
        sb.append(str);
        String str2 = suggestionInfo.e;
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        TextAppearanceSpan textAppearanceSpan = this.x;
        String str3 = suggestionInfo.c;
        spannableString.setSpan(textAppearanceSpan, 0, str3.length(), 33);
        spannableString.setSpan(this.y, str.length() + str3.length(), str2.length() + str.length() + str3.length(), 33);
        return spannableString;
    }

    @Override // defpackage.AbstractViewOnClickListenerC10533up3
    public final void a(int i) {
        SuggestionInfo suggestionInfo = this.w[i];
        int i2 = suggestionInfo.a;
        TextSuggestionHost textSuggestionHost = this.g;
        N.MIADbBhq(textSuggestionHost.a, textSuggestionHost, i2, suggestionInfo.b);
    }
}
