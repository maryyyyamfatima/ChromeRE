package defpackage;

import J.N;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import org.chromium.content.browser.input.TextSuggestionHost;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xg3 */
/* loaded from: classes2.dex */
public final class C3023Xg3 extends AbstractViewOnClickListenerC10533up3 {
    public String[] w;

    public C3023Xg3(Context context, TextSuggestionHost textSuggestionHost, WindowAndroid windowAndroid, View view) {
        super(context, textSuggestionHost, windowAndroid, view);
        this.w = new String[0];
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
        return new SpannableString(this.w[i]);
    }

    @Override // defpackage.AbstractViewOnClickListenerC10533up3
    public final void a(int i) {
        String str = this.w[i];
        TextSuggestionHost textSuggestionHost = this.g;
        N.M7RnYR2r(textSuggestionHost.a, textSuggestionHost, str);
    }
}
