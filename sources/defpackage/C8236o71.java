package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8236o71 extends AbstractC2218Rb3 {
    public final TextView a;
    public final AppCompatImageView g;
    public boolean h;
    public Runnable i;

    public C8236o71(Context context) {
        super(context);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.f12200_resource_name_obfuscated_res_0x7f0503f1, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        setClickable(true);
        setFocusable(true);
        TextView textView = new TextView(context);
        this.a = textView;
        C2088Qb3 c2088Qb3 = new C2088Qb3(-2, -2);
        c2088Qb3.a = true;
        textView.setLayoutParams(c2088Qb3);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setAllCaps(true);
        textView.setTextAppearance(R.style.f102910_resource_name_obfuscated_res_0x7f150460);
        textView.setMinHeight(context.getResources().getDimensionPixelSize(R.dimen.f37820_resource_name_obfuscated_res_0x7f08062d));
        textView.setGravity(16);
        textView.setTextAlignment(5);
        textView.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.f37830_resource_name_obfuscated_res_0x7f08062e), 0, 0, 0);
        addView(textView);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        this.g = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setImageResource(R.drawable.f47560_resource_name_obfuscated_res_0x7f090201);
        appCompatImageView.setLayoutParams(new C2088Qb3(getResources().getDimensionPixelSize(R.dimen.f37760_resource_name_obfuscated_res_0x7f080627), -1));
        addView(appCompatImageView);
        Ec4.m(this, new C7892n71(this));
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        Runnable runnable;
        super.setSelected(z);
        if (!z || (runnable = this.i) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = getLayoutDirection() == 1;
        if ((!z && AbstractC7472lu1.d(keyEvent)) || (z && AbstractC7472lu1.c(keyEvent))) {
            return performClick();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return super.isFocused() || (isSelected() && !isInTouchMode());
    }
}
