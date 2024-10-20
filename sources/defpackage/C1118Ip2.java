package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.app.ChromeActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ip2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118Ip2 extends AbstractViewOnClickListenerC1897Op2 {
    public final Handler A;
    public GridLayout w;
    public TextView x;
    public final ArrayList y;
    public final RunnableC0988Hp2 z;

    public C1118Ip2(ChromeActivity chromeActivity, String str, InterfaceViewOnClickListenerC1637Mp2 interfaceViewOnClickListenerC1637Mp2, String str2) {
        super(chromeActivity, str, interfaceViewOnClickListenerC1637Mp2);
        this.y = new ArrayList();
        this.z = new RunnableC0988Hp2(this);
        this.A = new Handler();
        this.x.setText(str2);
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final void a(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        Context context2 = linearLayout.getContext();
        TextView textView = new TextView(context2);
        this.x = textView;
        textView.setTextAppearance(textView.getContext(), R.style.f102580_resource_name_obfuscated_res_0x7f15043f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.x.setTextAlignment(3);
        this.x.setTextColor(context2.getColor(R.color.f21430_resource_name_obfuscated_res_0x7f070507));
        layoutParams.setMarginStart(context2.getResources().getDimensionPixelSize(R.dimen.f31600_resource_name_obfuscated_res_0x7f0801fa));
        layoutParams.setMarginEnd(context2.getResources().getDimensionPixelSize(R.dimen.f31600_resource_name_obfuscated_res_0x7f0801fa));
        this.x.setVisibility(4);
        this.r.addView(this.x, r1.getChildCount() - 1, layoutParams);
        GridLayout gridLayout = new GridLayout(context, null);
        this.w = gridLayout;
        gridLayout.a.n(2);
        gridLayout.h();
        gridLayout.requestLayout();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388613;
        linearLayout.addView(this.w, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.t.getLayoutParams();
        layoutParams3.width = 0;
        layoutParams3.weight = 1.0f;
    }

    public static SpannableStringBuilder h(String str, String str2, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        if (z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), length, str2.length() + length, 0);
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final void d(int i) {
        if (i == 5) {
            e(TextUtils.TruncateAt.END, false);
            this.s.setMaxLines(3);
        } else {
            e(TextUtils.TruncateAt.END, true);
            this.s.setMaxLines(1);
        }
        super.d(i);
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final void g() {
        if (this.i) {
            this.w.setVisibility(this.j == 5 ? 0 : 8);
            super.g();
        }
    }
}
