package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xq2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3072Xq2 extends AbstractC2218Rb3 {
    public final ChipView a;

    public C3072Xq2(Context context) {
        super(context);
        setFocusable(true);
        ChipView chipView = new ChipView(context, R.style.f97040_resource_name_obfuscated_res_0x7f150214);
        this.a = chipView;
        C2088Qb3 c2088Qb3 = new C2088Qb3(-2, -2);
        c2088Qb3.a = true;
        chipView.setLayoutParams(c2088Qb3);
        int c = AbstractC9685sM1.c(R.attr.f5490_resource_name_obfuscated_res_0x7f050152, context, "PedalView");
        int c2 = AbstractC9685sM1.c(R.attr.f5240_resource_name_obfuscated_res_0x7f050139, context, "PedalView");
        float a = GP2.a(R.dimen.f29130_resource_name_obfuscated_res_0x7f0800ec, context.getResources());
        chipView.a.d.setStroke(context.getResources().getDimensionPixelSize(R.dimen.f28990_resource_name_obfuscated_res_0x7f0800de), AbstractC3899bX.a(c, c2, a, false));
        addView(chipView);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ChipView chipView = this.a;
        if (keyCode == 61) {
            chipView.setSelected(!chipView.isSelected());
            return true;
        }
        if (AbstractC7472lu1.a(keyEvent) && chipView.isSelected()) {
            return chipView.performClick();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        this.a.setSelected(false);
    }

    @Override // defpackage.AbstractC2218Rb3, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - ((ViewGroup.MarginLayoutParams) getLayoutParams()).getMarginEnd();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ChipView chipView = this.a;
        chipView.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + chipView.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return super.isFocused() || (isSelected() && !isInTouchMode());
    }
}
