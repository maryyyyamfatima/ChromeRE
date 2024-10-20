package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z52, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11997z52 extends ClickableSpan {
    public final int a;
    public final Callback g;

    public C11997z52(Context context, Callback callback) {
        int color;
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.f7940_resource_name_obfuscated_res_0x7f050247, typedValue, true)) {
            color = typedValue.data;
        } else {
            color = theme.getResources().getColor(R.color.f18110_resource_name_obfuscated_res_0x7f070143, theme);
        }
        this.a = color;
        this.g = callback;
    }

    public C11997z52(Context context, int i, Callback callback) {
        this.a = context.getColor(i);
        this.g = callback;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.g.onResult(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
    }
}
