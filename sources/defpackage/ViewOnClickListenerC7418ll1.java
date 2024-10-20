package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ll1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC7418ll1 extends LinearLayout implements View.OnClickListener {
    public final InterfaceC1487Ll1 a;
    public final int g;
    public final ChromeImageButton h;

    public ViewOnClickListenerC7418ll1(Context context, InterfaceC1487Ll1 interfaceC1487Ll1, int i, int i2, Bitmap bitmap) {
        super(context);
        this.a = interfaceC1487Ll1;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f34170_resource_name_obfuscated_res_0x7f080379);
        this.g = dimensionPixelOffset;
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.f34150_resource_name_obfuscated_res_0x7f080377);
        setOrientation(0);
        setGravity(16);
        View c = ViewOnClickListenerC1876Ol1.c(getContext(), i, i2, bitmap);
        if (c != null) {
            addView(c, new LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset));
        }
        ChromeImageButton b = ViewOnClickListenerC1876Ol1.b(getContext());
        b.setOnClickListener(this);
        addView(b, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
        this.h = b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.infobar_close_button) {
            this.a.i();
        }
    }

    public final void a(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        view.setMinimumHeight(this.g);
        layoutParams.gravity = 80;
        addView(view, indexOfChild(this.h), layoutParams);
    }
}
