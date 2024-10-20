package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3290Zi0 extends AbstractC2218Rb3 {
    public final ImageView a;
    public View g;

    public C3290Zi0(Context context) {
        super(context);
        setClickable(true);
        setFocusable(true);
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setOutlineProvider(new C6278iR2(getResources().getDimensionPixelSize(R.dimen.f30560_resource_name_obfuscated_res_0x7f080183)));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new C2088Qb3(getResources().getDimensionPixelSize(R.dimen.f37840_resource_name_obfuscated_res_0x7f08062f), -2));
        addView(imageView);
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return super.isFocused() || (isSelected() && !isInTouchMode());
    }
}
