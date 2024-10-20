package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ql1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2136Ql1 extends FrameLayout {
    public final InterfaceC2006Pl1 a;

    public C2136Ql1(Context context, InterfaceC2006Pl1 interfaceC2006Pl1) {
        super(context);
        this.a = interfaceC2006Pl1;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f34280_resource_name_obfuscated_res_0x7f080384);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f34290_resource_name_obfuscated_res_0x7f080385);
        setMinimumHeight(dimensionPixelSize + dimensionPixelSize2);
        setBackgroundResource(R.drawable.f50980_resource_name_obfuscated_res_0x7f090366);
        setPadding(0, dimensionPixelSize2, 0, 0);
        ColorDrawable colorDrawable = (ColorDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(R.id.infobar_wrapper_bg_fill);
        colorDrawable.mutate();
        colorDrawable.setColor(AbstractC11746yN.c(getContext(), R.dimen.f34210_resource_name_obfuscated_res_0x7f08037d));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
    }
}
